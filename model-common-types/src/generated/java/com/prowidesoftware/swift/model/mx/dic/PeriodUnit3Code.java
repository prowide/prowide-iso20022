
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PeriodUnit3Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="PeriodUnit3Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="OTHP"/>
 *     <enumeration value="OTHN"/>
 *     <enumeration value="MNTH"/>
 *     <enumeration value="WEEK"/>
 *     <enumeration value="YEAR"/>
 *     <enumeration value="DAYS"/>
 *     <enumeration value="EXDY"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "PeriodUnit3Code")
@XmlEnum
public enum PeriodUnit3Code {


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
    EXDY;

    public String value() {
        return name();
    }

    public static PeriodUnit3Code fromValue(String v) {
        return valueOf(v);
    }

}
