
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TypeOfAmount5Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="TypeOfAmount5Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="CSHB"/>
 *     <enumeration value="DCNT"/>
 *     <enumeration value="FEES"/>
 *     <enumeration value="GRTY"/>
 *     <enumeration value="SRCH"/>
 *     <enumeration value="VATX"/>
 *     <enumeration value="COMM"/>
 *     <enumeration value="DONN"/>
 *     <enumeration value="TAXT"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
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
