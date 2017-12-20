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
 * <p>Java class for PORR_MT049013UV.Observation complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PORR_MT049013UV.Observation"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;group ref="{urn:hl7-org:v3}InfrastructureRootElements"/&gt;
 *         &lt;element name="id" type="{urn:hl7-org:v3}II" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="code" type="{urn:hl7-org:v3}CD"/&gt;
 *         &lt;element name="text" type="{urn:hl7-org:v3}ED" minOccurs="0"/&gt;
 *         &lt;element name="statusCode" type="{urn:hl7-org:v3}CS" minOccurs="0"/&gt;
 *         &lt;element name="effectiveTime" type="{urn:hl7-org:v3}SXCM_TS" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="confidentialityCode" type="{urn:hl7-org:v3}CE" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="repeatNumber" type="{urn:hl7-org:v3}IVL_INT" minOccurs="0"/&gt;
 *         &lt;element name="value" type="{urn:hl7-org:v3}ANY" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="interpretationCode" type="{urn:hl7-org:v3}CE" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="methodCode" type="{urn:hl7-org:v3}CE" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="targetSiteCode" type="{urn:hl7-org:v3}CD" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="performer" type="{urn:hl7-org:v3}PORR_MT049013UV.Performer" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="author" type="{urn:hl7-org:v3}PORR_MT049013UV.Author" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="location" type="{urn:hl7-org:v3}PORR_MT049013UV.Location" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="definition" type="{urn:hl7-org:v3}PORR_MT049013UV.Definition" minOccurs="0"/&gt;
 *         &lt;element name="referenceRange" type="{urn:hl7-org:v3}PORR_MT049013UV.ReferenceRange" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="outboundRelationship1" type="{urn:hl7-org:v3}PORR_MT049013UV.SourceOf1" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="outboundRelationship2" type="{urn:hl7-org:v3}PORR_MT049013UV.SourceOf2" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="inboundRelationship" type="{urn:hl7-org:v3}PORR_MT049013UV.SourceOf" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attGroup ref="{urn:hl7-org:v3}InfrastructureRootAttributes"/&gt;
 *       &lt;attribute name="classCode" type="{urn:hl7-org:v3}ActClass" fixed="OBS" /&gt;
 *       &lt;attribute name="moodCode" use="required" type="{urn:hl7-org:v3}x_ActMoodIntentEvent" /&gt;
 *       &lt;attribute name="negationInd" type="{urn:hl7-org:v3}bl" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PORR_MT049013UV.Observation", propOrder = {
    "realmCode",
    "typeId",
    "templateId",
    "id",
    "code",
    "text",
    "statusCode",
    "effectiveTime",
    "confidentialityCode",
    "repeatNumber",
    "value",
    "interpretationCode",
    "methodCode",
    "targetSiteCode",
    "performer",
    "author",
    "location",
    "definition",
    "referenceRange",
    "outboundRelationship1",
    "outboundRelationship2",
    "inboundRelationship"
})
public class PORRMT049013UVObservation {

    protected List<CS> realmCode;
    protected II typeId;
    protected List<II> templateId;
    protected List<II> id;
    @XmlElement(required = true)
    protected CD code;
    protected ED text;
    protected CS statusCode;
    protected List<SXCMTS> effectiveTime;
    protected List<CE> confidentialityCode;
    protected IVLINT repeatNumber;
    protected List<ANY> value;
    protected List<CE> interpretationCode;
    protected List<CE> methodCode;
    protected List<CD> targetSiteCode;
    @XmlElement(nillable = true)
    protected List<PORRMT049013UVPerformer> performer;
    @XmlElement(nillable = true)
    protected List<PORRMT049013UVAuthor> author;
    @XmlElement(nillable = true)
    protected List<PORRMT049013UVLocation> location;
    @XmlElementRef(name = "definition", namespace = "urn:hl7-org:v3", type = JAXBElement.class, required = false)
    protected JAXBElement<PORRMT049013UVDefinition> definition;
    @XmlElement(nillable = true)
    protected List<PORRMT049013UVReferenceRange> referenceRange;
    @XmlElement(nillable = true)
    protected List<PORRMT049013UVSourceOf1> outboundRelationship1;
    @XmlElement(nillable = true)
    protected List<PORRMT049013UVSourceOf2> outboundRelationship2;
    @XmlElement(nillable = true)
    protected List<PORRMT049013UVSourceOf> inboundRelationship;
    @XmlAttribute(name = "classCode")
    protected ActClass classCode;
    @XmlAttribute(name = "moodCode", required = true)
    protected XActMoodIntentEvent moodCode;
    @XmlAttribute(name = "negationInd")
    protected Boolean negationInd;

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
     *     {@link ED }
     *     
     */
    public ED getText() {
        return text;
    }

    /**
     * Sets the value of the text property.
     * 
     * @param value
     *     allowed object is
     *     {@link ED }
     *     
     */
    public void setText(ED value) {
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
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the effectiveTime property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEffectiveTime().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SXCMTS }
     * 
     * 
     */
    public List<SXCMTS> getEffectiveTime() {
        if (effectiveTime == null) {
            effectiveTime = new ArrayList<SXCMTS>();
        }
        return this.effectiveTime;
    }

    /**
     * Gets the value of the confidentialityCode property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the confidentialityCode property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getConfidentialityCode().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CE }
     * 
     * 
     */
    public List<CE> getConfidentialityCode() {
        if (confidentialityCode == null) {
            confidentialityCode = new ArrayList<CE>();
        }
        return this.confidentialityCode;
    }

