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
 * <p>Java class for EntityClassOrganization.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="EntityClassOrganization"&gt;
 *   &lt;restriction base="{urn:hl7-org:v3}cs"&gt;
 *     &lt;enumeration value="ORG"/&gt;
 *     &lt;enumeration value="PUB"/&gt;
 *     &lt;enumeration value="STATE"/&gt;
 *     &lt;enumeration value="NAT"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "EntityClassOrganization")
@XmlEnum
public enum EntityClassOrganization {

    ORG,
    PUB,
    STATE,
    NAT;

    public String value() {
        return name();
    }

    public static EntityClassOrganization fromValue(String v) {
        return valueOf(v);
    }

}