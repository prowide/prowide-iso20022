
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for LoyaltyTypeTransactionTotals1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="LoyaltyTypeTransactionTotals1Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="AWRD"/&gt;
 *     &lt;enumeration value="REBA"/&gt;
 *     &lt;enumeration value="REDE"/&gt;
 *     &lt;enumeration value="AWRR"/&gt;
 *     &lt;enumeration value="REBR"/&gt;
 *     &lt;enumeration value="REDR"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
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
