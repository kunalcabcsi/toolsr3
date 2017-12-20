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
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for POCP_HD060100UV.SubstanceAdministration1 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="POCP_HD060100UV.SubstanceAdministration1"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;group ref="{urn:hl7-org:v3}InfrastructureRootElements"/&gt;
 *         &lt;element name="id" type="{urn:hl7-org:v3}II" minOccurs="0"/&gt;
 *         &lt;element name="effectiveTime" type="{urn:hl7-org:v3}SXCM_TS" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="routeCode" type="{urn:hl7-org:v3}CE" minOccurs="0"/&gt;
 *         &lt;element name="doseQuantity" type="{urn:hl7-org:v3}IVL_PQ" minOccurs="0"/&gt;
 *         &lt;element name="maxDoseQuantity" type="{urn:hl7-org:v3}RTO_PQ_PQ" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="consumable" type="{urn:hl7-org:v3}POCP_HD060100UV.Consumable2" minOccurs="0"/&gt;
 *         &lt;element name="maintenanceGoal" type="{urn:hl7-org:v3}POCP_HD060100UV.MaintenanceGoal1" minOccurs="0"/&gt;
 *         &lt;element name="generalization" type="{urn:hl7-org:v3}POCP_HD060100UV.Generalization" minOccurs="0"/&gt;
 *         &lt;element name="reason" type="{urn:hl7-org:v3}POCP_HD060100UV.Reason" minOccurs="0"/&gt;
 *         &lt;element name="precondition" type="{urn:hl7-org:v3}POCP_HD060100UV.Precondition" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="derivedFrom" type="{urn:hl7-org:v3}POCP_HD060100UV.DerivedFrom" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="component" type="{urn:hl7-org:v3}POCP_HD060100UV.Component3" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="subjectOf" type="{urn:hl7-org:v3}POCP_HD060100UV.Subject2" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="componentOf" type="{urn:hl7-org:v3}POCP_HD060100UV.Component1" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attGroup ref="{urn:hl7-org:v3}InfrastructureRootAttributes"/&gt;
 *       &lt;attribute name="classCode" type="{urn:hl7-org:v3}ActClassSubstanceAdministration" default="SBADM" /&gt;
 *       &lt;attribute name="moodCode" type="{urn:hl7-org:v3}cs" default="DEF" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "POCP_HD060100UV.SubstanceAdministration1", propOrder = {
    "realmCode",
    "typeId",
    "templateId",
    "id",
    "effectiveTime",
    "routeCode",
    "doseQuantity",
    "maxDoseQuantity",
    "consumable",
    "maintenanceGoal",
    "generalization",
    "reason",
    "precondition",
    "derivedFrom",
    "component",
    "subjectOf",
    "componentOf"
})
public class POCPHD060100UVSubstanceAdministration1 {

