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
 * <p>Java class for StreetAddressLine.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="StreetAddressLine"&gt;
 *   &lt;restriction base="{urn:hl7-org:v3}cs"&gt;
 *     &lt;enumeration value="SAL"/&gt;
 *     &lt;enumeration value="BNR"/&gt;
 *     &lt;enumeration value="BNN"/&gt;
 *     &lt;enumeration value="BNS"/&gt;
 *     &lt;enumeration value="DIR"/&gt;
 *     &lt;enumeration value="STR"/&gt;
 *     &lt;enumeration value="STB"/&gt;
 *     &lt;enumeration value="STTYP"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "StreetAddressLine")
@XmlEnum
public enum StreetAddressLine {

    SAL,
    BNR,
    BNN,
    BNS,
    DIR,
    STR,
    STB,
    STTYP;

    public String value() {
        return name();
    }

    public static StreetAddressLine fromValue(String v) {
        return valueOf(v);
    }

}
