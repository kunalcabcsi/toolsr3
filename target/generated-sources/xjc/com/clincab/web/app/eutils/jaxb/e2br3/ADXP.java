//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.11.22 at 10:46:31 PM IST 
//


package com.clincab.web.app.eutils.jaxb.e2br3;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *             A character string that may have a type-tag signifying its
 *             role in the address. Typical parts that exist in about
 *             every address are street, house number, or post box,
 *             postal code, city, country but other roles may be defined
 *             regionally, nationally, or on an enterprise level (e.g. in
 *             military addresses). Addresses are usually broken up into
 *             lines, which are indicated by special line-breaking
 *             delimiter elements (e.g., DEL).
 *          
 * 
 * <p>Java class for ADXP complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ADXP"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{urn:hl7-org:v3}ST"&gt;
 *       &lt;attribute name="partType" type="{urn:hl7-org:v3}AddressPartType" /&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ADXP")
@XmlSeeAlso({
    AdxpDelimiter.class,
    AdxpCountry.class,
    AdxpState.class,
    AdxpCounty.class,
    AdxpCity.class,
    AdxpPostalCode.class,
    AdxpStreetAddressLine.class,
    AdxpHouseNumber.class,
    AdxpHouseNumberNumeric.class,
    AdxpDirection.class,
    AdxpStreetName.class,
    AdxpStreetNameBase.class,
    AdxpStreetNameType.class,
    AdxpAdditionalLocator.class,
    AdxpUnitID.class,
    AdxpUnitType.class,
    AdxpCareOf.class,
    AdxpCensusTract.class,
    AdxpDeliveryAddressLine.class,
    AdxpDeliveryInstallationType.class,
    AdxpDeliveryInstallationArea.class,
    AdxpDeliveryInstallationQualifier.class,
    AdxpDeliveryMode.class,
    AdxpDeliveryModeIdentifier.class,
    AdxpBuildingNumberSuffix.class,
    AdxpPostBox.class,
    AdxpPrecinct.class
})
public class ADXP
    extends ST
{

    @XmlAttribute(name = "partType")
    protected AddressPartType partType;

    /**
     * Gets the value of the partType property.
     * 
     * @return
     *     possible object is
     *     {@link AddressPartType }
     *     
     */
    public AddressPartType getPartType() {
        return partType;
    }

    /**
     * Sets the value of the partType property.
     * 
     * @param value
     *     allowed object is
     *     {@link AddressPartType }
     *     
     */
    public void setPartType(AddressPartType value) {
        this.partType = value;
    }

}
