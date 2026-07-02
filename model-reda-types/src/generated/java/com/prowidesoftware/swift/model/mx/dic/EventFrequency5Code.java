
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for EventFrequency5Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="EventFrequency5Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="YEAR"/&gt;
 *     &lt;enumeration value="SEMI"/&gt;
 *     &lt;enumeration value="QUTR"/&gt;
 *     &lt;enumeration value="MNTH"/&gt;
 *     &lt;enumeration value="WEEK"/&gt;
 *     &lt;enumeration value="DAIL"/&gt;
 *     &lt;enumeration value="CLOS"/&gt;
 *     &lt;enumeration value="TOMN"/&gt;
 *     &lt;enumeration value="TOWK"/&gt;
 *     &lt;enumeration value="TWMN"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "EventFrequency5Code")
@XmlEnum
public enum EventFrequency5Code {


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
     * Event takes place every month or once a month.
     * 
     */
    MNTH,

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
     * Event cannot take place, because, for example, the fund is closed.
     * 
     */
    CLOS,

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
     * Event takes place two times a month.
     * 
     */
    TWMN;

    public String value() {
        return name();
    }

    public static EventFrequency5Code fromValue(String v) {
        return valueOf(v);
    }

}
