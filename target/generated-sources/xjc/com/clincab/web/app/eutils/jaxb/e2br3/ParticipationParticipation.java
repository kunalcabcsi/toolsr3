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
 * <p>Java class for ParticipationParticipation.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ParticipationParticipation"&gt;
 *   &lt;restriction base="{urn:hl7-org:v3}cs"&gt;
 *     &lt;enumeration value="PART"/&gt;
 *     &lt;enumeration value="ADM"/&gt;
 *     &lt;enumeration value="ATND"/&gt;
 *     &lt;enumeration value="CALLBCK"/&gt;
 *     &lt;enumeration value="CON"/&gt;
 *     &lt;enumeration value="DIS"/&gt;
 *     &lt;enumeration value="ESC"/&gt;
 *     &lt;enumeration value="REF"/&gt;
 *     &lt;enumeration value="AUT"/&gt;
 *     &lt;enumeration value="INF"/&gt;
 *     &lt;enumeration value="TRANS"/&gt;
 *     &lt;enumeration value="ENT"/&gt;
 *     &lt;enumeration value="WIT"/&gt;
 *     &lt;enumeration value="CST"/&gt;
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
 *     &lt;enumeration value="IND"/&gt;
 *     &lt;enumeration value="BEN"/&gt;
 *     &lt;enumeration value="CAGNT"/&gt;
 *     &lt;enumeration value="COV"/&gt;
 *     &lt;enumeration value="GUAR"/&gt;
 *     &lt;enumeration value="HLD"/&gt;
 *     &lt;enumeration value="RCT"/&gt;
 *     &lt;enumeration value="RCV"/&gt;
 *     &lt;enumeration value="IRCP"/&gt;
 *     &lt;enumeration value="NOT"/&gt;
 *     &lt;enumeration value="PRCP"/&gt;
 *     &lt;enumeration value="REFB"/&gt;
 *     &lt;enumeration value="REFT"/&gt;
 *     &lt;enumeration value="TRC"/&gt;
 *     &lt;enumeration value="LOC"/&gt;
 *     &lt;enumeration value="DST"/&gt;
 *     &lt;enumeration value="ELOC"/&gt;
 *     &lt;enumeration value="ORG"/&gt;
 *     &lt;enumeration value="RML"/&gt;
 *     &lt;enumeration value="VIA"/&gt;
 *     &lt;enumeration value="PRF"/&gt;
 *     &lt;enumeration value="DIST"/&gt;
 *     &lt;enumeration value="PPRF"/&gt;
 *     &lt;enumeration value="SPRF"/&gt;
 *     &lt;enumeration value="RESP"/&gt;
 *     &lt;enumeration value="VRF"/&gt;
 *     &lt;enumeration value="AUTHEN"/&gt;
 *     &lt;enumeration value="LA"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ParticipationParticipation")
@XmlEnum
public enum ParticipationParticipation {

    PART,
    ADM,
    ATND,
    CALLBCK,
    CON,
    DIS,
    ESC,
    REF,
    AUT,
    INF,
    TRANS,
    ENT,
    WIT,
    CST,
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
    SPC,
    IND,
    BEN,
    CAGNT,
    COV,
    GUAR,
    HLD,
    RCT,
    RCV,
    IRCP,
    NOT,
    PRCP,
    REFB,
    REFT,
    TRC,
    LOC,
    DST,
    ELOC,
    ORG,
    RML,
    VIA,
    PRF,
    DIST,
    PPRF,
    SPRF,
    RESP,
    VRF,
    AUTHEN,
    LA;

    public String value() {
        return name();
    }

    public static ParticipationParticipation fromValue(String v) {
        return valueOf(v);
    }

}
