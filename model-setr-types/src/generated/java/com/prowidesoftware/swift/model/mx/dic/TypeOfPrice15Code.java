
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TypeOfPrice15Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="TypeOfPrice15Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="BIDE"/>
 *     <enumeration value="OFFR"/>
 *     <enumeration value="NAVL"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "TypeOfPrice15Code")
@XmlEnum
public enum TypeOfPrice15Code {


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
    NAVL;

    public String value() {
        return name();
    }

    public static TypeOfPrice15Code fromValue(String v) {
        return valueOf(v);
    }

}
