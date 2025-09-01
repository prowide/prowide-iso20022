
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TypeOfPrice5Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="TypeOfPrice5Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="BIDE"/&gt;
 *     &lt;enumeration value="OFFR"/&gt;
 *     &lt;enumeration value="NAVL"/&gt;
 *     &lt;enumeration value="CREA"/&gt;
 *     &lt;enumeration value="CANC"/&gt;
 *     &lt;enumeration value="INTE"/&gt;
 *     &lt;enumeration value="SWNG"/&gt;
 *     &lt;enumeration value="OTHR"/&gt;
 *     &lt;enumeration value="MIDD"/&gt;
 *     &lt;enumeration value="RINV"/&gt;
 *     &lt;enumeration value="SWIC"/&gt;
 *     &lt;enumeration value="MRKT"/&gt;
 *     &lt;enumeration value="INDC"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "TypeOfPrice5Code")
@XmlEnum
public enum TypeOfPrice5Code {


    /**
     * Price is the calculated bid price of a dual-priced fund (offer-bid prices), that is, the selling price of the units for the investor.
     * 
     */
    BIDE,

    /**
     * Price is the calculated offer price of a dual-priced investment fund (offer-bid prices), that is, the buying price of the units for an investor.
     * 
     */
    OFFR,

    /**
     * Price is the net asset value per unit that is used either as a transacting price for a single-priced investment fund class, or as a notional price for the calculation of other prices.
     * 
     */
    NAVL,

    /**
     * Price is the calculated creation price of a dual-priced investment fund (creation-cancellation prices) and the highest possible buying price of the units before the initial charge. The actual buying or offer price, which includes charges, will be higher.
     * 
     */
    CREA,

    /**
     * Price is the calculated cancellation price of a dual-priced investment fund (creation-cancellation price), and the lowest possible valuation of the units on any one-day. The actual selling or bid price is usually higher.
     * 
     */
    CANC,

    /**
     * Price is the non-official interim price given to an investor before the executed price.
     * 
     */
    INTE,

    /**
     * Price is the calculated net asset value price of a single-priced investment fund. The price is adjusted to take into account the dealing costs due to individual large deals, or due to a significant imbalance in volumes of subscriptions vs redemptions, as an alternative to dilution levy.
     * 
     */
    SWNG,

    /**
     * Price is another type of price, which is not explicitly defined.
     * 
     */
    OTHR,

    /**
     * Price is the average price between the bid and offer prices.
     * 
     */
    MIDD,

    /**
     * Price is the price used when reinvesting units after distribution.
     * 
     */
    RINV,

    /**
     * Price is the price used when transferring units between products.
     * 
     */
    SWIC,

    /**
     * Price is the current market price.
     * 
     */
    MRKT,

    /**
     * Price is the estimated indicative price.
     * 
     */
    INDC;

    public String value() {
        return name();
    }

    public static TypeOfPrice5Code fromValue(String v) {
        return valueOf(v);
    }

}
