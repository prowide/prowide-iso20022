
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DTCCPayoutType5Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="DTCCPayoutType5Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="CAPG"/>
 *     <enumeration value="CASH"/>
 *     <enumeration value="DIVI"/>
 *     <enumeration value="INTR"/>
 *     <enumeration value="LTCG"/>
 *     <enumeration value="PREM"/>
 *     <enumeration value="PRPL"/>
 *     <enumeration value="ROCA"/>
 *     <enumeration value="STCG"/>
 *     <enumeration value="TXCR"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "DTCCPayoutType5Code")
@XmlEnum
public enum DTCCPayoutType5Code {


    /**
     * Distribution of earnings to shareholders categorised by the company as capital gains.
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
     * Distribution of earnings to shareholders categorised by the company as long-term capital gains.
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
