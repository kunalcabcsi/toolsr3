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
 * <p>Java class for CalendarCycleOneLetter.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="CalendarCycleOneLetter"&gt;
 *   &lt;restriction base="{urn:hl7-org:v3}cs"&gt;
 *     &lt;enumeration value="CW"/&gt;
 *     &lt;enumeration value="W"/&gt;
 *     &lt;enumeration value="CY"/&gt;
 *     &lt;enumeration value="Y"/&gt;
 *     &lt;enumeration value="D"/&gt;
 *     &lt;enumeration value="DM"/&gt;
 *     &lt;enumeration value="DW"/&gt;
 *     &lt;enumeration value="J"/&gt;
 *     &lt;enumeration value="H"/&gt;
 *     &lt;enumeration value="HD"/&gt;
 *     &lt;enumeration value="M"/&gt;
 *     &lt;enumeration value="MY"/&gt;
 *     &lt;enumeration value="N"/&gt;
 *     &lt;enumeration value="NH"/&gt;
 *     &lt;enumeration value="S"/&gt;
 *     &lt;enumeration value="SN"/&gt;
 *     &lt;enumeration value="D"/&gt;
 *     &lt;enumeration value="H"/&gt;
 *     &lt;enumeration value="J"/&gt;
 *     &lt;enumeration value="M"/&gt;
 *     &lt;enumeration value="N"/&gt;
 *     &lt;enumeration value="S"/&gt;
 *     &lt;enumeration value="W"/&gt;
 *     &lt;enumeration value="Y"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "CalendarCycleOneLetter")
@XmlEnum
public enum CalendarCycleOneLetter {

    CW,
    W,
    CY,
    Y,
    D,
    DM,
    DW,
    J,
    H,
    HD,
    M,
    MY,
    N,
    NH,
    S,
    SN;

    public String value() {
        return name();
    }

    public static CalendarCycleOneLetter fromValue(String v) {
        return valueOf(v);
    }

}
