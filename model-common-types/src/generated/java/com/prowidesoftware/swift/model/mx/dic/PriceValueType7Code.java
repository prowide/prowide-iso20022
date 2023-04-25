
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PriceValueType7Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="PriceValueType7Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="DISC"/>
 *     <enumeration value="PREM"/>
 *     <enumeration value="PARV"/>
 *     <enumeration value="YIEL"/>
 *     <enumeration value="SPRE"/>
 *     <enumeration value="PEUN"/>
 *     <enumeration value="ABSO"/>
 *     <enumeration value="TEDP"/>
 *     <enumeration value="TEDY"/>
 *     <enumeration value="FICT"/>
 *     <enumeration value="VACT"/>
 *     <enumeration value="PRCT"/>
 *     <enumeration value="ACTU"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "PriceValueType7Code")
@XmlEnum
public enum PriceValueType7Code {


    /**
     * Price expressed as a number of percentage points below par, for example, a discount price of 2.0% equals a price of 98 when par is 100.
     * 
     */
    DISC,

    /**
     * Price expressed as a number of percentage points above par, for example, a premium price of 2.0% equals a price of 102 when par is 100.
     * 
     */
    PREM,

    /**
     * Price is the face amount.
     * 
     */
    PARV,

    /**
     * Price expressed as a yield.
     * 
     */
    YIEL,

    /**
     * Difference between a market maker's bid and asked price.
     * 
     */
    SPRE,

    /**
     * Price expressed per unit.
     * 
     */
    PEUN,

    /**
     * Price is expressed as absolute.
     * 
     */
    ABSO,

    /**
     * Price is expressed as Treasury Euro Dollar price.
     * 
     */
    TEDP,

    /**
     * Price is expressed as Treasury Euro Dollar yield.
     * 
     */
    TEDY,

    /**
     * Cabinet trades are used to indicate prices that trade at a price lower than that available on an exchange and they can be fixed or variable (primarily used for listed futures and options).
     * 
     */
    FICT,

    /**
     * Cabinet trades are used to indicate prices that trade at a price lower than that available on an exchange and they can be fixed or variable (primarily used for listed futures and options).
     * 
     */
    VACT,

    /**
     * Price expressed as a percentage of par.
     * 
     */
    PRCT,

    /**
     * Price expressed as a currency and amount per unit or per share.
     * 
     */
    ACTU;

    public String value() {
        return name();
    }

    public static PriceValueType7Code fromValue(String v) {
        return valueOf(v);
    }

}
