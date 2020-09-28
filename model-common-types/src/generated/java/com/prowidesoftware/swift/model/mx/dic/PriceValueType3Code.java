
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PriceValueType3Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="PriceValueType3Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="DISC"/&gt;
 *     &lt;enumeration value="PREM"/&gt;
 *     &lt;enumeration value="PARV"/&gt;
 *     &lt;enumeration value="YIEL"/&gt;
 *     &lt;enumeration value="SPRE"/&gt;
 *     &lt;enumeration value="PEUN"/&gt;
 *     &lt;enumeration value="ABSO"/&gt;
 *     &lt;enumeration value="TEDP"/&gt;
 *     &lt;enumeration value="TEDY"/&gt;
 *     &lt;enumeration value="FICT"/&gt;
 *     &lt;enumeration value="VACT"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "PriceValueType3Code")
@XmlEnum
public enum PriceValueType3Code {


    /**
     * Price expressed as a number of percentage points below par, eg, a discount price of 2.0% equals a price of 98 when par is 100.
     * 
     */
    DISC,

    /**
     * Price expressed as a number of percentage points above par, eg, a premium price of 2.0% equals a price of 102 when par is 100.
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
    VACT;

    public String value() {
        return name();
    }

    public static PriceValueType3Code fromValue(String v) {
        return valueOf(v);
    }

}
