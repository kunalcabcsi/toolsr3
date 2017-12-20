/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.clincab.e2br3.ui;

import com.clincab.e2br3.E2br3Application;
import com.clincab.e2br3.domain.ExtensionsUtil;
import com.vaadin.annotations.PreserveOnRefresh;
import com.vaadin.annotations.Push;
import com.vaadin.server.FileDownloader;
import com.vaadin.server.StreamResource;
import com.vaadin.server.StreamVariable;
import com.vaadin.server.VaadinRequest;
import com.vaadin.shared.ui.dnd.FileParameters;
import com.vaadin.spring.annotation.SpringUI;
import com.vaadin.ui.Button;
import com.vaadin.ui.ComboBox;
import com.vaadin.ui.CustomComponent;
import com.vaadin.ui.Grid;
import com.vaadin.ui.HorizontalLayout;
import com.vaadin.ui.Html5File;
import com.vaadin.ui.Notification;
import com.vaadin.ui.TabSheet;
import com.vaadin.ui.UI;
import com.vaadin.ui.VerticalLayout;
import com.vaadin.ui.dnd.FileDropHandler;
import com.vaadin.ui.dnd.FileDropTarget;
import com.vaadin.ui.dnd.event.FileDropEvent;
import com.vaadin.ui.themes.ValoTheme;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.logging.Level;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;
import javax.xml.bind.JAXBException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;

/**
 *
 * @author ksingh
 */
@Push
@SpringUI
@PreserveOnRefresh
public class AppUI extends UI {

    private final Logger logger = LoggerFactory.getLogger(E2br3Application.class);

    private final TabSheet tabSheet = new TabSheet();

    @Value(value = "#{'${e2b.sender.list}'.split(',')}")
    private List<String> senderList;

    @Value(value = "#{'${e2b.receiver.list}'.split(',')}")
    private List<String> receiverList;

    @Autowired
    private ExtensionsUtil extensionsUtil;

    private final ExtensionsTab extensionsTab = new ExtensionsTab();

    @Override
    protected void init(VaadinRequest request) {
        initLayout();
    }

    private void initLayout() {
        tabSheet.setSizeFull();

        tabSheet.addTab(extensionsTab, "Sender Receiver Device Ext.");

        extensionsTab.senderCB.setItems(senderList);
        extensionsTab.receiverCB.setItems(receiverList);

        this.setContent(tabSheet);
    }

    private class ExtensionsTab extends CustomComponent {

        private final Logger logger = LoggerFactory.getLogger(ExtensionsTab.class);

        private final VerticalLayout formLayout = new VerticalLayout();
        private final HorizontalLayout cbLayout = new HorizontalLayout();
        private final ComboBox<String> senderCB = new ComboBox("Sender");
        private final ComboBox<String> receiverCB = new ComboBox("Receiver");
        private final Grid<UploadXMLParameters> gridDropArea = new Grid<>("Drop files on the Grid");
        private final List<UploadXMLParameters> gridItems = new ArrayList<>();

        private final HashMap<Html5File, UploadXMLParameters> fileMap = new HashMap<>();
        private final Button dlnButton = new Button("Download");

        public ExtensionsTab() {
            initDesign();
        }

