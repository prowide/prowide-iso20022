
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Identification2Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="Identification2Code"&gt;
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
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "Identification2Code")
@XmlEnum
public enum Identification2Code {


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
    PHNB;

    public String value() {
        return name();
    }

    public static Identification2Code fromValue(String v) {
        return valueOf(v);
    }

}
