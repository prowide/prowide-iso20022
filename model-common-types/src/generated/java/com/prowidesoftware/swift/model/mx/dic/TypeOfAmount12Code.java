
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TypeOfAmount12Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="TypeOfAmount12Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="AMTH"/&gt;
 *     &lt;enumeration value="DCNT"/&gt;
 *     &lt;enumeration value="ISCF"/&gt;
 *     &lt;enumeration value="CUAT"/&gt;
 *     &lt;enumeration value="MAXI"/&gt;
 *     &lt;enumeration value="AMTX"/&gt;
 *     &lt;enumeration value="AMTN"/&gt;
 *     &lt;enumeration value="AMTQ"/&gt;
 *     &lt;enumeration value="OTHN"/&gt;
 *     &lt;enumeration value="OTHP"/&gt;
 *     &lt;enumeration value="RQCH"/&gt;
 *     &lt;enumeration value="ANTA"/&gt;
 *     &lt;enumeration value="PDCC"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "TypeOfAmount12Code")
@XmlEnum
public enum TypeOfAmount12Code {


    /**
     * Transaction amount that has been authorised.
     * 
     */
    AMTH,

    /**
     * Discount, rebate or voucher, related to loyalty programs. This amount is counted as a negative amount.
     * 
     */
    DCNT,

    /**
     * Fee applied by the card issuer to the cardholder.
     * 
     */
    ISCF,

    /**
     * Contains the total amount of all authorisations related to the same cardholder purchase activities. Example: total of all incremental or splitted shipment authorisations for the same purchase.
     * 
     */
    CUAT,

    /**
     * Maximum amount (the final amount must be less or equal).
     * 
     */
    MAXI,

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
     * Other type of amount defined at national level.
     * 
     */
    OTHN,

    /**
     * Other type of amount defined at private level.
     * 
     */
    OTHP,

    /**
     * Requested cashback amount
     * 
     */
    RQCH,

    /**
     * Amount anticipated for the transaction
     * 
     */
    ANTA,

    /**
     * Local amount before DCC (Dynamic Currency Conversion) was applied.
     * 
     */
    PDCC;

    public String value() {
        return name();
    }

    public static TypeOfAmount12Code fromValue(String v) {
        return valueOf(v);
    }

}
