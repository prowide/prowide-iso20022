
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Appearance1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="Appearance1Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="DELI"/>
 *     <enumeration value="NDEL"/>
 *     <enumeration value="LIMI"/>
 *     <enumeration value="BENT"/>
 *     <enumeration value="DFBE"/>
 *     <enumeration value="DLBE"/>
 *     <enumeration value="TMPG"/>
 *     <enumeration value="GLOB"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
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
