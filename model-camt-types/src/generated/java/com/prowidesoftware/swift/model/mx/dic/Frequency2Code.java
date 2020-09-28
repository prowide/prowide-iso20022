
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Frequency2Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="Frequency2Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="YEAR"/&gt;
 *     &lt;enumeration value="MNTH"/&gt;
 *     &lt;enumeration value="QURT"/&gt;
 *     &lt;enumeration value="MIAN"/&gt;
 *     &lt;enumeration value="WEEK"/&gt;
 *     &lt;enumeration value="DAIL"/&gt;
 *     &lt;enumeration value="ADHO"/&gt;
 *     &lt;enumeration value="INDA"/&gt;
 *     &lt;enumeration value="OVNG"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "Frequency2Code")
@XmlEnum
public enum Frequency2Code {


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
    QURT,

    /**
     * Event takes place every six months or two times a year.
     * 
     */
    MIAN,

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
     * Event takes place on request or as necessary.
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
    OVNG;

    public String value() {
        return name();
    }

    public static Frequency2Code fromValue(String v) {
        return valueOf(v);
    }

}
