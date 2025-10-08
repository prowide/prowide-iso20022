
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PeriodUnit4Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="PeriodUnit4Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="OTHP"/&gt;
 *     &lt;enumeration value="OTHN"/&gt;
 *     &lt;enumeration value="MNTH"/&gt;
 *     &lt;enumeration value="WEEK"/&gt;
 *     &lt;enumeration value="YEAR"/&gt;
 *     &lt;enumeration value="DAYS"/&gt;
 *     &lt;enumeration value="EXDY"/&gt;
 *     &lt;enumeration value="MINU"/&gt;
 *     &lt;enumeration value="HFDA"/&gt;
 *     &lt;enumeration value="HOUR"/&gt;
 *     &lt;enumeration value="OTHR"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
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
