
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PeriodUnit5Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="PeriodUnit5Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="MNTH"/>
 *     <enumeration value="WEEK"/>
 *     <enumeration value="YEAR"/>
 *     <enumeration value="DAYS"/>
 *     <enumeration value="EXDY"/>
 *     <enumeration value="MINU"/>
 *     <enumeration value="HFDA"/>
 *     <enumeration value="HOUR"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "PeriodUnit5Code")
@XmlEnum
public enum PeriodUnit5Code {


    /**
     * Counted in months.
     * 
     */
    MNTH,

    /**
     * Counted in weeks.
     * 
     */
    WEEK,

    /**
     * Counted in years.
     * 
     */
    YEAR,

    /**
     * Counted in days.
     * 
     */
    DAYS,

    /**
     * Extra Days
     * 
     */
    EXDY,

    /**
     * Period unit expressed in minutes
     * 
     */
    MINU,

    /**
     * Half days
     * 
     */
    HFDA,

    /**
     * Period unit expressed in hours.
     * 
     */
    HOUR;

    public String value() {
        return name();
    }

    public static PeriodUnit5Code fromValue(String v) {
        return valueOf(v);
    }

}
