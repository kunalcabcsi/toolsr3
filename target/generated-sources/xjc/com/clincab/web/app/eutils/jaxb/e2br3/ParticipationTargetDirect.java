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
 * <p>Java class for ParticipationTargetDirect.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ParticipationTargetDirect"&gt;
 *   &lt;restriction base="{urn:hl7-org:v3}cs"&gt;
 *     &lt;enumeration value="DIR"/&gt;
 *     &lt;enumeration value="ALY"/&gt;
 *     &lt;enumeration value="BBY"/&gt;
 *     &lt;enumeration value="CAT"/&gt;
 *     &lt;enumeration value="CSM"/&gt;
 *     &lt;enumeration value="DEV"/&gt;
 *     &lt;enumeration value="NRD"/&gt;
 *     &lt;enumeration value="RDV"/&gt;
 *     &lt;enumeration value="DON"/&gt;
 *     &lt;enumeration value="EXPAGNT"/&gt;
 *     &lt;enumeration value="EXPART"/&gt;
 *     &lt;enumeration value="EXPTRGT"/&gt;
 *     &lt;enumeration value="EXSRC"/&gt;
 *     &lt;enumeration value="PRD"/&gt;
 *     &lt;enumeration value="SBJ"/&gt;
 *     &lt;enumeration value="SPC"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ParticipationTargetDirect")
@XmlEnum
public enum ParticipationTargetDirect {

    DIR,
    ALY,
    BBY,
    CAT,
    CSM,
    DEV,
    NRD,
    RDV,
    DON,
    EXPAGNT,
    EXPART,
    EXPTRGT,
    EXSRC,
    PRD,
    SBJ,
    SPC;

    public String value() {
        return name();
    }

    public static ParticipationTargetDirect fromValue(String v) {
        return valueOf(v);
    }

}
