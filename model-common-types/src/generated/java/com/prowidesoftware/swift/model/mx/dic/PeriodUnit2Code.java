
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PeriodUnit2Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="PeriodUnit2Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="HOUR"/&gt;
 *     &lt;enumeration value="HFDA"/&gt;
 *     &lt;enumeration value="DAYS"/&gt;
 *     &lt;enumeration value="WEEK"/&gt;
 *     &lt;enumeration value="MNTH"/&gt;
 *     &lt;enumeration value="YEAR"/&gt;
 *     &lt;enumeration value="MINU"/&gt;
 *     &lt;enumeration value="OTHR"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "PeriodUnit2Code")
@XmlEnum
public enum PeriodUnit2Code {


    /**
     * Period unit expressed in hours.
     * 
     */
    HOUR,

    /**
     * Half days
     * 
     */
    HFDA,

    /**
     * Counted in days.
     * 
     */
    DAYS,

    /**
     * Counted in weeks.
     * 
     */
    WEEK,

    /**
     * Counted in months.
     * 
     */
    MNTH,

    /**
     * Counted in years.
     * 
     */
    YEAR,

    /**
     * Period unit expressed in minutes
     * 
     */
    MINU,

    /**
     * Counted in some other unit.
     * 
     */
    OTHR;

    public String value() {
        return name();
    }

    public static PeriodUnit2Code fromValue(String v) {
        return valueOf(v);
    }

}
