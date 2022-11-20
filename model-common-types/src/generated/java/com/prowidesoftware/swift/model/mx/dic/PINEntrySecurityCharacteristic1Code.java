
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PINEntrySecurityCharacteristic1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="PINEntrySecurityCharacteristic1Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="OTHN"/&gt;
 *     &lt;enumeration value="OTHP"/&gt;
 *     &lt;enumeration value="SECS"/&gt;
 *     &lt;enumeration value="SECH"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "PINEntrySecurityCharacteristic1Code")
@XmlEnum
public enum PINEntrySecurityCharacteristic1Code {


    /**
     * Other nationally assigned code.
     * 
     */
    OTHN,

    /**
     * Other privately assigned code.
     * 
     */
    OTHP,

    /**
     * PIN entry is protected via an approved software solution.
     * 
     */
    SECS,

    /**
     * PIN entry is protected via a secure hardware solution.
     * 
     */
    SECH;

    public String value() {
        return name();
    }

    public static PINEntrySecurityCharacteristic1Code fromValue(String v) {
        return valueOf(v);
    }

}
