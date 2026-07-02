
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RateBasis1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="RateBasis1Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="DAYS"/&gt;
 *     &lt;enumeration value="MNTH"/&gt;
 *     &lt;enumeration value="WEEK"/&gt;
 *     &lt;enumeration value="YEAR"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
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
