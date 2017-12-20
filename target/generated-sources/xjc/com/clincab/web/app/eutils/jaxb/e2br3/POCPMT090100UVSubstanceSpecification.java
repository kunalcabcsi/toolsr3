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
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for POCP_MT090100UV.SubstanceSpecification complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="POCP_MT090100UV.SubstanceSpecification"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;group ref="{urn:hl7-org:v3}InfrastructureRootElements"/&gt;
 *         &lt;element name="code" type="{urn:hl7-org:v3}CD"/&gt;
 *         &lt;element name="author" type="{urn:hl7-org:v3}POCP_MT090100UV.Author" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="component" type="{urn:hl7-org:v3}POCP_MT090100UV.Component" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="subjectOf" type="{urn:hl7-org:v3}POCP_MT090100UV.Subject" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attGroup ref="{urn:hl7-org:v3}InfrastructureRootAttributes"/&gt;
 *       &lt;attribute name="classCode" type="{urn:hl7-org:v3}ActClassRoot" default="ACT" /&gt;
 *       &lt;attribute name="moodCode" type="{urn:hl7-org:v3}cs" default="DEF" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "POCP_MT090100UV.SubstanceSpecification", propOrder = {
    "realmCode",
    "typeId",
    "templateId",
    "code",
    "author",
    "component",
    "subjectOf"
})
public class POCPMT090100UVSubstanceSpecification {

    protected List<CS> realmCode;
    protected II typeId;
    protected List<II> templateId;
    @XmlElement(required = true)
    protected CD code;
    @XmlElement(nillable = true)
    protected List<POCPMT090100UVAuthor> author;
    @XmlElement(nillable = true)
    protected List<POCPMT090100UVComponent> component;
    @XmlElement(nillable = true)
    protected List<POCPMT090100UVSubject> subjectOf;
    @XmlAttribute(name = "classCode")
    protected ActClassRoot classCode;
    @XmlAttribute(name = "moodCode")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String moodCode;

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
     * {@link POCPMT090100UVAuthor }
     * 
     * 
     */
    public List<POCPMT090100UVAuthor> getAuthor() {
        if (author == null) {
            author = new ArrayList<POCPMT090100UVAuthor>();
        }
        return this.author;
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
     * {@link POCPMT090100UVComponent }
     * 
     * 
     */
    public List<POCPMT090100UVComponent> getComponent() {
        if (component == null) {
            component = new ArrayList<POCPMT090100UVComponent>();
        }
        return this.component;
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
     * {@link POCPMT090100UVSubject }
     * 
     * 
     */
    public List<POCPMT090100UVSubject> getSubjectOf() {
        if (subjectOf == null) {
            subjectOf = new ArrayList<POCPMT090100UVSubject>();
        }
        return this.subjectOf;
    }

    /**
     * Gets the value of the classCode property.
     * 
     * @return
     *     possible object is
     *     {@link ActClassRoot }
     *     
     */
    public ActClassRoot getClassCode() {
        if (classCode == null) {
            return ActClassRoot.ACT;
        } else {
            return classCode;
        }
    }

    /**
     * Sets the value of the classCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActClassRoot }
     *     
     */
    public void setClassCode(ActClassRoot value) {
        this.classCode = value;
    }

    /**
     * Gets the value of the moodCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMoodCode() {
        if (moodCode == null) {
            return "DEF";
        } else {
            return moodCode;
        }
    }

    /**
     * Sets the value of the moodCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMoodCode(String value) {
        this.moodCode = value;
    }

}
