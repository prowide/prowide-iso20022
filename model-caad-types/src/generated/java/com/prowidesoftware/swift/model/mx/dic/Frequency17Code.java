
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Frequency17Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="Frequency17Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="YEAR"/>
 *     <enumeration value="DAIL"/>
 *     <enumeration value="FRTN"/>
 *     <enumeration value="MNTH"/>
 *     <enumeration value="QURT"/>
 *     <enumeration value="MIAN"/>
 *     <enumeration value="TEND"/>
 *     <enumeration value="WEEK"/>
 *     <enumeration value="ADHO"/>
 *     <enumeration value="SHFT"/>
 *     <enumeration value="ODMD"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
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
