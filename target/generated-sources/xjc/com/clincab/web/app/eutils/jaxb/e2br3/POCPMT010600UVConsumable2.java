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
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for POCP_MT010600UV.Consumable2 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="POCP_MT010600UV.Consumable2"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;group ref="{urn:hl7-org:v3}InfrastructureRootElements"/&gt;
 *         &lt;element name="manufacturedProduct" type="{urn:hl7-org:v3}POCP_MT010600UV.ManufacturedProduct"/&gt;
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
@XmlType(name = "POCP_MT010600UV.Consumable2", propOrder = {
    "realmCode",
    "typeId",
    "templateId",
    "manufacturedProduct"
})
public class POCPMT010600UVConsumable2 {

    protected List<CS> realmCode;
    protected II typeId;
    protected List<II> templateId;
    @XmlElement(required = true, nillable = true)
    protected POCPMT010600UVManufacturedProduct manufacturedProduct;
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
     * Gets the value of the manufacturedProduct property.
     * 
     * @return
     *     possible object is
     *     {@link POCPMT010600UVManufacturedProduct }
     *     
     */
    public POCPMT010600UVManufacturedProduct getManufacturedProduct() {
        return manufacturedProduct;
    }

    /**
     * Sets the value of the manufacturedProduct property.
     * 
     * @param value
     *     allowed object is
     *     {@link POCPMT010600UVManufacturedProduct }
     *     
     */
    public void setManufacturedProduct(POCPMT010600UVManufacturedProduct value) {
        this.manufacturedProduct = value;
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
