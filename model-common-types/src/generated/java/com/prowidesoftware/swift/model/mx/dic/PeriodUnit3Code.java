
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PeriodUnit3Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="PeriodUnit3Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="OTHP"/&gt;
 *     &lt;enumeration value="OTHN"/&gt;
 *     &lt;enumeration value="MNTH"/&gt;
 *     &lt;enumeration value="WEEK"/&gt;
 *     &lt;enumeration value="YEAR"/&gt;
 *     &lt;enumeration value="DAYS"/&gt;
 *     &lt;enumeration value="EXDY"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
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
