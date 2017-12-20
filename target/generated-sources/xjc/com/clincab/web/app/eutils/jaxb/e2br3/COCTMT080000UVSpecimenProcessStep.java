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
 * <p>Java class for COCT_MT080000UV.SpecimenProcessStep complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="COCT_MT080000UV.SpecimenProcessStep"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;group ref="{urn:hl7-org:v3}InfrastructureRootElements"/&gt;
 *         &lt;element name="id" type="{urn:hl7-org:v3}II" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="code" type="{urn:hl7-org:v3}CD" minOccurs="0"/&gt;
 *         &lt;element name="text" type="{urn:hl7-org:v3}ST" minOccurs="0"/&gt;
 *         &lt;element name="statusCode" type="{urn:hl7-org:v3}CS" minOccurs="0"/&gt;
 *         &lt;element name="effectiveTime" type="{urn:hl7-org:v3}IVL_TS" minOccurs="0"/&gt;
 *         &lt;element name="subject" type="{urn:hl7-org:v3}COCT_MT080000UV.Subject1" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="device" type="{urn:hl7-org:v3}COCT_MT080000UV.Device" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="consumable" type="{urn:hl7-org:v3}COCT_MT080000UV.Consumable" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="performer" type="{urn:hl7-org:v3}COCT_MT080000UV.Performer" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="author" type="{urn:hl7-org:v3}COCT_MT080000UV.Author" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="transcriber" type="{urn:hl7-org:v3}COCT_MT080000UV.Transcriber" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="verifier" type="{urn:hl7-org:v3}COCT_MT080000UV.Verifier" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="definition" type="{urn:hl7-org:v3}COCT_MT080000UV.Definition" minOccurs="0"/&gt;
 *         &lt;element name="precondition" type="{urn:hl7-org:v3}COCT_MT080000UV.Precondition" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="pertinentInformation" type="{urn:hl7-org:v3}COCT_MT080000UV.PertinentInformation" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="controlVariable" type="{urn:hl7-org:v3}COCT_MT080000UV.ControlVariable" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="subjectOf1" type="{urn:hl7-org:v3}COCT_MT080000UV.Subject4" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="subjectOf2" type="{urn:hl7-org:v3}COCT_MT080000UV.Subject5" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attGroup ref="{urn:hl7-org:v3}InfrastructureRootAttributes"/&gt;
 *       &lt;attribute name="nullFlavor" type="{urn:hl7-org:v3}NullFlavor" /&gt;
 *       &lt;attribute name="classCode" use="required" type="{urn:hl7-org:v3}x_LabProcessClassCodes" /&gt;
 *       &lt;attribute name="moodCode" use="required" type="{urn:hl7-org:v3}ActMoodEventOccurrence" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "COCT_MT080000UV.SpecimenProcessStep", propOrder = {
    "realmCode",
    "typeId",
    "templateId",
    "id",
    "code",
    "text",
    "statusCode",
    "effectiveTime",
    "subject",
    "device",
    "consumable",
    "performer",
    "author",
    "transcriber",
    "verifier",
    "definition",
    "precondition",
    "pertinentInformation",
    "controlVariable",
    "subjectOf1",
    "subjectOf2"
})
public class COCTMT080000UVSpecimenProcessStep {

