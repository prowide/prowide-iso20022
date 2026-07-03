
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for EventFrequency4Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="EventFrequency4Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="YEAR"/&gt;
 *     &lt;enumeration value="ADHO"/&gt;
 *     &lt;enumeration value="MNTH"/&gt;
 *     &lt;enumeration value="DAIL"/&gt;
 *     &lt;enumeration value="INDA"/&gt;
 *     &lt;enumeration value="WEEK"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "EventFrequency4Code")
@XmlEnum
public enum EventFrequency4Code {


    /**
     * Event takes place every year or once a year.
     * 
     */
    YEAR,

    /**
     * Event takes place as necessary.
     * 
     */
    ADHO,

    /**
     * Event takes place every month or once a month.
     * 
     */
    MNTH,

    /**
     * Event takes place every day.
     * 
     */
    DAIL,

    /**
     * Event takes place several times a day.
     * 
     */
    INDA,

    /**
     * Event takes place once a week.
     * 
     */
    WEEK;

    public String value() {
        return name();
    }

    public static EventFrequency4Code fromValue(String v) {
        return valueOf(v);
    }

}
