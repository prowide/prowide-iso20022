
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Identification3Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="Identification3Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="DRID"/&gt;
 *     &lt;enumeration value="NTID"/&gt;
 *     &lt;enumeration value="PASS"/&gt;
 *     &lt;enumeration value="SSYN"/&gt;
 *     &lt;enumeration value="ARNB"/&gt;
 *     &lt;enumeration value="OTHP"/&gt;
 *     &lt;enumeration value="OTHN"/&gt;
 *     &lt;enumeration value="EMAL"/&gt;
 *     &lt;enumeration value="PHNB"/&gt;
 *     &lt;enumeration value="CUID"/&gt;
 *     &lt;enumeration value="TXID"/&gt;
 *     &lt;enumeration value="PRXY"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
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
