
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CustomerHandlingInstructions1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="CustomerHandlingInstructions1Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="FIKI"/>
 *     <enumeration value="IOCA"/>
 *     <enumeration value="ALON"/>
 *     <enumeration value="SCAL"/>
 *     <enumeration value="WORK"/>
 *     <enumeration value="ADOO"/>
 *     <enumeration value="EFPH"/>
 *     <enumeration value="IMBO"/>
 *     <enumeration value="PGGD"/>
 *     <enumeration value="NOHE"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "CustomerHandlingInstructions1Code")
@XmlEnum
public enum CustomerHandlingInstructions1Code {


    /**
     * Market or limit order that is to be executed in its entirety as soon as it is submitted; if not so executed, the order is to be cancelled.
     * 
     */
    FIKI,

    /**
     * Market or limit order to be executed in whole or in part as soon as it is submitted; any portion not so executed is to be cancelled.
     * 
     */
    IOCA,

    /**
     * Round-lot market or limit-price order that must be executed in its entirety or not at all; unlike Fill or Kill orders, All Or None orders are not treated as canceled if they are not executed as soon as represented in the Trading Crowd.
     * 
     */
    ALON,

    /**
     * Order to buy (or sell) a financial instrument which specifies the total amount to be bought (or sold) and the amount to be bought (or sold) at specified price variations.
     * 
     */
    SCAL,

    /**
     * Make the order active until notified.
     * 
     */
    WORK,

    /**
     * Add on another order.
     * 
     */
    ADOO,

    /**
     * Indicates that a position in the underlying is traded for a futures position in the physical commodity markets.
     * 
     */
    EFPH,

    /**
     * Indicates that the order can only hit the imbalance during a call auction. The imbalance is the remaining quantity when other buy and sell orders are matched at the auction clearing price.
     * 
     */
    IMBO,

    /**
     * Limit order, where the limit price fluctuates relative to another quantity, such as the last sale, midpoint, opening price, bid, offer, or VWAP (Volume Weighted Average Price).
     * 
     */
    PGGD,

    /**
     * Indicates an order which may be executed in partials or outside the hours of the exchange or other exchange rules.
     * 
     */
    NOHE;

    public String value() {
        return name();
    }

    public static CustomerHandlingInstructions1Code fromValue(String v) {
        return valueOf(v);
    }

}
