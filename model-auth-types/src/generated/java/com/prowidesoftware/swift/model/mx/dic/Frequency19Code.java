
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Frequency19Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="Frequency19Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <minLength value="1"/>
 *     <maxLength value="4"/>
 *     <enumeration value="DAIL"/>
 *     <enumeration value="WEEK"/>
 *     <enumeration value="MNTH"/>
 *     <enumeration value="YEAR"/>
 *     <enumeration value="ADHO"/>
 *     <enumeration value="EXPI"/>
 *     <enumeration value="MIAN"/>
 *     <enumeration value="QURT"/>
 *     <enumeration value="HOUL"/>
 *     <enumeration value="ODMD"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "Frequency19Code")
@XmlEnum
public enum Frequency19Code {


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
    QURT,

    /**
     * Event takes place every hours.
     * 
     */
    HOUL,

    /**
     * Event takes place on demand.
     * 
     */
    ODMD;

    public String value() {
        return name();
    }

    public static Frequency19Code fromValue(String v) {
        return valueOf(v);
    }

}
