//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.12.20 at 02:30:39 PM IST 
//


package com.clincab.web.app.eutils.jaxb.e2br3;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for POCP_HD010500UV.Subject complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="POCP_HD010500UV.Subject"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;group ref="{urn:hl7-org:v3}InfrastructureRootElements"/&gt;
 *         &lt;choice&gt;
 *           &lt;element name="document" type="{urn:hl7-org:v3}POCP_MT050100UV.Document"/&gt;
 *           &lt;choice&gt;
 *             &lt;choice&gt;
 *               &lt;element name="approval" type="{urn:hl7-org:v3}POCP_MT050100UV.Approval"/&gt;
 *               &lt;element name="policy" type="{urn:hl7-org:v3}POCP_MT050100UV.Policy"/&gt;
 *             &lt;/choice&gt;
 *             &lt;choice&gt;
 *               &lt;element name="marketingAct" type="{urn:hl7-org:v3}POCP_MT050100UV.MarketingAct"/&gt;
 *               &lt;element name="monitoringProgram" type="{urn:hl7-org:v3}POCP_MT050100UV.MonitoringProgram"/&gt;
 *             &lt;/choice&gt;
 *           &lt;/choice&gt;
 *           &lt;choice&gt;
 *             &lt;element name="characteristic" type="{urn:hl7-org:v3}POCP_MT050100UV.Characteristic"/&gt;
 *             &lt;element name="observationGoal" type="{urn:hl7-org:v3}POCP_MT050100UV.ObservationGoal"/&gt;
 *             &lt;element name="substanceSpecification" type="{urn:hl7-org:v3}POCP_MT090100UV.SubstanceSpecification"/&gt;
 *           &lt;/choice&gt;
 *         &lt;/choice&gt;
 *       &lt;/sequence&gt;
 *       &lt;attGroup ref="{urn:hl7-org:v3}InfrastructureRootAttributes"/&gt;
 *       &lt;attribute name="nullFlavor" type="{urn:hl7-org:v3}NullFlavor" /&gt;
 *       &lt;attribute name="typeCode" type="{urn:hl7-org:v3}ParticipationTargetSubject" default="SBJ" /&gt;
 *       &lt;attribute name="negationInd" type="{urn:hl7-org:v3}bl" default="false" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "POCP_HD010500UV.Subject", propOrder = {
    "realmCode",
    "typeId",
    "templateId",
    "document",
    "approval",
    "policy",
    "marketingAct",
    "monitoringProgram",
    "characteristic",
    "observationGoal",
    "substanceSpecification"
})
public class POCPHD010500UVSubject {

