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
 * <p>Java class for RoleClass.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="RoleClass"&gt;
 *   &lt;restriction base="{urn:hl7-org:v3}cs"&gt;
 *     &lt;enumeration value="CHILD"/&gt;
 *     &lt;enumeration value="CRED"/&gt;
 *     &lt;enumeration value="NURPRAC"/&gt;
 *     &lt;enumeration value="NURS"/&gt;
 *     &lt;enumeration value="PA"/&gt;
 *     &lt;enumeration value="PHYS"/&gt;
 *     &lt;enumeration value="ROL"/&gt;
 *     &lt;enumeration value="CAREGIVER"/&gt;
 *     &lt;enumeration value="PRS"/&gt;
 *     &lt;enumeration value="EQUIV"/&gt;
 *     &lt;enumeration value="GEN"/&gt;
 *     &lt;enumeration value="INST"/&gt;
 *     &lt;enumeration value="SUBS"/&gt;
 *     &lt;enumeration value="CONT"/&gt;
 *     &lt;enumeration value="EXPAGTCAR"/&gt;
 *     &lt;enumeration value="INGR"/&gt;
 *     &lt;enumeration value="LOCE"/&gt;
 *     &lt;enumeration value="MBR"/&gt;
 *     &lt;enumeration value="PART"/&gt;
 *     &lt;enumeration value="SPEC"/&gt;
 *     &lt;enumeration value="ACCESS"/&gt;
 *     &lt;enumeration value="ADJY"/&gt;
 *     &lt;enumeration value="ADMM"/&gt;
 *     &lt;enumeration value="BIRTHPL"/&gt;
 *     &lt;enumeration value="DEATHPLC"/&gt;
 *     &lt;enumeration value="DST"/&gt;
 *     &lt;enumeration value="EXPR"/&gt;
 *     &lt;enumeration value="HLD"/&gt;
 *     &lt;enumeration value="HLTHCHRT"/&gt;
 *     &lt;enumeration value="IDENT"/&gt;
 *     &lt;enumeration value="MANU"/&gt;
 *     &lt;enumeration value="MNT"/&gt;
 *     &lt;enumeration value="OWN"/&gt;
 *     &lt;enumeration value="RGPR"/&gt;
 *     &lt;enumeration value="SDLOC"/&gt;
 *     &lt;enumeration value="TERR"/&gt;
 *     &lt;enumeration value="USED"/&gt;
 *     &lt;enumeration value="WRTE"/&gt;
 *     &lt;enumeration value="AFFL"/&gt;
 *     &lt;enumeration value="AGNT"/&gt;
 *     &lt;enumeration value="CIT"/&gt;
 *     &lt;enumeration value="COVPTY"/&gt;
 *     &lt;enumeration value="CRINV"/&gt;
 *     &lt;enumeration value="CRSPNSR"/&gt;
 *     &lt;enumeration value="EMP"/&gt;
 *     &lt;enumeration value="GUAR"/&gt;
 *     &lt;enumeration value="INVSBJ"/&gt;
 *     &lt;enumeration value="LIC"/&gt;
 *     &lt;enumeration value="PAT"/&gt;
 *     &lt;enumeration value="PAYEE"/&gt;
 *     &lt;enumeration value="PAYOR"/&gt;
 *     &lt;enumeration value="POLHOLD"/&gt;
 *     &lt;enumeration value="QUAL"/&gt;
 *     &lt;enumeration value="SPNSR"/&gt;
 *     &lt;enumeration value="STD"/&gt;
 *     &lt;enumeration value="UNDWRT"/&gt;
 *     &lt;enumeration value="ACTIB"/&gt;
 *     &lt;enumeration value="ACTIM"/&gt;
 *     &lt;enumeration value="ACTIR"/&gt;
 *     &lt;enumeration value="CONC"/&gt;
 *     &lt;enumeration value="ASSIGNED"/&gt;
 *     &lt;enumeration value="CON"/&gt;
 *     &lt;enumeration value="GUARD"/&gt;
 *     &lt;enumeration value="COMPAR"/&gt;
 *     &lt;enumeration value="SGNOFF"/&gt;
 *     &lt;enumeration value="ECON"/&gt;
 *     &lt;enumeration value="NOK"/&gt;
 *     &lt;enumeration value="BOND"/&gt;
 *     &lt;enumeration value="CONY"/&gt;
 *     &lt;enumeration value="CLAIM"/&gt;
 *     &lt;enumeration value="NAMED"/&gt;
 *     &lt;enumeration value="PROG"/&gt;
 *     &lt;enumeration value="RET"/&gt;
 *     &lt;enumeration value="MIL"/&gt;
 *     &lt;enumeration value="SAME"/&gt;
 *     &lt;enumeration value="SUBY"/&gt;
 *     &lt;enumeration value="EXPVECTOR"/&gt;
 *     &lt;enumeration value="FOMITE"/&gt;
 *     &lt;enumeration value="GRIC"/&gt;
 *     &lt;enumeration value="COLR"/&gt;
 *     &lt;enumeration value="FLVR"/&gt;
 *     &lt;enumeration value="PRSV"/&gt;
 *     &lt;enumeration value="STBL"/&gt;
 *     &lt;enumeration value="ACTI"/&gt;
 *     &lt;enumeration value="ADJV"/&gt;
 *     &lt;enumeration value="ADTV"/&gt;
 *     &lt;enumeration value="BASE"/&gt;
 *     &lt;enumeration value="IACT"/&gt;
 *     &lt;enumeration value="MECH"/&gt;
 *     &lt;enumeration value="CASEBJ"/&gt;
 *     &lt;enumeration value="RESBJ"/&gt;
 *     &lt;enumeration value="NOT"/&gt;
 *     &lt;enumeration value="PROV"/&gt;
 *     &lt;enumeration value="STOR"/&gt;
 *     &lt;enumeration value="THER"/&gt;
 *     &lt;enumeration value="DEPEN"/&gt;
 *     &lt;enumeration value="INDIV"/&gt;
 *     &lt;enumeration value="SUBSCR"/&gt;
 *     &lt;enumeration value="ACTM"/&gt;
 *     &lt;enumeration value="DSDLOC"/&gt;
 *     &lt;enumeration value="ISDLOC"/&gt;
 *     &lt;enumeration value="ALQT"/&gt;
 *     &lt;enumeration value="ISLT"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "RoleClass")
