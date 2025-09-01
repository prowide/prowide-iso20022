
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for EventFrequency3Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="EventFrequency3Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="YEAR"/&gt;
 *     &lt;enumeration value="MNTH"/&gt;
 *     &lt;enumeration value="QUTR"/&gt;
 *     &lt;enumeration value="SEMI"/&gt;
 *     &lt;enumeration value="WEEK"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "EventFrequency3Code")
@XmlEnum
public enum EventFrequency3Code {


    /**
     * Event takes place every year or once a year.
     * 
     */
    YEAR,

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
     * Event takes place once a week.
     * 
     */
    WEEK;

    public String value() {
        return name();
    }

    public static EventFrequency3Code fromValue(String v) {
        return valueOf(v);
    }

}
