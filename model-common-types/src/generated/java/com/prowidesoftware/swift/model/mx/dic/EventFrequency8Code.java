
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for EventFrequency8Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="EventFrequency8Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="ADHO"/>
 *     <enumeration value="YEAR"/>
 *     <enumeration value="DAIL"/>
 *     <enumeration value="FOMN"/>
 *     <enumeration value="TOMN"/>
 *     <enumeration value="TOWK"/>
 *     <enumeration value="TYEA"/>
 *     <enumeration value="INDA"/>
 *     <enumeration value="MNTH"/>
 *     <enumeration value="ONDE"/>
 *     <enumeration value="OVNG"/>
 *     <enumeration value="QUTR"/>
 *     <enumeration value="SEMI"/>
 *     <enumeration value="TWMN"/>
 *     <enumeration value="WEEK"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "EventFrequency8Code")
@XmlEnum
public enum EventFrequency8Code {


    /**
     * Event takes place as necessary.
     * 
     */
    ADHO,

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
     * Event takes place every four months or three times a year.
     * 
     */
    FOMN,

    /**
     * Event takes place every two months.
     * 
     */
    TOMN,

    /**
     * Event takes place every two weeks.
     * 
     */
    TOWK,

    /**
     * Event takes place every two years.
     * 
     */
    TYEA,

    /**
     * Event takes place several times a day.
     * 
     */
    INDA,

    /**
     * Event takes place every month or once a month.
     * 
     */
    MNTH,

    /**
     * Event takes place on demand.
     * 
     */
    ONDE,

    /**
     * Event takes place overnight.
     * 
     */
    OVNG,

    /**
     * Event takes place every three months or four times a year.
     * 
     */
    QUTR,

    /**
     * Event takes place every six months or two times a year.
     * 
     */
    SEMI,

    /**
     * Event takes place two times a month.
     * 
     */
    TWMN,

    /**
     * Event takes place once a week.
     * 
     */
    WEEK;

    public String value() {
        return name();
    }

    public static EventFrequency8Code fromValue(String v) {
        return valueOf(v);
    }

}
