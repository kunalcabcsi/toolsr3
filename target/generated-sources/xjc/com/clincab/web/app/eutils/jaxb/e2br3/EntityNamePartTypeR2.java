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
 * <p>Java class for EntityNamePartTypeR2.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="EntityNamePartTypeR2"&gt;
 *   &lt;restriction base="{urn:hl7-org:v3}cs"&gt;
 *     &lt;enumeration value="DEL"/&gt;
 *     &lt;enumeration value="FAM"/&gt;
 *     &lt;enumeration value="GIV"/&gt;
 *     &lt;enumeration value="TITLE"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "EntityNamePartTypeR2")
@XmlEnum
public enum EntityNamePartTypeR2 {

    DEL,
    FAM,
    GIV,
    TITLE;

    public String value() {
        return name();
    }

    public static EntityNamePartTypeR2 fromValue(String v) {
        return valueOf(v);
    }

}
