
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TimeUnit1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="TimeUnit1Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="DAYC"/&gt;
 *     &lt;enumeration value="HOUR"/&gt;
 *     &lt;enumeration value="MINU"/&gt;
 *     &lt;enumeration value="MNTH"/&gt;
 *     &lt;enumeration value="SECO"/&gt;
 *     &lt;enumeration value="WEEK"/&gt;
 *     &lt;enumeration value="YEAR"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "TimeUnit1Code")
@XmlEnum
public enum TimeUnit1Code {


    /**
     * Time unit is calendar day.
     * 
     */
    DAYC,

    /**
     * Time unit is hour.
     * 
     */
    HOUR,

    /**
     * Time unit is minute.
     * 
     */
    MINU,

    /**
     * Time unit is month.
     * 
     */
    MNTH,

    /**
     * Time unit is second.
     * 
     */
    SECO,

    /**
     * Time unit is week.
     * 
     */
    WEEK,

    /**
     * Time unit is year.
     * 
     */
    YEAR;

    public String value() {
        return name();
    }

    public static TimeUnit1Code fromValue(String v) {
        return valueOf(v);
    }

}
