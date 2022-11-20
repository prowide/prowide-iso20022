
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ExchangeRateType2Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ExchangeRateType2Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="SELL"/&gt;
 *     &lt;enumeration value="OTHP"/&gt;
 *     &lt;enumeration value="OTHN"/&gt;
 *     &lt;enumeration value="MIDL"/&gt;
 *     &lt;enumeration value="BUYR"/&gt;
 *     &lt;enumeration value="AGRD"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ExchangeRateType2Code")
@XmlEnum
public enum ExchangeRateType2Code {


    /**
     * Exchange rate is the Sell rate.
     * 
     */
    SELL,

    /**
     * Exchange rate type is privately defined.
     * 
     */
    OTHP,

    /**
     * Exchange rate type that is defined at the National level.
     * 
     */
    OTHN,

    /**
     * Exchange rate is the Middle rate.
     * 
     */
    MIDL,

    /**
     * Exchange rate is the Buy rate.
     * 
     */
    BUYR,

    /**
     * Exchange rate applied is the rate agreed between the parties.
     * 
     */
    AGRD;

    public String value() {
        return name();
    }

    public static ExchangeRateType2Code fromValue(String v) {
        return valueOf(v);
    }

}
