
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PINEntrySecurityCharacteristic1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="PINEntrySecurityCharacteristic1Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="OTHN"/>
 *     <enumeration value="OTHP"/>
 *     <enumeration value="SECS"/>
 *     <enumeration value="SECH"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
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
