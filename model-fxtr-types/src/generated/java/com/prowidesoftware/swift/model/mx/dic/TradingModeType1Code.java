
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TradingModeType1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="TradingModeType1Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="QUDR"/&gt;
 *     &lt;enumeration value="ORDR"/&gt;
 *     &lt;enumeration value="NETR"/&gt;
 *     &lt;enumeration value="AUCT"/&gt;
 *     &lt;enumeration value="MARC"/&gt;
 *     &lt;enumeration value="BILA"/&gt;
 *     &lt;enumeration value="ANON"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "TradingModeType1Code")
@XmlEnum
public enum TradingModeType1Code {


    /**
     * Members could click When market makers quote continuously,or enter RFQ trading process, and make a deal with market makers finally.
     * 
     */
    QUDR,

    /**
     * Using matchmaking mechanism to match orders which are submitted by members.
     * 
     */
    ORDR,

    /**
     * Members send advertisements, and then other members could enter negotiation trade process. In the negotiation trade process, the member completes product elements and submits, and the counterpart just confirms the deal to make a negotiation trade.
     * 
     */
    NETR,

    /**
     * When issuer issues the deposits, market members subscribe the deposits.  
     * 
     */
    AUCT,

    /**
     * Trades are executed through matching system.
     * 
     */
    MARC,

    /**
     * Counterparties neogiate trading details to execute trades. .
     * 
     */
    BILA,

    /**
     * Trades are executed anonymously to each counterparty, based on rule "pritority of price and time" to match trade.
     * 
     */
    ANON;

    public String value() {
        return name();
    }

    public static TradingModeType1Code fromValue(String v) {
        return valueOf(v);
    }

}
