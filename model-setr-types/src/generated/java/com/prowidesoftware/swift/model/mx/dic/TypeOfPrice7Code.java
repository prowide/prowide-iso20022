
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TypeOfPrice7Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="TypeOfPrice7Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="BIDE"/>
 *     <enumeration value="OFFR"/>
 *     <enumeration value="NAVL"/>
 *     <enumeration value="CREA"/>
 *     <enumeration value="CANC"/>
 *     <enumeration value="INTE"/>
 *     <enumeration value="SWNG"/>
 *     <enumeration value="OTHR"/>
 *     <enumeration value="MIDD"/>
 *     <enumeration value="RINV"/>
 *     <enumeration value="SWIC"/>
 *     <enumeration value="DDVR"/>
 *     <enumeration value="ACTU"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "TypeOfPrice7Code")
@XmlEnum
public enum TypeOfPrice7Code {


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
     * Price is the net income of a financial instrument, calculated on each dealing day, and divided by all the units outstanding on that day.
     * 
     */
    DDVR,

    /**
     * True offer price.
     * 
     */
    ACTU;

    public String value() {
        return name();
    }

    public static TypeOfPrice7Code fromValue(String v) {
        return valueOf(v);
    }

}
