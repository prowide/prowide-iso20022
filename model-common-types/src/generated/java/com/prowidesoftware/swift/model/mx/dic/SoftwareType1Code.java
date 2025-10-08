
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SoftwareType1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="SoftwareType1Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="MFFW"/>
 *     <enumeration value="MFSW"/>
 *     <enumeration value="APSW"/>
 *     <enumeration value="OTHP"/>
 *     <enumeration value="OTHN"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "SoftwareType1Code")
@XmlEnum
public enum SoftwareType1Code {


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
    APSW,

    /**
     * Private code.
     * 
     */
    OTHP,

    /**
     * National code.
     * 
     */
    OTHN;

    public String value() {
        return name();
    }

    public static SoftwareType1Code fromValue(String v) {
        return valueOf(v);
    }

}
