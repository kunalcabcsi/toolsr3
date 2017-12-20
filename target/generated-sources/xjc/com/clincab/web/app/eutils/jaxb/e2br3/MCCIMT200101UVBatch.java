//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.12.20 at 02:30:39 PM IST 
//


package com.clincab.web.app.eutils.jaxb.e2br3;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MCCI_MT200101UV.Batch complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MCCI_MT200101UV.Batch"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;group ref="{urn:hl7-org:v3}InfrastructureRootElements"/&gt;
 *         &lt;element name="id" type="{urn:hl7-org:v3}II"/&gt;
 *         &lt;element name="creationTime" type="{urn:hl7-org:v3}TS"/&gt;
 *         &lt;element name="securityText" type="{urn:hl7-org:v3}ST" minOccurs="0"/&gt;
 *         &lt;element name="responseModeCode" type="{urn:hl7-org:v3}CS"/&gt;
 *         &lt;element name="versionCode" type="{urn:hl7-org:v3}CS" minOccurs="0"/&gt;
 *         &lt;element name="interactionId" type="{urn:hl7-org:v3}II"/&gt;
 *         &lt;element name="referenceControlId" type="{urn:hl7-org:v3}II" minOccurs="0"/&gt;
 *         &lt;element name="name" type="{urn:hl7-org:v3}SC" minOccurs="0"/&gt;
 *         &lt;element name="batchComment" type="{urn:hl7-org:v3}ST" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="transmissionQuantity" type="{urn:hl7-org:v3}INT" minOccurs="0"/&gt;
 *         &lt;element name="batchTotalNumber" type="{urn:hl7-org:v3}INT" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="MCCI_IN000002UV01" type="{urn:hl7-org:v3}MCCI_MT000200UV01.Message" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="receiver" type="{urn:hl7-org:v3}MCCI_MT200101UV.Receiver"/&gt;
 *         &lt;element name="respondTo" type="{urn:hl7-org:v3}MCCI_MT200101UV.RespondTo" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="sender" type="{urn:hl7-org:v3}MCCI_MT200101UV.Sender"/&gt;
 *         &lt;element name="attentionLine" type="{urn:hl7-org:v3}MCCI_MT200101UV.AttentionLine" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="acknowledgement" type="{urn:hl7-org:v3}MCCI_MT200101UV.Acknowledgement"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attGroup ref="{urn:hl7-org:v3}InfrastructureRootAttributes"/&gt;
 *       &lt;attribute name="nullFlavor" type="{urn:hl7-org:v3}NullFlavor" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MCCI_MT200101UV.Batch", propOrder = {
    "realmCode",
    "typeId",
    "templateId",
    "id",
    "creationTime",
    "securityText",
    "responseModeCode",
    "versionCode",
    "interactionId",
    "referenceControlId",
    "name",
    "batchComment",
    "transmissionQuantity",
    "batchTotalNumber",
    "mcciin000002UV01",
    "receiver",
    "respondTo",
    "sender",
    "attentionLine",
    "acknowledgement"
})
@XmlSeeAlso({
    MCCIIN200101UV01 .class
})
public class MCCIMT200101UVBatch {

    protected List<CS> realmCode;
    protected II typeId;
    protected List<II> templateId;
    @XmlElement(required = true)
    protected II id;
    @XmlElement(required = true)
    protected TS creationTime;
    protected ST securityText;
    @XmlElement(required = true)
    protected CS responseModeCode;
    protected CS versionCode;
    @XmlElement(required = true)
    protected II interactionId;
    protected II referenceControlId;
    protected SC name;
    protected List<ST> batchComment;
    protected INT transmissionQuantity;
    protected List<INT> batchTotalNumber;
    @XmlElement(name = "MCCI_IN000002UV01", nillable = true)
    protected List<MCCIMT000200UV01Message> mcciin000002UV01;
    @XmlElement(required = true)
    protected MCCIMT200101UVReceiver receiver;
    @XmlElement(nillable = true)
    protected List<MCCIMT200101UVRespondTo> respondTo;
    @XmlElement(required = true)
    protected MCCIMT200101UVSender sender;
    @XmlElement(nillable = true)
    protected List<MCCIMT200101UVAttentionLine> attentionLine;
    @XmlElement(required = true, nillable = true)
    protected MCCIMT200101UVAcknowledgement acknowledgement;
    @XmlAttribute(name = "nullFlavor")
    protected NullFlavor nullFlavor;

