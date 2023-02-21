
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AccrualPeriodType1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="AccrualPeriodType1Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="LONG"/&gt;
 *     &lt;enumeration value="FREG"/&gt;
 *     &lt;enumeration value="SHRT"/&gt;
 *     &lt;enumeration value="YEAR"/&gt;
 *     &lt;enumeration value="XLNG"/&gt;
 *     &lt;enumeration value="DFLT"/&gt;
 *     &lt;enumeration value="OMIT"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
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
