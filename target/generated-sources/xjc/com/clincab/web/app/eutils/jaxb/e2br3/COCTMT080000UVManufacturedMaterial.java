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
 * <p>Java class for COCT_MT080000UV.ManufacturedMaterial complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="COCT_MT080000UV.ManufacturedMaterial"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;group ref="{urn:hl7-org:v3}InfrastructureRootElements"/&gt;
 *         &lt;element name="code" type="{urn:hl7-org:v3}CE"/&gt;
 *         &lt;element name="quantity" type="{urn:hl7-org:v3}PQ" minOccurs="0"/&gt;
 *         &lt;element name="desc" type="{urn:hl7-org:v3}ED" minOccurs="0"/&gt;
 *         &lt;element name="riskCode" type="{urn:hl7-org:v3}CE" minOccurs="0"/&gt;
 *         &lt;element name="handlingCode" type="{urn:hl7-org:v3}CE" minOccurs="0"/&gt;
 *         &lt;element name="lotNumberText" type="{urn:hl7-org:v3}ST" minOccurs="0"/&gt;
 *         &lt;element name="expirationTime" type="{urn:hl7-org:v3}IVL_TS" minOccurs="0"/&gt;
 *         &lt;element name="asManufacturedProduct" type="{urn:hl7-org:v3}COCT_MT080000UV.ManufacturedProduct"/&gt;
 *         &lt;element name="asSpecimenStub" type="{urn:hl7-org:v3}COCT_MT080000UV.SpecimenStub" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="asSpecimenInContainer" type="{urn:hl7-org:v3}COCT_MT080000UV.SpecimenInContainer" minOccurs="0"/&gt;
 *         &lt;element name="asOtherIDs" type="{urn:hl7-org:v3}COCT_MT080000UV.OtherIDs" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="derivedSpecimen" type="{urn:hl7-org:v3}COCT_MT080000UV.DerivedSpecimen" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="additive" type="{urn:hl7-org:v3}COCT_MT080000UV.Additive" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attGroup ref="{urn:hl7-org:v3}InfrastructureRootAttributes"/&gt;
 *       &lt;attribute name="nullFlavor" type="{urn:hl7-org:v3}NullFlavor" /&gt;
 *       &lt;attribute name="classCode" use="required" type="{urn:hl7-org:v3}EntityClassManufacturedMaterial" /&gt;
 *       &lt;attribute name="determinerCode" use="required" type="{urn:hl7-org:v3}EntityDeterminer" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "COCT_MT080000UV.ManufacturedMaterial", propOrder = {
    "realmCode",
    "typeId",
    "templateId",
    "code",
    "quantity",
    "desc",
    "riskCode",
    "handlingCode",
    "lotNumberText",
    "expirationTime",
    "asManufacturedProduct",
    "asSpecimenStub",
    "asSpecimenInContainer",
    "asOtherIDs",
    "derivedSpecimen",
    "additive"
})
public class COCTMT080000UVManufacturedMaterial {

    protected List<CS> realmCode;
    protected II typeId;
    protected List<II> templateId;
    @XmlElement(required = true)
    protected CE code;
    protected PQ quantity;
    protected ED desc;
    protected CE riskCode;
    protected CE handlingCode;
    protected ST lotNumberText;
    protected IVLTS expirationTime;
    @XmlElement(required = true, nillable = true)
    protected COCTMT080000UVManufacturedProduct asManufacturedProduct;
    @XmlElement(nillable = true)
    protected List<COCTMT080000UVSpecimenStub> asSpecimenStub;
    @XmlElementRef(name = "asSpecimenInContainer", namespace = "urn:hl7-org:v3", type = JAXBElement.class, required = false)
    protected JAXBElement<COCTMT080000UVSpecimenInContainer> asSpecimenInContainer;
    @XmlElement(nillable = true)
    protected List<COCTMT080000UVOtherIDs> asOtherIDs;
    @XmlElement(nillable = true)
    protected List<COCTMT080000UVDerivedSpecimen> derivedSpecimen;
    @XmlElement(nillable = true)
    protected List<COCTMT080000UVAdditive> additive;
    @XmlAttribute(name = "nullFlavor")
    protected NullFlavor nullFlavor;
    @XmlAttribute(name = "classCode", required = true)
    protected EntityClassManufacturedMaterial classCode;
    @XmlAttribute(name = "determinerCode", required = true)
    protected EntityDeterminer determinerCode;

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
     *     {@link PQ }
     *     
     */
    public PQ getQuantity() {
        return quantity;
    }

    /**
     * Sets the value of the quantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link PQ }
     *     
     */
    public void setQuantity(PQ value) {
        this.quantity = value;
    }

    /**
     * Gets the value of the desc property.
     * 
     * @return
     *     possible object is
     *     {@link ED }
     *     
     */
    public ED getDesc() {
        return desc;
    }

    /**
     * Sets the value of the desc property.
     * 
     * @param value
     *     allowed object is
     *     {@link ED }
     *     
     */
    public void setDesc(ED value) {
        this.desc = value;
    }