@XmlEnum
public enum RoleClass {

    CHILD,
    CRED,
    NURPRAC,
    NURS,
    PA,
    PHYS,
    ROL,
    CAREGIVER,
    PRS,
    EQUIV,
    GEN,
    INST,
    SUBS,
    CONT,
    EXPAGTCAR,
    INGR,
    LOCE,
    MBR,
    PART,
    SPEC,
    ACCESS,
    ADJY,
    ADMM,
    BIRTHPL,
    DEATHPLC,
    DST,
    EXPR,
    HLD,
    HLTHCHRT,
    IDENT,
    MANU,
    MNT,
    OWN,
    RGPR,
    SDLOC,
    TERR,
    USED,
    WRTE,
    AFFL,
    AGNT,
    CIT,
    COVPTY,
    CRINV,
    CRSPNSR,
    EMP,
    GUAR,
    INVSBJ,
    LIC,
    PAT,
    PAYEE,
    PAYOR,
    POLHOLD,
    QUAL,
    SPNSR,
    STD,
    UNDWRT,
    ACTIB,
    ACTIM,
    ACTIR,
    CONC,
    ASSIGNED,
    CON,
    GUARD,
    COMPAR,
    SGNOFF,
    ECON,
    NOK,
    BOND,
    CONY,
    CLAIM,
    NAMED,
    PROG,
    RET,
    MIL,
    SAME,
    SUBY,
    EXPVECTOR,
    FOMITE,
    GRIC,
    COLR,
    FLVR,
    PRSV,
    STBL,
    ACTI,
    ADJV,
    ADTV,
    BASE,
    IACT,
    MECH,
    CASEBJ,
    RESBJ,
    NOT,
    PROV,
    STOR,
    THER,
    DEPEN,
    INDIV,
    SUBSCR,
    ACTM,
    DSDLOC,
    ISDLOC,
    ALQT,
    ISLT;

    public String value() {
        return name();
    }

    public static RoleClass fromValue(String v) {
        return valueOf(v);
    }

}
