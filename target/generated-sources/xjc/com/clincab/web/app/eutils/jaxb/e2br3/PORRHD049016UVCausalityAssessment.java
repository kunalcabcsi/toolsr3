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
 * <p>Java class for PORR_HD049016UV.CausalityAssessment complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PORR_HD049016UV.CausalityAssessment"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;group ref="{urn:hl7-org:v3}InfrastructureRootElements"/&gt;
 *         &lt;element name="code" type="{urn:hl7-org:v3}CD" minOccurs="0"/&gt;
 *         &lt;element name="value" type="{urn:hl7-org:v3}ANY" minOccurs="0"/&gt;
 *         &lt;element name="methodCode" type="{urn:hl7-org:v3}CE" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="author" type="{urn:hl7-org:v3}PORR_HD049016UV.Author2" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="subject1" type="{urn:hl7-org:v3}PORR_HD049016UV.Subject3" minOccurs="0"/&gt;
 *         &lt;element name="subject2" type="{urn:hl7-org:v3}PORR_HD049016UV.Subject11" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attGroup ref="{urn:hl7-org:v3}InfrastructureRootAttributes"/&gt;
 *       &lt;attribute name="nullFlavor" type="{urn:hl7-org:v3}NullFlavor" /&gt;
 *       &lt;attribute name="classCode" use="required" type="{urn:hl7-org:v3}ActClassObservation" /&gt;
 *       &lt;attribute name="moodCode" use="required" type="{urn:hl7-org:v3}ActMoodEventOccurrence" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PORR_HD049016UV.CausalityAssessment", propOrder = {
    "realmCode",
    "typeId",
    "templateId",
    "code",
    "value",
    "methodCode",
    "author",
    "subject1",
    "subject2"
})
public class PORRHD049016UVCausalityAssessment {

    protected List<CS> realmCode;
    protected II typeId;
    protected List<II> templateId;
    protected CD code;
    protected ANY value;
    protected List<CE> methodCode;
    @XmlElement(nillable = true)
    protected List<PORRHD049016UVAuthor2> author;
    @XmlElementRef(name = "subject1", namespace = "urn:hl7-org:v3", type = JAXBElement.class, required = false)
    protected JAXBElement<PORRHD049016UVSubject3> subject1;
    @XmlElementRef(name = "subject2", namespace = "urn:hl7-org:v3", type = JAXBElement.class, required = false)
    protected JAXBElement<PORRHD049016UVSubject11> subject2;
    @XmlAttribute(name = "nullFlavor")
    protected NullFlavor nullFlavor;
    @XmlAttribute(name = "classCode", required = true)
    protected ActClassObservation classCode;
    @XmlAttribute(name = "moodCode", required = true)
    protected ActMoodEventOccurrence moodCode;

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
     *     {@link CD }
     *     
     */
    public CD getCode() {
        return code;
    }

    /**
     * Sets the value of the code property.
     * 
     * @param value
     *     allowed object is
     *     {@link CD }
     *     
     */
    public void setCode(CD value) {
        this.code = value;
    }

    /**
     * Gets the value of the value property.
     * 
     * @return
     *     possible object is
     *     {@link ANY }
     *     
     */
    public ANY getValue() {
        return value;
    }

    /**
     * Sets the value of the value property.
     * 
     * @param value
     *     allowed object is
     *     {@link ANY }
     *     
     */
    public void setValue(ANY value) {
        this.value = value;
    }

    /**
     * Gets the value of the methodCode property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the methodCode property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMethodCode().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CE }
     * 
     * 
     */
    public List<CE> getMethodCode() {
        if (methodCode == null) {
            methodCode = new ArrayList<CE>();
        }
        return this.methodCode;
    }

    /**
     * Gets the value of the author property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the author property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAuthor().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PORRHD049016UVAuthor2 }
     * 
     * 
     */
    public List<PORRHD049016UVAuthor2> getAuthor() {
        if (author == null) {
            author = new ArrayList<PORRHD049016UVAuthor2>();
        }
        return this.author;
    }

    /**
     * Gets the value of the subject1 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link PORRHD049016UVSubject3 }{@code >}
     *     
     */
    public JAXBElement<PORRHD049016UVSubject3> getSubject1() {
        return subject1;
    }

    /**
     * Sets the value of the subject1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link PORRHD049016UVSubject3 }{@code >}
     *     
     */
    public void setSubject1(JAXBElement<PORRHD049016UVSubject3> value) {
        this.subject1 = value;
    }

    /**
     * Gets the value of the subject2 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link PORRHD049016UVSubject11 }{@code >}
     *     
     */
    public JAXBElement<PORRHD049016UVSubject11> getSubject2() {
        return subject2;
    }

    /**
     * Sets the value of the subject2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link PORRHD049016UVSubject11 }{@code >}
     *     
     */
    public void setSubject2(JAXBElement<PORRHD049016UVSubject11> value) {
        this.subject2 = value;
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
     *     {@link ActClassObservation }
     *     
     */
    public ActClassObservation getClassCode() {
        return classCode;
    }

    /**
     * Sets the value of the classCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActClassObservation }
     *     
     */
    public void setClassCode(ActClassObservation value) {
        this.classCode = value;
    }

    /**
     * Gets the value of the moodCode property.
     * 
     * @return
     *     possible object is
     *     {@link ActMoodEventOccurrence }
     *     
     */
    public ActMoodEventOccurrence getMoodCode() {
        return moodCode;
    }

    /**
     * Sets the value of the moodCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActMoodEventOccurrence }
     *     
     */
    public void setMoodCode(ActMoodEventOccurrence value) {
        this.moodCode = value;
    }

}
