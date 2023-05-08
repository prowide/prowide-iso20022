
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MoneyMarketFundType1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="MoneyMarketFundType1Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="STLV"/>
 *     <enumeration value="STCN"/>
 *     <enumeration value="STVN"/>
 *     <enumeration value="SDVN"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
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
