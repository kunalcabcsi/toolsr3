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
 * <p>Java class for POCP_HD010600UV.Product complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="POCP_HD010600UV.Product"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;group ref="{urn:hl7-org:v3}InfrastructureRootElements"/&gt;
 *         &lt;element name="code" type="{urn:hl7-org:v3}CE" minOccurs="0"/&gt;
 *         &lt;element name="name" type="{urn:hl7-org:v3}EN" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="desc" type="{urn:hl7-org:v3}ED" minOccurs="0"/&gt;
 *         &lt;element name="riskCode" type="{urn:hl7-org:v3}CE" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="handlingCode" type="{urn:hl7-org:v3}CE" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="formCode" type="{urn:hl7-org:v3}CE" minOccurs="0"/&gt;
 *         &lt;element name="expirationTime" type="{urn:hl7-org:v3}IVL_TS" minOccurs="0"/&gt;
 *         &lt;element name="asIdentifiedEntity" type="{urn:hl7-org:v3}POCP_HD010600UV.IdentifiedEntity" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="asManufacturedProduct" type="{urn:hl7-org:v3}POCP_HD010600UV.ManufacturedProduct3" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="asNamedEntity" type="{urn:hl7-org:v3}POCP_HD010600UV.NamedEntity" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="instanceOfKind" type="{urn:hl7-org:v3}POCP_MT020100UV.InstanceOfKind1" minOccurs="0"/&gt;
 *         &lt;element name="asSpecializedKind" type="{urn:hl7-org:v3}POCP_HD010600UV.SpecializedKind" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="asEntityWithGeneric" type="{urn:hl7-org:v3}POCP_HD010600UV.EntityWithGeneric" minOccurs="0"/&gt;
 *         &lt;element name="asEquivalentEntity" type="{urn:hl7-org:v3}POCP_HD010600UV.EquivalentEntity" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="ingredient" type="{urn:hl7-org:v3}POCP_HD010600UV.Ingredient" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="asContent" type="{urn:hl7-org:v3}POCP_HD010600UV.Content" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="asPartOfAssembly" type="{urn:hl7-org:v3}POCP_HD010600UV.PartOfAssembly" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="part" type="{urn:hl7-org:v3}POCP_HD010600UV.Part" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attGroup ref="{urn:hl7-org:v3}InfrastructureRootAttributes"/&gt;
 *       &lt;attribute name="nullFlavor" type="{urn:hl7-org:v3}NullFlavor" /&gt;
 *       &lt;attribute name="classCode" type="{urn:hl7-org:v3}EntityClassManufacturedMaterial" default="MMAT" /&gt;
 *       &lt;attribute name="determinerCode" type="{urn:hl7-org:v3}EntityDeterminerDetermined" default="KIND" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "POCP_HD010600UV.Product", propOrder = {
    "realmCode",
    "typeId",
    "templateId",
    "code",
    "name",
    "desc",
    "riskCode",
    "handlingCode",
    "formCode",
    "expirationTime",
    "asIdentifiedEntity",
    "asManufacturedProduct",
    "asNamedEntity",
    "instanceOfKind",
    "asSpecializedKind",
    "asEntityWithGeneric",
    "asEquivalentEntity",
    "ingredient",
    "asContent",
    "asPartOfAssembly",
    "part"
})
public class POCPHD010600UVProduct {

