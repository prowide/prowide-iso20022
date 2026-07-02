
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Appearance1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="Appearance1Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="DELI"/&gt;
 *     &lt;enumeration value="NDEL"/&gt;
 *     &lt;enumeration value="LIMI"/&gt;
 *     &lt;enumeration value="BENT"/&gt;
 *     &lt;enumeration value="DFBE"/&gt;
 *     &lt;enumeration value="DLBE"/&gt;
 *     &lt;enumeration value="TMPG"/&gt;
 *     &lt;enumeration value="GLOB"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "Appearance1Code")
@XmlEnum
public enum Appearance1Code {


    /**
     * Physical certificates exist.
     * 
     */
    DELI,

    /**
     * Not yet deliverable contract.
     * 
     */
    NDEL,

    /**
     * Limited or partial deliverability.
     * 
     */
    LIMI,

    /**
     * Security exists only as an electronic record, ie, there are no physical certificates representing the security.
     * 
     */
    BENT,

    /**
     * Deferred printing, book entry.
     * 
     */
    DFBE,

    /**
     * Deliverable, book entry.
     * 
     */
    DLBE,

    /**
     * Deferred printing, global certificate.
     * 
     */
    TMPG,

    /**
     * Not deliverable, global certificate.
     * 
     */
    GLOB;

    public String value() {
        return name();
    }

    public static Appearance1Code fromValue(String v) {
        return valueOf(v);
    }

}
