//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.11.22 at 10:46:31 PM IST 
//


package com.clincab.web.app.eutils.jaxb.e2br3;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{urn:hl7-org:v3}PORR_IN049017UV.MCCI_MT000100UV01.Message"&gt;
 *       &lt;attribute name="ITSVersion" use="required" type="{http://www.w3.org/2001/XMLSchema}string" fixed="XML_1.0" /&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "")
@XmlRootElement(name = "PORR_IN049017UV")
public class PORRIN049017UV
    extends PORRIN049017UVMCCIMT000100UV01Message
{

    @XmlAttribute(name = "ITSVersion", required = true)
    protected String itsVersion;

    /**
     * Gets the value of the itsVersion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getITSVersion() {
        if (itsVersion == null) {
            return "XML_1.0";
        } else {
            return itsVersion;
        }
    }

    /**
     * Sets the value of the itsVersion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setITSVersion(String value) {
        this.itsVersion = value;
    }

}
