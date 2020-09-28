
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TradeTransactionCondition2Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="TradeTransactionCondition2Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="SPCC"/&gt;
 *     &lt;enumeration value="SECN"/&gt;
 *     &lt;enumeration value="SEBN"/&gt;
 *     &lt;enumeration value="SCBN"/&gt;
 *     &lt;enumeration value="SCRT"/&gt;
 *     &lt;enumeration value="SERT"/&gt;
 *     &lt;enumeration value="SCCR"/&gt;
 *     &lt;enumeration value="SECR"/&gt;
 *     &lt;enumeration value="CAST"/&gt;
 *     &lt;enumeration value="SPPR"/&gt;
 *     &lt;enumeration value="SPCU"/&gt;
 *     &lt;enumeration value="SPEX"/&gt;
 *     &lt;enumeration value="GTDL"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
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
     * Indicates whether the trade is executed  with a special cum 
     * dividend, ie, buying after the ex date and getting the dividend.
     * 
     */
    SPCU,

    /**
     * Indicates whether the trade is executed  with a special ex 
     * dividend, ie, selling before the ex date without the coupon.
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
