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
 * <p>Java class for ClassNullFlavor.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ClassNullFlavor"&gt;
 *   &lt;restriction base="{urn:hl7-org:v3}cs"&gt;
 *     &lt;enumeration value="ASKU"/&gt;
 *     &lt;enumeration value="MSK"/&gt;
 *     &lt;enumeration value="NA"/&gt;
 *     &lt;enumeration value="NASK"/&gt;
 *     &lt;enumeration value="NAV"/&gt;
 *     &lt;enumeration value="NI"/&gt;
 *     &lt;enumeration value="UNK"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ClassNullFlavor")
@XmlEnum
public enum ClassNullFlavor {

    ASKU,
    MSK,
    NA,
    NASK,
    NAV,
    NI,
    UNK;

    public String value() {
        return name();
    }

    public static ClassNullFlavor fromValue(String v) {
        return valueOf(v);
    }

}
