
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Identification3Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="Identification3Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="DRID"/>
 *     <enumeration value="NTID"/>
 *     <enumeration value="PASS"/>
 *     <enumeration value="SSYN"/>
 *     <enumeration value="ARNB"/>
 *     <enumeration value="OTHP"/>
 *     <enumeration value="OTHN"/>
 *     <enumeration value="EMAL"/>
 *     <enumeration value="PHNB"/>
 *     <enumeration value="CUID"/>
 *     <enumeration value="TXID"/>
 *     <enumeration value="PRXY"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "Identification3Code")
@XmlEnum
public enum Identification3Code {


    /**
     * Driver licence identification.
     * 
     */
    DRID,

    /**
     * National identification.
     * 
     */
    NTID,

    /**
     * Passport number.
     * 
     */
    PASS,

    /**
     * Social security number.
     * 
     */
    SSYN,

    /**
     * Alien registration number.
     * 
     */
    ARNB,

    /**
     * Other identification provided at private level.
     * 
     */
    OTHP,

    /**
     * Other identification assigned at national level.
     * 
     */
    OTHN,

    /**
     * E-mail.
     * 
     */
    EMAL,

    /**
     * Phone number.
     * 
     */
    PHNB,

    /**
     * Identification of customer.
     * 
     */
    CUID,

    /**
     * Tax identifier.
     * 
     */
    TXID,

    /**
     * Proxy
     * 
     */
    PRXY;

    public String value() {
        return name();
    }

    public static Identification3Code fromValue(String v) {
        return valueOf(v);
    }

}
