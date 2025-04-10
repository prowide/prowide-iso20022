
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for InterestRateIndexTenor2Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="InterestRateIndexTenor2Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="INDA"/>
 *     <enumeration value="MNTH"/>
 *     <enumeration value="YEAR"/>
 *     <enumeration value="TOMN"/>
 *     <enumeration value="QUTR"/>
 *     <enumeration value="FOMN"/>
 *     <enumeration value="SEMI"/>
 *     <enumeration value="OVNG"/>
 *     <enumeration value="WEEK"/>
 *     <enumeration value="TOWK"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "InterestRateIndexTenor2Code")
@XmlEnum
public enum InterestRateIndexTenor2Code {


    /**
     * Tenor is IntraDay.
     * 
     */
    INDA,

    /**
     * Tenor is 1 month.
     * 
     */
    MNTH,

    /**
     * Tenor is 12 months.
     * 
     */
    YEAR,

    /**
     * Tenor is 2 months.
     * 
     */
    TOMN,

    /**
     * Tenor is 3 months.
     * 
     */
    QUTR,

    /**
     * Tenor is 4 months.
     * 
     */
    FOMN,

    /**
     * Tenor is 6 months.
     * 
     */
    SEMI,

    /**
     * Tenor is overnght.
     * 
     */
    OVNG,

    /**
     * Tenor is 1 week.	
     * 
     */
    WEEK,

    /**
     * Tenor is 2 weeks.
     * 
     */
    TOWK;

    public String value() {
        return name();
    }

    public static InterestRateIndexTenor2Code fromValue(String v) {
        return valueOf(v);
    }

}
