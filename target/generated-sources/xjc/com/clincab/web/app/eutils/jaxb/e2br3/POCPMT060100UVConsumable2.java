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
 * <p>Java class for POCP_MT060100UV.Consumable2 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="POCP_MT060100UV.Consumable2"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;group ref="{urn:hl7-org:v3}InfrastructureRootElements"/&gt;
 *         &lt;choice&gt;
 *           &lt;choice&gt;
 *             &lt;element name="manufacturedProduct21" type="{urn:hl7-org:v3}POCP_MT010600UV.ManufacturedProduct2"/&gt;
 *             &lt;element name="content11" type="{urn:hl7-org:v3}POCP_MT010600UV.Content1"/&gt;
 *             &lt;element name="content1" type="{urn:hl7-org:v3}POCP_MT010600UV.Content"/&gt;
 *           &lt;/choice&gt;
 *           &lt;choice&gt;
 *             &lt;element name="administerableMaterial" type="{urn:hl7-org:v3}POCP_MT010600UV.AdministerableMaterial"/&gt;
 *             &lt;element name="manufacturedProduct3" type="{urn:hl7-org:v3}POCP_MT010600UV.ManufacturedProduct3"/&gt;
 *             &lt;element name="part" type="{urn:hl7-org:v3}POCP_MT010600UV.Part"/&gt;
 *             &lt;element name="manufacturedProduct" type="{urn:hl7-org:v3}POCP_MT010600UV.ManufacturedProduct"/&gt;
 *           &lt;/choice&gt;
 *           &lt;element name="ingredient" type="{urn:hl7-org:v3}POCP_MT010600UV.Ingredient"/&gt;
 *         &lt;/choice&gt;
 *       &lt;/sequence&gt;
 *       &lt;attGroup ref="{urn:hl7-org:v3}InfrastructureRootAttributes"/&gt;
 *       &lt;attribute name="nullFlavor" type="{urn:hl7-org:v3}NullFlavor" /&gt;
 *       &lt;attribute name="typeCode" type="{urn:hl7-org:v3}ParticipationConsumable" default="CSM" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "POCP_MT060100UV.Consumable2", propOrder = {
    "realmCode",
    "typeId",
    "templateId",
    "manufacturedProduct21",
    "content11",
    "content1",
    "administerableMaterial",
    "manufacturedProduct3",
    "part",
    "manufacturedProduct",
    "ingredient"
})
public class POCPMT060100UVConsumable2 {

