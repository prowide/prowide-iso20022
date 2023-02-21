
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TimeFrame2Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="TimeFrame2Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="HOLD"/&gt;
 *     &lt;enumeration value="LONG"/&gt;
 *     &lt;enumeration value="MEDM"/&gt;
 *     &lt;enumeration value="SHOR"/&gt;
 *     &lt;enumeration value="VSHT"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "TimeFrame2Code")
@XmlEnum
public enum TimeFrame2Code {


    /**
     * Hold to maturity.
     * 
     */
    HOLD,

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
     * Greater than or equal to one year.
     * 
     */
    SHOR,

    /**
     * Less than one year.
     * 
     */
    VSHT;

    public String value() {
        return name();
    }

    public static TimeFrame2Code fromValue(String v) {
        return valueOf(v);
    }

}
