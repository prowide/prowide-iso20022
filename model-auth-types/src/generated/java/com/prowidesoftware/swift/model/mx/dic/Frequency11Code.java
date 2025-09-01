
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Frequency11Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="Frequency11Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="YEAR"/&gt;
 *     &lt;enumeration value="DAIL"/&gt;
 *     &lt;enumeration value="MNTH"/&gt;
 *     &lt;enumeration value="EXPI"/&gt;
 *     &lt;enumeration value="OVNG"/&gt;
 *     &lt;enumeration value="QURT"/&gt;
 *     &lt;enumeration value="MIAN"/&gt;
 *     &lt;enumeration value="UPFR"/&gt;
 *     &lt;enumeration value="WEEK"/&gt;
 *     &lt;enumeration value="CRED"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
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
