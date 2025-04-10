
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Frequency11Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="Frequency11Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="YEAR"/>
 *     <enumeration value="DAIL"/>
 *     <enumeration value="MNTH"/>
 *     <enumeration value="EXPI"/>
 *     <enumeration value="OVNG"/>
 *     <enumeration value="QURT"/>
 *     <enumeration value="MIAN"/>
 *     <enumeration value="UPFR"/>
 *     <enumeration value="WEEK"/>
 *     <enumeration value="CRED"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "Frequency11Code")
@XmlEnum
public enum Frequency11Code {


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
     * Event occurs on expiry of a financial contract.
     * 
     */
    EXPI,

    /**
     * Event takes place overnight.
     * 
     */
    OVNG,

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
     * Event that takes place at the initiation of a trade or agreement.
     * 
     */
    UPFR,

    /**
     * Event takes place once a week.
     * 
     */
    WEEK,

    /**
     * Event occurs due to a credit event occurring for an issuer.
     * 
     */
    CRED;

    public String value() {
        return name();
    }

    public static Frequency11Code fromValue(String v) {
        return valueOf(v);
    }

}
