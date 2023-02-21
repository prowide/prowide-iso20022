
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TimeFrame1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="TimeFrame1Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="LONG"/&gt;
 *     &lt;enumeration value="MEDM"/&gt;
 *     &lt;enumeration value="NEUT"/&gt;
 *     &lt;enumeration value="SHOR"/&gt;
 *     &lt;enumeration value="VSHT"/&gt;
 *     &lt;enumeration value="HOLD"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
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