    protected List<CS> realmCode;
    protected II typeId;
    protected List<II> templateId;
    protected CE code;
    protected List<EN> name;
    protected ED desc;
    protected List<CE> riskCode;
    protected List<CE> handlingCode;
    protected CE formCode;
    protected IVLTS expirationTime;
    @XmlElement(nillable = true)
    protected List<POCPHD010600UVIdentifiedEntity> asIdentifiedEntity;
    @XmlElement(nillable = true)
    protected List<POCPHD010600UVManufacturedProduct3> asManufacturedProduct;
    @XmlElement(nillable = true)
    protected List<POCPHD010600UVNamedEntity> asNamedEntity;
    @XmlElementRef(name = "instanceOfKind", namespace = "urn:hl7-org:v3", type = JAXBElement.class, required = false)
    protected JAXBElement<POCPMT020100UVInstanceOfKind1> instanceOfKind;
    @XmlElement(nillable = true)
    protected List<POCPHD010600UVSpecializedKind> asSpecializedKind;
    @XmlElementRef(name = "asEntityWithGeneric", namespace = "urn:hl7-org:v3", type = JAXBElement.class, required = false)
    protected JAXBElement<POCPHD010600UVEntityWithGeneric> asEntityWithGeneric;
    @XmlElement(nillable = true)
    protected List<POCPHD010600UVEquivalentEntity> asEquivalentEntity;
    @XmlElement(nillable = true)
    protected List<POCPHD010600UVIngredient> ingredient;
    @XmlElement(nillable = true)
    protected List<POCPHD010600UVContent> asContent;
    @XmlElement(nillable = true)
    protected List<POCPHD010600UVPartOfAssembly> asPartOfAssembly;
    @XmlElement(nillable = true)
    protected List<POCPHD010600UVPart> part;
    @XmlAttribute(name = "nullFlavor")
    protected NullFlavor nullFlavor;
    @XmlAttribute(name = "classCode")
    protected EntityClassManufacturedMaterial classCode;
    @XmlAttribute(name = "determinerCode")
    protected EntityDeterminerDetermined determinerCode;

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
     * Gets the value of the name property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the name property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getName().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EN }
     * 
     * 
     */
    public List<EN> getName() {
        if (name == null) {
            name = new ArrayList<EN>();
        }
        return this.name;
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
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the riskCode property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRiskCode().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CE }
     * 
     * 
     */
    public List<CE> getRiskCode() {
        if (riskCode == null) {
            riskCode = new ArrayList<CE>();
        }
        return this.riskCode;
    }

    /**
     * Gets the value of the handlingCode property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the handlingCode property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getHandlingCode().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CE }
     * 
     * 
     */
    public List<CE> getHandlingCode() {
        if (handlingCode == null) {
            handlingCode = new ArrayList<CE>();
        }
        return this.handlingCode;
    }

    /**
     * Gets the value of the formCode property.
     * 
     * @return
     *     possible object is
     *     {@link CE }
     *     
     */
    public CE getFormCode() {
        return formCode;
    }

    /**
     * Sets the value of the formCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link CE }
     *     
     */
    public void setFormCode(CE value) {
        this.formCode = value;
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
     * Gets the value of the asIdentifiedEntity property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the asIdentifiedEntity property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAsIdentifiedEntity().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link POCPHD010600UVIdentifiedEntity }
     * 
     * 
     */
    public List<POCPHD010600UVIdentifiedEntity> getAsIdentifiedEntity() {
        if (asIdentifiedEntity == null) {
            asIdentifiedEntity = new ArrayList<POCPHD010600UVIdentifiedEntity>();
        }
        return this.asIdentifiedEntity;
    }

    /**
     * Gets the value of the asManufacturedProduct property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the asManufacturedProduct property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAsManufacturedProduct().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link POCPHD010600UVManufacturedProduct3 }
     * 
     * 
     */
    public List<POCPHD010600UVManufacturedProduct3> getAsManufacturedProduct() {
        if (asManufacturedProduct == null) {
            asManufacturedProduct = new ArrayList<POCPHD010600UVManufacturedProduct3>();
        }
        return this.asManufacturedProduct;
    }

    /**
     * Gets the value of the asNamedEntity property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the asNamedEntity property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAsNamedEntity().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link POCPHD010600UVNamedEntity }
     * 
     * 
     */
    public List<POCPHD010600UVNamedEntity> getAsNamedEntity() {
        if (asNamedEntity == null) {
            asNamedEntity = new ArrayList<POCPHD010600UVNamedEntity>();
        }
        return this.asNamedEntity;
    }

    /**
     * Gets the value of the instanceOfKind property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link POCPMT020100UVInstanceOfKind1 }{@code >}
     *     
     */
    public JAXBElement<POCPMT020100UVInstanceOfKind1> getInstanceOfKind() {
        return instanceOfKind;
    }

    /**
     * Sets the value of the instanceOfKind property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link POCPMT020100UVInstanceOfKind1 }{@code >}
     *     
     */
    public void setInstanceOfKind(JAXBElement<POCPMT020100UVInstanceOfKind1> value) {
        this.instanceOfKind = value;
    }

    /**
     * Gets the value of the asSpecializedKind property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the asSpecializedKind property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAsSpecializedKind().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link POCPHD010600UVSpecializedKind }
     * 
     * 
     */
    public List<POCPHD010600UVSpecializedKind> getAsSpecializedKind() {
        if (asSpecializedKind == null) {
            asSpecializedKind = new ArrayList<POCPHD010600UVSpecializedKind>();
        }
        return this.asSpecializedKind;
    }

    /**
     * Gets the value of the asEntityWithGeneric property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link POCPHD010600UVEntityWithGeneric }{@code >}
     *     
     */
    public JAXBElement<POCPHD010600UVEntityWithGeneric> getAsEntityWithGeneric() {
        return asEntityWithGeneric;
    }

    /**
     * Sets the value of the asEntityWithGeneric property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link POCPHD010600UVEntityWithGeneric }{@code >}
     *     
     */
    public void setAsEntityWithGeneric(JAXBElement<POCPHD010600UVEntityWithGeneric> value) {
        this.asEntityWithGeneric = value;
    }

    /**
     * Gets the value of the asEquivalentEntity property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the asEquivalentEntity property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAsEquivalentEntity().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link POCPHD010600UVEquivalentEntity }
     * 
     * 
     */
    public List<POCPHD010600UVEquivalentEntity> getAsEquivalentEntity() {
        if (asEquivalentEntity == null) {
            asEquivalentEntity = new ArrayList<POCPHD010600UVEquivalentEntity>();
        }
        return this.asEquivalentEntity;
    }

    /**
     * Gets the value of the ingredient property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the ingredient property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getIngredient().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link POCPHD010600UVIngredient }
     * 
     * 
     */
    public List<POCPHD010600UVIngredient> getIngredient() {
        if (ingredient == null) {
            ingredient = new ArrayList<POCPHD010600UVIngredient>();
        }
        return this.ingredient;
    }

    /**
     * Gets the value of the asContent property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the asContent property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAsContent().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link POCPHD010600UVContent }
     * 
     * 
     */
    public List<POCPHD010600UVContent> getAsContent() {
        if (asContent == null) {
            asContent = new ArrayList<POCPHD010600UVContent>();
        }
        return this.asContent;
    }

    /**
     * Gets the value of the asPartOfAssembly property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the asPartOfAssembly property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAsPartOfAssembly().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link POCPHD010600UVPartOfAssembly }
     * 
     * 
     */
    public List<POCPHD010600UVPartOfAssembly> getAsPartOfAssembly() {
        if (asPartOfAssembly == null) {
            asPartOfAssembly = new ArrayList<POCPHD010600UVPartOfAssembly>();
        }
        return this.asPartOfAssembly;
    }

    /**
     * Gets the value of the part property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the part property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPart().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link POCPHD010600UVPart }
     * 
     * 
     */
    public List<POCPHD010600UVPart> getPart() {
        if (part == null) {
            part = new ArrayList<POCPHD010600UVPart>();
        }
        return this.part;
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
        if (classCode == null) {
            return EntityClassManufacturedMaterial.MMAT;
        } else {
            return classCode;
        }
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
     *     {@link EntityDeterminerDetermined }
     *     
     */
    public EntityDeterminerDetermined getDeterminerCode() {
        if (determinerCode == null) {
            return EntityDeterminerDetermined.KIND;
        } else {
            return determinerCode;
        }
    }

    /**
     * Sets the value of the determinerCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityDeterminerDetermined }
     *     
     */
    public void setDeterminerCode(EntityDeterminerDetermined value) {
        this.determinerCode = value;
    }

}
