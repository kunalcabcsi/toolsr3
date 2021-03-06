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
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for POCP_MT010500UV.AdministerableMaterial complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="POCP_MT010500UV.AdministerableMaterial"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;group ref="{urn:hl7-org:v3}InfrastructureRootElements"/&gt;
 *         &lt;element name="administrableProduct" type="{urn:hl7-org:v3}POCP_MT010500UV.Product" minOccurs="0"/&gt;
 *         &lt;element name="subjectOf" type="{urn:hl7-org:v3}POCP_MT010500UV.Subject" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="consumedIn" type="{urn:hl7-org:v3}POCP_MT010500UV.Consumable1" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="productOf" type="{urn:hl7-org:v3}POCP_MT010500UV.Product3" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attGroup ref="{urn:hl7-org:v3}InfrastructureRootAttributes"/&gt;
 *       &lt;attribute name="classCode" type="{urn:hl7-org:v3}RoleClassAdministerableMaterial" default="ADMM" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "POCP_MT010500UV.AdministerableMaterial", propOrder = {
    "realmCode",
    "typeId",
    "templateId",
    "administrableProduct",
    "subjectOf",
    "consumedIn",
    "productOf"
})
public class POCPMT010500UVAdministerableMaterial {

    protected List<CS> realmCode;
    protected II typeId;
    protected List<II> templateId;
    @XmlElementRef(name = "administrableProduct", namespace = "urn:hl7-org:v3", type = JAXBElement.class, required = false)
    protected JAXBElement<POCPMT010500UVProduct> administrableProduct;
    @XmlElement(nillable = true)
    protected List<POCPMT010500UVSubject> subjectOf;
    @XmlElement(nillable = true)
    protected List<POCPMT010500UVConsumable1> consumedIn;
    @XmlElement(nillable = true)
    protected List<POCPMT010500UVProduct3> productOf;
    @XmlAttribute(name = "classCode")
    protected RoleClassAdministerableMaterial classCode;

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
     * Gets the value of the administrableProduct property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link POCPMT010500UVProduct }{@code >}
     *     
     */
    public JAXBElement<POCPMT010500UVProduct> getAdministrableProduct() {
        return administrableProduct;
    }

    /**
     * Sets the value of the administrableProduct property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link POCPMT010500UVProduct }{@code >}
     *     
     */
    public void setAdministrableProduct(JAXBElement<POCPMT010500UVProduct> value) {
        this.administrableProduct = value;
    }

    /**
     * Gets the value of the subjectOf property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the subjectOf property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSubjectOf().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link POCPMT010500UVSubject }
     * 
     * 
     */
    public List<POCPMT010500UVSubject> getSubjectOf() {
        if (subjectOf == null) {
            subjectOf = new ArrayList<POCPMT010500UVSubject>();
        }
        return this.subjectOf;
    }

    /**
     * Gets the value of the consumedIn property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the consumedIn property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getConsumedIn().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link POCPMT010500UVConsumable1 }
     * 
     * 
     */
    public List<POCPMT010500UVConsumable1> getConsumedIn() {
        if (consumedIn == null) {
            consumedIn = new ArrayList<POCPMT010500UVConsumable1>();
        }
        return this.consumedIn;
    }

    /**
     * Gets the value of the productOf property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the productOf property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getProductOf().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link POCPMT010500UVProduct3 }
     * 
     * 
     */
    public List<POCPMT010500UVProduct3> getProductOf() {
        if (productOf == null) {
            productOf = new ArrayList<POCPMT010500UVProduct3>();
        }
        return this.productOf;
    }

    /**
     * Gets the value of the classCode property.
     * 
     * @return
     *     possible object is
     *     {@link RoleClassAdministerableMaterial }
     *     
     */
    public RoleClassAdministerableMaterial getClassCode() {
        if (classCode == null) {
            return RoleClassAdministerableMaterial.ADMM;
        } else {
            return classCode;
        }
    }

    /**
     * Sets the value of the classCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link RoleClassAdministerableMaterial }
     *     
     */
    public void setClassCode(RoleClassAdministerableMaterial value) {
        this.classCode = value;
    }

}
