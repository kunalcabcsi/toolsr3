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
 * <p>Java class for POCP_MT010200UV.Part complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="POCP_MT010200UV.Part"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;group ref="{urn:hl7-org:v3}InfrastructureRootElements"/&gt;
 *         &lt;element name="id" type="{urn:hl7-org:v3}II" minOccurs="0"/&gt;
 *         &lt;element name="quantity" type="{urn:hl7-org:v3}RTO_PQ_PQ" minOccurs="0"/&gt;
 *         &lt;element name="partProduct" type="{urn:hl7-org:v3}POCP_MT010200UV.Product"/&gt;
 *         &lt;element name="subjectOf" type="{urn:hl7-org:v3}POCP_MT010200UV.Subject" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="deviceOf" type="{urn:hl7-org:v3}POCP_MT010200UV.Device" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="consumedIn" type="{urn:hl7-org:v3}POCP_MT010200UV.Consumable1" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="productOf" type="{urn:hl7-org:v3}POCP_MT010200UV.Product3" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="indirectTargetOf" type="{urn:hl7-org:v3}POCP_MT010200UV.IndirectTarget" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attGroup ref="{urn:hl7-org:v3}InfrastructureRootAttributes"/&gt;
 *       &lt;attribute name="nullFlavor" type="{urn:hl7-org:v3}NullFlavor" /&gt;
 *       &lt;attribute name="classCode" type="{urn:hl7-org:v3}RoleClassPart" default="PART" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "POCP_MT010200UV.Part", propOrder = {
    "realmCode",
    "typeId",
    "templateId",
    "id",
    "quantity",
    "partProduct",
    "subjectOf",
    "deviceOf",
    "consumedIn",
    "productOf",
    "indirectTargetOf"
})
public class POCPMT010200UVPart {

    protected List<CS> realmCode;
    protected II typeId;
    protected List<II> templateId;
    protected II id;
    protected RTOPQPQ quantity;
    @XmlElement(required = true)
    protected POCPMT010200UVProduct partProduct;
    @XmlElement(nillable = true)
    protected List<POCPMT010200UVSubject> subjectOf;
    @XmlElement(nillable = true)
    protected List<POCPMT010200UVDevice> deviceOf;
    @XmlElement(nillable = true)
    protected List<POCPMT010200UVConsumable1> consumedIn;
    @XmlElement(nillable = true)
    protected List<POCPMT010200UVProduct3> productOf;
    @XmlElement(nillable = true)
    protected List<POCPMT010200UVIndirectTarget> indirectTargetOf;
    @XmlAttribute(name = "nullFlavor")
    protected NullFlavor nullFlavor;
    @XmlAttribute(name = "classCode")
    protected RoleClassPart classCode;

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
     * Gets the value of the quantity property.
     * 
     * @return
     *     possible object is
     *     {@link RTOPQPQ }
     *     
     */
    public RTOPQPQ getQuantity() {
        return quantity;
    }

    /**
     * Sets the value of the quantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link RTOPQPQ }
     *     
     */
    public void setQuantity(RTOPQPQ value) {
        this.quantity = value;
    }

    /**
     * Gets the value of the partProduct property.
     * 
     * @return
     *     possible object is
     *     {@link POCPMT010200UVProduct }
     *     
     */
    public POCPMT010200UVProduct getPartProduct() {
        return partProduct;
    }

    /**
     * Sets the value of the partProduct property.
     * 
     * @param value
     *     allowed object is
     *     {@link POCPMT010200UVProduct }
     *     
     */
    public void setPartProduct(POCPMT010200UVProduct value) {
        this.partProduct = value;
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
     * {@link POCPMT010200UVSubject }
     * 
     * 
     */
    public List<POCPMT010200UVSubject> getSubjectOf() {
        if (subjectOf == null) {
            subjectOf = new ArrayList<POCPMT010200UVSubject>();
        }
        return this.subjectOf;
    }

    /**
     * Gets the value of the deviceOf property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the deviceOf property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDeviceOf().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link POCPMT010200UVDevice }
     * 
     * 
     */
    public List<POCPMT010200UVDevice> getDeviceOf() {
        if (deviceOf == null) {
            deviceOf = new ArrayList<POCPMT010200UVDevice>();
        }
        return this.deviceOf;
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
     * {@link POCPMT010200UVConsumable1 }
     * 
     * 
     */
    public List<POCPMT010200UVConsumable1> getConsumedIn() {
        if (consumedIn == null) {
            consumedIn = new ArrayList<POCPMT010200UVConsumable1>();
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
     * {@link POCPMT010200UVProduct3 }
     * 
     * 
     */
    public List<POCPMT010200UVProduct3> getProductOf() {
        if (productOf == null) {
            productOf = new ArrayList<POCPMT010200UVProduct3>();
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
     * {@link POCPMT010200UVIndirectTarget }
     * 
     * 
     */
    public List<POCPMT010200UVIndirectTarget> getIndirectTargetOf() {
        if (indirectTargetOf == null) {
            indirectTargetOf = new ArrayList<POCPMT010200UVIndirectTarget>();
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
     *     {@link RoleClassPart }
     *     
     */
    public RoleClassPart getClassCode() {
        if (classCode == null) {
            return RoleClassPart.PART;
        } else {
            return classCode;
        }
    }

    /**
     * Sets the value of the classCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link RoleClassPart }
     *     
     */
    public void setClassCode(RoleClassPart value) {
        this.classCode = value;
    }

}
