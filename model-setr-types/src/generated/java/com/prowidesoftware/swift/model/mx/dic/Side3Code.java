
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Side3Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="Side3Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="BUYI"/&gt;
 *     &lt;enumeration value="SELL"/&gt;
 *     &lt;enumeration value="CROS"/&gt;
 *     &lt;enumeration value="CRSH"/&gt;
 *     &lt;enumeration value="CSHE"/&gt;
 *     &lt;enumeration value="DEFI"/&gt;
 *     &lt;enumeration value="OPPO"/&gt;
 *     &lt;enumeration value="UNDI"/&gt;
 *     &lt;enumeration value="TWOS"/&gt;
 *     &lt;enumeration value="BUMI"/&gt;
 *     &lt;enumeration value="SEPL"/&gt;
 *     &lt;enumeration value="SESH"/&gt;
 *     &lt;enumeration value="SSEX"/&gt;
 *     &lt;enumeration value="LEND"/&gt;
 *     &lt;enumeration value="BORW"/&gt;
 *     &lt;enumeration value="OPEX"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "Side3Code")
@XmlEnum
public enum Side3Code {


    /**
     * Order is buy driven.
     * 
     */
    BUYI,

    /**
     * Order is sell driven.
     * 
     */
    SELL,

    /**
     * Identifies an order for which a broker wishes to take the other side and cross with the client.
     * 
     */
    CROS,

    /**
     * Identifies a type of order for which a broker wants to cross with the client in the case a client wants to establish a short position, and sends a Sell Short order to the broker. Many exchanges have tick rules needing to be enforced, and the order getting converted from Sell Short to Cross (instead of Cross Short) could result in an illegal short sell.
     * 
     */
    CRSH,

    /**
     * Identifies a type of order for which a broker wants to cross with the client in the case a client wants to establish a short position and is exempt from the uptick restriction. Used as audit trail on exchanges.
     * 
     */
    CSHE,

    /**
     * Indicates, in the case of a multileg instrument,that the sides of the legs are the same as defined at the creation of the multileg instrument.
     * 
     */
    DEFI,

    /**
     * Indicates, in the case of a multileg instrument,that the sides of the legs are the opposite of their definition at the creation of the multileg instrument.
     * 
     */
    OPPO,

    /**
     * The side of the indication of interest is not disclosed.
     * 
     */
    UNDI,

    /**
     * Indicates that the side refers to both buys and sells.
     * 
     */
    TWOS,

    /**
     * A round-lot market order to buy minus is an order to buy a stated amount of a stock provided that its price is: 
     * - not higher than the last sale if the last sale was a minus or zero minus tick and
     * - not higher than the last sale minus the minimum fractional change in the stock if the last sale was a plus or zero plus tick.
     * A limit price order to buy minus also states the highest price at which it can be executed.
     * 
     */
    BUMI,

    /**
     * A round-lot market order to sell plus is an order to sell a stated amount of a stock provided that its price is: 
     * - not lower than the last sale if the last sale was a plus or zero plus tick and
     * - not lower than the last sale minus the minimum fractional change in the stock if the last sale was a minus or zero minus tick.
     * A limit-price order to sell plus also states the lowest price at which it can be executed.
     * 
     */
    SEPL,

    /**
     * An order to sell a security that the seller does not own; a sale effected by delivering a security borrowed by, or for the account of, the seller. Can only be executed on a plus or zero plus tick.
     * 
     */
    SESH,

    /**
     * Short sale exempt from short-sale rules.
     * 
     */
    SSEX,

    /**
     * Order is to lend securities.
     * 
     */
    LEND,

    /**
     * Order is to borrow securities.
     * 
     */
    BORW,

    /**
     * Exercise of an option contract.
     * 
     */
    OPEX;

    public String value() {
        return name();
    }

    public static Side3Code fromValue(String v) {
        return valueOf(v);
    }

}
