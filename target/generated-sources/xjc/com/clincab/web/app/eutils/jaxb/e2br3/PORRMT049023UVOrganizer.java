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
 * <p>Java class for PORR_MT049023UV.Organizer complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PORR_MT049023UV.Organizer"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;group ref="{urn:hl7-org:v3}InfrastructureRootElements"/&gt;
 *         &lt;element name="code" type="{urn:hl7-org:v3}CD" minOccurs="0"/&gt;
 *         &lt;element name="text" type="{urn:hl7-org:v3}ED" minOccurs="0"/&gt;
 *         &lt;element name="performer" type="{urn:hl7-org:v3}PORR_MT049023UV.Performer" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="author" type="{urn:hl7-org:v3}PORR_MT049023UV.Author" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="location" type="{urn:hl7-org:v3}PORR_MT049023UV.Location" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="component" type="{urn:hl7-org:v3}PORR_MT049023UV.Component" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="outboundRelationship1" type="{urn:hl7-org:v3}PORR_MT049023UV.SourceOf1" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="outboundRelationship2" type="{urn:hl7-org:v3}PORR_MT049023UV.SourceOf2" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="inboundRelationship" type="{urn:hl7-org:v3}PORR_MT049023UV.SourceOf" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attGroup ref="{urn:hl7-org:v3}InfrastructureRootAttributes"/&gt;
 *       &lt;attribute name="classCode" type="{urn:hl7-org:v3}ActClass" fixed="CATEGORY" /&gt;
 *       &lt;attribute name="moodCode" type="{urn:hl7-org:v3}ActMood" fixed="EVN" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PORR_MT049023UV.Organizer", propOrder = {
    "realmCode",
    "typeId",
    "templateId",
    "code",
    "text",
    "performer",
    "author",
    "location",
    "component",
    "outboundRelationship1",
    "outboundRelationship2",
    "inboundRelationship"
})
public class PORRMT049023UVOrganizer {

    protected List<CS> realmCode;
    protected II typeId;
    protected List<II> templateId;
    protected CD code;
    protected ED text;
    @XmlElement(nillable = true)
    protected List<PORRMT049023UVPerformer> performer;
    @XmlElement(nillable = true)
    protected List<PORRMT049023UVAuthor> author;
    @XmlElement(nillable = true)
    protected List<PORRMT049023UVLocation> location;
    @XmlElement(nillable = true)
    protected List<PORRMT049023UVComponent> component;
    @XmlElement(nillable = true)
    protected List<PORRMT049023UVSourceOf1> outboundRelationship1;
    @XmlElement(nillable = true)
    protected List<PORRMT049023UVSourceOf2> outboundRelationship2;
    @XmlElement(nillable = true)
    protected List<PORRMT049023UVSourceOf> inboundRelationship;
    @XmlAttribute(name = "classCode")
    protected ActClass classCode;
    @XmlAttribute(name = "moodCode")
    protected ActMood moodCode;

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
     * Gets the value of the component property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the component property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getComponent().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PORRMT049023UVComponent }
     * 
     * 
     */
    public List<PORRMT049023UVComponent> getComponent() {
        if (component == null) {
            component = new ArrayList<PORRMT049023UVComponent>();
        }
        return this.component;
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
            return ActClass.CATEGORY;
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
     *     {@link ActMood }
     *     
     */
    public ActMood getMoodCode() {
        if (moodCode == null) {
            return ActMood.EVN;
        } else {
            return moodCode;
        }
    }

    /**
     * Sets the value of the moodCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActMood }
     *     
     */
    public void setMoodCode(ActMood value) {
        this.moodCode = value;
    }

}
