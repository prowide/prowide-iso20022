
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Frequency13Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="Frequency13Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;minLength value="1"/&gt;
 *     &lt;maxLength value="4"/&gt;
 *     &lt;enumeration value="DAIL"/&gt;
 *     &lt;enumeration value="WEEK"/&gt;
 *     &lt;enumeration value="MNTH"/&gt;
 *     &lt;enumeration value="YEAR"/&gt;
 *     &lt;enumeration value="ADHO"/&gt;
 *     &lt;enumeration value="EXPI"/&gt;
 *     &lt;enumeration value="MIAN"/&gt;
 *     &lt;enumeration value="QURT"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "Frequency13Code")
@XmlEnum
public enum Frequency13Code {


    /**
     * Event takes place every day.
     * 
     */
    DAIL,

    /**
     * Event takes place once a week.
     * 
     */
    WEEK,

    /**
     * Event takes place every month or once a month.
     * 
     */
    MNTH,

    /**
     * Event takes place every year or once a year.
     * 
     */
    YEAR,

    /**
     * Event takes place on request or as necessary.
     * 
     */
    ADHO,

    /**
     * Event occurs on expiry of a financial contract.
     * 
     */
    EXPI,

    /**
     * Event takes place every six months or two times a year.
     * 
     */
    MIAN,

    /**
     * Event takes place every three months or four times a year.
     * 
     */
    QURT;

    public String value() {
        return name();
    }

    public static Frequency13Code fromValue(String v) {
        return valueOf(v);
    }

}
