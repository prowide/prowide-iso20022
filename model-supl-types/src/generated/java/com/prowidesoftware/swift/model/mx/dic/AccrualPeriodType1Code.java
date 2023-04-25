
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AccrualPeriodType1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="AccrualPeriodType1Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="LONG"/>
 *     <enumeration value="FREG"/>
 *     <enumeration value="SHRT"/>
 *     <enumeration value="YEAR"/>
 *     <enumeration value="XLNG"/>
 *     <enumeration value="DFLT"/>
 *     <enumeration value="OMIT"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "AccrualPeriodType1Code")
@XmlEnum
public enum AccrualPeriodType1Code {


    /**
     * Long first payment period is applicable.
     * 
     */
    LONG,

    /**
     * Regular first payment period is applicable.
     * 
     */
    FREG,

    /**
     * Short first payment period is applicable.
     * 
     */
    SHRT,

    /**
     * First year of payment is applicable.
     * 
     */
    YEAR,

    /**
     * Extra long payment period is applicable.
     * 
     */
    XLNG,

    /**
     * Default payment period is applicable.
     * 
     */
    DFLT,

    /**
     * Payment has not been done.
     * 
     */
    OMIT;

    public String value() {
        return name();
    }

    public static AccrualPeriodType1Code fromValue(String v) {
        return valueOf(v);
    }

}
