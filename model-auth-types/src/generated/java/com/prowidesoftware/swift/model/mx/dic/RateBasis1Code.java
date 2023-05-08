
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RateBasis1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="RateBasis1Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="DAYS"/>
 *     <enumeration value="MNTH"/>
 *     <enumeration value="WEEK"/>
 *     <enumeration value="YEAR"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "RateBasis1Code")
@XmlEnum
public enum RateBasis1Code {


    /**
     * Rate is reported in days.
     * 
     */
    DAYS,

    /**
     * Rate is reported in months.
     * 
     */
    MNTH,

    /**
     * Rate is reported in weeks.
     * 
     */
    WEEK,

    /**
     * Rate is reported in years.
     * 
     */
    YEAR;

    public String value() {
        return name();
    }

    public static RateBasis1Code fromValue(String v) {
        return valueOf(v);
    }

}
