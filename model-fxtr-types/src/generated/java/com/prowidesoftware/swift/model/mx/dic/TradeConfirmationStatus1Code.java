
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TradeConfirmationStatus1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="TradeConfirmationStatus1Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="ALST"/&gt;
 *     &lt;enumeration value="CONF"/&gt;
 *     &lt;enumeration value="DISA"/&gt;
 *     &lt;enumeration value="EMCN"/&gt;
 *     &lt;enumeration value="MISM"/&gt;
 *     &lt;enumeration value="SCCN"/&gt;
 *     &lt;enumeration value="SNCC"/&gt;
 *     &lt;enumeration value="SNCN"/&gt;
 *     &lt;enumeration value="UNCN"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
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
