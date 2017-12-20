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
 * <p>Java class for COCT_HD080000UV.Subject2 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="COCT_HD080000UV.Subject2"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;group ref="{urn:hl7-org:v3}InfrastructureRootElements"/&gt;
 *         &lt;element name="sequenceNumber" type="{urn:hl7-org:v3}INT" minOccurs="0"/&gt;
 *         &lt;choice&gt;
 *           &lt;choice&gt;
 *             &lt;element name="specimenProcessStep" type="{urn:hl7-org:v3}COCT_HD080000UV.SpecimenProcessStep"/&gt;
 *             &lt;element name="specimenCollectionProcess" type="{urn:hl7-org:v3}COCT_HD080000UV.SpecimenCollectionProcess"/&gt;
 *           &lt;/choice&gt;
 *           &lt;element name="observationEvent" type="{urn:hl7-org:v3}COCT_HD080000UV.ObservationEvent"/&gt;
 *         &lt;/choice&gt;
 *       &lt;/sequence&gt;
 *       &lt;attGroup ref="{urn:hl7-org:v3}InfrastructureRootAttributes"/&gt;
 *       &lt;attribute name="nullFlavor" type="{urn:hl7-org:v3}NullFlavor" /&gt;
 *       &lt;attribute name="typeCode" use="required" type="{urn:hl7-org:v3}ParticipationTargetSubject" /&gt;
 *       &lt;attribute name="contextControlCode" type="{urn:hl7-org:v3}ContextControl" default="OP" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "COCT_HD080000UV.Subject2", propOrder = {
    "realmCode",
    "typeId",
    "templateId",
    "sequenceNumber",
    "specimenProcessStep",
    "specimenCollectionProcess",
    "observationEvent"
})
public class COCTHD080000UVSubject2 {

    protected List<CS> realmCode;
    protected II typeId;
    protected List<II> templateId;
    protected INT sequenceNumber;
    @XmlElementRef(name = "specimenProcessStep", namespace = "urn:hl7-org:v3", type = JAXBElement.class, required = false)
    protected JAXBElement<COCTHD080000UVSpecimenProcessStep> specimenProcessStep;
    @XmlElementRef(name = "specimenCollectionProcess", namespace = "urn:hl7-org:v3", type = JAXBElement.class, required = false)
    protected JAXBElement<COCTHD080000UVSpecimenCollectionProcess> specimenCollectionProcess;
    @XmlElementRef(name = "observationEvent", namespace = "urn:hl7-org:v3", type = JAXBElement.class, required = false)
    protected JAXBElement<COCTHD080000UVObservationEvent> observationEvent;
    @XmlAttribute(name = "nullFlavor")
    protected NullFlavor nullFlavor;
    @XmlAttribute(name = "typeCode", required = true)
    protected ParticipationTargetSubject typeCode;
    @XmlAttribute(name = "contextControlCode")
    protected ContextControl contextControlCode;

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
     * Gets the value of the sequenceNumber property.
     * 
     * @return
     *     possible object is
     *     {@link INT }
     *     
     */
    public INT getSequenceNumber() {
        return sequenceNumber;
    }

    /**
     * Sets the value of the sequenceNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link INT }
     *     
     */
    public void setSequenceNumber(INT value) {
        this.sequenceNumber = value;
    }

    /**
     * Gets the value of the specimenProcessStep property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link COCTHD080000UVSpecimenProcessStep }{@code >}
     *     
     */
    public JAXBElement<COCTHD080000UVSpecimenProcessStep> getSpecimenProcessStep() {
        return specimenProcessStep;
    }

    /**
     * Sets the value of the specimenProcessStep property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link COCTHD080000UVSpecimenProcessStep }{@code >}
     *     
     */
    public void setSpecimenProcessStep(JAXBElement<COCTHD080000UVSpecimenProcessStep> value) {
        this.specimenProcessStep = value;
    }

    /**
     * Gets the value of the specimenCollectionProcess property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link COCTHD080000UVSpecimenCollectionProcess }{@code >}
     *     
     */
    public JAXBElement<COCTHD080000UVSpecimenCollectionProcess> getSpecimenCollectionProcess() {
        return specimenCollectionProcess;
    }

    /**
     * Sets the value of the specimenCollectionProcess property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link COCTHD080000UVSpecimenCollectionProcess }{@code >}
     *     
     */
    public void setSpecimenCollectionProcess(JAXBElement<COCTHD080000UVSpecimenCollectionProcess> value) {
        this.specimenCollectionProcess = value;
    }

    /**
     * Gets the value of the observationEvent property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link COCTHD080000UVObservationEvent }{@code >}
     *     
     */
    public JAXBElement<COCTHD080000UVObservationEvent> getObservationEvent() {
        return observationEvent;
    }

    /**
     * Sets the value of the observationEvent property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link COCTHD080000UVObservationEvent }{@code >}
     *     
     */
    public void setObservationEvent(JAXBElement<COCTHD080000UVObservationEvent> value) {
        this.observationEvent = value;
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
        return typeCode;
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
     * Gets the value of the contextControlCode property.
     * 
     * @return
     *     possible object is
     *     {@link ContextControl }
     *     
     */
    public ContextControl getContextControlCode() {
        if (contextControlCode == null) {
            return ContextControl.OP;
        } else {
            return contextControlCode;
        }
    }

    /**
     * Sets the value of the contextControlCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link ContextControl }
     *     
     */
    public void setContextControlCode(ContextControl value) {
        this.contextControlCode = value;
    }

}
