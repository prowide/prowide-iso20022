
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SettlementInstructionReason1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="SettlementInstructionReason1Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="CSHI"/&gt;
 *     &lt;enumeration value="ALLL"/&gt;
 *     &lt;enumeration value="CSHO"/&gt;
 *     &lt;enumeration value="CHAR"/&gt;
 *     &lt;enumeration value="DIVI"/&gt;
 *     &lt;enumeration value="INTE"/&gt;
 *     &lt;enumeration value="SAVP"/&gt;
 *     &lt;enumeration value="REDM"/&gt;
 *     &lt;enumeration value="SAVE"/&gt;
 *     &lt;enumeration value="BUYI"/&gt;
 *     &lt;enumeration value="SELL"/&gt;
 *     &lt;enumeration value="SUBS"/&gt;
 *     &lt;enumeration value="WTHP"/&gt;
 *     &lt;enumeration value="CORP"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "SettlementInstructionReason1Code")
@XmlEnum
public enum SettlementInstructionReason1Code {


    /**
     * Settlement of all credit amounts.
     * 
     */
    CSHI,

    /**
     * Settlement of all credit and debit amounts.
     * 
     */
    ALLL,

    /**
     * Settlement of all debit amounts.
     * 
     */
    CSHO,

    /**
     * Settlement of charges.
     * 
     */
    CHAR,

    /**
     * Settlement of dividends.
     * 
     */
    DIVI,

    /**
     * Settlement of interest.
     * 
     */
    INTE,

    /**
     * Settlement of investments to a savings plan.
     * 
     */
    SAVP,

    /**
     * Settlement of redemptions or redemption legs of a switch transaction.
     * 
     */
    REDM,

    /**
     * Settlement of investments to a savings plan and withdrawals from a savings plan.
     * 
     */
    SAVE,

    /**
     * Settlement of securities purchases.
     * 
     */
    BUYI,

    /**
     * Settlement of securities sales.
     * 
     */
    SELL,

    /**
     * Settlement of subscriptions or subscription legs of a switch transaction.
     * 
     */
    SUBS,

    /**
     * Settlement of withdrawals from a savings plan.
     * 
     */
    WTHP,

    /**
     * Settlement of corporate actions.
     * 
     */
    CORP;

    public String value() {
        return name();
    }

    public static SettlementInstructionReason1Code fromValue(String v) {
        return valueOf(v);
    }

}
