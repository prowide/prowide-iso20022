
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Qualifier1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="Qualifier1Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="ALNO"/&gt;
 *     &lt;enumeration value="MOCE"/&gt;
 *     &lt;enumeration value="CLOS"/&gt;
 *     &lt;enumeration value="VWAP"/&gt;
 *     &lt;enumeration value="ITOW"/&gt;
 *     &lt;enumeration value="LIMI"/&gt;
 *     &lt;enumeration value="MOBH"/&gt;
 *     &lt;enumeration value="OPEN"/&gt;
 *     &lt;enumeration value="POSI"/&gt;
 *     &lt;enumeration value="MAKT"/&gt;
 *     &lt;enumeration value="RTRA"/&gt;
 *     &lt;enumeration value="POSH"/&gt;
 *     &lt;enumeration value="TDAY"/&gt;
 *     &lt;enumeration value="VERS"/&gt;
 *     &lt;enumeration value="AWAY"/&gt;
 *     &lt;enumeration value="CROS"/&gt;
 *     &lt;enumeration value="MIDP"/&gt;
 *     &lt;enumeration value="PREO"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "Qualifier1Code")
@XmlEnum
public enum Qualifier1Code {


    /**
     * A limit order that is to be executed in its entirety or not at all (no partial transaction), and thus is testing the strength/conviction of the counterparty.  Unlike a fill or kill order, all or none orders are not to be treated as cancelled if not executed as soon as it is represented in the trading crowd.  Instead it remains alive until executed or cancelled.  The making of "all or none" bids or offers in stocks is prohibited, and the making of "all or none" bids or offers in bonds is subject to the restrictions of Rule 61.
     * 
     */
    ALNO,

    /**
     * An order to trade stocks, options, or futures as close as possible to the market close.
     * 
     */
    MOCE,

    /**
     * An all or none market order that is to be executed at the closing price of the security on the exchange.  If the execution cannot be made under this condition, the order is to be treated as cancelled.
     * 
     * Note that this attribute does not apply to trading of fixed income securities.
     * 
     */
    CLOS,

    /**
     * A trading benchmark particularly used in pension plans. Calculated by adding up the dollars traded for every transaction (price times shares traded) and then dividing by the total shares traded for the day for the particular security.
     * 
     */
    VWAP,

    /**
     * Having a sell inquiry in a security (not a firm customer sell order), often entailing a capital commitment.
     * 
     */
    ITOW,

    /**
     * An order to buy a stock at or below a specified price, or to sell a stock at or above a specified price.  The customer specifies a price, and the order can be executed only if the market reaches or betters that price.  A conditional trading order designed to avoid the danger of adverse unexpected price movements.
     * 
     */
    LIMI,

    /**
     * More security exists to be bought or sold by the same buyer or seller, respectively.  Often, the buyer or seller does not disclose the full size of his buy or sell interest as not to affect the market adversely.
     * 
     * Information that the execution is taking place in waves/iceberg.
     * 
     */
    MOBH,

    /**
     * An order that is to be executed at the opening (and corresponding price) of the security or not at all, and any such order or portion thereof not executed is to be treated as cancelled.
     * 
     */
    OPEN,

    /**
     * A market commitment to purchase or sell securities.
     * 
     */
    POSI,

    /**
     * An order to buy or sell a security at the most advantageous price obtainable after the order is represented in the trading crowd.  Other special restrictions, such as all or none (AON) or good 'til cancelled (GTC), cannot be specified on a market order.
     * 
     */
    MAKT,

    /**
     * All of the information necessary to generate an order is present and is considered an offer.
     * 
     */
    RTRA,

    /**
     * A collection of investments, real and/or financial, with distribution by geographic region or by asset type of the portfolio's holdings.
     * 
     */
    POSH,

    /**
     * Working the order through the day.
     * 
     */
    TDAY,

    /**
     * Indication sent versus the current quote.
     * 
     */
    VERS,

    /**
     * Transacting with another broker/dealer.
     * 
     */
    AWAY,

    /**
     * Securities transaction in which the same broker acts as agent for both sides of the trade; a legal practice only if the broker first offers the securities publicly at a price higher than the bid.
     * 
     */
    CROS,

    /**
     * An all or none market order that is to be executed at the mid price spread of the security on the exchange.  If the execution cannot be made under this condition, the order is to be treated as cancelled.
     * 
     */
    MIDP,

    /**
     * Price of security prior to a market opening.
     * 
     */
    PREO;

    public String value() {
        return name();
    }

    public static Qualifier1Code fromValue(String v) {
        return valueOf(v);
    }

}
