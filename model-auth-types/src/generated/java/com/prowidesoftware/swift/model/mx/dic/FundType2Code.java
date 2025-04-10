
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FundType2Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="FundType2Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="ETFT"/&gt;
 *     &lt;enumeration value="MMFT"/&gt;
 *     &lt;enumeration value="OTHR"/&gt;
 *     &lt;enumeration value="REIT"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
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
