
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for EventFrequency12Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="EventFrequency12Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="ADHO"/&gt;
 *     &lt;enumeration value="YEAR"/&gt;
 *     &lt;enumeration value="DAIL"/&gt;
 *     &lt;enumeration value="TOMN"/&gt;
 *     &lt;enumeration value="TOWK"/&gt;
 *     &lt;enumeration value="INDA"/&gt;
 *     &lt;enumeration value="MNTH"/&gt;
 *     &lt;enumeration value="QUTR"/&gt;
 *     &lt;enumeration value="SEMI"/&gt;
 *     &lt;enumeration value="TWMN"/&gt;
 *     &lt;enumeration value="WEEK"/&gt;
 *     &lt;enumeration value="ONDE"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "EventFrequency12Code")
@XmlEnum
public enum EventFrequency12Code {


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
    WEEK,

    /**
     * Event takes place on demand.
     * 
     */
    ONDE;

    public String value() {
        return name();
    }

    public static EventFrequency12Code fromValue(String v) {
        return valueOf(v);
    }

}