    protected List<CS> realmCode;
    protected II typeId;
    protected List<II> templateId;
    @XmlElementRef(name = "manufacturedProduct21", namespace = "urn:hl7-org:v3", type = JAXBElement.class, required = false)
    protected JAXBElement<POCPMT010600UVManufacturedProduct2> manufacturedProduct21;
    @XmlElementRef(name = "content11", namespace = "urn:hl7-org:v3", type = JAXBElement.class, required = false)
    protected JAXBElement<POCPMT010600UVContent1> content11;
    @XmlElementRef(name = "content1", namespace = "urn:hl7-org:v3", type = JAXBElement.class, required = false)
    protected JAXBElement<POCPMT010600UVContent> content1;
    @XmlElementRef(name = "administerableMaterial", namespace = "urn:hl7-org:v3", type = JAXBElement.class, required = false)
    protected JAXBElement<POCPMT010600UVAdministerableMaterial> administerableMaterial;
    @XmlElementRef(name = "manufacturedProduct3", namespace = "urn:hl7-org:v3", type = JAXBElement.class, required = false)
    protected JAXBElement<POCPMT010600UVManufacturedProduct3> manufacturedProduct3;
    @XmlElementRef(name = "part", namespace = "urn:hl7-org:v3", type = JAXBElement.class, required = false)
    protected JAXBElement<POCPMT010600UVPart> part;
    @XmlElementRef(name = "manufacturedProduct", namespace = "urn:hl7-org:v3", type = JAXBElement.class, required = false)
    protected JAXBElement<POCPMT010600UVManufacturedProduct> manufacturedProduct;
    @XmlElementRef(name = "ingredient", namespace = "urn:hl7-org:v3", type = JAXBElement.class, required = false)
    protected JAXBElement<POCPMT010600UVIngredient> ingredient;
    @XmlAttribute(name = "nullFlavor")
    protected NullFlavor nullFlavor;
    @XmlAttribute(name = "typeCode")
    protected ParticipationConsumable typeCode;

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
     * Gets the value of the manufacturedProduct21 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link POCPMT010600UVManufacturedProduct2 }{@code >}
     *     
     */
    public JAXBElement<POCPMT010600UVManufacturedProduct2> getManufacturedProduct21() {
        return manufacturedProduct21;
    }

    /**
     * Sets the value of the manufacturedProduct21 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link POCPMT010600UVManufacturedProduct2 }{@code >}
     *     
     */
    public void setManufacturedProduct21(JAXBElement<POCPMT010600UVManufacturedProduct2> value) {
        this.manufacturedProduct21 = value;
    }

    /**
     * Gets the value of the content11 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link POCPMT010600UVContent1 }{@code >}
     *     
     */
    public JAXBElement<POCPMT010600UVContent1> getContent11() {
        return content11;
    }

    /**
     * Sets the value of the content11 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link POCPMT010600UVContent1 }{@code >}
     *     
     */
    public void setContent11(JAXBElement<POCPMT010600UVContent1> value) {
        this.content11 = value;
    }

    /**
     * Gets the value of the content1 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link POCPMT010600UVContent }{@code >}
     *     
     */
    public JAXBElement<POCPMT010600UVContent> getContent1() {
        return content1;
    }

    /**
     * Sets the value of the content1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link POCPMT010600UVContent }{@code >}
     *     
     */
    public void setContent1(JAXBElement<POCPMT010600UVContent> value) {
        this.content1 = value;
    }

    /**
     * Gets the value of the administerableMaterial property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link POCPMT010600UVAdministerableMaterial }{@code >}
     *     
     */
    public JAXBElement<POCPMT010600UVAdministerableMaterial> getAdministerableMaterial() {
        return administerableMaterial;
    }

    /**
     * Sets the value of the administerableMaterial property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link POCPMT010600UVAdministerableMaterial }{@code >}
     *     
     */
    public void setAdministerableMaterial(JAXBElement<POCPMT010600UVAdministerableMaterial> value) {
        this.administerableMaterial = value;
    }

    /**
     * Gets the value of the manufacturedProduct3 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link POCPMT010600UVManufacturedProduct3 }{@code >}
     *     
     */
    public JAXBElement<POCPMT010600UVManufacturedProduct3> getManufacturedProduct3() {
        return manufacturedProduct3;
    }

    /**
     * Sets the value of the manufacturedProduct3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link POCPMT010600UVManufacturedProduct3 }{@code >}
     *     
     */
    public void setManufacturedProduct3(JAXBElement<POCPMT010600UVManufacturedProduct3> value) {
        this.manufacturedProduct3 = value;
    }

    /**
     * Gets the value of the part property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link POCPMT010600UVPart }{@code >}
     *     
     */
    public JAXBElement<POCPMT010600UVPart> getPart() {
        return part;
    }

    /**
     * Sets the value of the part property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link POCPMT010600UVPart }{@code >}
     *     
     */
    public void setPart(JAXBElement<POCPMT010600UVPart> value) {
        this.part = value;
    }

    /**
     * Gets the value of the manufacturedProduct property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link POCPMT010600UVManufacturedProduct }{@code >}
     *     
     */
    public JAXBElement<POCPMT010600UVManufacturedProduct> getManufacturedProduct() {
        return manufacturedProduct;
    }

    /**
     * Sets the value of the manufacturedProduct property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link POCPMT010600UVManufacturedProduct }{@code >}
     *     
     */
    public void setManufacturedProduct(JAXBElement<POCPMT010600UVManufacturedProduct> value) {
        this.manufacturedProduct = value;
    }

    /**
     * Gets the value of the ingredient property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link POCPMT010600UVIngredient }{@code >}
     *     
     */
    public JAXBElement<POCPMT010600UVIngredient> getIngredient() {
        return ingredient;
    }

    /**
     * Sets the value of the ingredient property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link POCPMT010600UVIngredient }{@code >}
     *     
     */
    public void setIngredient(JAXBElement<POCPMT010600UVIngredient> value) {
        this.ingredient = value;
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
     *     {@link ParticipationConsumable }
     *     
     */
    public ParticipationConsumable getTypeCode() {
        if (typeCode == null) {
            return ParticipationConsumable.CSM;
        } else {
            return typeCode;
        }
    }

    /**
     * Sets the value of the typeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link ParticipationConsumable }
     *     
     */
    public void setTypeCode(ParticipationConsumable value) {
        this.typeCode = value;
    }

}