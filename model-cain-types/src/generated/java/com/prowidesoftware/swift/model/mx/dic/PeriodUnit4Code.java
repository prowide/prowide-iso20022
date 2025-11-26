
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PeriodUnit4Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="PeriodUnit4Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="OTHP"/>
 *     <enumeration value="OTHN"/>
 *     <enumeration value="MNTH"/>
 *     <enumeration value="WEEK"/>
 *     <enumeration value="YEAR"/>
 *     <enumeration value="DAYS"/>
 *     <enumeration value="EXDY"/>
 *     <enumeration value="MINU"/>
 *     <enumeration value="HFDA"/>
 *     <enumeration value="HOUR"/>
 *     <enumeration value="OTHR"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "PeriodUnit4Code")
@XmlEnum
public enum PeriodUnit4Code {


    /**
     * Other Private
     * 
     */
    OTHP,

    /**
     * Other National
     * 
     */
    OTHN,

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
    HOUR,

    /**
     * Counted in some other unit.
     * 
     */
    OTHR;

    public String value() {
        return name();
    }

    public static PeriodUnit4Code fromValue(String v) {
        return valueOf(v);
    }

}
