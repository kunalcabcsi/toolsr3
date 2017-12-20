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
 * <p>Java class for POCP_MT060100UV.Subject2 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="POCP_MT060100UV.Subject2"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;group ref="{urn:hl7-org:v3}InfrastructureRootElements"/&gt;
 *         &lt;choice&gt;
 *           &lt;choice&gt;
 *             &lt;element name="characteristic" type="{urn:hl7-org:v3}POCP_MT050200UV.Characteristic"/&gt;
 *             &lt;element name="observationGoal" type="{urn:hl7-org:v3}POCP_MT050200UV.ObservationGoal"/&gt;
 *             &lt;element name="substanceSpecification" type="{urn:hl7-org:v3}POCP_MT090100UV.SubstanceSpecification"/&gt;
 *           &lt;/choice&gt;
 *           &lt;element name="issue" type="{urn:hl7-org:v3}POCP_MT060100UV.Issue"/&gt;
 *         &lt;/choice&gt;
 *       &lt;/sequence&gt;
 *       &lt;attGroup ref="{urn:hl7-org:v3}InfrastructureRootAttributes"/&gt;
 *       &lt;attribute name="nullFlavor" type="{urn:hl7-org:v3}NullFlavor" /&gt;
 *       &lt;attribute name="typeCode" type="{urn:hl7-org:v3}ActRelationshipHasSubject" default="SUBJ" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "POCP_MT060100UV.Subject2", propOrder = {
    "realmCode",
    "typeId",
    "templateId",
    "characteristic",
    "observationGoal",
    "substanceSpecification",
    "issue"
})
public class POCPMT060100UVSubject2 {

    protected List<CS> realmCode;
    protected II typeId;
    protected List<II> templateId;
    @XmlElementRef(name = "characteristic", namespace = "urn:hl7-org:v3", type = JAXBElement.class, required = false)
    protected JAXBElement<POCPMT050200UVCharacteristic> characteristic;
    @XmlElementRef(name = "observationGoal", namespace = "urn:hl7-org:v3", type = JAXBElement.class, required = false)
    protected JAXBElement<POCPMT050200UVObservationGoal> observationGoal;
    @XmlElementRef(name = "substanceSpecification", namespace = "urn:hl7-org:v3", type = JAXBElement.class, required = false)
    protected JAXBElement<POCPMT090100UVSubstanceSpecification> substanceSpecification;
    @XmlElementRef(name = "issue", namespace = "urn:hl7-org:v3", type = JAXBElement.class, required = false)
    protected JAXBElement<POCPMT060100UVIssue> issue;
    @XmlAttribute(name = "nullFlavor")
    protected NullFlavor nullFlavor;
    @XmlAttribute(name = "typeCode")
    protected ActRelationshipHasSubject typeCode;

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
     * Gets the value of the characteristic property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link POCPMT050200UVCharacteristic }{@code >}
     *     
     */
    public JAXBElement<POCPMT050200UVCharacteristic> getCharacteristic() {
        return characteristic;
    }

    /**
     * Sets the value of the characteristic property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link POCPMT050200UVCharacteristic }{@code >}
     *     
     */
    public void setCharacteristic(JAXBElement<POCPMT050200UVCharacteristic> value) {
        this.characteristic = value;
    }

    /**
     * Gets the value of the observationGoal property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link POCPMT050200UVObservationGoal }{@code >}
     *     
     */
    public JAXBElement<POCPMT050200UVObservationGoal> getObservationGoal() {
        return observationGoal;
    }

    /**
     * Sets the value of the observationGoal property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link POCPMT050200UVObservationGoal }{@code >}
     *     
     */
    public void setObservationGoal(JAXBElement<POCPMT050200UVObservationGoal> value) {
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
     * Gets the value of the issue property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link POCPMT060100UVIssue }{@code >}
     *     
     */
    public JAXBElement<POCPMT060100UVIssue> getIssue() {
        return issue;
    }

    /**
     * Sets the value of the issue property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link POCPMT060100UVIssue }{@code >}
     *     
     */
    public void setIssue(JAXBElement<POCPMT060100UVIssue> value) {
        this.issue = value;
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
     *     {@link ActRelationshipHasSubject }
     *     
     */
    public ActRelationshipHasSubject getTypeCode() {
        if (typeCode == null) {
            return ActRelationshipHasSubject.SUBJ;
        } else {
            return typeCode;
        }
    }

    /**
     * Sets the value of the typeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActRelationshipHasSubject }
     *     
     */
    public void setTypeCode(ActRelationshipHasSubject value) {
        this.typeCode = value;
    }

}
