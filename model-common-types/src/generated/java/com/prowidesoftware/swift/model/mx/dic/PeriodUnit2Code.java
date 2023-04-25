
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PeriodUnit2Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="PeriodUnit2Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="HOUR"/>
 *     <enumeration value="HFDA"/>
 *     <enumeration value="DAYS"/>
 *     <enumeration value="WEEK"/>
 *     <enumeration value="MNTH"/>
 *     <enumeration value="YEAR"/>
 *     <enumeration value="MINU"/>
 *     <enumeration value="OTHR"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
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
