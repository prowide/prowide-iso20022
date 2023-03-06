
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for OrderType1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="OrderType1Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="ALNO"/&gt;
 *     &lt;enumeration value="BCSE"/&gt;
 *     &lt;enumeration value="BCSH"/&gt;
 *     &lt;enumeration value="BMIN"/&gt;
 *     &lt;enumeration value="CARE"/&gt;
 *     &lt;enumeration value="COMB"/&gt;
 *     &lt;enumeration value="DISC"/&gt;
 *     &lt;enumeration value="LMTO"/&gt;
 *     &lt;enumeration value="LIWI"/&gt;
 *     &lt;enumeration value="LIWO"/&gt;
 *     &lt;enumeration value="MRKT"/&gt;
 *     &lt;enumeration value="MANH"/&gt;
 *     &lt;enumeration value="MATH"/&gt;
 *     &lt;enumeration value="NOHE"/&gt;
 *     &lt;enumeration value="ORLI"/&gt;
 *     &lt;enumeration value="BAPR"/&gt;
 *     &lt;enumeration value="STOP"/&gt;
 *     &lt;enumeration value="STLI"/&gt;
 *     &lt;enumeration value="SLOS"/&gt;
 *     &lt;enumeration value="SPLU"/&gt;
 *     &lt;enumeration value="SSHO"/&gt;
 *     &lt;enumeration value="SSEX"/&gt;
 *     &lt;enumeration value="WTWO"/&gt;
 *     &lt;enumeration value="PRQT"/&gt;
 *     &lt;enumeration value="PRID"/&gt;
 *     &lt;enumeration value="FXSW"/&gt;
 *     &lt;enumeration value="FNRI"/&gt;
 *     &lt;enumeration value="MKLO"/&gt;
 *     &lt;enumeration value="PGGD"/&gt;
 *     &lt;enumeration value="COSE"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "OrderType1Code")
@XmlEnum
public enum OrderType1Code {


    /**
     * A round-lot market or limit price order that must be executed in its entirety or not at all; unlike fill or kill orders, all or none orders are not treated as canceled if they are not executed as soon as represented in the trading crowd.
     * 
     */
    ALNO,

    /**
     * A buy contra short exempt.
     * 
     */
    BCSE,

    /**
     * An order to buy contra short.
     * 
     */
    BCSH,

    /**
     * An order to buy at a price lower than the current market price. This is an order to buy a stated amount of a financial instrument provided that its price is not higher than the last sale if the last sale was a minus or zero minus tick, not higher than the last sale minus the minimum fractional change in the stock if the last sale was a plus or zero plus tick. The price limit indicates the highest price at which the order can be executed.
     * 
     */
    BMIN,

    /**
     * An order which is not to be executed as a whole if the executing broker judges that it may disturb the price.
     * 
     */
    CARE,

    /**
     * An order which is linked to another order to buy or sell and must be executed as a unit, both or none, or cancelled as a unit. The linkage sequence must be completed with a reference to the linked order.
     * 
     */
    COMB,

    /**
     * An order where the executing broker or investment manager decides on the quantity or price.
     * 
     */
    DISC,

    /**
     * An order to buy at the indicated price limit or lower or an order to sell at the indicated limit price or higher.
     * 
     */
    LMTO,

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
     * An order to buy or sell a specified amount of a financial instrument at the quoted market price or better.
     * 
     */
    MRKT,

    /**
     * An order to buy or sell a stated amount of a financial instrument at the quoted market price or better with some discretion on the price limit.
     * 
     */
    MANH,

    /**
     * An order which becomes a market order once the market price is reached.
     * 
     */
    MATH,

    /**
     * An order which may be executed in partials or outside the hours of the exchange or other exchange rules.
     * 
     */
    NOHE,

    /**
     * An order which is related to another order where the second part may be cancelled without canceling the first. In this case, the second order is identified as the second part. Normally the sell order must be executed before the buy order. The linkage sequence must be completed with a reference to the linked order.
     * 
     */
    ORLI,

    /**
     * A price established by joint agreement of odd-lot dealers for as illiquid financial instrument.
     * 
     */
    BAPR,

    /**
     * An order to buy which becomes a market order when the financial instrument trades at or above the stop price after the order is submitted or an order to sell which becomes a market order when the financial instrument trades at or below the stop price after the order is submitted.
     * 
     */
    STOP,

    /**
     * A stop order to buy which becomes a limit order at the limit price when the financial instrument trades at or above the stop price after the order is submitted. A stop order to sell which becomes a limit order at the limit price when the financial instrument trades at or below the stop price after the order is submitted.
     * 
     */
    STLI,

    /**
     * An order to sell that sets the sell price below the market price.
     * 
     */
    SLOS,

    /**
     * An order to sell a stated amount provided that the price is not lower than the last sale price if the last sale was a plus or zero plus tick and not lower than the last sale minus the minimum fractional change in the financial instrument if the last sale was a minus or zero minus tick.
     * 
     */
    SPLU,

    /**
     * An order to sell that the seller does not own; a sale effected by delivering a financial instrument borrowed by or for the account of the seller.
     * 
     */
    SSHO,

    /**
     * An order to sell short which is exempt from short-sale rules.
     * 
     */
    SSEX,

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
     * Indicates that the order is a counter order.
     * 
     */
    COSE;

    public String value() {
        return name();
    }

    public static OrderType1Code fromValue(String v) {
        return valueOf(v);
    }

}
