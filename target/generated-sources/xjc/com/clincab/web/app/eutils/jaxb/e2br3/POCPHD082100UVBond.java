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
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for POCP_HD082100UV.Bond complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="POCP_HD082100UV.Bond"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;group ref="{urn:hl7-org:v3}InfrastructureRootElements"/&gt;
 *         &lt;element name="code" type="{urn:hl7-org:v3}CE" minOccurs="0"/&gt;
 *         &lt;element name="quantity" type="{urn:hl7-org:v3}RTO_PQ_PQ" minOccurs="0"/&gt;
 *         &lt;element name="positionNumber" type="{urn:hl7-org:v3}INT" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="playingMoiety" type="{urn:hl7-org:v3}POCP_HD082100UV.Moiety2"/&gt;
 *         &lt;element name="subjectOf" type="{urn:hl7-org:v3}POCP_HD082100UV.Subject1" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="productOf" type="{urn:hl7-org:v3}POCP_HD082100UV.Product" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="participation" type="{urn:hl7-org:v3}POCP_HD082100UV.Interactor1" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attGroup ref="{urn:hl7-org:v3}InfrastructureRootAttributes"/&gt;
 *       &lt;attribute name="nullFlavor" type="{urn:hl7-org:v3}NullFlavor" /&gt;
 *       &lt;attribute name="classCode" type="{urn:hl7-org:v3}cs" default="BOND" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "POCP_HD082100UV.Bond", propOrder = {
    "realmCode",
    "typeId",
    "templateId",
    "code",
    "quantity",
    "positionNumber",
    "playingMoiety",
    "subjectOf",
    "productOf",
    "participation"
})
public class POCPHD082100UVBond {

    protected List<CS> realmCode;
    protected II typeId;
    protected List<II> templateId;
    protected CE code;
    protected RTOPQPQ quantity;
    protected List<INT> positionNumber;
    @XmlElement(required = true)
    protected POCPHD082100UVMoiety2 playingMoiety;
    @XmlElement(nillable = true)
    protected List<POCPHD082100UVSubject1> subjectOf;
    @XmlElement(nillable = true)
    protected List<POCPHD082100UVProduct> productOf;
    @XmlElement(nillable = true)
    protected List<POCPHD082100UVInteractor1> participation;
    @XmlAttribute(name = "nullFlavor")
    protected NullFlavor nullFlavor;
    @XmlAttribute(name = "classCode")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String classCode;

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
     * Gets the value of the quantity property.
     * 
     * @return
     *     possible object is
     *     {@link RTOPQPQ }
     *     
     */
    public RTOPQPQ getQuantity() {
        return quantity;
    }

    /**
     * Sets the value of the quantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link RTOPQPQ }
     *     
     */
    public void setQuantity(RTOPQPQ value) {
        this.quantity = value;
    }

    /**
     * Gets the value of the positionNumber property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the positionNumber property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPositionNumber().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link INT }
     * 
     * 
     */
    public List<INT> getPositionNumber() {
        if (positionNumber == null) {
            positionNumber = new ArrayList<INT>();
        }
        return this.positionNumber;
    }

    /**
     * Gets the value of the playingMoiety property.
     * 
     * @return
     *     possible object is
     *     {@link POCPHD082100UVMoiety2 }
     *     
     */
    public POCPHD082100UVMoiety2 getPlayingMoiety() {
        return playingMoiety;
    }

    /**
     * Sets the value of the playingMoiety property.
     * 
     * @param value
     *     allowed object is
     *     {@link POCPHD082100UVMoiety2 }
     *     
     */
    public void setPlayingMoiety(POCPHD082100UVMoiety2 value) {
        this.playingMoiety = value;
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
     * {@link POCPHD082100UVSubject1 }
     * 
     * 
     */
    public List<POCPHD082100UVSubject1> getSubjectOf() {
        if (subjectOf == null) {
            subjectOf = new ArrayList<POCPHD082100UVSubject1>();
        }
        return this.subjectOf;
    }

    /**
     * Gets the value of the productOf property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the productOf property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getProductOf().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link POCPHD082100UVProduct }
     * 
     * 
     */
    public List<POCPHD082100UVProduct> getProductOf() {
        if (productOf == null) {
            productOf = new ArrayList<POCPHD082100UVProduct>();
        }
        return this.productOf;
    }

    /**
     * Gets the value of the participation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the participation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getParticipation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link POCPHD082100UVInteractor1 }
     * 
     * 
     */
    public List<POCPHD082100UVInteractor1> getParticipation() {
        if (participation == null) {
            participation = new ArrayList<POCPHD082100UVInteractor1>();
        }
        return this.participation;
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
     *     {@link String }
     *     
     */
    public String getClassCode() {
        if (classCode == null) {
            return "BOND";
        } else {
            return classCode;
        }
    }

    /**
     * Sets the value of the classCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClassCode(String value) {
        this.classCode = value;
    }

}
