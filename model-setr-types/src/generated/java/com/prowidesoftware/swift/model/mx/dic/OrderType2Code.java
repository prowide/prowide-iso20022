
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for OrderType2Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="OrderType2Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="MRKT"/>
 *     <enumeration value="LMTO"/>
 *     <enumeration value="STOP"/>
 *     <enumeration value="LIWI"/>
 *     <enumeration value="LIWO"/>
 *     <enumeration value="BAPR"/>
 *     <enumeration value="MATH"/>
 *     <enumeration value="WTWO"/>
 *     <enumeration value="PRQT"/>
 *     <enumeration value="PRID"/>
 *     <enumeration value="FXSW"/>
 *     <enumeration value="FNRI"/>
 *     <enumeration value="MKLO"/>
 *     <enumeration value="PGGD"/>
 *     <enumeration value="SLOS"/>
 *     <enumeration value="STLI"/>
 *     <enumeration value="COSE"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "OrderType2Code")
@XmlEnum
public enum OrderType2Code {


    /**
     * An order to buy or sell a specified amount of a financial instrument at the quoted market price or better.
     * 
     */
    MRKT,

    /**
     * An order to buy at the indicated price limit or lower or an order to sell at the indicated limit price or higher.
     * 
     */
    LMTO,

    /**
     * An order to buy which becomes a market order when the financial instrument trades at or above the stop price after the order is submitted or an order to sell which becomes a market order when the financial instrument trades at or below the stop price after the order is submitted.
     * 
     */
    STOP,

    /**
     * An order to be executed at a limit price, with a round-lot (or board-lot) sales; valid only for odd lot orders.
     * 
     */
    LIWI,

    /**
     * An order to be executed at a limit price, without a round-lot (or board-lot) sales; valid only for odd lot orders.
     * 
     */
    LIWO,

    /**
     * A price established by joint agreement of odd-lot dealers for as illiquid financial instrument.
     * 
     */
    BAPR,

    /**
     * An order which becomes a market order once the market price is reached.
     * 
     */
    MATH,

    /**
     * An odd lot order filled on an effective round lot transaction, or on an effective bid or offer, whichever occurs first after the specialist receives the order. (e.g. NYSE order type).
     * 
     */
    WTWO,

    /**
     * An order sent in response to a Quote message.
     * 
     */
    PRQT,

    /**
     * An order sent in response to an Indication of Interest message.
     * 
     */
    PRID,

    /**
     * A "Swap" order for Foreign Exchange (currency trading).
     * 
     */
    FXSW,

    /**
     * Japanese term for an order to buy or sell a stated amount of a security at a specified limit price. Any unexecuted (leftover) quantity becomes a Market On Close order.
     * 
     */
    FNRI,

    /**
     * Indicates an order to buy or sell a stated amount of a security at the prevailing market price with any unexecuted (leftover) quantity becoming a Limit order at the last executed price.
     * 
     */
    MKLO,

    /**
     * Limit order, where the limit price fluctuates relative to another quantity, such as the last sale, midpoint, opening price, bid, offer, or VWAP (Volume Weighted Average Price).
     * 
     */
    PGGD,

    /**
     * An order to sell that sets the sell price below the market price.
     * 
     */
    SLOS,

    /**
     * A stop order to buy which becomes a limit order at the limit price when the financial instrument trades at or above the stop price after the order is submitted. A stop order to sell which becomes a limit order at the limit price when the financial instrument trades at or below the stop price after the order is submitted.
     * 
     */
    STLI,

    /**
     * Indicates that the order is a counter order.
     * 
     */
    COSE;

    public String value() {
        return name();
    }

    public static OrderType2Code fromValue(String v) {
        return valueOf(v);
    }

}
