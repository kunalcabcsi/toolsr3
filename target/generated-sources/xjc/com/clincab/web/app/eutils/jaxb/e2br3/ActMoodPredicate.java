//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.11.22 at 10:46:31 PM IST 
//


package com.clincab.web.app.eutils.jaxb.e2br3;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ActMoodPredicate.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ActMoodPredicate"&gt;
 *   &lt;restriction base="{urn:hl7-org:v3}cs"&gt;
 *     &lt;enumeration value="CRT"/&gt;
 *     &lt;enumeration value="EVN.CRT"/&gt;
 *     &lt;enumeration value="GOL.CRT"/&gt;
 *     &lt;enumeration value="INT.CRT"/&gt;
 *     &lt;enumeration value="PRMS.CRT"/&gt;
 *     &lt;enumeration value="RQO.CRT"/&gt;
 *     &lt;enumeration value="RSK.CRT"/&gt;
 *     &lt;enumeration value="EXPEC"/&gt;
 *     &lt;enumeration value="GOL"/&gt;
 *     &lt;enumeration value="RSK"/&gt;
 *     &lt;enumeration value="OPT"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ActMoodPredicate")
@XmlEnum
public enum ActMoodPredicate {

    CRT("CRT"),
    @XmlEnumValue("EVN.CRT")
    EVN_CRT("EVN.CRT"),
    @XmlEnumValue("GOL.CRT")
    GOL_CRT("GOL.CRT"),
    @XmlEnumValue("INT.CRT")
    INT_CRT("INT.CRT"),
    @XmlEnumValue("PRMS.CRT")
    PRMS_CRT("PRMS.CRT"),
    @XmlEnumValue("RQO.CRT")
    RQO_CRT("RQO.CRT"),
    @XmlEnumValue("RSK.CRT")
    RSK_CRT("RSK.CRT"),
    EXPEC("EXPEC"),
    GOL("GOL"),
    RSK("RSK"),
    OPT("OPT");
    private final String value;

    ActMoodPredicate(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ActMoodPredicate fromValue(String v) {
        for (ActMoodPredicate c: ActMoodPredicate.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
