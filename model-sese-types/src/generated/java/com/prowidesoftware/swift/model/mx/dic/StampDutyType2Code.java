
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for StampDutyType2Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="StampDutyType2Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="ASTD"/>
 *     <enumeration value="SDRN"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "StampDutyType2Code")
@XmlEnum
public enum StampDutyType2Code {


    /**
     * Stamps duty is applicable.
     * 
     */
    ASTD,

    /**
     * Stamp duty not applicable.
     * 
     */
    SDRN;

    public String value() {
        return name();
    }

    public static StampDutyType2Code fromValue(String v) {
        return valueOf(v);
    }

}