    /**
     * Gets the value of the riskCode property.
     * 
     * @return
     *     possible object is
     *     {@link CE }
     *     
     */
    public CE getRiskCode() {
        return riskCode;
    }

    /**
     * Sets the value of the riskCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link CE }
     *     
     */
    public void setRiskCode(CE value) {
        this.riskCode = value;
    }

    /**
     * Gets the value of the handlingCode property.
     * 
     * @return
     *     possible object is
     *     {@link CE }
     *     
     */
    public CE getHandlingCode() {
        return handlingCode;
    }

    /**
     * Sets the value of the handlingCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link CE }
     *     
     */
    public void setHandlingCode(CE value) {
        this.handlingCode = value;
    }

    /**
     * Gets the value of the lotNumberText property.
     * 
     * @return
     *     possible object is
     *     {@link ST }
     *     
     */
    public ST getLotNumberText() {
        return lotNumberText;
    }

    /**
     * Sets the value of the lotNumberText property.
     * 
     * @param value
     *     allowed object is
     *     {@link ST }
     *     
     */
    public void setLotNumberText(ST value) {
        this.lotNumberText = value;
    }

    /**
     * Gets the value of the expirationTime property.
     * 
     * @return
     *     possible object is
     *     {@link IVLTS }
     *     
     */
    public IVLTS getExpirationTime() {
        return expirationTime;
    }

    /**
     * Sets the value of the expirationTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link IVLTS }
     *     
     */
    public void setExpirationTime(IVLTS value) {
        this.expirationTime = value;
    }

    /**
     * Gets the value of the asManufacturedProduct property.
     * 
     * @return
     *     possible object is
     *     {@link COCTMT080000UVManufacturedProduct }
     *     
     */
    public COCTMT080000UVManufacturedProduct getAsManufacturedProduct() {
        return asManufacturedProduct;
    }

    /**
     * Sets the value of the asManufacturedProduct property.
     * 
     * @param value
     *     allowed object is
     *     {@link COCTMT080000UVManufacturedProduct }
     *     
     */
    public void setAsManufacturedProduct(COCTMT080000UVManufacturedProduct value) {
        this.asManufacturedProduct = value;
    }

    /**
     * Gets the value of the asSpecimenStub property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the asSpecimenStub property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAsSpecimenStub().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link COCTMT080000UVSpecimenStub }
     * 
     * 
     */
    public List<COCTMT080000UVSpecimenStub> getAsSpecimenStub() {
        if (asSpecimenStub == null) {
            asSpecimenStub = new ArrayList<COCTMT080000UVSpecimenStub>();
        }
        return this.asSpecimenStub;
    }

    /**
     * Gets the value of the asSpecimenInContainer property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link COCTMT080000UVSpecimenInContainer }{@code >}
     *     
     */
    public JAXBElement<COCTMT080000UVSpecimenInContainer> getAsSpecimenInContainer() {
        return asSpecimenInContainer;
    }

    /**
     * Sets the value of the asSpecimenInContainer property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link COCTMT080000UVSpecimenInContainer }{@code >}
     *     
     */
    public void setAsSpecimenInContainer(JAXBElement<COCTMT080000UVSpecimenInContainer> value) {
        this.asSpecimenInContainer = value;
    }

    /**
     * Gets the value of the asOtherIDs property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the asOtherIDs property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAsOtherIDs().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link COCTMT080000UVOtherIDs }
     * 
     * 
     */
    public List<COCTMT080000UVOtherIDs> getAsOtherIDs() {
        if (asOtherIDs == null) {
            asOtherIDs = new ArrayList<COCTMT080000UVOtherIDs>();
        }
        return this.asOtherIDs;
    }

    /**
     * Gets the value of the derivedSpecimen property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the derivedSpecimen property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDerivedSpecimen().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link COCTMT080000UVDerivedSpecimen }
     * 
     * 
     */
    public List<COCTMT080000UVDerivedSpecimen> getDerivedSpecimen() {
        if (derivedSpecimen == null) {
            derivedSpecimen = new ArrayList<COCTMT080000UVDerivedSpecimen>();
        }
        return this.derivedSpecimen;
    }

    /**
     * Gets the value of the additive property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the additive property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAdditive().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link COCTMT080000UVAdditive }
     * 
     * 
     */
    public List<COCTMT080000UVAdditive> getAdditive() {
        if (additive == null) {
            additive = new ArrayList<COCTMT080000UVAdditive>();
        }
        return this.additive;
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
     *     {@link EntityClassManufacturedMaterial }
     *     
     */
    public EntityClassManufacturedMaterial getClassCode() {
        return classCode;
    }

    /**
     * Sets the value of the classCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityClassManufacturedMaterial }
     *     
     */
    public void setClassCode(EntityClassManufacturedMaterial value) {
        this.classCode = value;
    }

    /**
     * Gets the value of the determinerCode property.
     * 
     * @return
     *     possible object is
     *     {@link EntityDeterminer }
     *     
     */
    public EntityDeterminer getDeterminerCode() {
        return determinerCode;
    }

    /**
     * Sets the value of the determinerCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityDeterminer }
     *     
     */
    public void setDeterminerCode(EntityDeterminer value) {
        this.determinerCode = value;
    }

}
