
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SoftwareType2Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="SoftwareType2Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="MFFW"/>
 *     <enumeration value="MFSW"/>
 *     <enumeration value="APSW"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "SoftwareType2Code")
@XmlEnum
public enum SoftwareType2Code {


    /**
     * Manufacturer Firmware.
     * 
     */
    MFFW,

    /**
     * Manufacturer Software.
     * 
     */
    MFSW,

    /**
     * Application Software.
     * 
     */
    APSW;

    public String value() {
        return name();
    }

    public static SoftwareType2Code fromValue(String v) {
        return valueOf(v);
    }

}