    protected List<CS> realmCode;
    protected II typeId;
    protected List<II> templateId;
    @XmlElementRef(name = "document", namespace = "urn:hl7-org:v3", type = JAXBElement.class, required = false)
    protected JAXBElement<POCPMT050100UVDocument> document;
    @XmlElementRef(name = "approval", namespace = "urn:hl7-org:v3", type = JAXBElement.class, required = false)
    protected JAXBElement<POCPMT050100UVApproval> approval;
    @XmlElementRef(name = "policy", namespace = "urn:hl7-org:v3", type = JAXBElement.class, required = false)
    protected JAXBElement<POCPMT050100UVPolicy> policy;
    @XmlElementRef(name = "marketingAct", namespace = "urn:hl7-org:v3", type = JAXBElement.class, required = false)
    protected JAXBElement<POCPMT050100UVMarketingAct> marketingAct;
    @XmlElementRef(name = "monitoringProgram", namespace = "urn:hl7-org:v3", type = JAXBElement.class, required = false)
    protected JAXBElement<POCPMT050100UVMonitoringProgram> monitoringProgram;
    @XmlElementRef(name = "characteristic", namespace = "urn:hl7-org:v3", type = JAXBElement.class, required = false)
    protected JAXBElement<POCPMT050100UVCharacteristic> characteristic;
    @XmlElementRef(name = "observationGoal", namespace = "urn:hl7-org:v3", type = JAXBElement.class, required = false)
    protected JAXBElement<POCPMT050100UVObservationGoal> observationGoal;
    @XmlElementRef(name = "substanceSpecification", namespace = "urn:hl7-org:v3", type = JAXBElement.class, required = false)
    protected JAXBElement<POCPMT090100UVSubstanceSpecification> substanceSpecification;
    @XmlAttribute(name = "nullFlavor")
    protected NullFlavor nullFlavor;
    @XmlAttribute(name = "typeCode")
    protected ParticipationTargetSubject typeCode;
    @XmlAttribute(name = "negationInd")
    protected Boolean negationInd;

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
     * Gets the value of the document property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link POCPMT050100UVDocument }{@code >}
     *     
     */
    public JAXBElement<POCPMT050100UVDocument> getDocument() {
        return document;
    }

    /**
     * Sets the value of the document property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link POCPMT050100UVDocument }{@code >}
     *     
     */
    public void setDocument(JAXBElement<POCPMT050100UVDocument> value) {
        this.document = value;
    }

    /**
     * Gets the value of the approval property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link POCPMT050100UVApproval }{@code >}
     *     
     */
    public JAXBElement<POCPMT050100UVApproval> getApproval() {
        return approval;
    }

    /**
     * Sets the value of the approval property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link POCPMT050100UVApproval }{@code >}
     *     
     */
    public void setApproval(JAXBElement<POCPMT050100UVApproval> value) {
        this.approval = value;
    }

    /**
     * Gets the value of the policy property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link POCPMT050100UVPolicy }{@code >}
     *     
     */
    public JAXBElement<POCPMT050100UVPolicy> getPolicy() {
        return policy;
    }

    /**
     * Sets the value of the policy property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link POCPMT050100UVPolicy }{@code >}
     *     
     */
    public void setPolicy(JAXBElement<POCPMT050100UVPolicy> value) {
        this.policy = value;
    }

    /**
     * Gets the value of the marketingAct property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link POCPMT050100UVMarketingAct }{@code >}
     *     
     */
    public JAXBElement<POCPMT050100UVMarketingAct> getMarketingAct() {
        return marketingAct;
    }

    /**
     * Sets the value of the marketingAct property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link POCPMT050100UVMarketingAct }{@code >}
     *     
     */
    public void setMarketingAct(JAXBElement<POCPMT050100UVMarketingAct> value) {
        this.marketingAct = value;
    }

    /**
     * Gets the value of the monitoringProgram property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link POCPMT050100UVMonitoringProgram }{@code >}
     *     
     */
    public JAXBElement<POCPMT050100UVMonitoringProgram> getMonitoringProgram() {
        return monitoringProgram;
    }

    /**
     * Sets the value of the monitoringProgram property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link POCPMT050100UVMonitoringProgram }{@code >}
     *     
     */
    public void setMonitoringProgram(JAXBElement<POCPMT050100UVMonitoringProgram> value) {
        this.monitoringProgram = value;
    }

    /**
     * Gets the value of the characteristic property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link POCPMT050100UVCharacteristic }{@code >}
     *     
     */
    public JAXBElement<POCPMT050100UVCharacteristic> getCharacteristic() {
        return characteristic;
    }

    /**
     * Sets the value of the characteristic property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link POCPMT050100UVCharacteristic }{@code >}
     *     
     */
    public void setCharacteristic(JAXBElement<POCPMT050100UVCharacteristic> value) {
        this.characteristic = value;
    }

    /**
     * Gets the value of the observationGoal property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link POCPMT050100UVObservationGoal }{@code >}
     *     
     */
    public JAXBElement<POCPMT050100UVObservationGoal> getObservationGoal() {
        return observationGoal;
    }

    /**
     * Sets the value of the observationGoal property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link POCPMT050100UVObservationGoal }{@code >}
     *     
     */
    public void setObservationGoal(JAXBElement<POCPMT050100UVObservationGoal> value) {
        this.observationGoal = value;
    }

    /**
     * Gets the value of the substanceSpecification property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link POCPMT090100UVSubstanceSpecification }{@code >}
     *     
     */
    public JAXBElement<POCPMT090100UVSubstanceSpecification> getSubstanceSpecification() {
        return substanceSpecification;
    }

    /**
     * Sets the value of the substanceSpecification property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link POCPMT090100UVSubstanceSpecification }{@code >}
     *     
     */
    public void setSubstanceSpecification(JAXBElement<POCPMT090100UVSubstanceSpecification> value) {
        this.substanceSpecification = value;
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

    /**
     * Gets the value of the typeCode property.
     * 
     * @return
     *     possible object is
     *     {@link ParticipationTargetSubject }
     *     
     */
    public ParticipationTargetSubject getTypeCode() {
        if (typeCode == null) {
            return ParticipationTargetSubject.SBJ;
        } else {
            return typeCode;
        }
    }

    /**
     * Sets the value of the typeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link ParticipationTargetSubject }
     *     
     */
    public void setTypeCode(ParticipationTargetSubject value) {
        this.typeCode = value;
    }

    /**
     * Gets the value of the negationInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isNegationInd() {
        if (negationInd == null) {
            return false;
        } else {
            return negationInd;
        }
    }

    /**
     * Sets the value of the negationInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setNegationInd(Boolean value) {
        this.negationInd = value;
    }

}
