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
 * <p>Java class for POCP_MT020200UV.DeviceInstance complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="POCP_MT020200UV.DeviceInstance"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;group ref="{urn:hl7-org:v3}InfrastructureRootElements"/&gt;
 *         &lt;element name="id" type="{urn:hl7-org:v3}II" minOccurs="0"/&gt;
 *         &lt;element name="quantity" type="{urn:hl7-org:v3}PQ" minOccurs="0"/&gt;
 *         &lt;element name="desc" type="{urn:hl7-org:v3}ED" minOccurs="0"/&gt;
 *         &lt;element name="existenceTime" type="{urn:hl7-org:v3}IVL_TS" minOccurs="0"/&gt;
 *         &lt;element name="lotNumberText" type="{urn:hl7-org:v3}ST" minOccurs="0"/&gt;
 *         &lt;element name="expirationTime" type="{urn:hl7-org:v3}IVL_TS" minOccurs="0"/&gt;
 *         &lt;element name="manufacturerModelName" type="{urn:hl7-org:v3}SC" minOccurs="0"/&gt;
 *         &lt;element name="softwareName" type="{urn:hl7-org:v3}SC" minOccurs="0"/&gt;
 *         &lt;element name="asIdentifiedItem" type="{urn:hl7-org:v3}POCP_MT020200UV.IdentifiedItem" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="asContent" type="{urn:hl7-org:v3}POCP_MT020200UV.Content2" minOccurs="0"/&gt;
 *         &lt;element name="asMember" type="{urn:hl7-org:v3}POCP_MT020200UV.Member" minOccurs="0"/&gt;
 *         &lt;element name="asInstanceOfKind" type="{urn:hl7-org:v3}POCP_MT020200UV.InstanceOfKind2" minOccurs="0"/&gt;
 *         &lt;element name="part" type="{urn:hl7-org:v3}POCP_MT020200UV.Part" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="ingredient" type="{urn:hl7-org:v3}POCP_MT020200UV.Ingredient1" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="member" type="{urn:hl7-org:v3}POCP_MT020200UV.Member1" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attGroup ref="{urn:hl7-org:v3}InfrastructureRootAttributes"/&gt;
 *       &lt;attribute name="nullFlavor" type="{urn:hl7-org:v3}NullFlavor" /&gt;
 *       &lt;attribute name="classCode" type="{urn:hl7-org:v3}EntityClassDevice" default="DEV" /&gt;
 *       &lt;attribute name="determinerCode" type="{urn:hl7-org:v3}EntityDeterminerSpecific" default="INSTANCE" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "POCP_MT020200UV.DeviceInstance", propOrder = {
    "realmCode",
    "typeId",
    "templateId",
    "id",
    "quantity",
    "desc",
    "existenceTime",
    "lotNumberText",
    "expirationTime",
    "manufacturerModelName",
    "softwareName",
    "asIdentifiedItem",
    "asContent",
    "asMember",
    "asInstanceOfKind",
    "part",
    "ingredient",
    "member"
})
public class POCPMT020200UVDeviceInstance {

    protected List<CS> realmCode;
    protected II typeId;
    protected List<II> templateId;
    protected II id;
    protected PQ quantity;
    protected ED desc;
    protected IVLTS existenceTime;
    protected ST lotNumberText;
    protected IVLTS expirationTime;
    protected SC manufacturerModelName;
    protected SC softwareName;
    @XmlElement(nillable = true)
    protected List<POCPMT020200UVIdentifiedItem> asIdentifiedItem;
    @XmlElementRef(name = "asContent", namespace = "urn:hl7-org:v3", type = JAXBElement.class, required = false)
    protected JAXBElement<POCPMT020200UVContent2> asContent;
    @XmlElementRef(name = "asMember", namespace = "urn:hl7-org:v3", type = JAXBElement.class, required = false)
    protected JAXBElement<POCPMT020200UVMember> asMember;
    @XmlElementRef(name = "asInstanceOfKind", namespace = "urn:hl7-org:v3", type = JAXBElement.class, required = false)
    protected JAXBElement<POCPMT020200UVInstanceOfKind2> asInstanceOfKind;
    @XmlElement(nillable = true)
    protected List<POCPMT020200UVPart> part;
    @XmlElement(nillable = true)
    protected List<POCPMT020200UVIngredient1> ingredient;
    @XmlElement(nillable = true)
    protected List<POCPMT020200UVMember1> member;
    @XmlAttribute(name = "nullFlavor")
    protected NullFlavor nullFlavor;
    @XmlAttribute(name = "classCode")
    protected EntityClassDevice classCode;
    @XmlAttribute(name = "determinerCode")
    protected EntityDeterminerSpecific determinerCode;

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
     * Gets the value of the existenceTime property.
     * 
     * @return
     *     possible object is
     *     {@link IVLTS }
     *     
     */
    public IVLTS getExistenceTime() {
        return existenceTime;
    }

