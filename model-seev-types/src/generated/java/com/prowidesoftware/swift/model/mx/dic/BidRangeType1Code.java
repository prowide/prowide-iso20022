
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BidRangeType1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="BidRangeType1Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="DIVI"/&gt;
 *     &lt;enumeration value="INCR"/&gt;
 *     &lt;enumeration value="MULT"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "BidRangeType1Code")
@XmlEnum
public enum BidRangeType1Code {


    /**
     * All values (including minimum and maximum prices) are divisible by the bid interval.
     * 
     */
    DIVI,

    /**
     * No values within the bid range are divisible by the bid interval including the minimum and maximum prices.  Each value between the minimum and maximum prices is incremented by the bid interval.
     * 
     */
    INCR,

    /**
     * Minimum and maximum prices are not divisible by the bid interval.  All successive values between the minimum and maximum prices are in multiples of the bid interval.
     * 
     */
    MULT;

    public String value() {
        return name();
    }

    public static BidRangeType1Code fromValue(String v) {
        return valueOf(v);
    }

}
