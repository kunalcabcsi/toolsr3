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
 * <p>Java class for PORR_MT049006UV01.Role complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PORR_MT049006UV01.Role"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;group ref="{urn:hl7-org:v3}InfrastructureRootElements"/&gt;
 *         &lt;element name="code" type="{urn:hl7-org:v3}CE" minOccurs="0"/&gt;
 *         &lt;choice&gt;
 *           &lt;element name="associatedPerson" type="{urn:hl7-org:v3}PORR_MT049006UV01.Person2"/&gt;
 *           &lt;element name="associatedAnimal" type="{urn:hl7-org:v3}PORR_MT049006UV01.Animal"/&gt;
 *         &lt;/choice&gt;
 *         &lt;element name="subjectOf1" type="{urn:hl7-org:v3}PORR_MT049006UV01.Subject" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="subjectOf2" type="{urn:hl7-org:v3}PORR_MT049006UV01.Subject14" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attGroup ref="{urn:hl7-org:v3}InfrastructureRootAttributes"/&gt;
 *       &lt;attribute name="nullFlavor" type="{urn:hl7-org:v3}NullFlavor" /&gt;
 *       &lt;attribute name="classCode" use="required" type="{urn:hl7-org:v3}RoleClassAssociative" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PORR_MT049006UV01.Role", propOrder = {
    "realmCode",
    "typeId",
    "templateId",
    "code",
    "associatedPerson",
    "associatedAnimal",
    "subjectOf1",
    "subjectOf2"
})
public class PORRMT049006UV01Role {

    protected List<CS> realmCode;
    protected II typeId;
    protected List<II> templateId;
    protected CE code;
    @XmlElementRef(name = "associatedPerson", namespace = "urn:hl7-org:v3", type = JAXBElement.class, required = false)
    protected JAXBElement<PORRMT049006UV01Person2> associatedPerson;
    @XmlElementRef(name = "associatedAnimal", namespace = "urn:hl7-org:v3", type = JAXBElement.class, required = false)
    protected JAXBElement<PORRMT049006UV01Animal> associatedAnimal;
    @XmlElement(nillable = true)
    protected List<PORRMT049006UV01Subject> subjectOf1;
    @XmlElement(nillable = true)
    protected List<PORRMT049006UV01Subject14> subjectOf2;
    @XmlAttribute(name = "nullFlavor")
    protected NullFlavor nullFlavor;
    @XmlAttribute(name = "classCode", required = true)
    protected RoleClassAssociative classCode;

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
     * Gets the value of the associatedPerson property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link PORRMT049006UV01Person2 }{@code >}
     *     
     */
    public JAXBElement<PORRMT049006UV01Person2> getAssociatedPerson() {
        return associatedPerson;
    }

    /**
     * Sets the value of the associatedPerson property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link PORRMT049006UV01Person2 }{@code >}
     *     
     */
    public void setAssociatedPerson(JAXBElement<PORRMT049006UV01Person2> value) {
        this.associatedPerson = value;
    }

    /**
     * Gets the value of the associatedAnimal property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link PORRMT049006UV01Animal }{@code >}
     *     
     */
    public JAXBElement<PORRMT049006UV01Animal> getAssociatedAnimal() {
        return associatedAnimal;
    }

    /**
     * Sets the value of the associatedAnimal property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link PORRMT049006UV01Animal }{@code >}
     *     
     */
    public void setAssociatedAnimal(JAXBElement<PORRMT049006UV01Animal> value) {
        this.associatedAnimal = value;
    }

    /**
     * Gets the value of the subjectOf1 property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the subjectOf1 property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSubjectOf1().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PORRMT049006UV01Subject }
     * 
     * 
     */
    public List<PORRMT049006UV01Subject> getSubjectOf1() {
        if (subjectOf1 == null) {
            subjectOf1 = new ArrayList<PORRMT049006UV01Subject>();
        }
        return this.subjectOf1;
    }

    /**
     * Gets the value of the subjectOf2 property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the subjectOf2 property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSubjectOf2().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PORRMT049006UV01Subject14 }
     * 
     * 
     */
    public List<PORRMT049006UV01Subject14> getSubjectOf2() {
        if (subjectOf2 == null) {
            subjectOf2 = new ArrayList<PORRMT049006UV01Subject14>();
        }
        return this.subjectOf2;
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
     *     {@link RoleClassAssociative }
     *     
     */
    public RoleClassAssociative getClassCode() {
        return classCode;
    }

    /**
     * Sets the value of the classCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link RoleClassAssociative }
     *     
     */
    public void setClassCode(RoleClassAssociative value) {
        this.classCode = value;
    }

}
