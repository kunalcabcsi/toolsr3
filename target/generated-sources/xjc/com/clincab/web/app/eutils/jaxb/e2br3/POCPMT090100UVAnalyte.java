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
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for POCP_MT090100UV.Analyte complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="POCP_MT090100UV.Analyte"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;group ref="{urn:hl7-org:v3}InfrastructureRootElements"/&gt;
 *         &lt;choice&gt;
 *           &lt;element name="identifiedSubstance" type="{urn:hl7-org:v3}POCP_MT080300UV.IdentifiedSubstance"/&gt;
 *           &lt;element name="ingredient" type="{urn:hl7-org:v3}POCP_MT080300UV.Ingredient"/&gt;
 *           &lt;element name="moiety" type="{urn:hl7-org:v3}POCP_MT080300UV.Moiety"/&gt;
 *         &lt;/choice&gt;
 *       &lt;/sequence&gt;
 *       &lt;attGroup ref="{urn:hl7-org:v3}InfrastructureRootAttributes"/&gt;
 *       &lt;attribute name="nullFlavor" type="{urn:hl7-org:v3}NullFlavor" /&gt;
 *       &lt;attribute name="typeCode" type="{urn:hl7-org:v3}cs" default="ALY" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "POCP_MT090100UV.Analyte", propOrder = {
    "realmCode",
    "typeId",
    "templateId",
    "identifiedSubstance",
    "ingredient",
    "moiety"
})
public class POCPMT090100UVAnalyte {

    protected List<CS> realmCode;
    protected II typeId;
    protected List<II> templateId;
    @XmlElementRef(name = "identifiedSubstance", namespace = "urn:hl7-org:v3", type = JAXBElement.class, required = false)
    protected JAXBElement<POCPMT080300UVIdentifiedSubstance> identifiedSubstance;
    @XmlElementRef(name = "ingredient", namespace = "urn:hl7-org:v3", type = JAXBElement.class, required = false)
    protected JAXBElement<POCPMT080300UVIngredient> ingredient;
    @XmlElementRef(name = "moiety", namespace = "urn:hl7-org:v3", type = JAXBElement.class, required = false)
    protected JAXBElement<POCPMT080300UVMoiety> moiety;
    @XmlAttribute(name = "nullFlavor")
    protected NullFlavor nullFlavor;
    @XmlAttribute(name = "typeCode")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String typeCode;

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
     * Gets the value of the identifiedSubstance property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link POCPMT080300UVIdentifiedSubstance }{@code >}
     *     
     */
    public JAXBElement<POCPMT080300UVIdentifiedSubstance> getIdentifiedSubstance() {
        return identifiedSubstance;
    }

    /**
     * Sets the value of the identifiedSubstance property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link POCPMT080300UVIdentifiedSubstance }{@code >}
     *     
     */
    public void setIdentifiedSubstance(JAXBElement<POCPMT080300UVIdentifiedSubstance> value) {
        this.identifiedSubstance = value;
    }

    /**
     * Gets the value of the ingredient property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link POCPMT080300UVIngredient }{@code >}
     *     
     */
    public JAXBElement<POCPMT080300UVIngredient> getIngredient() {
        return ingredient;
    }

    /**
     * Sets the value of the ingredient property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link POCPMT080300UVIngredient }{@code >}
     *     
     */
    public void setIngredient(JAXBElement<POCPMT080300UVIngredient> value) {
        this.ingredient = value;
    }

    /**
     * Gets the value of the moiety property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link POCPMT080300UVMoiety }{@code >}
     *     
     */
    public JAXBElement<POCPMT080300UVMoiety> getMoiety() {
        return moiety;
    }

    /**
     * Sets the value of the moiety property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link POCPMT080300UVMoiety }{@code >}
     *     
     */
    public void setMoiety(JAXBElement<POCPMT080300UVMoiety> value) {
        this.moiety = value;
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
     *     {@link String }
     *     
     */
    public String getTypeCode() {
        if (typeCode == null) {
            return "ALY";
        } else {
            return typeCode;
        }
    }

    /**
     * Sets the value of the typeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTypeCode(String value) {
        this.typeCode = value;
    }

}