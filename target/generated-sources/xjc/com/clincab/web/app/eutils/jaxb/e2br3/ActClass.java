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
 * <p>Java class for ActClass.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ActClass"&gt;
 *   &lt;restriction base="{urn:hl7-org:v3}cs"&gt;
 *     &lt;enumeration value="ACT"/&gt;
 *     &lt;enumeration value="COMPOSITION"/&gt;
 *     &lt;enumeration value="CONTAINER"/&gt;
 *     &lt;enumeration value="EXTRACT"/&gt;
 *     &lt;enumeration value="FOLDER"/&gt;
 *     &lt;enumeration value="GROUPER"/&gt;
 *     &lt;enumeration value="ROIBND"/&gt;
 *     &lt;enumeration value="ROIOVL"/&gt;
 *     &lt;enumeration value="LLD"/&gt;
 *     &lt;enumeration value="PRN"/&gt;
 *     &lt;enumeration value="RLD"/&gt;
 *     &lt;enumeration value="SFWL"/&gt;
 *     &lt;enumeration value="SIT"/&gt;
 *     &lt;enumeration value="STN"/&gt;
 *     &lt;enumeration value="SUP"/&gt;
 *     &lt;enumeration value="ACCM"/&gt;
 *     &lt;enumeration value="ACCT"/&gt;
 *     &lt;enumeration value="ACSN"/&gt;
 *     &lt;enumeration value="ADJUD"/&gt;
 *     &lt;enumeration value="CACT"/&gt;
 *     &lt;enumeration value="CNTRCT"/&gt;
 *     &lt;enumeration value="CONS"/&gt;
 *     &lt;enumeration value="CONTREG"/&gt;
 *     &lt;enumeration value="CTTEVENT"/&gt;
 *     &lt;enumeration value="DISPACT"/&gt;
 *     &lt;enumeration value="EXPOS"/&gt;
 *     &lt;enumeration value="INC"/&gt;
 *     &lt;enumeration value="INFRM"/&gt;
 *     &lt;enumeration value="INVE"/&gt;
 *     &lt;enumeration value="LIST"/&gt;
 *     &lt;enumeration value="MPROT"/&gt;
 *     &lt;enumeration value="OBS"/&gt;
 *     &lt;enumeration value="PCPR"/&gt;
 *     &lt;enumeration value="POLICY"/&gt;
 *     &lt;enumeration value="PROC"/&gt;
 *     &lt;enumeration value="REG"/&gt;
 *     &lt;enumeration value="REV"/&gt;
 *     &lt;enumeration value="SPCTRT"/&gt;
 *     &lt;enumeration value="SPLY"/&gt;
 *     &lt;enumeration value="STORE"/&gt;
 *     &lt;enumeration value="SUBST"/&gt;
 *     &lt;enumeration value="TRFR"/&gt;
 *     &lt;enumeration value="TRNS"/&gt;
 *     &lt;enumeration value="XACT"/&gt;
 *     &lt;enumeration value="ACTN"/&gt;
 *     &lt;enumeration value="INFO"/&gt;
 *     &lt;enumeration value="STC"/&gt;
 *     &lt;enumeration value="OUTB"/&gt;
 *     &lt;enumeration value="FCNTRCT"/&gt;
 *     &lt;enumeration value="DOC"/&gt;
 *     &lt;enumeration value="CASE"/&gt;
 *     &lt;enumeration value="CATEGORY"/&gt;
 *     &lt;enumeration value="DOCBODY"/&gt;
 *     &lt;enumeration value="DOCSECT"/&gt;
 *     &lt;enumeration value="TOPIC"/&gt;
 *     &lt;enumeration value="DOCCLIN"/&gt;
 *     &lt;enumeration value="CDALVLONE"/&gt;
 *     &lt;enumeration value="AEXPOS"/&gt;
 *     &lt;enumeration value="TEXPOS"/&gt;
 *     &lt;enumeration value="EHR"/&gt;
 *     &lt;enumeration value="COV"/&gt;
 *     &lt;enumeration value="DETPOL"/&gt;
 *     &lt;enumeration value="EXP"/&gt;
 *     &lt;enumeration value="LOC"/&gt;
 *     &lt;enumeration value="PHN"/&gt;
 *     &lt;enumeration value="POL"/&gt;
 *     &lt;enumeration value="SEQ"/&gt;
 *     &lt;enumeration value="SEQVAR"/&gt;
 *     &lt;enumeration value="CLUSTER"/&gt;
 *     &lt;enumeration value="ALRT"/&gt;
 *     &lt;enumeration value="BATTERY"/&gt;
 *     &lt;enumeration value="CLNTRL"/&gt;
 *     &lt;enumeration value="CNOD"/&gt;
 *     &lt;enumeration value="CONC"/&gt;
 *     &lt;enumeration value="COND"/&gt;
 *     &lt;enumeration value="DGIMG"/&gt;
 *     &lt;enumeration value="GEN"/&gt;
 *     &lt;enumeration value="INVSTG"/&gt;
 *     &lt;enumeration value="OBSSER"/&gt;
 *     &lt;enumeration value="POS"/&gt;
 *     &lt;enumeration value="SPCOBS"/&gt;
 *     &lt;enumeration value="VERIF"/&gt;
 *     &lt;enumeration value="OBSCOR"/&gt;
 *     &lt;enumeration value="ENC"/&gt;
 *     &lt;enumeration value="JURISPOL"/&gt;
 *     &lt;enumeration value="ORGPOL"/&gt;
 *     &lt;enumeration value="SCOPOL"/&gt;
 *     &lt;enumeration value="STDPOL"/&gt;
 *     &lt;enumeration value="POSACC"/&gt;
 *     &lt;enumeration value="POSCOORD"/&gt;
 *     &lt;enumeration value="SBADM"/&gt;
 *     &lt;enumeration value="SBEXT"/&gt;
 *     &lt;enumeration value="SPECCOLLECT"/&gt;
 *     &lt;enumeration value="DIET"/&gt;
 *     &lt;enumeration value="RTRD"/&gt;
 *     &lt;enumeration value="TRD"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ActClass")