        private void initDesign() {
            gridDropArea.setSizeFull();
            gridDropArea.addColumn(FileParameters::getName).setCaption("File Name");
            gridDropArea.addColumn(FileParameters::getSize).setCaption("File Size");
            gridDropArea.addColumn(FileParameters::getMime).setCaption("Mime Type");
            gridDropArea.addColumn(UploadXMLParameters::getUploaded).setCaption("Upload Status");
            gridDropArea.addColumn(UploadXMLParameters::getInPath).setCaption("In File");
            gridDropArea.addColumn(UploadXMLParameters::getValidXml).setCaption("Valid ICSR");
            gridDropArea.addColumn(UploadXMLParameters::getProcessed).setCaption("Processed");
            gridDropArea.addColumn(UploadXMLParameters::getOutPath).setCaption("Out File");

            cbLayout.addComponent(senderCB);
            cbLayout.addComponent(receiverCB);
            formLayout.addComponent(gridDropArea);
            formLayout.addComponent(cbLayout);
            formLayout.addComponent(dlnButton);
            dlnButton.setVisible(false);
            dlnButton.setEnabled(false);
            dlnButton.setStyleName(ValoTheme.BUTTON_HUGE);
            dlnButton.addStyleName(ValoTheme.BUTTON_BORDERLESS_COLORED);

            FileDropTarget<Grid<UploadXMLParameters>> dropTarget = new FileDropTarget<>(gridDropArea, new FileDropHandler() {

                @Override
                public void drop(FileDropEvent event) {

                    if (senderCB.getValue() == null || senderCB.getValue().isEmpty()) {
                        Notification.show("Select Sender!", Notification.Type.ERROR_MESSAGE);
                        return;
                    }
                    if (receiverCB.getValue() == null || receiverCB.getValue().isEmpty()) {
                        Notification.show("Select Receiver!", Notification.Type.ERROR_MESSAGE);
                        return;
                    }

                    fileMap.clear();
                    gridItems.clear();
                    dlnButton.setVisible(false);
                    dlnButton.setEnabled(false);

                    Collection<Html5File> files = event.getFiles();

                    for (Html5File file : files) {

                        file.setStreamVariable(new StreamVariable() {
                            @Override
                            public OutputStream getOutputStream() {
                                try {
                                    File inFile = File.createTempFile("in_", ".xml");
                                    if (!fileMap.containsKey(file)) {
                                        UploadXMLParameters uploadXMLParameters = new UploadXMLParameters();
                                        fileMap.put(file, uploadXMLParameters);
                                        gridItems.add(uploadXMLParameters);
                                    }
                                    UploadXMLParameters uploadXMLParameters = fileMap.get(file);
                                    uploadXMLParameters.setInPath(inFile.getAbsolutePath());
                                    access(new Runnable() {
                                        @Override
                                        public void run() {
                                            gridDropArea.setItems(gridItems);
                                            gridDropArea.scrollToEnd();
                                        }
                                    });
                                    return new FileOutputStream(inFile);
                                } catch (FileNotFoundException ex) {
                                } catch (IOException ex) {
                                }
                                return null;
                            }

                            @Override
                            public boolean listenProgress() {
                                return true;
                            }

                            @Override
                            public void onProgress(StreamVariable.StreamingProgressEvent event) {
                                if (!fileMap.containsKey(file)) {
                                    UploadXMLParameters uploadXMLParameters = new UploadXMLParameters(event.getFileName(), event.getContentLength(), event.getMimeType());
                                    fileMap.put(file, uploadXMLParameters);
                                    gridItems.add(uploadXMLParameters);
                                    return;
                                }
                                UploadXMLParameters uploadXMLParameters = fileMap.get(file);
                                uploadXMLParameters.setUploaded(event.getBytesReceived() * 100 / file.getFileSize() + "%");
                                access(new Runnable() {
                                    @Override
                                    public void run() {
                                        gridDropArea.setItems(gridItems);
                                        gridDropArea.scrollToEnd();
                                    }
                                });
                            }

                            @Override
                            public void streamingStarted(StreamVariable.StreamingStartEvent event) {
                                if (!fileMap.containsKey(file)) {
                                    UploadXMLParameters uploadXMLParameters = new UploadXMLParameters(event.getFileName(), event.getContentLength(), event.getMimeType());
                                    fileMap.put(file, uploadXMLParameters);
                                    gridItems.add(uploadXMLParameters);
                                    return;
                                }
                                UploadXMLParameters uploadXMLParameters = fileMap.get(file);
                                uploadXMLParameters.setUploaded("Queued");
                                access(new Runnable() {
                                    @Override
                                    public void run() {
                                        gridDropArea.setItems(gridItems);
                                        gridDropArea.scrollToEnd();
                                    }
                                });
                            }

                            @Override
                            public void streamingFinished(StreamVariable.StreamingEndEvent event) {
                                if (!fileMap.containsKey(file)) {
                                    UploadXMLParameters uploadXMLParameters = new UploadXMLParameters(event.getFileName(), event.getContentLength(), event.getMimeType());
                                    fileMap.put(file, uploadXMLParameters);
                                    gridItems.add(uploadXMLParameters);
                                    return;
                                }
                                UploadXMLParameters uploadXMLParameters = fileMap.get(file);
                                uploadXMLParameters.setUploaded("Success");
                                try {
                                    File outFile = extensionsUtil.changeExtensions(new File(uploadXMLParameters.getInPath()), receiverCB.getValue().trim(), senderCB.getValue().trim());
                                    uploadXMLParameters.setOutPath(outFile.getPath());
                                    uploadXMLParameters.setValidXml("Yes");
                                    uploadXMLParameters.setProcessed("Yes");
                                } catch (RuntimeException ex) {
                                    uploadXMLParameters.setOutPath(ex.getMessage());
                                    uploadXMLParameters.setValidXml("Yes");
                                    uploadXMLParameters.setProcessed("No");
                                } catch (JAXBException ex) {
                                    uploadXMLParameters.setOutPath(ex.getMessage());
                                    uploadXMLParameters.setValidXml("No");
                                    uploadXMLParameters.setProcessed("No");
                                } catch (IOException ex) {
                                    uploadXMLParameters.setOutPath(ex.getMessage());
                                    uploadXMLParameters.setValidXml("Yes");
                                    uploadXMLParameters.setProcessed("No");
                                }
                                access(new Runnable() {
                                    @Override
                                    public void run() {
                                        gridDropArea.setItems(gridItems);
                                        gridDropArea.scrollToEnd();
                                    }
                                });

                                if (files.size() == fileMap.size()) {
                                    zipOutput();
                                    access(new Runnable() {
                                        @Override
                                        public void run() {
                                            System.out.println("Download _______________________________");
                                            dlnButton.setVisible(true);
                                            dlnButton.setEnabled(true);
                                        }
                                    });
                                }
                            }

                            @Override
                            public void streamingFailed(StreamVariable.StreamingErrorEvent event) {
                                if (!fileMap.containsKey(file)) {
                                    UploadXMLParameters uploadXMLParameters = new UploadXMLParameters(event.getFileName(), event.getContentLength(), event.getMimeType());
                                    fileMap.put(file, uploadXMLParameters);
                                    gridItems.add(uploadXMLParameters);
                                    return;
                                }
                                UploadXMLParameters uploadXMLParameters = fileMap.get(file);
                                uploadXMLParameters.setUploaded("Failed");
                                access(new Runnable() {
                                    @Override
                                    public void run() {
                                        gridDropArea.setItems(gridItems);
                                        gridDropArea.scrollToEnd();
                                    }
                                });
                            }

                            @Override
                            public boolean isInterrupted() {
                                return false;
                            }

                        });
                    }
                }
            });
            setCompositionRoot(formLayout);
        }

