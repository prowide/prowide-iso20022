
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TradeTransactionCondition2Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="TradeTransactionCondition2Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="SPCC"/>
 *     <enumeration value="SECN"/>
 *     <enumeration value="SEBN"/>
 *     <enumeration value="SCBN"/>
 *     <enumeration value="SCRT"/>
 *     <enumeration value="SERT"/>
 *     <enumeration value="SCCR"/>
 *     <enumeration value="SECR"/>
 *     <enumeration value="CAST"/>
 *     <enumeration value="SPPR"/>
 *     <enumeration value="SPCU"/>
 *     <enumeration value="SPEX"/>
 *     <enumeration value="GTDL"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "TradeTransactionCondition2Code")
@XmlEnum
public enum TradeTransactionCondition2Code {


    /**
     * Indicates whether the trade is executed with a special cum coupon.
     * 
     */
    SPCC,

    /**
     * Indicates whether the trade is executed with a special ex coupon.
     * 
     */
    SECN,

    /**
     * Indicates whether the trade is executed special ex bonus.
     * 
     */
    SEBN,

    /**
     * Indicates whether the trade is executed special cum bonus.
     * 
     */
    SCBN,

    /**
     * Indicates whether the trade is executed special cum rights.
     * 
     */
    SCRT,

    /**
     * Indicates whether the trade is executed special ex rights.
     * 
     */
    SERT,

    /**
     * Indicates whether the trade is executed special cum capital repayments.
     * 
     */
    SCCR,

    /**
     * Indicates whether the trade is executed special ex capital repayments.
     * 
     */
    SECR,

    /**
     * Indicates whether the trade is executed with a cash settlement.
     * 
     */
    CAST,

    /**
     * Indicates whether the trade is executed with a special price.
     * 
     */
    SPPR,

    /**
     * Indicates whether the trade is executed with a special cum 
     * dividend, that is, buying after the ex date and getting the dividend.
     * 
     */
    SPCU,

    /**
     * Indicates whether the trade is executed with a special ex 
     * dividend, that is, selling before the ex date without the coupon.
     * 
     */
    SPEX,

    /**
     * Indicates whether the delivery of the financial instrument on settlement date 
     * is guaranteed.
     * 
     */
    GTDL;

    public String value() {
        return name();
    }

    public static TradeTransactionCondition2Code fromValue(String v) {
        return valueOf(v);
    }

}
