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
 * <p>Java class for POCP_HD020100UV.Part complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="POCP_HD020100UV.Part"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;group ref="{urn:hl7-org:v3}InfrastructureRootElements"/&gt;
 *         &lt;choice&gt;
 *           &lt;element name="partProductInstance" type="{urn:hl7-org:v3}POCP_HD020100UV.ProductInstance"/&gt;
 *           &lt;element name="partDeviceInstance" type="{urn:hl7-org:v3}POCP_HD020100UV.DeviceInstance"/&gt;
 *         &lt;/choice&gt;
 *         &lt;element name="subjectOf" type="{urn:hl7-org:v3}POCP_HD020100UV.Subject" maxOccurs="unbounded" minOccurs="0"/&gt;
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
@XmlType(name = "POCP_HD020100UV.Part", propOrder = {
    "realmCode",
    "typeId",
    "templateId",
    "partProductInstance",
    "partDeviceInstance",
    "subjectOf"
})
public class POCPHD020100UVPart {

    protected List<CS> realmCode;
    protected II typeId;
    protected List<II> templateId;
    protected POCPHD020100UVProductInstance partProductInstance;
    protected POCPHD020100UVDeviceInstance partDeviceInstance;
    @XmlElement(nillable = true)
    protected List<POCPHD020100UVSubject> subjectOf;
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
     * Gets the value of the partProductInstance property.
     * 
     * @return
     *     possible object is
     *     {@link POCPHD020100UVProductInstance }
     *     
     */
    public POCPHD020100UVProductInstance getPartProductInstance() {
        return partProductInstance;
    }

    /**
     * Sets the value of the partProductInstance property.
     * 
     * @param value
     *     allowed object is
     *     {@link POCPHD020100UVProductInstance }
     *     
     */
    public void setPartProductInstance(POCPHD020100UVProductInstance value) {
        this.partProductInstance = value;
    }

    /**
     * Gets the value of the partDeviceInstance property.
     * 
     * @return
     *     possible object is
     *     {@link POCPHD020100UVDeviceInstance }
     *     
     */
    public POCPHD020100UVDeviceInstance getPartDeviceInstance() {
        return partDeviceInstance;
    }

    /**
     * Sets the value of the partDeviceInstance property.
     * 
     * @param value
     *     allowed object is
     *     {@link POCPHD020100UVDeviceInstance }
     *     
     */
    public void setPartDeviceInstance(POCPHD020100UVDeviceInstance value) {
        this.partDeviceInstance = value;
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
     * {@link POCPHD020100UVSubject }
     * 
     * 
     */
    public List<POCPHD020100UVSubject> getSubjectOf() {
        if (subjectOf == null) {
            subjectOf = new ArrayList<POCPHD020100UVSubject>();
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
