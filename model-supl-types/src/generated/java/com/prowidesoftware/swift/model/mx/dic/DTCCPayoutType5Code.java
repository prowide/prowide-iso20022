
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DTCCPayoutType5Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="DTCCPayoutType5Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="CAPG"/&gt;
 *     &lt;enumeration value="CASH"/&gt;
 *     &lt;enumeration value="DIVI"/&gt;
 *     &lt;enumeration value="INTR"/&gt;
 *     &lt;enumeration value="LTCG"/&gt;
 *     &lt;enumeration value="PREM"/&gt;
 *     &lt;enumeration value="PRPL"/&gt;
 *     &lt;enumeration value="ROCA"/&gt;
 *     &lt;enumeration value="STCG"/&gt;
 *     &lt;enumeration value="TXCR"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "DTCCPayoutType5Code")
@XmlEnum
public enum DTCCPayoutType5Code {


    /**
     * Distribution of earnings to shareholders categorized by the company as capital gains.
     * 
     */
    CAPG,

    /**
     * Payout consisting of cash.
     * 
     */
    CASH,

    /**
     * Distribution of earnings to shareholders categorised by company as dividend.
     * 
     */
    DIVI,

    /**
     * Cash payment on a debt instrument calculated using the coupon rate, principal and period of time.
     * 
     */
    INTR,

    /**
     * Distribution of earnings to shareholders categorized by the company as long-term capital gains.
     * 
     */
    LTCG,

    /**
     * Cash payment that is categorised by the issuer as premium, usually offered as incentive for early participation in an offer.
     * 
     */
    PREM,

    /**
     * Cash payment on a debt instrument that represents a return of principal to the holder.
     * 
     */
    PRPL,

    /**
     * Distribution that doesn't represent earnings and is categorized by the company as return of capital.
     * 
     */
    ROCA,

    /**
     * Distribution of earnings to shareholders categorized by the company as short-term capital gains.
     * 
     */
    STCG,

    /**
     * Payout consisting of a tax credit.
     * 
     */
    TXCR;

    public String value() {
        return name();
    }

    public static DTCCPayoutType5Code fromValue(String v) {
        return valueOf(v);
    }

}
