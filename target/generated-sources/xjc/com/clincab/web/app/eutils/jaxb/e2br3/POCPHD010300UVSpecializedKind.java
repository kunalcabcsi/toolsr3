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
 * <p>Java class for POCP_HD010300UV.SpecializedKind complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="POCP_HD010300UV.SpecializedKind"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;group ref="{urn:hl7-org:v3}InfrastructureRootElements"/&gt;
 *         &lt;element name="code" type="{urn:hl7-org:v3}CE" minOccurs="0"/&gt;
 *         &lt;element name="generalizedMaterialKind" type="{urn:hl7-org:v3}POCP_HD010300UV.MaterialKind"/&gt;
 *         &lt;element name="subjectOf" type="{urn:hl7-org:v3}POCP_HD010300UV.Subject" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attGroup ref="{urn:hl7-org:v3}InfrastructureRootAttributes"/&gt;
 *       &lt;attribute name="classCode" type="{urn:hl7-org:v3}RoleClassIsSpeciesEntity" default="GEN" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "POCP_HD010300UV.SpecializedKind", propOrder = {
    "realmCode",
    "typeId",
    "templateId",
    "code",
    "generalizedMaterialKind",
    "subjectOf"
})
public class POCPHD010300UVSpecializedKind {

    protected List<CS> realmCode;
    protected II typeId;
    protected List<II> templateId;
    protected CE code;
    @XmlElement(required = true)
    protected POCPHD010300UVMaterialKind generalizedMaterialKind;
    @XmlElement(nillable = true)
    protected List<POCPHD010300UVSubject> subjectOf;
    @XmlAttribute(name = "classCode")
    protected RoleClassIsSpeciesEntity classCode;

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
     * Gets the value of the code property.
     * 
     * @return
     *     possible object is
     *     {@link CE }
     *     
     */
    public CE getCode() {
        return code;
    }

    /**
     * Sets the value of the code property.
     * 
     * @param value
     *     allowed object is
     *     {@link CE }
     *     
     */
    public void setCode(CE value) {
        this.code = value;
    }

    /**
     * Gets the value of the generalizedMaterialKind property.
     * 
     * @return
     *     possible object is
     *     {@link POCPHD010300UVMaterialKind }
     *     
     */
    public POCPHD010300UVMaterialKind getGeneralizedMaterialKind() {
        return generalizedMaterialKind;
    }

    /**
     * Sets the value of the generalizedMaterialKind property.
     * 
     * @param value
     *     allowed object is
     *     {@link POCPHD010300UVMaterialKind }
     *     
     */
    public void setGeneralizedMaterialKind(POCPHD010300UVMaterialKind value) {
        this.generalizedMaterialKind = value;
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
     * {@link POCPHD010300UVSubject }
     * 
     * 
     */
    public List<POCPHD010300UVSubject> getSubjectOf() {
        if (subjectOf == null) {
            subjectOf = new ArrayList<POCPHD010300UVSubject>();
        }
        return this.subjectOf;
    }

    /**
     * Gets the value of the classCode property.
     * 
     * @return
     *     possible object is
     *     {@link RoleClassIsSpeciesEntity }
     *     
     */
    public RoleClassIsSpeciesEntity getClassCode() {
        if (classCode == null) {
            return RoleClassIsSpeciesEntity.GEN;
        } else {
            return classCode;
        }
    }

    /**
     * Sets the value of the classCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link RoleClassIsSpeciesEntity }
     *     
     */
    public void setClassCode(RoleClassIsSpeciesEntity value) {
        this.classCode = value;
    }

}
