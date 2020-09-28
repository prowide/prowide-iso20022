
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MoneyMarketFundType1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="MoneyMarketFundType1Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="STLV"/&gt;
 *     &lt;enumeration value="STCN"/&gt;
 *     &lt;enumeration value="STVN"/&gt;
 *     &lt;enumeration value="SDVN"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "MoneyMarketFundType1Code")
@XmlEnum
public enum MoneyMarketFundType1Code {


    /**
     * Short-term low volatility net asset value money market fund.
     * 
     */
    STLV,

    /**
     * Short-term public debt constant net asset value money market fund.
     * 
     */
    STCN,

    /**
     * Short-term variable net asset value money market fund.
     * 
     * 
     */
    STVN,

    /**
     * Standard variable net asset value money market fund
     * 
     */
    SDVN;

    public String value() {
        return name();
    }

    public static MoneyMarketFundType1Code fromValue(String v) {
        return valueOf(v);
    }

}
