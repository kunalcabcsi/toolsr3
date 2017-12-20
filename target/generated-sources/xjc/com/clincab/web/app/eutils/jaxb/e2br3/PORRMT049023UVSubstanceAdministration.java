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
 * <p>Java class for PORR_MT049023UV.SubstanceAdministration complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PORR_MT049023UV.SubstanceAdministration"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;group ref="{urn:hl7-org:v3}InfrastructureRootElements"/&gt;
 *         &lt;element name="id" type="{urn:hl7-org:v3}II" minOccurs="0"/&gt;
 *         &lt;element name="text" type="{urn:hl7-org:v3}ED" minOccurs="0"/&gt;
 *         &lt;element name="statusCode" type="{urn:hl7-org:v3}CS" minOccurs="0"/&gt;
 *         &lt;element name="effectiveTime" type="{urn:hl7-org:v3}SXCM_TS" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="confidentialityCode" type="{urn:hl7-org:v3}CE" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="repeatNumber" type="{urn:hl7-org:v3}IVL_INT" minOccurs="0"/&gt;
 *         &lt;element name="approachSiteCode" type="{urn:hl7-org:v3}CD" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="routeCode" type="{urn:hl7-org:v3}CE" minOccurs="0"/&gt;
 *         &lt;element name="doseQuantity" type="{urn:hl7-org:v3}IVL_PQ" minOccurs="0"/&gt;
 *         &lt;element name="rateQuantity" type="{urn:hl7-org:v3}IVL_PQ" minOccurs="0"/&gt;
 *         &lt;element name="doseCheckQuantity" type="{urn:hl7-org:v3}RTO_QTY_QTY" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="maxDoseQuantity" type="{urn:hl7-org:v3}RTO_PQ_PQ" minOccurs="0"/&gt;
 *         &lt;element name="administrationUnitCode" type="{urn:hl7-org:v3}CE" minOccurs="0"/&gt;
 *         &lt;element name="consumable" type="{urn:hl7-org:v3}PORR_MT049023UV.Consumable" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="performer" type="{urn:hl7-org:v3}PORR_MT049023UV.Performer" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="author" type="{urn:hl7-org:v3}PORR_MT049023UV.Author" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="location" type="{urn:hl7-org:v3}PORR_MT049023UV.Location" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="outboundRelationship1" type="{urn:hl7-org:v3}PORR_MT049023UV.SourceOf1" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="outboundRelationship2" type="{urn:hl7-org:v3}PORR_MT049023UV.SourceOf2" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="inboundRelationship" type="{urn:hl7-org:v3}PORR_MT049023UV.SourceOf" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attGroup ref="{urn:hl7-org:v3}InfrastructureRootAttributes"/&gt;
 *       &lt;attribute name="classCode" type="{urn:hl7-org:v3}ActClass" fixed="SBADM" /&gt;
 *       &lt;attribute name="moodCode" use="required" type="{urn:hl7-org:v3}x_ActMoodIntentEvent" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PORR_MT049023UV.SubstanceAdministration", propOrder = {
    "realmCode",
    "typeId",
    "templateId",
    "id",
    "text",
    "statusCode",
    "effectiveTime",
    "confidentialityCode",
    "repeatNumber",
    "approachSiteCode",
    "routeCode",
    "doseQuantity",
    "rateQuantity",
    "doseCheckQuantity",
    "maxDoseQuantity",
    "administrationUnitCode",
    "consumable",
    "performer",
    "author",
    "location",
    "outboundRelationship1",
    "outboundRelationship2",
    "inboundRelationship"
})
public class PORRMT049023UVSubstanceAdministration {

