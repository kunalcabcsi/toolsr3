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
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for POCP_MT080200UV.PresentSubstance complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="POCP_MT080200UV.PresentSubstance"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;group ref="{urn:hl7-org:v3}InfrastructureRootElements"/&gt;
 *         &lt;choice&gt;
 *           &lt;element name="player" type="{urn:hl7-org:v3}POCP_MT081100UV.Substance"/&gt;
 *           &lt;element name="player2" type="{urn:hl7-org:v3}POCP_MT082100UV.Substance"/&gt;
 *         &lt;/choice&gt;
 *         &lt;choice&gt;
 *           &lt;element name="scoper1" type="{urn:hl7-org:v3}POCP_MT080200UV.Entity" minOccurs="0"/&gt;
 *           &lt;element name="scoper2" type="{urn:hl7-org:v3}POCP_MT080200UV.OrganismStrain" minOccurs="0"/&gt;
 *         &lt;/choice&gt;
 *       &lt;/sequence&gt;
 *       &lt;attGroup ref="{urn:hl7-org:v3}InfrastructureRootAttributes"/&gt;
 *       &lt;attribute name="classCode" use="required" type="{urn:hl7-org:v3}RoleClassSubstancePresence" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "POCP_MT080200UV.PresentSubstance", propOrder = {
    "realmCode",
    "typeId",
    "templateId",
    "player",
    "player2",
    "scoper1",
    "scoper2"
})
public class POCPMT080200UVPresentSubstance {

    protected List<CS> realmCode;
    protected II typeId;
    protected List<II> templateId;
    protected POCPMT081100UVSubstance player;
    protected POCPMT082100UVSubstance player2;
    @XmlElementRef(name = "scoper1", namespace = "urn:hl7-org:v3", type = JAXBElement.class, required = false)
    protected JAXBElement<POCPMT080200UVEntity> scoper1;
    @XmlElementRef(name = "scoper2", namespace = "urn:hl7-org:v3", type = JAXBElement.class, required = false)
    protected JAXBElement<POCPMT080200UVOrganismStrain> scoper2;
    @XmlAttribute(name = "classCode", required = true)
    protected RoleClassSubstancePresence classCode;

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
     * Gets the value of the player property.
     * 
     * @return
     *     possible object is
     *     {@link POCPMT081100UVSubstance }
     *     
     */
    public POCPMT081100UVSubstance getPlayer() {
        return player;
    }

    /**
     * Sets the value of the player property.
     * 
     * @param value
     *     allowed object is
     *     {@link POCPMT081100UVSubstance }
     *     
     */
    public void setPlayer(POCPMT081100UVSubstance value) {
        this.player = value;
    }

    /**
     * Gets the value of the player2 property.
     * 
     * @return
     *     possible object is
     *     {@link POCPMT082100UVSubstance }
     *     
     */
    public POCPMT082100UVSubstance getPlayer2() {
        return player2;
    }

    /**
     * Sets the value of the player2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link POCPMT082100UVSubstance }
     *     
     */
    public void setPlayer2(POCPMT082100UVSubstance value) {
        this.player2 = value;
    }

    /**
     * Gets the value of the scoper1 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link POCPMT080200UVEntity }{@code >}
     *     
     */
    public JAXBElement<POCPMT080200UVEntity> getScoper1() {
        return scoper1;
    }

    /**
     * Sets the value of the scoper1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link POCPMT080200UVEntity }{@code >}
     *     
     */
    public void setScoper1(JAXBElement<POCPMT080200UVEntity> value) {
        this.scoper1 = value;
    }

    /**
     * Gets the value of the scoper2 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link POCPMT080200UVOrganismStrain }{@code >}
     *     
     */
    public JAXBElement<POCPMT080200UVOrganismStrain> getScoper2() {
        return scoper2;
    }

    /**
     * Sets the value of the scoper2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link POCPMT080200UVOrganismStrain }{@code >}
     *     
     */
    public void setScoper2(JAXBElement<POCPMT080200UVOrganismStrain> value) {
        this.scoper2 = value;
    }

    /**
     * Gets the value of the classCode property.
     * 
     * @return
     *     possible object is
     *     {@link RoleClassSubstancePresence }
     *     
     */
    public RoleClassSubstancePresence getClassCode() {
        return classCode;
    }

    /**
     * Sets the value of the classCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link RoleClassSubstancePresence }
     *     
     */
    public void setClassCode(RoleClassSubstancePresence value) {
        this.classCode = value;
    }

}