    /**
     * Gets the value of the realmCode property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the realmCode property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRealmCode().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CS }
     * 
     * 
     */
    public List<CS> getRealmCode() {
        if (realmCode == null) {
            realmCode = new ArrayList<CS>();
        }
        return this.realmCode;
    }

    /**
     * Gets the value of the typeId property.
     * 
     * @return
     *     possible object is
     *     {@link II }
     *     
     */
    public II getTypeId() {
        return typeId;
    }

    /**
     * Sets the value of the typeId property.
     * 
     * @param value
     *     allowed object is
     *     {@link II }
     *     
     */
    public void setTypeId(II value) {
        this.typeId = value;
    }

    /**
     * Gets the value of the templateId property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the templateId property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTemplateId().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link II }
     * 
     * 
     */
    public List<II> getTemplateId() {
        if (templateId == null) {
            templateId = new ArrayList<II>();
        }
        return this.templateId;
    }

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link II }
     *     
     */
    public II getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link II }
     *     
     */
    public void setId(II value) {
        this.id = value;
    }

    /**
     * Gets the value of the creationTime property.
     * 
     * @return
     *     possible object is
     *     {@link TS }
     *     
     */
    public TS getCreationTime() {
        return creationTime;
    }

    /**
     * Sets the value of the creationTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link TS }
     *     
     */
    public void setCreationTime(TS value) {
        this.creationTime = value;
    }

    /**
     * Gets the value of the securityText property.
     * 
     * @return
     *     possible object is
     *     {@link ST }
     *     
     */
    public ST getSecurityText() {
        return securityText;
    }

    /**
     * Sets the value of the securityText property.
     * 
     * @param value
     *     allowed object is
     *     {@link ST }
     *     
     */
    public void setSecurityText(ST value) {
        this.securityText = value;
    }

    /**
     * Gets the value of the responseModeCode property.
     * 
     * @return
     *     possible object is
     *     {@link CS }
     *     
     */
    public CS getResponseModeCode() {
        return responseModeCode;
    }

    /**
     * Sets the value of the responseModeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link CS }
     *     
     */
    public void setResponseModeCode(CS value) {
        this.responseModeCode = value;
    }

    /**
     * Gets the value of the versionCode property.
     * 
     * @return
     *     possible object is
     *     {@link CS }
     *     
     */
    public CS getVersionCode() {
        return versionCode;
    }

    /**
     * Sets the value of the versionCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link CS }
     *     
     */
    public void setVersionCode(CS value) {
        this.versionCode = value;
    }

    /**
     * Gets the value of the interactionId property.
     * 
     * @return
     *     possible object is
     *     {@link II }
     *     
     */
    public II getInteractionId() {
        return interactionId;
    }

    /**
     * Sets the value of the interactionId property.
     * 
     * @param value
     *     allowed object is
     *     {@link II }
     *     
     */
    public void setInteractionId(II value) {
        this.interactionId = value;
    }

    /**
     * Gets the value of the referenceControlId property.
     * 
     * @return
     *     possible object is
     *     {@link II }
     *     
     */
    public II getReferenceControlId() {
        return referenceControlId;
    }

    /**
     * Sets the value of the referenceControlId property.
     * 
     * @param value
     *     allowed object is
     *     {@link II }
     *     
     */
    public void setReferenceControlId(II value) {
        this.referenceControlId = value;
    }

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link SC }
     *     
     */
    public SC getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link SC }
     *     
     */
    public void setName(SC value) {
        this.name = value;
    }

    /**
     * Gets the value of the batchComment property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the batchComment property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBatchComment().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ST }
     * 
     * 
     */
    public List<ST> getBatchComment() {
        if (batchComment == null) {
            batchComment = new ArrayList<ST>();
        }
        return this.batchComment;
    }

    /**
     * Gets the value of the transmissionQuantity property.
     * 
     * @return
     *     possible object is
     *     {@link INT }
     *     
     */
    public INT getTransmissionQuantity() {
        return transmissionQuantity;
    }

    /**
     * Sets the value of the transmissionQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link INT }
     *     
     */
    public void setTransmissionQuantity(INT value) {
        this.transmissionQuantity = value;
    }

    /**
     * Gets the value of the batchTotalNumber property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the batchTotalNumber property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBatchTotalNumber().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link INT }
     * 
     * 
     */
    public List<INT> getBatchTotalNumber() {
        if (batchTotalNumber == null) {
            batchTotalNumber = new ArrayList<INT>();
        }
        return this.batchTotalNumber;
    }

    /**
     * Gets the value of the mcciin000002UV01 property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the mcciin000002UV01 property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMCCIIN000002UV01().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MCCIMT000200UV01Message }
     * 
     * 
     */
    public List<MCCIMT000200UV01Message> getMCCIIN000002UV01() {
        if (mcciin000002UV01 == null) {
            mcciin000002UV01 = new ArrayList<MCCIMT000200UV01Message>();
        }
        return this.mcciin000002UV01;
    }

    /**
     * Gets the value of the receiver property.
     * 
     * @return
     *     possible object is
     *     {@link MCCIMT200101UVReceiver }
     *     
     */
    public MCCIMT200101UVReceiver getReceiver() {
        return receiver;
    }

    /**
     * Sets the value of the receiver property.
     * 
     * @param value
     *     allowed object is
     *     {@link MCCIMT200101UVReceiver }
     *     
     */
    public void setReceiver(MCCIMT200101UVReceiver value) {
        this.receiver = value;
    }

    /**
     * Gets the value of the respondTo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the respondTo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRespondTo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MCCIMT200101UVRespondTo }
     * 
     * 
     */
    public List<MCCIMT200101UVRespondTo> getRespondTo() {
        if (respondTo == null) {
            respondTo = new ArrayList<MCCIMT200101UVRespondTo>();
        }
        return this.respondTo;
    }

    /**
     * Gets the value of the sender property.
     * 
     * @return
     *     possible object is
     *     {@link MCCIMT200101UVSender }
     *     
     */
    public MCCIMT200101UVSender getSender() {
        return sender;
    }

    /**
     * Sets the value of the sender property.
     * 
     * @param value
     *     allowed object is
     *     {@link MCCIMT200101UVSender }
     *     
     */
    public void setSender(MCCIMT200101UVSender value) {
        this.sender = value;
    }

    /**
     * Gets the value of the attentionLine property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the attentionLine property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAttentionLine().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MCCIMT200101UVAttentionLine }
     * 
     * 
     */
    public List<MCCIMT200101UVAttentionLine> getAttentionLine() {
        if (attentionLine == null) {
            attentionLine = new ArrayList<MCCIMT200101UVAttentionLine>();
        }
        return this.attentionLine;
    }

    /**
     * Gets the value of the acknowledgement property.
     * 
     * @return
     *     possible object is
     *     {@link MCCIMT200101UVAcknowledgement }
     *     
     */
    public MCCIMT200101UVAcknowledgement getAcknowledgement() {
        return acknowledgement;
    }

    /**
     * Sets the value of the acknowledgement property.
     * 
     * @param value
     *     allowed object is
     *     {@link MCCIMT200101UVAcknowledgement }
     *     
     */
    public void setAcknowledgement(MCCIMT200101UVAcknowledgement value) {
        this.acknowledgement = value;
    }

    /**
     * Gets the value of the nullFlavor property.
     * 
     * @return
     *     possible object is
     *     {@link NullFlavor }
     *     
     */
    public NullFlavor getNullFlavor() {
        return nullFlavor;
    }

    /**
     * Sets the value of the nullFlavor property.
     * 
     * @param value
     *     allowed object is
     *     {@link NullFlavor }
     *     
     */
    public void setNullFlavor(NullFlavor value) {
        this.nullFlavor = value;
    }

}