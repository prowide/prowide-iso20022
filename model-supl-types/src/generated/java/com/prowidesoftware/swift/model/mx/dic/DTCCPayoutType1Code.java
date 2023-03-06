
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DTCCPayoutType1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="DTCCPayoutType1Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="CASH"/&gt;
 *     &lt;enumeration value="DIVI"/&gt;
 *     &lt;enumeration value="ROCA"/&gt;
 *     &lt;enumeration value="STCG"/&gt;
 *     &lt;enumeration value="LTCG"/&gt;
 *     &lt;enumeration value="CAPG"/&gt;
 *     &lt;enumeration value="PREM"/&gt;
 *     &lt;enumeration value="PRPL"/&gt;
 *     &lt;enumeration value="INTR"/&gt;
 *     &lt;enumeration value="FLFR"/&gt;
 *     &lt;enumeration value="UNFR"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "DTCCPayoutType1Code")
@XmlEnum
public enum DTCCPayoutType1Code {


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
     * Distribution that doesn't represent earnings and is categorised by the company as return of capital.
     * 
     */
    ROCA,

    /**
     * Distribution of earnings to shareholders categorised by the company as short-term capital gains.
     * 
     */
    STCG,

    /**
     * Distribution of earnings to shareholders categorised by the company as long-term capital gains.
     * 
     */
    LTCG,

    /**
     * Distribution of earnings to shareholders categorised by the company as capital gains.
     * 
     */
    CAPG,

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
     * Cash payment on a debt instrument calculated using the coupon rate, principal and period of time.
     * 
     */
    INTR,

    /**
     * In some markets, companies further categorize dividends as franked or unfranked. "Franked" means that a tax credit is attached to that part of the dividend.
     * 
     */
    FLFR,

    /**
     * In some markets, companies further categorize dividends as franked or unfranked. "Unfranked" means that there is no tax credit attached to the dividend.
     * 
     */
    UNFR;

    public String value() {
        return name();
    }

    public static DTCCPayoutType1Code fromValue(String v) {
        return valueOf(v);
    }

}
