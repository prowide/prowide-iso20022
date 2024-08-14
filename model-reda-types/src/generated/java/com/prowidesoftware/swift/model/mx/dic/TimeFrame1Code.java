
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TimeFrame1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="TimeFrame1Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="LONG"/>
 *     <enumeration value="MEDM"/>
 *     <enumeration value="NEUT"/>
 *     <enumeration value="SHOR"/>
 *     <enumeration value="VSHT"/>
 *     <enumeration value="HOLD"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "TimeFrame1Code")
@XmlEnum
public enum TimeFrame1Code {


    /**
     * Greater than five years.
     * 
     */
    LONG,

    /**
     * Greater than or equal to three years.
     * 
     */
    MEDM,

    /**
     * Time frame is neutral.
     * 
     */
    NEUT,

    /**
     * Greater than or equal to one year.
     * 
     */
    SHOR,

    /**
     * Less than one year.
     * 
     */
    VSHT,

    /**
     * Hold to maturity.
     * 
     */
    HOLD;

    public String value() {
        return name();
    }

    public static TimeFrame1Code fromValue(String v) {
        return valueOf(v);
    }

}
