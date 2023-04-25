
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Frequency7Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="Frequency7Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="YEAR"/>
 *     <enumeration value="DAIL"/>
 *     <enumeration value="MNTH"/>
 *     <enumeration value="QURT"/>
 *     <enumeration value="MIAN"/>
 *     <enumeration value="TEND"/>
 *     <enumeration value="MOVE"/>
 *     <enumeration value="WEEK"/>
 *     <enumeration value="INDA"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "Frequency7Code")
@XmlEnum
public enum Frequency7Code {


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
     * Event takes place at the end of the day if there was a movement on the account, otherwise nothing is sent that day.
     * 
     */
    MOVE,

    /**
     * Event takes place once a week.
     * 
     */
    WEEK,

    /**
     * Event takes place several times a day.
     * 
     */
    INDA;

    public String value() {
        return name();
    }

    public static Frequency7Code fromValue(String v) {
        return valueOf(v);
    }

}
