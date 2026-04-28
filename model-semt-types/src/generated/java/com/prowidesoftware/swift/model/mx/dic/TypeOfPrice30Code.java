
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TypeOfPrice30Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="TypeOfPrice30Code"&gt;
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
 *     &lt;enumeration value="SWIC"/&gt;
 *     &lt;enumeration value="DDVR"/&gt;
 *     &lt;enumeration value="ACTU"/&gt;
 *     &lt;enumeration value="NAUP"/&gt;
 *     &lt;enumeration value="GUAR"/&gt;
 *     &lt;enumeration value="ENAV"/&gt;
 *     &lt;enumeration value="REDN"/&gt;
 *     &lt;enumeration value="SUBN"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "TypeOfPrice30Code")
@XmlEnum
public enum TypeOfPrice30Code {


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
    ACTU,

    /**
     * The original NAV before the price of the investment fund was swung.
     * 
     */
    NAUP,

    /**
     * Price is a guaranteed price.
     * 
     */
    GUAR,

    /**
     * Price is an estimated net asset value per unit.
     * 
     */
    ENAV,

    /**
     * Net Asset Value (NAV) applicable to redemptions.
     * 
     */
    REDN,

    /**
     * Net Asset Value (NAV) applicable to subscriptions.
     * 
     */
    SUBN;

    public String value() {
        return name();
    }

    public static TypeOfPrice30Code fromValue(String v) {
        return valueOf(v);
    }

}
