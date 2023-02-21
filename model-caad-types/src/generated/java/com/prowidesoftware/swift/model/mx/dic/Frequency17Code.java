
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Frequency17Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="Frequency17Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="YEAR"/&gt;
 *     &lt;enumeration value="DAIL"/&gt;
 *     &lt;enumeration value="FRTN"/&gt;
 *     &lt;enumeration value="MNTH"/&gt;
 *     &lt;enumeration value="QURT"/&gt;
 *     &lt;enumeration value="MIAN"/&gt;
 *     &lt;enumeration value="TEND"/&gt;
 *     &lt;enumeration value="WEEK"/&gt;
 *     &lt;enumeration value="ADHO"/&gt;
 *     &lt;enumeration value="SHFT"/&gt;
 *     &lt;enumeration value="ODMD"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "Frequency17Code")
@XmlEnum
public enum Frequency17Code {


    /**
     * Event takes place every year or once a year.
     * 
     */
    YEAR,

    /**
     * Event takes place every day.
     * 
     */
    DAIL,

    /**
     * Event takes place every two weeks.
     * 
     */
    FRTN,

    /**
     * Event takes place every month or once a month.
     * 
     */
    MNTH,

    /**
     * Event takes place every three months or four times a year.
     * 
     */
    QURT,

    /**
     * Event takes place every six months or two times a year.
     * 
     */
    MIAN,

    /**
     * Event takes place every ten business days.
     * 
     */
    TEND,

    /**
     * Event takes place once a week.
     * 
     */
    WEEK,

    /**
     * Event takes place on request or as necessary.
     * 
     */
    ADHO,

    /**
     * Event associated with a shift.
     * 
     */
    SHFT,

    /**
     * Event takes place on demand.
     * 
     */
    ODMD;

    public String value() {
        return name();
    }

    public static Frequency17Code fromValue(String v) {
        return valueOf(v);
    }

}
