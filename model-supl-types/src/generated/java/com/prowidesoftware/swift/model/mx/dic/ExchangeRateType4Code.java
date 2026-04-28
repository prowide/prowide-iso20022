
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ExchangeRateType4Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ExchangeRateType4Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="AGRD"/&gt;
 *     &lt;enumeration value="SALE"/&gt;
 *     &lt;enumeration value="SPOT"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ExchangeRateType4Code")
@XmlEnum
public enum ExchangeRateType4Code {


    /**
     * Exchange rate applied is the rate agreed between the parties.
     * 
     */
    AGRD,

    /**
     * Exchange rate applied is the market rate at the time of the sale.
     * 
     */
    SALE,

    /**
     * Exchange rate applied is the spot rate.
     * 
     */
    SPOT;

    public String value() {
        return name();
    }

    public static ExchangeRateType4Code fromValue(String v) {
        return valueOf(v);
    }

}
