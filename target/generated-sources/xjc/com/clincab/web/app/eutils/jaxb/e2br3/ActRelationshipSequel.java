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
 * <p>Java class for ActRelationshipSequel.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ActRelationshipSequel"&gt;
 *   &lt;restriction base="{urn:hl7-org:v3}cs"&gt;
 *     &lt;enumeration value="SEQL"/&gt;
 *     &lt;enumeration value="APND"/&gt;
 *     &lt;enumeration value="BSLN"/&gt;
 *     &lt;enumeration value="COMPLY"/&gt;
 *     &lt;enumeration value="DOC"/&gt;
 *     &lt;enumeration value="FLFS"/&gt;
 *     &lt;enumeration value="OCCR"/&gt;
 *     &lt;enumeration value="OREF"/&gt;
 *     &lt;enumeration value="SCH"/&gt;
 *     &lt;enumeration value="GEN"/&gt;
 *     &lt;enumeration value="GEVL"/&gt;
 *     &lt;enumeration value="INST"/&gt;
 *     &lt;enumeration value="MOD"/&gt;
 *     &lt;enumeration value="MTCH"/&gt;
 *     &lt;enumeration value="OPTN"/&gt;
 *     &lt;enumeration value="RCHAL"/&gt;
 *     &lt;enumeration value="REV"/&gt;
 *     &lt;enumeration value="RPLC"/&gt;
 *     &lt;enumeration value="SUCC"/&gt;
 *     &lt;enumeration value="UPDT"/&gt;
 *     &lt;enumeration value="XCRPT"/&gt;
 *     &lt;enumeration value="VRXCRPT"/&gt;
 *     &lt;enumeration value="XFRM"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ActRelationshipSequel")
@XmlEnum
public enum ActRelationshipSequel {

    SEQL,
    APND,
    BSLN,
    COMPLY,
    DOC,
    FLFS,
    OCCR,
    OREF,
    SCH,
    GEN,
    GEVL,
    INST,
    MOD,
    MTCH,
    OPTN,
    RCHAL,
    REV,
    RPLC,
    SUCC,
    UPDT,
    XCRPT,
    VRXCRPT,
    XFRM;

    public String value() {
        return name();
    }

    public static ActRelationshipSequel fromValue(String v) {
        return valueOf(v);
    }

}