    /**
     * Gets the value of the repeatNumber property.
     * 
     * @return
     *     possible object is
     *     {@link IVLINT }
     *     
     */
    public IVLINT getRepeatNumber() {
        return repeatNumber;
    }

    /**
     * Sets the value of the repeatNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link IVLINT }
     *     
     */
    public void setRepeatNumber(IVLINT value) {
        this.repeatNumber = value;
    }

    /**
     * Gets the value of the value property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the value property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getValue().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ANY }
     * 
     * 
     */
    public List<ANY> getValue() {
        if (value == null) {
            value = new ArrayList<ANY>();
        }
        return this.value;
    }

    /**
     * Gets the value of the interpretationCode property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the interpretationCode property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getInterpretationCode().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CE }
     * 
     * 
     */
    public List<CE> getInterpretationCode() {
        if (interpretationCode == null) {
            interpretationCode = new ArrayList<CE>();
        }
        return this.interpretationCode;
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
     * Gets the value of the targetSiteCode property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the targetSiteCode property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTargetSiteCode().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CD }
     * 
     * 
     */
    public List<CD> getTargetSiteCode() {
        if (targetSiteCode == null) {
            targetSiteCode = new ArrayList<CD>();
        }
        return this.targetSiteCode;
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
     * {@link PORRMT049013UVPerformer }
     * 
     * 
     */
    public List<PORRMT049013UVPerformer> getPerformer() {
        if (performer == null) {
            performer = new ArrayList<PORRMT049013UVPerformer>();
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
     * {@link PORRMT049013UVAuthor }
     * 
     * 
     */
    public List<PORRMT049013UVAuthor> getAuthor() {
        if (author == null) {
            author = new ArrayList<PORRMT049013UVAuthor>();
        }
        return this.author;
    }

    /**
     * Gets the value of the location property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the location property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLocation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PORRMT049013UVLocation }
     * 
     * 
     */
    public List<PORRMT049013UVLocation> getLocation() {
        if (location == null) {
            location = new ArrayList<PORRMT049013UVLocation>();
        }
        return this.location;
    }

    /**
     * Gets the value of the definition property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link PORRMT049013UVDefinition }{@code >}
     *     
     */
    public JAXBElement<PORRMT049013UVDefinition> getDefinition() {
        return definition;
    }

    /**
     * Sets the value of the definition property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link PORRMT049013UVDefinition }{@code >}
     *     
     */
    public void setDefinition(JAXBElement<PORRMT049013UVDefinition> value) {
        this.definition = value;
    }

    /**
     * Gets the value of the referenceRange property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the referenceRange property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getReferenceRange().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PORRMT049013UVReferenceRange }
     * 
     * 
     */
    public List<PORRMT049013UVReferenceRange> getReferenceRange() {
        if (referenceRange == null) {
            referenceRange = new ArrayList<PORRMT049013UVReferenceRange>();
        }
        return this.referenceRange;
    }

    /**
     * Gets the value of the outboundRelationship1 property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the outboundRelationship1 property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOutboundRelationship1().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PORRMT049013UVSourceOf1 }
     * 
     * 
     */
    public List<PORRMT049013UVSourceOf1> getOutboundRelationship1() {
        if (outboundRelationship1 == null) {
            outboundRelationship1 = new ArrayList<PORRMT049013UVSourceOf1>();
        }
        return this.outboundRelationship1;
    }

    /**
     * Gets the value of the outboundRelationship2 property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the outboundRelationship2 property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOutboundRelationship2().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PORRMT049013UVSourceOf2 }
     * 
     * 
     */
    public List<PORRMT049013UVSourceOf2> getOutboundRelationship2() {
        if (outboundRelationship2 == null) {
            outboundRelationship2 = new ArrayList<PORRMT049013UVSourceOf2>();
        }
        return this.outboundRelationship2;
    }

    /**
     * Gets the value of the inboundRelationship property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the inboundRelationship property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getInboundRelationship().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PORRMT049013UVSourceOf }
     * 
     * 
     */
    public List<PORRMT049013UVSourceOf> getInboundRelationship() {
        if (inboundRelationship == null) {
            inboundRelationship = new ArrayList<PORRMT049013UVSourceOf>();
        }
        return this.inboundRelationship;
    }

    /**
     * Gets the value of the classCode property.
     * 
     * @return
     *     possible object is
     *     {@link ActClass }
     *     
     */
    public ActClass getClassCode() {
        if (classCode == null) {
            return ActClass.OBS;
        } else {
            return classCode;
        }
    }

    /**
     * Sets the value of the classCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActClass }
     *     
     */
    public void setClassCode(ActClass value) {
        this.classCode = value;
    }

    /**
     * Gets the value of the moodCode property.
     * 
     * @return
     *     possible object is
     *     {@link XActMoodIntentEvent }
     *     
     */
    public XActMoodIntentEvent getMoodCode() {
        return moodCode;
    }

    /**
     * Sets the value of the moodCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link XActMoodIntentEvent }
     *     
     */
    public void setMoodCode(XActMoodIntentEvent value) {
        this.moodCode = value;
    }

    /**
     * Gets the value of the negationInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isNegationInd() {
        return negationInd;
    }

    /**
     * Sets the value of the negationInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setNegationInd(Boolean value) {
        this.negationInd = value;
    }

}
