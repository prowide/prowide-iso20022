
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for InstalmentAmountDetailsType1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="InstalmentAmountDetailsType1Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="TAXX"/&gt;
 *     &lt;enumeration value="RQST"/&gt;
 *     &lt;enumeration value="OTHP"/&gt;
 *     &lt;enumeration value="OTHN"/&gt;
 *     &lt;enumeration value="OTHC"/&gt;
 *     &lt;enumeration value="INSU"/&gt;
 *     &lt;enumeration value="FUNA"/&gt;
 *     &lt;enumeration value="FEES"/&gt;
 *     &lt;enumeration value="EXPN"/&gt;
 *     &lt;enumeration value="AFCO"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "InstalmentAmountDetailsType1Code")
@XmlEnum
public enum InstalmentAmountDetailsType1Code {


    /**
     * Instalment amount tax
     * 
     */
    TAXX,

    /**
     * Requested amount
     * 
     */
    RQST,

    /**
     * Grace period unit type
     * 
     */
    OTHP,

    /**
     * Grace period unit type
     * 
     */
    OTHN,

    /**
     * Other amounts
     * 
     */
    OTHC,

    /**
     * Insurance amount
     * 
     */
    INSU,

    /**
     * Funded amount
     * 
     */
    FUNA,

    /**
     * Fees amount
     * 
     */
    FEES,

    /**
     * Expense Amount
     * 
     */
    EXPN,

    /**
     * Total financing cost per annum.
     * 
     */
    AFCO;

    public String value() {
        return name();
    }

    public static InstalmentAmountDetailsType1Code fromValue(String v) {
        return valueOf(v);
    }

}
