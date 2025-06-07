
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SoftwareType1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="SoftwareType1Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="MFFW"/&gt;
 *     &lt;enumeration value="MFSW"/&gt;
 *     &lt;enumeration value="APSW"/&gt;
 *     &lt;enumeration value="OTHP"/&gt;
 *     &lt;enumeration value="OTHN"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
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