@XmlEnum
public enum ActClass {

    ACT,
    COMPOSITION,
    CONTAINER,
    EXTRACT,
    FOLDER,
    GROUPER,
    ROIBND,
    ROIOVL,
    LLD,
    PRN,
    RLD,
    SFWL,
    SIT,
    STN,
    SUP,
    ACCM,
    ACCT,
    ACSN,
    ADJUD,
    CACT,
    CNTRCT,
    CONS,
    CONTREG,
    CTTEVENT,
    DISPACT,
    EXPOS,
    INC,
    INFRM,
    INVE,
    LIST,
    MPROT,
    OBS,
    PCPR,
    POLICY,
    PROC,
    REG,
    REV,
    SPCTRT,
    SPLY,
    STORE,
    SUBST,
    TRFR,
    TRNS,
    XACT,
    ACTN,
    INFO,
    STC,
    OUTB,
    FCNTRCT,
    DOC,
    CASE,
    CATEGORY,
    DOCBODY,
    DOCSECT,
    TOPIC,
    DOCCLIN,
    CDALVLONE,
    AEXPOS,
    TEXPOS,
    EHR,
    COV,
    DETPOL,
    EXP,
    LOC,
    PHN,
    POL,
    SEQ,
    SEQVAR,
    CLUSTER,
    ALRT,
    BATTERY,
    CLNTRL,
    CNOD,
    CONC,
    COND,
    DGIMG,
    GEN,
    INVSTG,
    OBSSER,
    POS,
    SPCOBS,
    VERIF,
    OBSCOR,
    ENC,
    JURISPOL,
    ORGPOL,
    SCOPOL,
    STDPOL,
    POSACC,
    POSCOORD,
    SBADM,
    SBEXT,
    SPECCOLLECT,
    DIET,
    RTRD,
    TRD;

    public String value() {
        return name();
    }

    public static ActClass fromValue(String v) {
        return valueOf(v);
    }

}
