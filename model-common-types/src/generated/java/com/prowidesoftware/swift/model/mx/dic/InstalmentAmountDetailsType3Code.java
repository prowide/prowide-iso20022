
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for InstalmentAmountDetailsType3Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="InstalmentAmountDetailsType3Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="AFCO"/&gt;
 *     &lt;enumeration value="EXPN"/&gt;
 *     &lt;enumeration value="FEES"/&gt;
 *     &lt;enumeration value="FUNA"/&gt;
 *     &lt;enumeration value="INSU"/&gt;
 *     &lt;enumeration value="INTR"/&gt;
 *     &lt;enumeration value="OTHC"/&gt;
 *     &lt;enumeration value="OTHN"/&gt;
 *     &lt;enumeration value="OTHP"/&gt;
 *     &lt;enumeration value="PRNC"/&gt;
 *     &lt;enumeration value="RQST"/&gt;
 *     &lt;enumeration value="TAXX"/&gt;
 *     &lt;enumeration value="DCNT"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "InstalmentAmountDetailsType3Code")
@XmlEnum
public enum InstalmentAmountDetailsType3Code {


    /**
     * Total financing cost per annum.
     * 
     */
    AFCO,

    /**
     * Expense Amount
     * 
     */
    EXPN,

    /**
     * Fees amount
     * 
     */
    FEES,

    /**
     * Funded amount
     * 
     */
    FUNA,

    /**
     * Insurance amount
     * 
     */
    INSU,

    /**
     * Interest amount.
     * 
     */
    INTR,

    /**
     * Other amounts
     * 
     */
    OTHC,

    /**
     * Grace period unit type
     * 
     */
    OTHN,

    /**
     * Grace period unit type
     * 
     */
    OTHP,

    /**
     * Principal amount.
     * 
     */
    PRNC,

    /**
     * Requested amount
     * 
     */
    RQST,

    /**
     * Instalment amount tax
     * 
     */
    TAXX,

    /**
     * Discount.
     * 
     */
    DCNT;

    public String value() {
        return name();
    }

    public static InstalmentAmountDetailsType3Code fromValue(String v) {
        return valueOf(v);
    }

}
