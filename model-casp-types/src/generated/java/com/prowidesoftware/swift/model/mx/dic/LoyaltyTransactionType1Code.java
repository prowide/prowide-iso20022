
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for LoyaltyTransactionType1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="LoyaltyTransactionType1Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="AWRD"/&gt;
 *     &lt;enumeration value="AWRR"/&gt;
 *     &lt;enumeration value="REBR"/&gt;
 *     &lt;enumeration value="REBA"/&gt;
 *     &lt;enumeration value="REDE"/&gt;
 *     &lt;enumeration value="REDR"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "LoyaltyTransactionType1Code")
@XmlEnum
public enum LoyaltyTransactionType1Code {


    /**
     * Direct or payment related award on a loyalty account. Award alone, award associated to a payment (may be with an additional award alone), award because of 	a payment resulting on rebates.
     * 
     */
    AWRD,

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
     * Refund of a loyalty redemption transaction.
     * 
     */
    REDR;

    public String value() {
        return name();
    }

    public static LoyaltyTransactionType1Code fromValue(String v) {
        return valueOf(v);
    }

}
