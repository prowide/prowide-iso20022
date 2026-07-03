
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TypeOfAmount5Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="TypeOfAmount5Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="CSHB"/&gt;
 *     &lt;enumeration value="DCNT"/&gt;
 *     &lt;enumeration value="FEES"/&gt;
 *     &lt;enumeration value="GRTY"/&gt;
 *     &lt;enumeration value="SRCH"/&gt;
 *     &lt;enumeration value="VATX"/&gt;
 *     &lt;enumeration value="COMM"/&gt;
 *     &lt;enumeration value="DONN"/&gt;
 *     &lt;enumeration value="TAXT"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "TypeOfAmount5Code")
@XmlEnum
public enum TypeOfAmount5Code {


    /**
     * Cash-back amount.
     * 
     */
    CSHB,

    /**
     * Discount, rebate or voucher, related to loyalty programs. This amount is counted as a negative amount.
     * 
     */
    DCNT,

    /**
     * Fees.
     * 
     */
    FEES,

    /**
     * Gratuity amount.
     * 
     */
    GRTY,

    /**
     * Extra fee for a purchase or a withdrawal.
     * 
     */
    SRCH,

    /**
     * Value added tax amount.
     * 
     */
    VATX,

    /**
     * Commission, for example for DCC (Dynamic Currency Conversion) transactions.
     * 
     */
    COMM,

    /**
     * Donation amount.
     * 
     */
    DONN,

    /**
     * Taxes applicable to the transaction.
     * 
     */
    TAXT;

    public String value() {
        return name();
    }

    public static TypeOfAmount5Code fromValue(String v) {
        return valueOf(v);
    }

}
