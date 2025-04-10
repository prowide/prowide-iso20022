
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for EventFrequency9Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="EventFrequency9Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="YEAR"/>
 *     <enumeration value="SEMI"/>
 *     <enumeration value="QUTR"/>
 *     <enumeration value="TOMN"/>
 *     <enumeration value="MNTH"/>
 *     <enumeration value="TWMN"/>
 *     <enumeration value="TOWK"/>
 *     <enumeration value="WEEK"/>
 *     <enumeration value="DAIL"/>
 *     <enumeration value="ADHO"/>
 *     <enumeration value="INDA"/>
 *     <enumeration value="OVNG"/>
 *     <enumeration value="ONDE"/>
 *     <enumeration value="NONE"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "EventFrequency9Code")
@XmlEnum
public enum EventFrequency9Code {


    /**
     * Event takes place every year or once a year.
     * 
     */
    YEAR,

    /**
     * Event takes place every six months or two times a year.
     * 
     */
    SEMI,

    /**
     * Event takes place every three months or four times a year.
     * 
     */
    QUTR,

    /**
     * Event takes place every two months.
     * 
     */
    TOMN,

    /**
     * Event takes place every month or once a month.
     * 
     */
    MNTH,

    /**
     * Event takes place two times a month.
     * 
     */
    TWMN,

    /**
     * Event takes place every two weeks.
     * 
     */
    TOWK,

    /**
     * Event takes place once a week.
     * 
     */
    WEEK,

    /**
     * Event takes place every day.
     * 
     */
    DAIL,

    /**
     * Event takes place as necessary.
     * 
     */
    ADHO,

    /**
     * Event takes place several times a day.
     * 
     */
    INDA,

    /**
     * Event takes place overnight.
     * 
     */
    OVNG,

    /**
     * Event takes place on demand.
     * 
     */
    ONDE,

    /**
     * Event does not take place.
     * 
     */
    NONE;

    public String value() {
        return name();
    }

    public static EventFrequency9Code fromValue(String v) {
        return valueOf(v);
    }

}
