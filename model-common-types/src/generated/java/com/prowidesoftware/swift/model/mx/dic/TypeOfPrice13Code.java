
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TypeOfPrice13Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="TypeOfPrice13Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="BIDE"/&gt;
 *     &lt;enumeration value="OFFR"/&gt;
 *     &lt;enumeration value="NAVL"/&gt;
 *     &lt;enumeration value="CREA"/&gt;
 *     &lt;enumeration value="CANC"/&gt;
 *     &lt;enumeration value="INTE"/&gt;
 *     &lt;enumeration value="SWNG"/&gt;
 *     &lt;enumeration value="MIDD"/&gt;
 *     &lt;enumeration value="RINV"/&gt;
 *     &lt;enumeration value="NAVS"/&gt;
 *     &lt;enumeration value="SWIC"/&gt;
 *     &lt;enumeration value="GAVL"/&gt;
 *     &lt;enumeration value="DDVR"/&gt;
 *     &lt;enumeration value="ACTU"/&gt;
 *     &lt;enumeration value="EGAV"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "TypeOfPrice13Code")
@XmlEnum
public enum TypeOfPrice13Code {


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
     * Price is the estimated net asset value for the side pocket.
     * 
     */
    NAVS,

    /**
     * Price is the price used when transferring units between products.
     * 
     */
    SWIC,

    /**
     * Price is the gross asset value per unit and includes the performance fee per share. It is used as the transacting price for a fund with equalisation. GAVL price minus the NAVL price = performance fee.
     * 
     */
    GAVL,

    /**
     * Price is the net income of a financial instrument, calculated on each dealing day, and divided by all the units outstanding on that day.
     * 
     */
    DDVR,

    /**
     * True offer price.
     * 
     */
    ACTU,

    /**
     * Price is the estimated gross asset value per unit and includes the performance fee per share. It is used as the transacting price for a fund with equalisation. GAVL price minus the NAVL price = performance fee.
     * 
     */
    EGAV;

    public String value() {
        return name();
    }

    public static TypeOfPrice13Code fromValue(String v) {
        return valueOf(v);
    }

}
