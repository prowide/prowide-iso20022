
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TradingMethodType1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="TradingMethodType1Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="BITR"/>
 *     <enumeration value="CERB"/>
 *     <enumeration value="CUMA"/>
 *     <enumeration value="LIOR"/>
 *     <enumeration value="NETR"/>
 *     <enumeration value="ONCT"/>
 *     <enumeration value="QUAU"/>
 *     <enumeration value="TEAU"/>
 *     <enumeration value="ANCL"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "TradingMethodType1Code")
@XmlEnum
public enum TradingMethodType1Code {


    /**
     * Taker submits a bilateral request, maker replys the quotation, and taker accepts the quotation to complete a bilateral trade.
     * 
     */
    BITR,

    /**
     * Members submit orders, and trading system uses matchmaking mechanism of Centralized Price Bidding to match orders.
     * 
     * 
     */
    CERB,

    /**
     * Members submit orders, and trading system uses continuous matchmaking mechanism to match orders.
     * 
     * 
     */
    CUMA,

    /**
     * Member activate an order, and if order matches with market maker's quotationa, the order will be filled automatically.
     * 
     */
    LIOR,

    /**
     * Member completes product elements and submits, and the counterpart just confirms the deal to complete a negotiation trade.
     * 
     */
    NETR,

    /**
     * When market makers quote continuously, members could just click the quotation to make a deal with market makers.
     * 
     */
    ONCT,

    /**
     * Market members can click the predetermined price setted by issuer to make a deal， and then the subscription amount will deduct in time.
     * 
     * 
     */
    QUAU,

    /**
     * Administrator reviews the deposit that filled by issuer, and sends it to the tenderers as reference. Atfer this, the issuer confirms the tendering result.
     * 
     * 
     */
    TEAU,

    /**
     * Trades are executed any click anonymously.
     * 
     */
    ANCL;

    public String value() {
        return name();
    }

    public static TradingMethodType1Code fromValue(String v) {
        return valueOf(v);
    }

}
