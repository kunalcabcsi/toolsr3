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
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for POCP_MT010600UV.ManufacturedProduct2 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="POCP_MT010600UV.ManufacturedProduct2"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;group ref="{urn:hl7-org:v3}InfrastructureRootElements"/&gt;
 *         &lt;element name="id" type="{urn:hl7-org:v3}II" minOccurs="0"/&gt;
 *         &lt;element name="manufacturerOrganization" type="{urn:hl7-org:v3}POCP_MT030200UV.Organization" minOccurs="0"/&gt;
 *         &lt;element name="subjectOf" type="{urn:hl7-org:v3}POCP_MT010600UV.Subject" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="productOf" type="{urn:hl7-org:v3}POCP_MT010600UV.Product2" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="indirectTargetOf" type="{urn:hl7-org:v3}POCP_MT010600UV.IndirectTarget" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attGroup ref="{urn:hl7-org:v3}InfrastructureRootAttributes"/&gt;
 *       &lt;attribute name="nullFlavor" type="{urn:hl7-org:v3}NullFlavor" /&gt;
 *       &lt;attribute name="classCode" type="{urn:hl7-org:v3}RoleClassManufacturedProduct" default="MANU" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "POCP_MT010600UV.ManufacturedProduct2", propOrder = {
    "realmCode",
    "typeId",
    "templateId",
    "id",
    "manufacturerOrganization",
    "subjectOf",
    "productOf",
    "indirectTargetOf"
})
public class POCPMT010600UVManufacturedProduct2 {

    protected List<CS> realmCode;
    protected II typeId;
    protected List<II> templateId;
    protected II id;
    @XmlElementRef(name = "manufacturerOrganization", namespace = "urn:hl7-org:v3", type = JAXBElement.class, required = false)
    protected JAXBElement<POCPMT030200UVOrganization> manufacturerOrganization;
    @XmlElement(nillable = true)
    protected List<POCPMT010600UVSubject> subjectOf;
    @XmlElement(nillable = true)
    protected List<POCPMT010600UVProduct2> productOf;
    @XmlElement(nillable = true)
    protected List<POCPMT010600UVIndirectTarget> indirectTargetOf;
    @XmlAttribute(name = "nullFlavor")
    protected NullFlavor nullFlavor;
    @XmlAttribute(name = "classCode")
    protected RoleClassManufacturedProduct classCode;

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
     * Gets the value of the manufacturerOrganization property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link POCPMT030200UVOrganization }{@code >}
     *     
     */
    public JAXBElement<POCPMT030200UVOrganization> getManufacturerOrganization() {
        return manufacturerOrganization;
    }

    /**
     * Sets the value of the manufacturerOrganization property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link POCPMT030200UVOrganization }{@code >}
     *     
     */
    public void setManufacturerOrganization(JAXBElement<POCPMT030200UVOrganization> value) {
        this.manufacturerOrganization = value;
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
     * {@link POCPMT010600UVSubject }
     * 
     * 
     */
    public List<POCPMT010600UVSubject> getSubjectOf() {
        if (subjectOf == null) {
            subjectOf = new ArrayList<POCPMT010600UVSubject>();
        }
        return this.subjectOf;
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
     * {@link POCPMT010600UVProduct2 }
     * 
     * 
     */
    public List<POCPMT010600UVProduct2> getProductOf() {
        if (productOf == null) {
            productOf = new ArrayList<POCPMT010600UVProduct2>();
        }
        return this.productOf;
    }

    /**
     * Gets the value of the indirectTargetOf property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the indirectTargetOf property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getIndirectTargetOf().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link POCPMT010600UVIndirectTarget }
     * 
     * 
     */
    public List<POCPMT010600UVIndirectTarget> getIndirectTargetOf() {
        if (indirectTargetOf == null) {
            indirectTargetOf = new ArrayList<POCPMT010600UVIndirectTarget>();
        }
        return this.indirectTargetOf;
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
     * Gets the value of the classCode property.
     * 
     * @return
     *     possible object is
     *     {@link RoleClassManufacturedProduct }
     *     
     */
    public RoleClassManufacturedProduct getClassCode() {
        if (classCode == null) {
            return RoleClassManufacturedProduct.MANU;
        } else {
            return classCode;
        }
    }

    /**
     * Sets the value of the classCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link RoleClassManufacturedProduct }
     *     
     */
    public void setClassCode(RoleClassManufacturedProduct value) {
        this.classCode = value;
    }

}
