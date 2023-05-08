
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for InvestmentFundTransactionType1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="InvestmentFundTransactionType1Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="ALLL"/>
 *     <enumeration value="SELL"/>
 *     <enumeration value="BUYI"/>
 *     <enumeration value="SWIO"/>
 *     <enumeration value="TRIN"/>
 *     <enumeration value="TOUT"/>
 *     <enumeration value="SUBS"/>
 *     <enumeration value="REDM"/>
 *     <enumeration value="CDEP"/>
 *     <enumeration value="CWIT"/>
 *     <enumeration value="DIVP"/>
 *     <enumeration value="CAEV"/>
 *     <enumeration value="CROI"/>
 *     <enumeration value="CROO"/>
 *     <enumeration value="DIVI"/>
 *     <enumeration value="INSP"/>
 *     <enumeration value="OTHR"/>
 *     <enumeration value="REAA"/>
 *     <enumeration value="RWPL"/>
 *     <enumeration value="RDIV"/>
 *     <enumeration value="SSPL"/>
 *     <enumeration value="SUAA"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "InvestmentFundTransactionType1Code")
@XmlEnum
public enum InvestmentFundTransactionType1Code {


    /**
     * All types of transactions.
     * 
     */
    ALLL,

    /**
     * Sale of securities.
     * 
     */
    SELL,

    /**
     * Purchase of securities.
     * 
     */
    BUYI,

    /**
     * Transaction is a subscription leg of a switch order execution.
     * 
     */
    SWIO,

    /**
     * Transaction is an incoming credit to an account on the shareholders register, and is not linked to a shift in investment (subscription or switch), but to account management.
     * 
     */
    TRIN,

    /**
     * Transaction is a debit to an account on the shareholders register, and is not linked to a shift in investment (redemption or switch), but to account management.
     * 
     */
    TOUT,

    /**
     * Transaction is a subscription to an investment fund.
     * 
     */
    SUBS,

    /**
     * Transaction is a redemption of an investment fund.
     * 
     */
    REDM,

    /**
     * Transaction is a cash deposit.
     * 
     */
    CDEP,

    /**
     * Transaction is a cash withdrawal.
     * 
     */
    CWIT,

    /**
     * Transaction is the payment of dividends and other proceeds.
     * 
     */
    DIVP,

    /**
     * Transaction is the result of a corporate action.
     * 
     */
    CAEV,

    /**
     * Transaction is a cross-in.
     * 
     */
    CROI,

    /**
     * Transaction is a cross out.
     * 
     */
    CROO,

    /**
     * Transaction is a dividend.
     * 
     */
    DIVI,

    /**
     * Transaction is an InSpecie.
     * 
     */
    INSP,

    /**
     * Transaction is another type of transaction.
     * 
     */
    OTHR,

    /**
     * Transaction is a redemption in an asset allocation plan which enables investors to withdraw, by percentage a certain amount of cash from several sub-funds of a same umbrella structure.
     * 
     */
    REAA,

    /**
     * Transaction is a withdrawal by individuals in the framework of a structured plan for investments made in the past.
     * 
     */
    RWPL,

    /**
     * Transaction is a reinvestment of dividend.
     * 
     */
    RDIV,

    /**
     * Transaction is a subscription for a savings plan, that is, money set aside by individuals in the framework of a structured plan for a special purpose, for example, retirement.
     * 
     */
    SSPL,

    /**
     * Transaction is a subscription in an asset allocation plan that enables investors to allocate, by percentage a certain amount of cash into several sub-funds of a same umbrella structure.
     * 
     */
    SUAA;

    public String value() {
        return name();
    }

    public static InvestmentFundTransactionType1Code fromValue(String v) {
        return valueOf(v);
    }

}
