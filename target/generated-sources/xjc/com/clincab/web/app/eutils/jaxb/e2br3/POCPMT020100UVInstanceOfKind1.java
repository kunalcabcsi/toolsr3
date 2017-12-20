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
 * <p>Java class for POCP_MT020100UV.InstanceOfKind1 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="POCP_MT020100UV.InstanceOfKind1"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;group ref="{urn:hl7-org:v3}InfrastructureRootElements"/&gt;
 *         &lt;element name="quantity" type="{urn:hl7-org:v3}RTO_PQ_PQ" minOccurs="0"/&gt;
 *         &lt;choice&gt;
 *           &lt;element name="productInstanceInstance" type="{urn:hl7-org:v3}POCP_MT020100UV.ProductInstance"/&gt;
 *           &lt;element name="deviceInstanceInstance" type="{urn:hl7-org:v3}POCP_MT020100UV.DeviceInstance"/&gt;
 *         &lt;/choice&gt;
 *         &lt;element name="subjectOf" type="{urn:hl7-org:v3}POCP_MT020100UV.Subject" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attGroup ref="{urn:hl7-org:v3}InfrastructureRootAttributes"/&gt;
 *       &lt;attribute name="classCode" type="{urn:hl7-org:v3}RoleClassInstance" default="INST" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "POCP_MT020100UV.InstanceOfKind1", propOrder = {
    "realmCode",
    "typeId",
    "templateId",
    "quantity",
    "productInstanceInstance",
    "deviceInstanceInstance",
    "subjectOf"
})
public class POCPMT020100UVInstanceOfKind1 {

    protected List<CS> realmCode;
    protected II typeId;
    protected List<II> templateId;
    protected RTOPQPQ quantity;
    protected POCPMT020100UVProductInstance productInstanceInstance;
    protected POCPMT020100UVDeviceInstance deviceInstanceInstance;
    @XmlElement(nillable = true)
    protected List<POCPMT020100UVSubject> subjectOf;
    @XmlAttribute(name = "classCode")
    protected RoleClassInstance classCode;

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
     * Gets the value of the productInstanceInstance property.
     * 
     * @return
     *     possible object is
     *     {@link POCPMT020100UVProductInstance }
     *     
     */
    public POCPMT020100UVProductInstance getProductInstanceInstance() {
        return productInstanceInstance;
    }

    /**
     * Sets the value of the productInstanceInstance property.
     * 
     * @param value
     *     allowed object is
     *     {@link POCPMT020100UVProductInstance }
     *     
     */
    public void setProductInstanceInstance(POCPMT020100UVProductInstance value) {
        this.productInstanceInstance = value;
    }

    /**
     * Gets the value of the deviceInstanceInstance property.
     * 
     * @return
     *     possible object is
     *     {@link POCPMT020100UVDeviceInstance }
     *     
     */
    public POCPMT020100UVDeviceInstance getDeviceInstanceInstance() {
        return deviceInstanceInstance;
    }

    /**
     * Sets the value of the deviceInstanceInstance property.
     * 
     * @param value
     *     allowed object is
     *     {@link POCPMT020100UVDeviceInstance }
     *     
     */
    public void setDeviceInstanceInstance(POCPMT020100UVDeviceInstance value) {
        this.deviceInstanceInstance = value;
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
     * {@link POCPMT020100UVSubject }
     * 
     * 
     */
    public List<POCPMT020100UVSubject> getSubjectOf() {
        if (subjectOf == null) {
            subjectOf = new ArrayList<POCPMT020100UVSubject>();
        }
        return this.subjectOf;
    }

    /**
     * Gets the value of the classCode property.
     * 
     * @return
     *     possible object is
     *     {@link RoleClassInstance }
     *     
     */
    public RoleClassInstance getClassCode() {
        if (classCode == null) {
            return RoleClassInstance.INST;
        } else {
            return classCode;
        }
    }

    /**
     * Sets the value of the classCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link RoleClassInstance }
     *     
     */
    public void setClassCode(RoleClassInstance value) {
        this.classCode = value;
    }

}
