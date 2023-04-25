
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FundType2Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="FundType2Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="ETFT"/>
 *     <enumeration value="MMFT"/>
 *     <enumeration value="OTHR"/>
 *     <enumeration value="REIT"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "FundType2Code")
@XmlEnum
public enum FundType2Code {


    /**
     * Fund of which at least one unit or share class is traded throughout the day on at
     * least one trading venue and with at least one market maker which takes action to ensure that the price of its units or shares on the trading venue does not vary significantly from its net asset value and, where applicable, from its indicative net asset value.
     * 
     * 
     */
    ETFT,

    /**
     * Indication that a fund is a public debt constant net asset value money market fund, low volatility net asset value money market fund or variable net asset value money market fund.
     * 
     */
    MMFT,

    /**
     * Other type of an investment fund. 
     * 
     */
    OTHR,

    /**
     * Listed real investment company.
     * 
     */
    REIT;

    public String value() {
        return name();
    }

    public static FundType2Code fromValue(String v) {
        return valueOf(v);
    }

}