    /**
     * Sets the value of the existenceTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link IVLTS }
     *     
     */
    public void setExistenceTime(IVLTS value) {
        this.existenceTime = value;
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
     * Gets the value of the manufacturerModelName property.
     * 
     * @return
     *     possible object is
     *     {@link SC }
     *     
     */
    public SC getManufacturerModelName() {
        return manufacturerModelName;
    }

    /**
     * Sets the value of the manufacturerModelName property.
     * 
     * @param value
     *     allowed object is
     *     {@link SC }
     *     
     */
    public void setManufacturerModelName(SC value) {
        this.manufacturerModelName = value;
    }

    /**
     * Gets the value of the softwareName property.
     * 
     * @return
     *     possible object is
     *     {@link SC }
     *     
     */
    public SC getSoftwareName() {
        return softwareName;
    }

    /**
     * Sets the value of the softwareName property.
     * 
     * @param value
     *     allowed object is
     *     {@link SC }
     *     
     */
    public void setSoftwareName(SC value) {
        this.softwareName = value;
    }

    /**
     * Gets the value of the asIdentifiedItem property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the asIdentifiedItem property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAsIdentifiedItem().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link POCPMT020200UVIdentifiedItem }
     * 
     * 
     */
    public List<POCPMT020200UVIdentifiedItem> getAsIdentifiedItem() {
        if (asIdentifiedItem == null) {
            asIdentifiedItem = new ArrayList<POCPMT020200UVIdentifiedItem>();
        }
        return this.asIdentifiedItem;
    }

    /**
     * Gets the value of the asContent property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link POCPMT020200UVContent2 }{@code >}
     *     
     */
    public JAXBElement<POCPMT020200UVContent2> getAsContent() {
        return asContent;
    }

    /**
     * Sets the value of the asContent property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link POCPMT020200UVContent2 }{@code >}
     *     
     */
    public void setAsContent(JAXBElement<POCPMT020200UVContent2> value) {
        this.asContent = value;
    }

    /**
     * Gets the value of the asMember property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link POCPMT020200UVMember }{@code >}
     *     
     */
    public JAXBElement<POCPMT020200UVMember> getAsMember() {
        return asMember;
    }

    /**
     * Sets the value of the asMember property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link POCPMT020200UVMember }{@code >}
     *     
     */
    public void setAsMember(JAXBElement<POCPMT020200UVMember> value) {
        this.asMember = value;
    }

    /**
     * Gets the value of the asInstanceOfKind property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link POCPMT020200UVInstanceOfKind2 }{@code >}
     *     
     */
    public JAXBElement<POCPMT020200UVInstanceOfKind2> getAsInstanceOfKind() {
        return asInstanceOfKind;
    }

    /**
     * Sets the value of the asInstanceOfKind property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link POCPMT020200UVInstanceOfKind2 }{@code >}
     *     
     */
    public void setAsInstanceOfKind(JAXBElement<POCPMT020200UVInstanceOfKind2> value) {
        this.asInstanceOfKind = value;
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
     * {@link POCPMT020200UVPart }
     * 
     * 
     */
    public List<POCPMT020200UVPart> getPart() {
        if (part == null) {
            part = new ArrayList<POCPMT020200UVPart>();
        }
        return this.part;
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
     * {@link POCPMT020200UVIngredient1 }
     * 
     * 
     */
    public List<POCPMT020200UVIngredient1> getIngredient() {
        if (ingredient == null) {
            ingredient = new ArrayList<POCPMT020200UVIngredient1>();
        }
        return this.ingredient;
    }

    /**
     * Gets the value of the member property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the member property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMember().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link POCPMT020200UVMember1 }
     * 
     * 
     */
    public List<POCPMT020200UVMember1> getMember() {
        if (member == null) {
            member = new ArrayList<POCPMT020200UVMember1>();
        }
        return this.member;
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
     *     {@link EntityClassDevice }
     *     
     */
    public EntityClassDevice getClassCode() {
        if (classCode == null) {
            return EntityClassDevice.DEV;
        } else {
            return classCode;
        }
    }

    /**
     * Sets the value of the classCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityClassDevice }
     *     
     */
    public void setClassCode(EntityClassDevice value) {
        this.classCode = value;
    }

    /**
     * Gets the value of the determinerCode property.
     * 
     * @return
     *     possible object is
     *     {@link EntityDeterminerSpecific }
     *     
     */
    public EntityDeterminerSpecific getDeterminerCode() {
        if (determinerCode == null) {
            return EntityDeterminerSpecific.INSTANCE;
        } else {
            return determinerCode;
        }
    }

    /**
     * Sets the value of the determinerCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityDeterminerSpecific }
     *     
     */
    public void setDeterminerCode(EntityDeterminerSpecific value) {
        this.determinerCode = value;
    }

}
