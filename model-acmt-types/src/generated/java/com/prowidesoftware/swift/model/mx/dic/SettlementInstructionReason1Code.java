
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SettlementInstructionReason1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="SettlementInstructionReason1Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="CSHI"/>
 *     <enumeration value="ALLL"/>
 *     <enumeration value="CSHO"/>
 *     <enumeration value="CHAR"/>
 *     <enumeration value="DIVI"/>
 *     <enumeration value="INTE"/>
 *     <enumeration value="SAVP"/>
 *     <enumeration value="REDM"/>
 *     <enumeration value="SAVE"/>
 *     <enumeration value="BUYI"/>
 *     <enumeration value="SELL"/>
 *     <enumeration value="SUBS"/>
 *     <enumeration value="WTHP"/>
 *     <enumeration value="CORP"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
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
