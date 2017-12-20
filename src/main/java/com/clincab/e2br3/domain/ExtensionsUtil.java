/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.clincab.e2br3.domain;

import com.clincab.web.app.eutils.jaxb.e2br3.II;
import com.clincab.web.app.eutils.jaxb.e2br3.MCCIIN200100UV01;
import com.clincab.web.app.eutils.jaxb.e2br3.MCCIMT000100UV01Device;
import com.clincab.web.app.eutils.jaxb.e2br3.MCCIMT000100UV01Receiver;
import com.clincab.web.app.eutils.jaxb.e2br3.MCCIMT000100UV01Sender;
import com.clincab.web.app.eutils.jaxb.e2br3.PORRIN049016UVMCCIMT000100UV01Message;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.List;
import java.util.logging.Level;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

/**
 *
 * @author ksingh
 */
@Component
public class ExtensionsUtil {

    private final Logger logger = LoggerFactory.getLogger(ExtensionsUtil.class);

    public File changeExtensions(File file, String receiverCode, String senderCode) throws JAXBException, FileNotFoundException, IOException {

        try {

            logger.debug("Checking {} file", file.getAbsolutePath());

            if (!file.exists()) {
                String log = String.format("File %s not found", file.getAbsolutePath());
                logger.debug(log);
                throw new FileNotFoundException(log);
            }

            if (file.isDirectory()) {
                String log = String.format("File %s is a directory", file.getAbsolutePath());
                logger.debug(log);
                throw new FileNotFoundException(log);
            }

            if (!file.canRead()) {
                String log = String.format("File %s not readable", file.getAbsolutePath());
                logger.debug(log);
                throw new SecurityException(log);
            }
        } catch (FileNotFoundException ex) {
            String log = String.format("File %s does not exist is or a directory or is unreadable", file.getAbsolutePath());
            logger.error(log);
            throw new FileNotFoundException(log);
        } catch (SecurityException ex) {
            String log = String.format("File %s does not exist is or a directory or is unreadable", file.getAbsolutePath());
            logger.error(log);
            throw new FileNotFoundException(log);
        }

        try {
            logger.debug("Creating Marshaller for {} file", file.getAbsolutePath());
            JAXBContext jaxbContext = JAXBContext.newInstance(MCCIIN200100UV01.class);
            Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
            MCCIIN200100UV01 icsr = (MCCIIN200100UV01) jaxbUnmarshaller.unmarshal(file);

            logger.debug("Checking HL7 messages from {} file", file.getAbsolutePath());
            List<Object> hl7Messages = icsr.getPORRIN049016UVOrPORRIN049017UVOrPORRIN049018UV();

            if (hl7Messages.isEmpty()) {
                String log = String.format("No HL7 messages found in %s file", file.getAbsolutePath());
                logger.debug(log);
                throw new JAXBException(log);
            }

            for (Object hl7Message : hl7Messages) {
                if (hl7Message instanceof PORRIN049016UVMCCIMT000100UV01Message) {
                    PORRIN049016UVMCCIMT000100UV01Message icsrMessage = (PORRIN049016UVMCCIMT000100UV01Message) hl7Message;
                    logger.debug("Processing HL7 PORR_IN049016UV message {}", icsrMessage.getId().getExtension());

                    List<MCCIMT000100UV01Receiver> icsrReceivers = icsrMessage.getReceiver();

                    if (icsrReceivers.isEmpty()) {
                        String log = String.format("No receivers found for HL7 PORR_IN049016UV message %s", icsrMessage.getId().getExtension());
                        logger.debug(log);
                        throw new JAXBException(log);
                    }

                    for (MCCIMT000100UV01Receiver icsrReceiver : icsrReceivers) {
                        MCCIMT000100UV01Device receiverDevice = icsrReceiver.getDevice();
                        if (receiverDevice == null) {
                            String log = String.format("No receiver device found for HL7 PORR_IN049016UV message %s", icsrMessage.getId().getExtension());
                            logger.debug(log);
                            throw new JAXBException(log);
                        }
                        List<II> ids = receiverDevice.getId();
                        if (ids.isEmpty()) {
                            String log = String.format("No ids found in a receiver for HL7 PORR_IN049016UV message %s", icsrMessage.getId().getExtension());
                            logger.debug(log);
                            throw new JAXBException(log);
                        }
                        for (II id : ids) {
                            if (id == null) {
                                String log = String.format("No id found in a receiver for HL7 PORR_IN049016UV message %s", icsrMessage.getId().getExtension());
                                logger.debug(log);
                                throw new JAXBException(log);
                            }
                            id.setExtension(receiverCode);
                        }
                    }

                    MCCIMT000100UV01Sender icsrSender = icsrMessage.getSender();
                    if (icsrSender == null) {
                        String log = String.format("No sender found for HL7 PORR_IN049016UV message %s", icsrMessage.getId().getExtension());
                        logger.debug(log);
                        throw new JAXBException(log);
                    }

                    MCCIMT000100UV01Device senderDevice = icsrSender.getDevice();
                    if (senderDevice == null) {
                        String log = String.format("No device found in sender for HL7 PORR_IN049016UV message %s", icsrMessage.getId().getExtension());
                        logger.debug(log);
                        throw new JAXBException(log);
                    }
                    List<II> ids = senderDevice.getId();
                    if (ids.isEmpty()) {
                        String log = String.format("No ids found in sender for HL7 PORR_IN049016UV message %s", icsrMessage.getId().getExtension());
                        logger.debug(log);
                        throw new JAXBException(log);
                    }
                    for (II id : ids) {
                        if (id == null) {
                            String log = String.format("No id found in sender for HL7 PORR_IN049016UV message %s", icsrMessage.getId().getExtension());
                            logger.debug(log);
                            throw new JAXBException(log);
                        }
                        id.setExtension(senderCode);
                    }
                }

            }

            Marshaller marshaller = jaxbContext.createMarshaller();
            marshaller.setProperty(Marshaller.JAXB_FRAGMENT, Boolean.TRUE);
            marshaller.setProperty("com.sun.xml.internal.bind.xmlHeaders", "<?xml version=\"1.0\" encoding=\"UTF-8\"?>");
            marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
            marshaller.setProperty(Marshaller.JAXB_SCHEMA_LOCATION, "urn:hl7-org:v3 http://eudravigilance.ema.europa.eu/XSD/multicacheschemas/MCCI_IN200100UV01.xsd");
            File outTempFile = File.createTempFile("out_", ".xml");
            OutputStream os = new FileOutputStream(outTempFile);
            marshaller.marshal(icsr, os);
            os.flush();
            os.close();
            return outTempFile;
        } catch (IllegalArgumentException ex) {
            String log = String.format("An error occurred processing file %s: %s", file.getAbsolutePath(), ex.getMessage());
            logger.error(log);
            throw new IllegalArgumentException(log);
        } catch (JAXBException ex) {
            String log = String.format("An error occurred processing file %s: %s", file.getAbsolutePath(), ex.getMessage());
            logger.error(log);
            throw new JAXBException(log);
        } catch (FileNotFoundException ex) {
            String log = String.format("An error occurred processing file %s: %s", file.getAbsolutePath(), ex.getMessage());
            logger.error(log);
            throw new FileNotFoundException(log);
        } catch (IOException ex) {
            String log = String.format("An error occurred processing file %s: %s", file.getAbsolutePath(), ex.getMessage());
            logger.error(log);
            throw new IOException(log);
        } catch (RuntimeException ex) {
            String log = String.format("An error occurred processing file %s: %s", file.getAbsolutePath(), ex.getMessage());
            logger.error(log);
            throw new RuntimeException(log);
        }
    }
}