        private void zipOutput() {
            try {
                File zipFile = File.createTempFile("output_", ".zip");

                byte[] buffer = new byte[1024];
                FileOutputStream fos = new FileOutputStream(zipFile);
                ZipOutputStream zos = new ZipOutputStream(fos);
                for (Map.Entry<Html5File, UploadXMLParameters> entry : fileMap.entrySet()) {
                    if (entry.getValue() == null) {
                        continue;
                    }
                    ZipEntry ze = new ZipEntry(entry.getKey().getFileName());
                    zos.putNextEntry(ze);

                    FileInputStream in = new FileInputStream(entry.getValue().getOutPath());

                    int len;
                    while ((len = in.read(buffer)) > 0) {
                        zos.write(buffer, 0, len);
                    }

                    in.close();
                }
                zos.closeEntry();
                //remember close it
                zos.close();

                FileDownloader fileDln = new FileDownloader(new StreamResource(new StreamResource.StreamSource() {
                    @Override
                    public InputStream getStream() {
                        try {
                            return new FileInputStream(zipFile);
                        } catch (FileNotFoundException ex) {
                        }
                        return null;
                    }
                }, zipFile.getName()));
                fileDln.extend(dlnButton);
            } catch (IOException ex) {
            }
        }

    }

    private class UploadXMLParameters extends FileParameters {

        private String inPath;

        private String outPath;

        private String uploaded;

        private String validXml;

        private String processed;

        public UploadXMLParameters() {
        }

        public UploadXMLParameters(String name, long size, String mime) {
            super(name, size, mime);
        }

        public UploadXMLParameters(String name, long size, String mime, String inPath, String outPath, String uploaded, String validXml, String processed) {
            super(name, size, mime);
            this.inPath = inPath;
            this.outPath = outPath;
            this.uploaded = uploaded;
            this.validXml = validXml;
            this.processed = processed;
        }

        public String getInPath() {
            return inPath;
        }

        public void setInPath(String inPath) {
            this.inPath = inPath;
        }

        public String getOutPath() {
            return outPath;
        }

        public void setOutPath(String outPath) {
            this.outPath = outPath;
        }

        public String getUploaded() {
            return uploaded;
        }

        public void setUploaded(String uploaded) {
            this.uploaded = uploaded;
        }

        public String getValidXml() {
            return validXml;
        }

        public void setValidXml(String validXml) {
            this.validXml = validXml;
        }

        public String getProcessed() {
            return processed;
        }

        public void setProcessed(String processed) {
            this.processed = processed;
        }

    }

}
