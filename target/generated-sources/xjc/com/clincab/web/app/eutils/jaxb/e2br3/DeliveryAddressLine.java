//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.11.22 at 10:46:31 PM IST 
//


package com.clincab.web.app.eutils.jaxb.e2br3;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DeliveryAddressLine.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="DeliveryAddressLine"&gt;
 *   &lt;restriction base="{urn:hl7-org:v3}cs"&gt;
 *     &lt;enumeration value="DAL"/&gt;
 *     &lt;enumeration value="DINST"/&gt;
 *     &lt;enumeration value="DINSTA"/&gt;
 *     &lt;enumeration value="DINSTQ"/&gt;
 *     &lt;enumeration value="DMOD"/&gt;
 *     &lt;enumeration value="DMODID"/&gt;
 *     &lt;enumeration value="POB"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "DeliveryAddressLine")
@XmlEnum
public enum DeliveryAddressLine {

    DAL,
    DINST,
    DINSTA,
    DINSTQ,
    DMOD,
    DMODID,
    POB;

    public String value() {
        return name();
    }

    public static DeliveryAddressLine fromValue(String v) {
        return valueOf(v);
    }

}