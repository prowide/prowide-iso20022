
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for WeekDay3Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="WeekDay3Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="ALLD"/&gt;
 *     &lt;enumeration value="XBHL"/&gt;
 *     &lt;enumeration value="IBHL"/&gt;
 *     &lt;enumeration value="FRID"/&gt;
 *     &lt;enumeration value="MOND"/&gt;
 *     &lt;enumeration value="SATD"/&gt;
 *     &lt;enumeration value="SUND"/&gt;
 *     &lt;enumeration value="THUD"/&gt;
 *     &lt;enumeration value="TUED"/&gt;
 *     &lt;enumeration value="WEDD"/&gt;
 *     &lt;enumeration value="WDAY"/&gt;
 *     &lt;enumeration value="WEND"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "WeekDay3Code")
@XmlEnum
public enum WeekDay3Code {


    /**
     * All Days of the week.
     * 
     */
    ALLD,

    /**
     * Days of the week excluding bank holidays.
     * 
     */
    XBHL,

    /**
     * Days of the week Including bank holidays.
     * 
     */
    IBHL,

    /**
     * Friday.
     * 
     */
    FRID,

    /**
     * Monday.
     * 
     */
    MOND,

    /**
     * Saturday.
     * 
     */
    SATD,

    /**
     * Sunday.
     * 
     */
    SUND,

    /**
     * Thursday.
     * 
     */
    THUD,

    /**
     * Tuesday.
     * 
     */
    TUED,

    /**
     * Wednesday.
     * 
     */
    WEDD,

    /**
     * Weekdays.
     * 
     */
    WDAY,

    /**
     * Weekend.
     * 
     */
    WEND;

    public String value() {
        return name();
    }

    public static WeekDay3Code fromValue(String v) {
        return valueOf(v);
    }

}
