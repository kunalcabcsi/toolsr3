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
 * <p>Java class for ActClassCompositeOrder.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ActClassCompositeOrder"&gt;
 *   &lt;restriction base="{urn:hl7-org:v3}cs"&gt;
 *     &lt;enumeration value="GROUPER"/&gt;
 *     &lt;enumeration value="CLUSTER"/&gt;
 *     &lt;enumeration value="OBS"/&gt;
 *     &lt;enumeration value="ROIBND"/&gt;
 *     &lt;enumeration value="ROIOVL"/&gt;
 *     &lt;enumeration value="LLD"/&gt;
 *     &lt;enumeration value="PRN"/&gt;
 *     &lt;enumeration value="RLD"/&gt;
 *     &lt;enumeration value="SFWL"/&gt;
 *     &lt;enumeration value="SIT"/&gt;
 *     &lt;enumeration value="STN"/&gt;
 *     &lt;enumeration value="SUP"/&gt;
 *     &lt;enumeration value="RTRD"/&gt;
 *     &lt;enumeration value="TRD"/&gt;
 *     &lt;enumeration value="ALRT"/&gt;
 *     &lt;enumeration value="BATTERY"/&gt;
 *     &lt;enumeration value="CLNTRL"/&gt;
 *     &lt;enumeration value="CNOD"/&gt;
 *     &lt;enumeration value="CONC"/&gt;
 *     &lt;enumeration value="COND"/&gt;
 *     &lt;enumeration value="CASE"/&gt;
 *     &lt;enumeration value="OUTB"/&gt;
 *     &lt;enumeration value="DGIMG"/&gt;
 *     &lt;enumeration value="GEN"/&gt;
 *     &lt;enumeration value="DETPOL"/&gt;
 *     &lt;enumeration value="EXP"/&gt;
 *     &lt;enumeration value="LOC"/&gt;
 *     &lt;enumeration value="PHN"/&gt;
 *     &lt;enumeration value="POL"/&gt;
 *     &lt;enumeration value="SEQ"/&gt;
 *     &lt;enumeration value="SEQVAR"/&gt;
 *     &lt;enumeration value="INVSTG"/&gt;
 *     &lt;enumeration value="OBSSER"/&gt;
 *     &lt;enumeration value="OBSCOR"/&gt;
 *     &lt;enumeration value="POS"/&gt;
 *     &lt;enumeration value="POSACC"/&gt;
 *     &lt;enumeration value="POSCOORD"/&gt;
 *     &lt;enumeration value="SPCOBS"/&gt;
 *     &lt;enumeration value="VERIF"/&gt;
 *     &lt;enumeration value="PROC"/&gt;
 *     &lt;enumeration value="SBADM"/&gt;
 *     &lt;enumeration value="SBEXT"/&gt;
 *     &lt;enumeration value="SPECCOLLECT"/&gt;
 *     &lt;enumeration value="SPLY"/&gt;
 *     &lt;enumeration value="DIET"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ActClassCompositeOrder")
@XmlEnum
public enum ActClassCompositeOrder {

    GROUPER,
    CLUSTER,
    OBS,
    ROIBND,
    ROIOVL,
    LLD,
    PRN,
    RLD,
    SFWL,
    SIT,
    STN,
    SUP,
    RTRD,
    TRD,
    ALRT,
    BATTERY,
    CLNTRL,
    CNOD,
    CONC,
    COND,
    CASE,
    OUTB,
    DGIMG,
    GEN,
    DETPOL,
    EXP,
    LOC,
    PHN,
    POL,
    SEQ,
    SEQVAR,
    INVSTG,
    OBSSER,
    OBSCOR,
    POS,
    POSACC,
    POSCOORD,
    SPCOBS,
    VERIF,
    PROC,
    SBADM,
    SBEXT,
    SPECCOLLECT,
    SPLY,
    DIET;

    public String value() {
        return name();
    }

    public static ActClassCompositeOrder fromValue(String v) {
        return valueOf(v);
    }

}
