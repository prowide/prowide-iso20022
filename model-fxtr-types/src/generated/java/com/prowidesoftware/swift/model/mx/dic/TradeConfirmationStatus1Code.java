
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TradeConfirmationStatus1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="TradeConfirmationStatus1Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="ALST"/>
 *     <enumeration value="CONF"/>
 *     <enumeration value="DISA"/>
 *     <enumeration value="EMCN"/>
 *     <enumeration value="MISM"/>
 *     <enumeration value="SCCN"/>
 *     <enumeration value="SNCC"/>
 *     <enumeration value="SNCN"/>
 *     <enumeration value="UNCN"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "TradeConfirmationStatus1Code")
@XmlEnum
public enum TradeConfirmationStatus1Code {


    /**
     * All current status of the trade.
     * 
     */
    ALST,

    /**
     * Trades are confirmed by Central Matching Utility (analogous to virtual matching utility).
     * 
     */
    CONF,

    /**
     * Trade information of the both trading member is unmatched.
     * 
     */
    DISA,

    /**
     * Central Matching Utility (analogous to virtual matching utility) confirms trades in contingency.
     * 
     */
    EMCN,

    /**
     * Trade information between Central Matching Utility(analogous to virtual matching utility) and the trading member is mismatched.
     * 
     */
    MISM,

    /**
     * Home party has confirmed, but couterparty is unrecognized.
     * 
     */
    SCCN,

    /**
     * Home party has not confirmed, but couterparty is recognized.
     * 
     */
    SNCC,

    /**
     * Both the two parties are not confirmed.
     * 
     */
    SNCN,

    /**
     * Trades are not confirmed by Central Matching Utility(analogous to virtual matching utility).
     * 
     */
    UNCN;

    public String value() {
        return name();
    }

    public static TradeConfirmationStatus1Code fromValue(String v) {
        return valueOf(v);
    }

}
