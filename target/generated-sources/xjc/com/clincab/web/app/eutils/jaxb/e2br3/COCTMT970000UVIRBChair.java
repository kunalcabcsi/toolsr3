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
 * <p>Java class for COCT_MT970000UV.IRBChair complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="COCT_MT970000UV.IRBChair"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;group ref="{urn:hl7-org:v3}InfrastructureRootElements"/&gt;
 *         &lt;element name="addr" type="{urn:hl7-org:v3}AD" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="telecom" type="{urn:hl7-org:v3}TEL" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="signingPerson" type="{urn:hl7-org:v3}COCT_MT970000UV.Person" minOccurs="0"/&gt;
 *         &lt;element name="representedInstitutionReviewBoard" type="{urn:hl7-org:v3}COCT_MT970000UV.InstitutionReviewBoard" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attGroup ref="{urn:hl7-org:v3}InfrastructureRootAttributes"/&gt;
 *       &lt;attribute name="nullFlavor" type="{urn:hl7-org:v3}NullFlavor" /&gt;
 *       &lt;attribute name="classCode" use="required" type="{urn:hl7-org:v3}RoleClassSigningAuthorityOrOfficer" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "COCT_MT970000UV.IRBChair", propOrder = {
    "realmCode",
    "typeId",
    "templateId",
    "addr",
    "telecom",
    "signingPerson",
    "representedInstitutionReviewBoard"
})
public class COCTMT970000UVIRBChair {

    protected List<CS> realmCode;
    protected II typeId;
    protected List<II> templateId;
    protected List<AD> addr;
    protected List<TEL> telecom;
    @XmlElementRef(name = "signingPerson", namespace = "urn:hl7-org:v3", type = JAXBElement.class, required = false)
    protected JAXBElement<COCTMT970000UVPerson> signingPerson;
    @XmlElementRef(name = "representedInstitutionReviewBoard", namespace = "urn:hl7-org:v3", type = JAXBElement.class, required = false)
    protected JAXBElement<COCTMT970000UVInstitutionReviewBoard> representedInstitutionReviewBoard;
    @XmlAttribute(name = "nullFlavor")
    protected NullFlavor nullFlavor;
    @XmlAttribute(name = "classCode", required = true)
    protected RoleClassSigningAuthorityOrOfficer classCode;

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
     * Gets the value of the addr property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the addr property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAddr().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AD }
     * 
     * 
     */
    public List<AD> getAddr() {
        if (addr == null) {
            addr = new ArrayList<AD>();
        }
        return this.addr;
    }

    /**
     * Gets the value of the telecom property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the telecom property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTelecom().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TEL }
     * 
     * 
     */
    public List<TEL> getTelecom() {
        if (telecom == null) {
            telecom = new ArrayList<TEL>();
        }
        return this.telecom;
    }

    /**
     * Gets the value of the signingPerson property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link COCTMT970000UVPerson }{@code >}
     *     
     */
    public JAXBElement<COCTMT970000UVPerson> getSigningPerson() {
        return signingPerson;
    }

    /**
     * Sets the value of the signingPerson property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link COCTMT970000UVPerson }{@code >}
     *     
     */
    public void setSigningPerson(JAXBElement<COCTMT970000UVPerson> value) {
        this.signingPerson = value;
    }

    /**
     * Gets the value of the representedInstitutionReviewBoard property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link COCTMT970000UVInstitutionReviewBoard }{@code >}
     *     
     */
    public JAXBElement<COCTMT970000UVInstitutionReviewBoard> getRepresentedInstitutionReviewBoard() {
        return representedInstitutionReviewBoard;
    }

    /**
     * Sets the value of the representedInstitutionReviewBoard property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link COCTMT970000UVInstitutionReviewBoard }{@code >}
     *     
     */
    public void setRepresentedInstitutionReviewBoard(JAXBElement<COCTMT970000UVInstitutionReviewBoard> value) {
        this.representedInstitutionReviewBoard = value;
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
     *     {@link RoleClassSigningAuthorityOrOfficer }
     *     
     */
    public RoleClassSigningAuthorityOrOfficer getClassCode() {
        return classCode;
    }

    /**
     * Sets the value of the classCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link RoleClassSigningAuthorityOrOfficer }
     *     
     */
    public void setClassCode(RoleClassSigningAuthorityOrOfficer value) {
        this.classCode = value;
    }

}
