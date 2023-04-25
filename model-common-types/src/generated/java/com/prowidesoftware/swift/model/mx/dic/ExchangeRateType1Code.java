
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ExchangeRateType1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="ExchangeRateType1Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="SPOT"/>
 *     <enumeration value="SALE"/>
 *     <enumeration value="AGRD"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "ExchangeRateType1Code")
@XmlEnum
public enum ExchangeRateType1Code {


    /**
     * Exchange rate applied is the spot rate.
     * 
     */
    SPOT,

    /**
     * Exchange rate applied is the market rate at the time of the sale.
     * 
     */
    SALE,

    /**
     * Exchange rate applied is the rate agreed between the parties.
     * 
     */
    AGRD;

    public String value() {
        return name();
    }

    public static ExchangeRateType1Code fromValue(String v) {
        return valueOf(v);
    }

}
