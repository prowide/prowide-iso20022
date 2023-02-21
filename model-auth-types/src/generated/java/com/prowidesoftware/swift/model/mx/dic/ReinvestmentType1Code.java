
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ReinvestmentType1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ReinvestmentType1Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="OTHR"/&gt;
 *     &lt;enumeration value="OCMP"/&gt;
 *     &lt;enumeration value="MMFT"/&gt;
 *     &lt;enumeration value="REPM"/&gt;
 *     &lt;enumeration value="SDPU"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ReinvestmentType1Code")
@XmlEnum
public enum ReinvestmentType1Code {


    /**
     * Other type of reinvestment.
     * 
     */
    OTHR,

    /**
     * Reinvestment type is a pool of commingled assets.
     * 
     */
    OCMP,

    /**
     * Reinvestment type is registered money market fund that is a public debt constant net asset value money market fund, low volatility net asset value money market fund or variable net asset value money market fund.
     * 
     */
    MMFT,

    /**
     * Reinvestment type is market where repurchase agreements are traded. 
     * 
     */
    REPM,

    /**
     * Reinvestment type is direct purchase of securities.
     * 
     */
    SDPU;

    public String value() {
        return name();
    }

    public static ReinvestmentType1Code fromValue(String v) {
        return valueOf(v);
    }

}
