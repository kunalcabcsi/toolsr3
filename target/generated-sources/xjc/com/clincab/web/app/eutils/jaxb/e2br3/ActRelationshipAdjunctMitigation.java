//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.12.20 at 02:30:39 PM IST 
//


package com.clincab.web.app.eutils.jaxb.e2br3;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ActRelationshipAdjunctMitigation.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ActRelationshipAdjunctMitigation"&gt;
 *   &lt;restriction base="{urn:hl7-org:v3}cs"&gt;
 *     &lt;enumeration value="MTGT.ADJ"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ActRelationshipAdjunctMitigation")
@XmlEnum
public enum ActRelationshipAdjunctMitigation {

    @XmlEnumValue("MTGT.ADJ")
    MTGT_ADJ("MTGT.ADJ");
    private final String value;

    ActRelationshipAdjunctMitigation(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ActRelationshipAdjunctMitigation fromValue(String v) {
        for (ActRelationshipAdjunctMitigation c: ActRelationshipAdjunctMitigation.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
