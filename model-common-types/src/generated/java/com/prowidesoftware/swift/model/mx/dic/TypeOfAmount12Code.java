
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TypeOfAmount12Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="TypeOfAmount12Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="AMTH"/>
 *     <enumeration value="DCNT"/>
 *     <enumeration value="ISCF"/>
 *     <enumeration value="CUAT"/>
 *     <enumeration value="MAXI"/>
 *     <enumeration value="AMTX"/>
 *     <enumeration value="AMTN"/>
 *     <enumeration value="AMTQ"/>
 *     <enumeration value="OTHN"/>
 *     <enumeration value="OTHP"/>
 *     <enumeration value="RQCH"/>
 *     <enumeration value="ANTA"/>
 *     <enumeration value="PDCC"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
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
