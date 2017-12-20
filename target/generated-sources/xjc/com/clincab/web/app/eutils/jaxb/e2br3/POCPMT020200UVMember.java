//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.11.22 at 10:46:31 PM IST 
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
 * <p>Java class for POCP_MT020200UV.Member complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="POCP_MT020200UV.Member"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;group ref="{urn:hl7-org:v3}InfrastructureRootElements"/&gt;
 *         &lt;choice&gt;
 *           &lt;element name="groupProductInstance" type="{urn:hl7-org:v3}POCP_MT020200UV.ProductInstance"/&gt;
 *           &lt;element name="groupDeviceInstance" type="{urn:hl7-org:v3}POCP_MT020200UV.DeviceInstance"/&gt;
 *         &lt;/choice&gt;
 *         &lt;element name="subjectOf" type="{urn:hl7-org:v3}POCP_MT020200UV.Subject" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attGroup ref="{urn:hl7-org:v3}InfrastructureRootAttributes"/&gt;
 *       &lt;attribute name="nullFlavor" type="{urn:hl7-org:v3}NullFlavor" /&gt;
 *       &lt;attribute name="classCode" type="{urn:hl7-org:v3}RoleClassMember" default="MBR" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "POCP_MT020200UV.Member", propOrder = {
    "realmCode",
    "typeId",
    "templateId",
    "groupProductInstance",
    "groupDeviceInstance",
    "subjectOf"
})
public class POCPMT020200UVMember {

    protected List<CS> realmCode;
    protected II typeId;
    protected List<II> templateId;
    protected POCPMT020200UVProductInstance groupProductInstance;
    protected POCPMT020200UVDeviceInstance groupDeviceInstance;
    @XmlElement(nillable = true)
    protected List<POCPMT020200UVSubject> subjectOf;
    @XmlAttribute(name = "nullFlavor")
    protected NullFlavor nullFlavor;
    @XmlAttribute(name = "classCode")
    protected RoleClassMember classCode;

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
     * Gets the value of the groupProductInstance property.
     * 
     * @return
     *     possible object is
     *     {@link POCPMT020200UVProductInstance }
     *     
     */
    public POCPMT020200UVProductInstance getGroupProductInstance() {
        return groupProductInstance;
    }

    /**
     * Sets the value of the groupProductInstance property.
     * 
     * @param value
     *     allowed object is
     *     {@link POCPMT020200UVProductInstance }
     *     
     */
    public void setGroupProductInstance(POCPMT020200UVProductInstance value) {
        this.groupProductInstance = value;
    }

    /**
     * Gets the value of the groupDeviceInstance property.
     * 
     * @return
     *     possible object is
     *     {@link POCPMT020200UVDeviceInstance }
     *     
     */
    public POCPMT020200UVDeviceInstance getGroupDeviceInstance() {
        return groupDeviceInstance;
    }

    /**
     * Sets the value of the groupDeviceInstance property.
     * 
     * @param value
     *     allowed object is
     *     {@link POCPMT020200UVDeviceInstance }
     *     
     */
    public void setGroupDeviceInstance(POCPMT020200UVDeviceInstance value) {
        this.groupDeviceInstance = value;
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
     * {@link POCPMT020200UVSubject }
     * 
     * 
     */
    public List<POCPMT020200UVSubject> getSubjectOf() {
        if (subjectOf == null) {
            subjectOf = new ArrayList<POCPMT020200UVSubject>();
        }
        return this.subjectOf;
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
     *     {@link RoleClassMember }
     *     
     */
    public RoleClassMember getClassCode() {
        if (classCode == null) {
            return RoleClassMember.MBR;
        } else {
            return classCode;
        }
    }

    /**
     * Sets the value of the classCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link RoleClassMember }
     *     
     */
    public void setClassCode(RoleClassMember value) {
        this.classCode = value;
    }

}
