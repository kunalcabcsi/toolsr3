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
 * <p>Java class for TimingEvent.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="TimingEvent"&gt;
 *   &lt;restriction base="{urn:hl7-org:v3}cs"&gt;
 *     &lt;enumeration value="AC"/&gt;
 *     &lt;enumeration value="ACD"/&gt;
 *     &lt;enumeration value="ACM"/&gt;
 *     &lt;enumeration value="ACV"/&gt;
 *     &lt;enumeration value="C"/&gt;
 *     &lt;enumeration value="HS"/&gt;
 *     &lt;enumeration value="IC"/&gt;
 *     &lt;enumeration value="ICD"/&gt;
 *     &lt;enumeration value="ICM"/&gt;
 *     &lt;enumeration value="ICV"/&gt;
 *     &lt;enumeration value="PC"/&gt;
 *     &lt;enumeration value="PCD"/&gt;
 *     &lt;enumeration value="PCM"/&gt;
 *     &lt;enumeration value="PCV"/&gt;
 *     &lt;enumeration value="WAKE"/&gt;
 *     &lt;enumeration value="CD"/&gt;
 *     &lt;enumeration value="CM"/&gt;
 *     &lt;enumeration value="CV"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "TimingEvent")
@XmlEnum
public enum TimingEvent {

    AC,
    ACD,
    ACM,
    ACV,
    C,
    HS,
    IC,
    ICD,
    ICM,
    ICV,
    PC,
    PCD,
    PCM,
    PCV,
    WAKE,
    CD,
    CM,
    CV;

    public String value() {
        return name();
    }

    public static TimingEvent fromValue(String v) {
        return valueOf(v);
    }

}