    protected List<CS> realmCode;
    protected II typeId;
    protected List<II> templateId;
    protected II id;
    protected List<SXCMTS> effectiveTime;
    protected CE routeCode;
    protected IVLPQ doseQuantity;
    protected List<RTOPQPQ> maxDoseQuantity;
    @XmlElementRef(name = "consumable", namespace = "urn:hl7-org:v3", type = JAXBElement.class, required = false)
    protected JAXBElement<POCPHD060100UVConsumable2> consumable;
    @XmlElementRef(name = "maintenanceGoal", namespace = "urn:hl7-org:v3", type = JAXBElement.class, required = false)
    protected JAXBElement<POCPHD060100UVMaintenanceGoal1> maintenanceGoal;
    @XmlElementRef(name = "generalization", namespace = "urn:hl7-org:v3", type = JAXBElement.class, required = false)
    protected JAXBElement<POCPHD060100UVGeneralization> generalization;
    @XmlElementRef(name = "reason", namespace = "urn:hl7-org:v3", type = JAXBElement.class, required = false)
    protected JAXBElement<POCPHD060100UVReason> reason;
    @XmlElement(nillable = true)
    protected List<POCPHD060100UVPrecondition> precondition;
    @XmlElement(nillable = true)
    protected List<POCPHD060100UVDerivedFrom> derivedFrom;
    @XmlElement(nillable = true)
    protected List<POCPHD060100UVComponent3> component;
    @XmlElement(nillable = true)
    protected List<POCPHD060100UVSubject2> subjectOf;
    @XmlElementRef(name = "componentOf", namespace = "urn:hl7-org:v3", type = JAXBElement.class, required = false)
    protected JAXBElement<POCPHD060100UVComponent1> componentOf;
    @XmlAttribute(name = "classCode")
    protected ActClassSubstanceAdministration classCode;
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
     * Gets the value of the effectiveTime property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the effectiveTime property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEffectiveTime().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SXCMTS }
     * 
     * 
     */
    public List<SXCMTS> getEffectiveTime() {
        if (effectiveTime == null) {
            effectiveTime = new ArrayList<SXCMTS>();
        }
        return this.effectiveTime;
    }

    /**
     * Gets the value of the routeCode property.
     * 
     * @return
     *     possible object is
     *     {@link CE }
     *     
     */
    public CE getRouteCode() {
        return routeCode;
    }

    /**
     * Sets the value of the routeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link CE }
     *     
     */
    public void setRouteCode(CE value) {
        this.routeCode = value;
    }

    /**
     * Gets the value of the doseQuantity property.
     * 
     * @return
     *     possible object is
     *     {@link IVLPQ }
     *     
     */
    public IVLPQ getDoseQuantity() {
        return doseQuantity;
    }

    /**
     * Sets the value of the doseQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link IVLPQ }
     *     
     */
    public void setDoseQuantity(IVLPQ value) {
        this.doseQuantity = value;
    }

    /**
     * Gets the value of the maxDoseQuantity property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the maxDoseQuantity property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMaxDoseQuantity().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RTOPQPQ }
     * 
     * 
     */
    public List<RTOPQPQ> getMaxDoseQuantity() {
        if (maxDoseQuantity == null) {
            maxDoseQuantity = new ArrayList<RTOPQPQ>();
        }
        return this.maxDoseQuantity;
    }

    /**
     * Gets the value of the consumable property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link POCPHD060100UVConsumable2 }{@code >}
     *     
     */
    public JAXBElement<POCPHD060100UVConsumable2> getConsumable() {
        return consumable;
    }

    /**
     * Sets the value of the consumable property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link POCPHD060100UVConsumable2 }{@code >}
     *     
     */
    public void setConsumable(JAXBElement<POCPHD060100UVConsumable2> value) {
        this.consumable = value;
    }

    /**
     * Gets the value of the maintenanceGoal property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link POCPHD060100UVMaintenanceGoal1 }{@code >}
     *     
     */
    public JAXBElement<POCPHD060100UVMaintenanceGoal1> getMaintenanceGoal() {
        return maintenanceGoal;
    }

    /**
     * Sets the value of the maintenanceGoal property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link POCPHD060100UVMaintenanceGoal1 }{@code >}
     *     
     */
    public void setMaintenanceGoal(JAXBElement<POCPHD060100UVMaintenanceGoal1> value) {
        this.maintenanceGoal = value;
    }

    /**
     * Gets the value of the generalization property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link POCPHD060100UVGeneralization }{@code >}
     *     
     */
    public JAXBElement<POCPHD060100UVGeneralization> getGeneralization() {
        return generalization;
    }

    /**
     * Sets the value of the generalization property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link POCPHD060100UVGeneralization }{@code >}
     *     
     */
    public void setGeneralization(JAXBElement<POCPHD060100UVGeneralization> value) {
        this.generalization = value;
    }

    /**
     * Gets the value of the reason property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link POCPHD060100UVReason }{@code >}
     *     
     */
    public JAXBElement<POCPHD060100UVReason> getReason() {
        return reason;
    }

    /**
     * Sets the value of the reason property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link POCPHD060100UVReason }{@code >}
     *     
     */
    public void setReason(JAXBElement<POCPHD060100UVReason> value) {
        this.reason = value;
    }

    /**
     * Gets the value of the precondition property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the precondition property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPrecondition().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link POCPHD060100UVPrecondition }
     * 
     * 
     */
    public List<POCPHD060100UVPrecondition> getPrecondition() {
        if (precondition == null) {
            precondition = new ArrayList<POCPHD060100UVPrecondition>();
        }
        return this.precondition;
    }

    /**
     * Gets the value of the derivedFrom property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the derivedFrom property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDerivedFrom().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link POCPHD060100UVDerivedFrom }
     * 
     * 
     */
    public List<POCPHD060100UVDerivedFrom> getDerivedFrom() {
        if (derivedFrom == null) {
            derivedFrom = new ArrayList<POCPHD060100UVDerivedFrom>();
        }
        return this.derivedFrom;
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
     * {@link POCPHD060100UVComponent3 }
     * 
     * 
     */
    public List<POCPHD060100UVComponent3> getComponent() {
        if (component == null) {
            component = new ArrayList<POCPHD060100UVComponent3>();
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
     * {@link POCPHD060100UVSubject2 }
     * 
     * 
     */
    public List<POCPHD060100UVSubject2> getSubjectOf() {
        if (subjectOf == null) {
            subjectOf = new ArrayList<POCPHD060100UVSubject2>();
        }
        return this.subjectOf;
    }

    /**
     * Gets the value of the componentOf property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link POCPHD060100UVComponent1 }{@code >}
     *     
     */
    public JAXBElement<POCPHD060100UVComponent1> getComponentOf() {
        return componentOf;
    }

    /**
     * Sets the value of the componentOf property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link POCPHD060100UVComponent1 }{@code >}
     *     
     */
    public void setComponentOf(JAXBElement<POCPHD060100UVComponent1> value) {
        this.componentOf = value;
    }

    /**
     * Gets the value of the classCode property.
     * 
     * @return
     *     possible object is
     *     {@link ActClassSubstanceAdministration }
     *     
     */
    public ActClassSubstanceAdministration getClassCode() {
        if (classCode == null) {
            return ActClassSubstanceAdministration.SBADM;
        } else {
            return classCode;
        }
    }

    /**
     * Sets the value of the classCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActClassSubstanceAdministration }
     *     
     */
    public void setClassCode(ActClassSubstanceAdministration value) {
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
