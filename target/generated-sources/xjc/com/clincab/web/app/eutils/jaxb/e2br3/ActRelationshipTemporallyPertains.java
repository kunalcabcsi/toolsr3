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
 * <p>Java class for ActRelationshipTemporallyPertains.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ActRelationshipTemporallyPertains"&gt;
 *   &lt;restriction base="{urn:hl7-org:v3}cs"&gt;
 *     &lt;enumeration value="EAE"/&gt;
 *     &lt;enumeration value="EAS"/&gt;
 *     &lt;enumeration value="EDU"/&gt;
 *     &lt;enumeration value="EBS"/&gt;
 *     &lt;enumeration value="ECW"/&gt;
 *     &lt;enumeration value="EAE"/&gt;
 *     &lt;enumeration value="EAS"/&gt;
 *     &lt;enumeration value="EDU"/&gt;
 *     &lt;enumeration value="EBS"/&gt;
 *     &lt;enumeration value="ECW"/&gt;
 *     &lt;enumeration value="SAE"/&gt;
 *     &lt;enumeration value="SAS"/&gt;
 *     &lt;enumeration value="SDU"/&gt;
 *     &lt;enumeration value="SBS"/&gt;
 *     &lt;enumeration value="SCW"/&gt;
 *     &lt;enumeration value="SAE"/&gt;
 *     &lt;enumeration value="SAS"/&gt;
 *     &lt;enumeration value="SDU"/&gt;
 *     &lt;enumeration value="SBS"/&gt;
 *     &lt;enumeration value="SCW"/&gt;
 *     &lt;enumeration value="CONCURRENT"/&gt;
 *     &lt;enumeration value="CONCURRENT"/&gt;
 *     &lt;enumeration value="DURING"/&gt;
 *     &lt;enumeration value="DURING"/&gt;
 *     &lt;enumeration value="OVERLAP"/&gt;
 *     &lt;enumeration value="OVERLAP"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ActRelationshipTemporallyPertains")
@XmlEnum
public enum ActRelationshipTemporallyPertains {

    EAE,
    EAS,
    EDU,
    EBS,
    ECW,
    SAE,
    SAS,
    SDU,
    SBS,
    SCW,
    CONCURRENT,
    DURING,
    OVERLAP;

    public String value() {
        return name();
    }

    public static ActRelationshipTemporallyPertains fromValue(String v) {
        return valueOf(v);
    }

}