
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TypeOfAmount6Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="TypeOfAmount6Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="ATMF"/&gt;
 *     &lt;enumeration value="AMTH"/&gt;
 *     &lt;enumeration value="CRDB"/&gt;
 *     &lt;enumeration value="DCNT"/&gt;
 *     &lt;enumeration value="FEES"/&gt;
 *     &lt;enumeration value="AMTX"/&gt;
 *     &lt;enumeration value="AMTN"/&gt;
 *     &lt;enumeration value="AMTQ"/&gt;
 *     &lt;enumeration value="SRCH"/&gt;
 *     &lt;enumeration value="VATX"/&gt;
 *     &lt;enumeration value="COMI"/&gt;
 *     &lt;enumeration value="FEEI"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "TypeOfAmount6Code")
@XmlEnum
public enum TypeOfAmount6Code {


    /**
     * Commission that the issuer will charge to the cardholder, which should be shown and accepted by the cardholder before the money is disbursed.
     * 
     */
    ATMF,

    /**
     * Transaction amount that has been authorised.
     * 
     */
    AMTH,

    /**
     * Remaining allowed amount for this type of transaction with this card, after the transaction, until the end of the card limit period.
     * 
     */
    CRDB,

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
     * Maximum amount allowed for the transaction in the transaction amount currency if the transaction amount of the request was declined.
     * 
     */
    AMTX,

    /**
     * Minimum amount allowed in the TransactionAmount currency if the transaction amount of the request was declined.
     * 
     */
    AMTN,

    /**
     * Transaction amount that has been requested to be authorised.
     * 
     */
    AMTQ,

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
     * Commission from the card issuer.
     * 
     */
    COMI,

    /**
     * Fees amount from the card issuer.
     * 
     */
    FEEI;

    public String value() {
        return name();
    }

    public static TypeOfAmount6Code fromValue(String v) {
        return valueOf(v);
    }

}
