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
 * <p>Java class for RoleStatusCancelled.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="RoleStatusCancelled"&gt;
 *   &lt;restriction base="{urn:hl7-org:v3}cs"&gt;
 *     &lt;enumeration value="cancelled"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "RoleStatusCancelled")
@XmlEnum
public enum RoleStatusCancelled {

    @XmlEnumValue("cancelled")
    CANCELLED("cancelled");
    private final String value;

    RoleStatusCancelled(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static RoleStatusCancelled fromValue(String v) {
        for (RoleStatusCancelled c: RoleStatusCancelled.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
