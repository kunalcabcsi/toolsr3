//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.11.22 at 10:46:31 PM IST 
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
 * <p>Java class for POCP_MT060100UV.Subject1 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="POCP_MT060100UV.Subject1"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;group ref="{urn:hl7-org:v3}InfrastructureRootElements"/&gt;
 *         &lt;choice&gt;
 *           &lt;element name="observationCriterion" type="{urn:hl7-org:v3}POCP_MT060100UV.ObservationCriterion"/&gt;
 *           &lt;element name="actCriterion" type="{urn:hl7-org:v3}POCP_MT060100UV.ActCriterion"/&gt;
 *           &lt;element name="substanceAdministrationCriterion" type="{urn:hl7-org:v3}POCP_MT060100UV.SubstanceAdministrationCriterion"/&gt;
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
@XmlType(name = "POCP_MT060100UV.Subject1", propOrder = {
    "realmCode",
    "typeId",
    "templateId",
    "observationCriterion",
    "actCriterion",
    "substanceAdministrationCriterion"
})
public class POCPMT060100UVSubject1 {

    protected List<CS> realmCode;
    protected II typeId;
    protected List<II> templateId;
    @XmlElementRef(name = "observationCriterion", namespace = "urn:hl7-org:v3", type = JAXBElement.class, required = false)
    protected JAXBElement<POCPMT060100UVObservationCriterion> observationCriterion;
    @XmlElementRef(name = "actCriterion", namespace = "urn:hl7-org:v3", type = JAXBElement.class, required = false)
    protected JAXBElement<POCPMT060100UVActCriterion> actCriterion;
    @XmlElementRef(name = "substanceAdministrationCriterion", namespace = "urn:hl7-org:v3", type = JAXBElement.class, required = false)
    protected JAXBElement<POCPMT060100UVSubstanceAdministrationCriterion> substanceAdministrationCriterion;
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
     * Gets the value of the observationCriterion property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link POCPMT060100UVObservationCriterion }{@code >}
     *     
     */
    public JAXBElement<POCPMT060100UVObservationCriterion> getObservationCriterion() {
        return observationCriterion;
    }

    /**
     * Sets the value of the observationCriterion property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link POCPMT060100UVObservationCriterion }{@code >}
     *     
     */
    public void setObservationCriterion(JAXBElement<POCPMT060100UVObservationCriterion> value) {
        this.observationCriterion = value;
    }

    /**
     * Gets the value of the actCriterion property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link POCPMT060100UVActCriterion }{@code >}
     *     
     */
    public JAXBElement<POCPMT060100UVActCriterion> getActCriterion() {
        return actCriterion;
    }

    /**
     * Sets the value of the actCriterion property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link POCPMT060100UVActCriterion }{@code >}
     *     
     */
    public void setActCriterion(JAXBElement<POCPMT060100UVActCriterion> value) {
        this.actCriterion = value;
    }

    /**
     * Gets the value of the substanceAdministrationCriterion property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link POCPMT060100UVSubstanceAdministrationCriterion }{@code >}
     *     
     */
    public JAXBElement<POCPMT060100UVSubstanceAdministrationCriterion> getSubstanceAdministrationCriterion() {
        return substanceAdministrationCriterion;
    }

    /**
     * Sets the value of the substanceAdministrationCriterion property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link POCPMT060100UVSubstanceAdministrationCriterion }{@code >}
     *     
     */
    public void setSubstanceAdministrationCriterion(JAXBElement<POCPMT060100UVSubstanceAdministrationCriterion> value) {
        this.substanceAdministrationCriterion = value;
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