    protected List<CS> realmCode;
    protected II typeId;
    protected List<II> templateId;
    protected II id;
    protected ED text;
    protected CS statusCode;
    protected List<SXCMTS> effectiveTime;
    protected List<CE> confidentialityCode;
    protected IVLINT repeatNumber;
    protected List<CD> approachSiteCode;
    protected CE routeCode;
    protected IVLPQ doseQuantity;
    protected IVLPQ rateQuantity;
    protected List<RTOQTYQTY> doseCheckQuantity;
    protected RTOPQPQ maxDoseQuantity;
    protected CE administrationUnitCode;
    @XmlElement(nillable = true)
    protected List<PORRMT049023UVConsumable> consumable;
    @XmlElement(nillable = true)
    protected List<PORRMT049023UVPerformer> performer;
    @XmlElement(nillable = true)
    protected List<PORRMT049023UVAuthor> author;
    @XmlElement(nillable = true)
    protected List<PORRMT049023UVLocation> location;
    @XmlElement(nillable = true)
    protected List<PORRMT049023UVSourceOf1> outboundRelationship1;
    @XmlElement(nillable = true)
    protected List<PORRMT049023UVSourceOf2> outboundRelationship2;
    @XmlElement(nillable = true)
    protected List<PORRMT049023UVSourceOf> inboundRelationship;
    @XmlAttribute(name = "classCode")
    protected ActClass classCode;
    @XmlAttribute(name = "moodCode", required = true)
    protected XActMoodIntentEvent moodCode;

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
     * Gets the value of the approachSiteCode property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the approachSiteCode property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getApproachSiteCode().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CD }
     * 
     * 
     */
    public List<CD> getApproachSiteCode() {
        if (approachSiteCode == null) {
            approachSiteCode = new ArrayList<CD>();
        }
        return this.approachSiteCode;
    }

    /**
     * Gets the value of the routeCode property.
     * 
     * @return
     *     possible object is
     *     {@link CE }
     *     
     */
    public CE getRouteCode() {
        return routeCode;
    }

    /**
     * Sets the value of the routeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link CE }
     *     
     */
    public void setRouteCode(CE value) {
        this.routeCode = value;
    }

    /**
     * Gets the value of the doseQuantity property.
     * 
     * @return
     *     possible object is
     *     {@link IVLPQ }
     *     
     */
    public IVLPQ getDoseQuantity() {
        return doseQuantity;
    }

    /**
     * Sets the value of the doseQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link IVLPQ }
     *     
     */
    public void setDoseQuantity(IVLPQ value) {
        this.doseQuantity = value;
    }

    /**
     * Gets the value of the rateQuantity property.
     * 
     * @return
     *     possible object is
     *     {@link IVLPQ }
     *     
     */
    public IVLPQ getRateQuantity() {
        return rateQuantity;
    }

    /**
     * Sets the value of the rateQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link IVLPQ }
     *     
     */
    public void setRateQuantity(IVLPQ value) {
        this.rateQuantity = value;
    }

    /**
     * Gets the value of the doseCheckQuantity property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the doseCheckQuantity property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDoseCheckQuantity().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RTOQTYQTY }
     * 
     * 
     */
    public List<RTOQTYQTY> getDoseCheckQuantity() {
        if (doseCheckQuantity == null) {
            doseCheckQuantity = new ArrayList<RTOQTYQTY>();
        }
        return this.doseCheckQuantity;
    }

    /**
     * Gets the value of the maxDoseQuantity property.
     * 
     * @return
     *     possible object is
     *     {@link RTOPQPQ }
     *     
     */
    public RTOPQPQ getMaxDoseQuantity() {
        return maxDoseQuantity;
    }

    /**
     * Sets the value of the maxDoseQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link RTOPQPQ }
     *     
     */
    public void setMaxDoseQuantity(RTOPQPQ value) {
        this.maxDoseQuantity = value;
    }

    /**
     * Gets the value of the administrationUnitCode property.
     * 
     * @return
     *     possible object is
     *     {@link CE }
     *     
     */
    public CE getAdministrationUnitCode() {
        return administrationUnitCode;
    }

    /**
     * Sets the value of the administrationUnitCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link CE }
     *     
     */
    public void setAdministrationUnitCode(CE value) {
        this.administrationUnitCode = value;
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
     * {@link PORRMT049023UVConsumable }
     * 
     * 
     */
    public List<PORRMT049023UVConsumable> getConsumable() {
        if (consumable == null) {
            consumable = new ArrayList<PORRMT049023UVConsumable>();
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
     * {@link PORRMT049023UVPerformer }
     * 
     * 
     */
    public List<PORRMT049023UVPerformer> getPerformer() {
        if (performer == null) {
            performer = new ArrayList<PORRMT049023UVPerformer>();
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
     * {@link PORRMT049023UVAuthor }
     * 
     * 
     */
    public List<PORRMT049023UVAuthor> getAuthor() {
        if (author == null) {
            author = new ArrayList<PORRMT049023UVAuthor>();
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
     * {@link PORRMT049023UVLocation }
     * 
     * 
     */
    public List<PORRMT049023UVLocation> getLocation() {
        if (location == null) {
            location = new ArrayList<PORRMT049023UVLocation>();
        }
        return this.location;
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
     * {@link PORRMT049023UVSourceOf1 }
     * 
     * 
     */
    public List<PORRMT049023UVSourceOf1> getOutboundRelationship1() {
        if (outboundRelationship1 == null) {
            outboundRelationship1 = new ArrayList<PORRMT049023UVSourceOf1>();
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
     * {@link PORRMT049023UVSourceOf2 }
     * 
     * 
     */
    public List<PORRMT049023UVSourceOf2> getOutboundRelationship2() {
        if (outboundRelationship2 == null) {
            outboundRelationship2 = new ArrayList<PORRMT049023UVSourceOf2>();
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
     * {@link PORRMT049023UVSourceOf }
     * 
     * 
     */
    public List<PORRMT049023UVSourceOf> getInboundRelationship() {
        if (inboundRelationship == null) {
            inboundRelationship = new ArrayList<PORRMT049023UVSourceOf>();
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
            return ActClass.SBADM;
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

}
