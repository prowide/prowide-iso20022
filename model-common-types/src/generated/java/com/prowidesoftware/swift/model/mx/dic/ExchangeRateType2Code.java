
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ExchangeRateType2Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="ExchangeRateType2Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="SELL"/>
 *     <enumeration value="OTHP"/>
 *     <enumeration value="OTHN"/>
 *     <enumeration value="MIDL"/>
 *     <enumeration value="BUYR"/>
 *     <enumeration value="AGRD"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
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
