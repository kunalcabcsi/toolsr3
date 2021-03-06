//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.12.20 at 02:30:39 PM IST 
//


package com.clincab.web.app.eutils.jaxb.e2br3;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AddressUse.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="AddressUse"&gt;
 *   &lt;restriction base="{urn:hl7-org:v3}cs"&gt;
 *     &lt;enumeration value="BAD"/&gt;
 *     &lt;enumeration value="CONF"/&gt;
 *     &lt;enumeration value="H"/&gt;
 *     &lt;enumeration value="TMP"/&gt;
 *     &lt;enumeration value="WP"/&gt;
 *     &lt;enumeration value="PHYS"/&gt;
 *     &lt;enumeration value="PST"/&gt;
 *     &lt;enumeration value="AS"/&gt;
 *     &lt;enumeration value="EC"/&gt;
 *     &lt;enumeration value="MC"/&gt;
 *     &lt;enumeration value="PG"/&gt;
 *     &lt;enumeration value="HP"/&gt;
 *     &lt;enumeration value="HV"/&gt;
 *     &lt;enumeration value="DIR"/&gt;
 *     &lt;enumeration value="PUB"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "AddressUse")
@XmlEnum
public enum AddressUse {

    BAD,
    CONF,
    H,
    TMP,
    WP,
    PHYS,
    PST,
    AS,
    EC,
    MC,
    PG,
    HP,
    HV,
    DIR,
    PUB;

    public String value() {
        return name();
    }

    public static AddressUse fromValue(String v) {
        return valueOf(v);
    }

}
