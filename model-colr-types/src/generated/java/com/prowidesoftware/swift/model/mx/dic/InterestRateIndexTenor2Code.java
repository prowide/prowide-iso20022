
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for InterestRateIndexTenor2Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="InterestRateIndexTenor2Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="INDA"/&gt;
 *     &lt;enumeration value="MNTH"/&gt;
 *     &lt;enumeration value="YEAR"/&gt;
 *     &lt;enumeration value="TOMN"/&gt;
 *     &lt;enumeration value="QUTR"/&gt;
 *     &lt;enumeration value="FOMN"/&gt;
 *     &lt;enumeration value="SEMI"/&gt;
 *     &lt;enumeration value="OVNG"/&gt;
 *     &lt;enumeration value="WEEK"/&gt;
 *     &lt;enumeration value="TOWK"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
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
