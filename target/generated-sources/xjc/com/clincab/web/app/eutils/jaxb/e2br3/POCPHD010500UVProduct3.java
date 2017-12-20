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
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for POCP_HD010500UV.Product3 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="POCP_HD010500UV.Product3"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;group ref="{urn:hl7-org:v3}InfrastructureRootElements"/&gt;
 *         &lt;choice&gt;
 *           &lt;element name="potentialSupply" type="{urn:hl7-org:v3}POCP_HD010500UV.PotentialSupply"/&gt;
 *           &lt;element name="reconstitution" type="{urn:hl7-org:v3}POCP_HD010500UV.Reconstitution"/&gt;
 *           &lt;element name="actDefinition" type="{urn:hl7-org:v3}POCP_HD010500UV.ActDefinition"/&gt;
 *         &lt;/choice&gt;
 *       &lt;/sequence&gt;
 *       &lt;attGroup ref="{urn:hl7-org:v3}InfrastructureRootAttributes"/&gt;
 *       &lt;attribute name="nullFlavor" type="{urn:hl7-org:v3}NullFlavor" /&gt;
 *       &lt;attribute name="typeCode" type="{urn:hl7-org:v3}ParticipationProduct" default="PRD" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "POCP_HD010500UV.Product3", propOrder = {
    "realmCode",
    "typeId",
    "templateId",
    "potentialSupply",
    "reconstitution",
    "actDefinition"
})
public class POCPHD010500UVProduct3 {

    protected List<CS> realmCode;
    protected II typeId;
    protected List<II> templateId;
    @XmlElementRef(name = "potentialSupply", namespace = "urn:hl7-org:v3", type = JAXBElement.class, required = false)
    protected JAXBElement<POCPHD010500UVPotentialSupply> potentialSupply;
    @XmlElementRef(name = "reconstitution", namespace = "urn:hl7-org:v3", type = JAXBElement.class, required = false)
    protected JAXBElement<POCPHD010500UVReconstitution> reconstitution;
    @XmlElementRef(name = "actDefinition", namespace = "urn:hl7-org:v3", type = JAXBElement.class, required = false)
    protected JAXBElement<POCPHD010500UVActDefinition> actDefinition;
    @XmlAttribute(name = "nullFlavor")
    protected NullFlavor nullFlavor;
    @XmlAttribute(name = "typeCode")
    protected ParticipationProduct typeCode;

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
     * Gets the value of the potentialSupply property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link POCPHD010500UVPotentialSupply }{@code >}
     *     
     */
    public JAXBElement<POCPHD010500UVPotentialSupply> getPotentialSupply() {
        return potentialSupply;
    }

    /**
     * Sets the value of the potentialSupply property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link POCPHD010500UVPotentialSupply }{@code >}
     *     
     */
    public void setPotentialSupply(JAXBElement<POCPHD010500UVPotentialSupply> value) {
        this.potentialSupply = value;
    }

    /**
     * Gets the value of the reconstitution property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link POCPHD010500UVReconstitution }{@code >}
     *     
     */
    public JAXBElement<POCPHD010500UVReconstitution> getReconstitution() {
        return reconstitution;
    }

    /**
     * Sets the value of the reconstitution property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link POCPHD010500UVReconstitution }{@code >}
     *     
     */
    public void setReconstitution(JAXBElement<POCPHD010500UVReconstitution> value) {
        this.reconstitution = value;
    }

    /**
     * Gets the value of the actDefinition property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link POCPHD010500UVActDefinition }{@code >}
     *     
     */
    public JAXBElement<POCPHD010500UVActDefinition> getActDefinition() {
        return actDefinition;
    }

    /**
     * Sets the value of the actDefinition property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link POCPHD010500UVActDefinition }{@code >}
     *     
     */
    public void setActDefinition(JAXBElement<POCPHD010500UVActDefinition> value) {
        this.actDefinition = value;
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
     * Gets the value of the typeCode property.
     * 
     * @return
     *     possible object is
     *     {@link ParticipationProduct }
     *     
     */
    public ParticipationProduct getTypeCode() {
        if (typeCode == null) {
            return ParticipationProduct.PRD;
        } else {
            return typeCode;
        }
    }

    /**
     * Sets the value of the typeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link ParticipationProduct }
     *     
     */
    public void setTypeCode(ParticipationProduct value) {
        this.typeCode = value;
    }

}
