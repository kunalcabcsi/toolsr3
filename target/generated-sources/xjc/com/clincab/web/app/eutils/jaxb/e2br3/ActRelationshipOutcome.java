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
 * <p>Java class for ActRelationshipOutcome.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ActRelationshipOutcome"&gt;
 *   &lt;restriction base="{urn:hl7-org:v3}cs"&gt;
 *     &lt;enumeration value="OUTC"/&gt;
 *     &lt;enumeration value="OBJC"/&gt;
 *     &lt;enumeration value="OBJF"/&gt;
 *     &lt;enumeration value="GOAL"/&gt;
 *     &lt;enumeration value="RISK"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ActRelationshipOutcome")
@XmlEnum
public enum ActRelationshipOutcome {

    OUTC,
    OBJC,
    OBJF,
    GOAL,
    RISK;

    public String value() {
        return name();
    }

    public static ActRelationshipOutcome fromValue(String v) {
        return valueOf(v);
    }

}
