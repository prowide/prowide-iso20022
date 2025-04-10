
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for LoyaltyTypeTransactionTotals1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="LoyaltyTypeTransactionTotals1Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="AWRD"/>
 *     <enumeration value="REBA"/>
 *     <enumeration value="REDE"/>
 *     <enumeration value="AWRR"/>
 *     <enumeration value="REBR"/>
 *     <enumeration value="REDR"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "LoyaltyTypeTransactionTotals1Code")
@XmlEnum
public enum LoyaltyTypeTransactionTotals1Code {


    /**
     * Direct or payment related award on a loyalty account. Award alone, award associated to a payment (may be with an additional award alone), award because of a payment resulting on rebates.
     * 
     */
    AWRD,

    /**
     * Rebate on a total amount, sale item amount, or sale items.
     * 
     */
    REBA,

    /**
     * Redemption on a loyalty account.
     * 
     */
    REDE,

    /**
     * Refund of a loyalty award transaction.
     * 
     */
    AWRR,

    /**
     * Refund of a loyalty rebate transaction.
     * 
     */
    REBR,

    /**
     * Refund of a loyalty redemption transaction.
     * 
     */
    REDR;

    public String value() {
        return name();
    }

    public static LoyaltyTypeTransactionTotals1Code fromValue(String v) {
        return valueOf(v);
    }

}