    protected List<CS> realmCode;
    protected II typeId;
    protected List<II> templateId;
    protected List<II> id;
    protected CD code;
    protected ST text;
    protected CS statusCode;
    protected IVLTS effectiveTime;
    @XmlElement(nillable = true)
    protected List<COCTMT080000UVSubject1> subject;
    @XmlElement(nillable = true)
    protected List<COCTMT080000UVDevice> device;
    @XmlElement(nillable = true)
    protected List<COCTMT080000UVConsumable> consumable;
    @XmlElement(nillable = true)
    protected List<COCTMT080000UVPerformer> performer;
    @XmlElement(nillable = true)
    protected List<COCTMT080000UVAuthor> author;
    @XmlElement(nillable = true)
    protected List<COCTMT080000UVTranscriber> transcriber;
    @XmlElement(nillable = true)
    protected List<COCTMT080000UVVerifier> verifier;
    @XmlElementRef(name = "definition", namespace = "urn:hl7-org:v3", type = JAXBElement.class, required = false)
    protected JAXBElement<COCTMT080000UVDefinition> definition;
    @XmlElement(nillable = true)
    protected List<COCTMT080000UVPrecondition> precondition;
    @XmlElement(nillable = true)
    protected List<COCTMT080000UVPertinentInformation> pertinentInformation;
    @XmlElement(nillable = true)
    protected List<COCTMT080000UVControlVariable> controlVariable;
    @XmlElement(nillable = true)
    protected List<COCTMT080000UVSubject4> subjectOf1;
    @XmlElementRef(name = "subjectOf2", namespace = "urn:hl7-org:v3", type = JAXBElement.class, required = false)
    protected JAXBElement<COCTMT080000UVSubject5> subjectOf2;
    @XmlAttribute(name = "nullFlavor")
    protected NullFlavor nullFlavor;
    @XmlAttribute(name = "classCode", required = true)
    protected XLabProcessClassCodes classCode;
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
     * Gets the value of the id property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the id property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getId().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link II }
     * 
     * 
     */
    public List<II> getId() {
        if (id == null) {
            id = new ArrayList<II>();
        }
        return this.id;
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
     * Gets the value of the text property.
     * 
     * @return
     *     possible object is
     *     {@link ST }
     *     
     */
    public ST getText() {
        return text;
    }

    /**
     * Sets the value of the text property.
     * 
     * @param value
     *     allowed object is
     *     {@link ST }
     *     
     */
    public void setText(ST value) {
        this.text = value;
    }

    /**
     * Gets the value of the statusCode property.
     * 
     * @return
     *     possible object is
     *     {@link CS }
     *     
     */
    public CS getStatusCode() {
        return statusCode;
    }

    /**
     * Sets the value of the statusCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link CS }
     *     
     */
    public void setStatusCode(CS value) {
        this.statusCode = value;
    }

    /**
     * Gets the value of the effectiveTime property.
     * 
     * @return
     *     possible object is
     *     {@link IVLTS }
     *     
     */
    public IVLTS getEffectiveTime() {
        return effectiveTime;
    }

    /**
     * Sets the value of the effectiveTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link IVLTS }
     *     
     */
    public void setEffectiveTime(IVLTS value) {
        this.effectiveTime = value;
    }

    /**
     * Gets the value of the subject property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the subject property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSubject().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link COCTMT080000UVSubject1 }
     * 
     * 
     */
    public List<COCTMT080000UVSubject1> getSubject() {
        if (subject == null) {
            subject = new ArrayList<COCTMT080000UVSubject1>();
        }
        return this.subject;
    }

    /**
     * Gets the value of the device property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the device property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDevice().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link COCTMT080000UVDevice }
     * 
     * 
     */
    public List<COCTMT080000UVDevice> getDevice() {
        if (device == null) {
            device = new ArrayList<COCTMT080000UVDevice>();
        }
        return this.device;
    }

    /**
     * Gets the value of the consumable property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the consumable property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getConsumable().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link COCTMT080000UVConsumable }
     * 
     * 
     */
    public List<COCTMT080000UVConsumable> getConsumable() {
        if (consumable == null) {
            consumable = new ArrayList<COCTMT080000UVConsumable>();
        }
        return this.consumable;
    }

    /**
     * Gets the value of the performer property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the performer property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPerformer().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link COCTMT080000UVPerformer }
     * 
     * 
     */
    public List<COCTMT080000UVPerformer> getPerformer() {
        if (performer == null) {
            performer = new ArrayList<COCTMT080000UVPerformer>();
        }
        return this.performer;
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
     * {@link COCTMT080000UVAuthor }
     * 
     * 
     */
    public List<COCTMT080000UVAuthor> getAuthor() {
        if (author == null) {
            author = new ArrayList<COCTMT080000UVAuthor>();
        }
        return this.author;
    }

    /**
     * Gets the value of the transcriber property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the transcriber property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTranscriber().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link COCTMT080000UVTranscriber }
     * 
     * 
     */
    public List<COCTMT080000UVTranscriber> getTranscriber() {
        if (transcriber == null) {
            transcriber = new ArrayList<COCTMT080000UVTranscriber>();
        }
        return this.transcriber;
    }

    /**
     * Gets the value of the verifier property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the verifier property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getVerifier().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link COCTMT080000UVVerifier }
     * 
     * 
     */
    public List<COCTMT080000UVVerifier> getVerifier() {
        if (verifier == null) {
            verifier = new ArrayList<COCTMT080000UVVerifier>();
        }
        return this.verifier;
    }

    /**
     * Gets the value of the definition property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link COCTMT080000UVDefinition }{@code >}
     *     
     */
    public JAXBElement<COCTMT080000UVDefinition> getDefinition() {
        return definition;
    }

    /**
     * Sets the value of the definition property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link COCTMT080000UVDefinition }{@code >}
     *     
     */
    public void setDefinition(JAXBElement<COCTMT080000UVDefinition> value) {
        this.definition = value;
    }

    /**
     * Gets the value of the precondition property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the precondition property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPrecondition().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link COCTMT080000UVPrecondition }
     * 
     * 
     */
    public List<COCTMT080000UVPrecondition> getPrecondition() {
        if (precondition == null) {
            precondition = new ArrayList<COCTMT080000UVPrecondition>();
        }
        return this.precondition;
    }

    /**
     * Gets the value of the pertinentInformation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the pertinentInformation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPertinentInformation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link COCTMT080000UVPertinentInformation }
     * 
     * 
     */
    public List<COCTMT080000UVPertinentInformation> getPertinentInformation() {
        if (pertinentInformation == null) {
            pertinentInformation = new ArrayList<COCTMT080000UVPertinentInformation>();
        }
        return this.pertinentInformation;
    }

    /**
     * Gets the value of the controlVariable property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the controlVariable property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getControlVariable().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link COCTMT080000UVControlVariable }
     * 
     * 
     */
    public List<COCTMT080000UVControlVariable> getControlVariable() {
        if (controlVariable == null) {
            controlVariable = new ArrayList<COCTMT080000UVControlVariable>();
        }
        return this.controlVariable;
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
     * {@link COCTMT080000UVSubject4 }
     * 
     * 
     */
    public List<COCTMT080000UVSubject4> getSubjectOf1() {
        if (subjectOf1 == null) {
            subjectOf1 = new ArrayList<COCTMT080000UVSubject4>();
        }
        return this.subjectOf1;
    }

    /**
     * Gets the value of the subjectOf2 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link COCTMT080000UVSubject5 }{@code >}
     *     
     */
    public JAXBElement<COCTMT080000UVSubject5> getSubjectOf2() {
        return subjectOf2;
    }

    /**
     * Sets the value of the subjectOf2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link COCTMT080000UVSubject5 }{@code >}
     *     
     */
    public void setSubjectOf2(JAXBElement<COCTMT080000UVSubject5> value) {
        this.subjectOf2 = value;
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
     *     {@link XLabProcessClassCodes }
     *     
     */
    public XLabProcessClassCodes getClassCode() {
        return classCode;
    }

    /**
     * Sets the value of the classCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link XLabProcessClassCodes }
     *     
     */
    public void setClassCode(XLabProcessClassCodes value) {
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
