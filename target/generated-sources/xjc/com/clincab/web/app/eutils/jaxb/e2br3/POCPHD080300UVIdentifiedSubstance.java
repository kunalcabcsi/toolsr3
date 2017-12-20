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
 * <p>Java class for POCP_HD080300UV.IdentifiedSubstance complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="POCP_HD080300UV.IdentifiedSubstance"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;group ref="{urn:hl7-org:v3}InfrastructureRootElements"/&gt;
 *         &lt;element name="id" type="{urn:hl7-org:v3}II"/&gt;
 *         &lt;element name="code" type="{urn:hl7-org:v3}CV" minOccurs="0"/&gt;
 *         &lt;element name="statusCode" type="{urn:hl7-org:v3}CS" minOccurs="0"/&gt;
 *         &lt;element name="effectiveTime" type="{urn:hl7-org:v3}IVL_TS" minOccurs="0"/&gt;
 *         &lt;element name="identifiedSubstance" type="{urn:hl7-org:v3}POCP_HD080300UV.Substance" minOccurs="0"/&gt;
 *         &lt;choice&gt;
 *           &lt;element name="assigningTerritory" type="{urn:hl7-org:v3}POCP_HD080300UV.Territory" minOccurs="0"/&gt;
 *           &lt;element name="assigningOrganization" type="{urn:hl7-org:v3}POCP_HD080300UV.Organization" minOccurs="0"/&gt;
 *         &lt;/choice&gt;
 *         &lt;element name="subjectOf" type="{urn:hl7-org:v3}POCP_HD080300UV.Subject1" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="productOf" type="{urn:hl7-org:v3}POCP_HD080300UV.Product" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="participation" type="{urn:hl7-org:v3}POCP_HD080300UV.Interactor1" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attGroup ref="{urn:hl7-org:v3}InfrastructureRootAttributes"/&gt;
 *       &lt;attribute name="classCode" type="{urn:hl7-org:v3}RoleClassIdentifiedEntity" default="IDENT" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "POCP_HD080300UV.IdentifiedSubstance", propOrder = {
    "realmCode",
    "typeId",
    "templateId",
    "id",
    "code",
    "statusCode",
    "effectiveTime",
    "identifiedSubstance",
    "assigningTerritory",
    "assigningOrganization",
    "subjectOf",
    "productOf",
    "participation"
})
public class POCPHD080300UVIdentifiedSubstance {

    protected List<CS> realmCode;
    protected II typeId;
    protected List<II> templateId;
    @XmlElement(required = true)
    protected II id;
    protected CV code;
    protected CS statusCode;
    protected IVLTS effectiveTime;
    @XmlElementRef(name = "identifiedSubstance", namespace = "urn:hl7-org:v3", type = JAXBElement.class, required = false)
    protected JAXBElement<POCPHD080300UVSubstance> identifiedSubstance;
    @XmlElementRef(name = "assigningTerritory", namespace = "urn:hl7-org:v3", type = JAXBElement.class, required = false)
    protected JAXBElement<POCPHD080300UVTerritory> assigningTerritory;
    @XmlElementRef(name = "assigningOrganization", namespace = "urn:hl7-org:v3", type = JAXBElement.class, required = false)
    protected JAXBElement<POCPHD080300UVOrganization> assigningOrganization;
    @XmlElement(nillable = true)
    protected List<POCPHD080300UVSubject1> subjectOf;
    @XmlElement(nillable = true)
    protected List<POCPHD080300UVProduct> productOf;
    @XmlElement(nillable = true)
    protected List<POCPHD080300UVInteractor1> participation;
    @XmlAttribute(name = "classCode")
    protected RoleClassIdentifiedEntity classCode;

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
     * Gets the value of the code property.
     * 
     * @return
     *     possible object is
     *     {@link CV }
     *     
     */
    public CV getCode() {
        return code;
    }

    /**
     * Sets the value of the code property.
     * 
     * @param value
     *     allowed object is
     *     {@link CV }
     *     
     */
    public void setCode(CV value) {
        this.code = value;
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
     * @return
     *     possible object is
     *     {@link IVLTS }
     *     
     */
    public IVLTS getEffectiveTime() {
        return effectiveTime;
    }

    /**
     * Sets the value of the effectiveTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link IVLTS }
     *     
     */
    public void setEffectiveTime(IVLTS value) {
        this.effectiveTime = value;
    }

    /**
     * Gets the value of the identifiedSubstance property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link POCPHD080300UVSubstance }{@code >}
     *     
     */
    public JAXBElement<POCPHD080300UVSubstance> getIdentifiedSubstance() {
        return identifiedSubstance;
    }

    /**
     * Sets the value of the identifiedSubstance property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link POCPHD080300UVSubstance }{@code >}
     *     
     */
    public void setIdentifiedSubstance(JAXBElement<POCPHD080300UVSubstance> value) {
        this.identifiedSubstance = value;
    }

    /**
     * Gets the value of the assigningTerritory property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link POCPHD080300UVTerritory }{@code >}
     *     
     */
    public JAXBElement<POCPHD080300UVTerritory> getAssigningTerritory() {
        return assigningTerritory;
    }

    /**
     * Sets the value of the assigningTerritory property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link POCPHD080300UVTerritory }{@code >}
     *     
     */
    public void setAssigningTerritory(JAXBElement<POCPHD080300UVTerritory> value) {
        this.assigningTerritory = value;
    }

    /**
     * Gets the value of the assigningOrganization property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link POCPHD080300UVOrganization }{@code >}
     *     
     */
    public JAXBElement<POCPHD080300UVOrganization> getAssigningOrganization() {
        return assigningOrganization;
    }

    /**
     * Sets the value of the assigningOrganization property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link POCPHD080300UVOrganization }{@code >}
     *     
     */
    public void setAssigningOrganization(JAXBElement<POCPHD080300UVOrganization> value) {
        this.assigningOrganization = value;
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
     * {@link POCPHD080300UVSubject1 }
     * 
     * 
     */
    public List<POCPHD080300UVSubject1> getSubjectOf() {
        if (subjectOf == null) {
            subjectOf = new ArrayList<POCPHD080300UVSubject1>();
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
     * {@link POCPHD080300UVProduct }
     * 
     * 
     */
    public List<POCPHD080300UVProduct> getProductOf() {
        if (productOf == null) {
            productOf = new ArrayList<POCPHD080300UVProduct>();
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
     * {@link POCPHD080300UVInteractor1 }
     * 
     * 
     */
    public List<POCPHD080300UVInteractor1> getParticipation() {
        if (participation == null) {
            participation = new ArrayList<POCPHD080300UVInteractor1>();
        }
        return this.participation;
    }

    /**
     * Gets the value of the classCode property.
     * 
     * @return
     *     possible object is
     *     {@link RoleClassIdentifiedEntity }
     *     
     */
    public RoleClassIdentifiedEntity getClassCode() {
        if (classCode == null) {
            return RoleClassIdentifiedEntity.IDENT;
        } else {
            return classCode;
        }
    }

    /**
     * Sets the value of the classCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link RoleClassIdentifiedEntity }
     *     
     */
    public void setClassCode(RoleClassIdentifiedEntity value) {
        this.classCode = value;
    }

}
