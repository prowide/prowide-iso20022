
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for WeekDay3Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="WeekDay3Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="ALLD"/>
 *     <enumeration value="XBHL"/>
 *     <enumeration value="IBHL"/>
 *     <enumeration value="FRID"/>
 *     <enumeration value="MOND"/>
 *     <enumeration value="SATD"/>
 *     <enumeration value="SUND"/>
 *     <enumeration value="THUD"/>
 *     <enumeration value="TUED"/>
 *     <enumeration value="WEDD"/>
 *     <enumeration value="WDAY"/>
 *     <enumeration value="WEND"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
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
