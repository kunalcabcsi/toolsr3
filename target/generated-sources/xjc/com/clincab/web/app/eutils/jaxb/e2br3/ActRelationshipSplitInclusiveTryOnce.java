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
 * <p>Java class for ActRelationshipSplitInclusiveTryOnce.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ActRelationshipSplitInclusiveTryOnce"&gt;
 *   &lt;restriction base="{urn:hl7-org:v3}cs"&gt;
 *     &lt;enumeration value="I1"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ActRelationshipSplitInclusiveTryOnce")
@XmlEnum
public enum ActRelationshipSplitInclusiveTryOnce {

    @XmlEnumValue("I1")
    I_1("I1");
    private final String value;

    ActRelationshipSplitInclusiveTryOnce(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ActRelationshipSplitInclusiveTryOnce fromValue(String v) {
        for (ActRelationshipSplitInclusiveTryOnce c: ActRelationshipSplitInclusiveTryOnce.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
