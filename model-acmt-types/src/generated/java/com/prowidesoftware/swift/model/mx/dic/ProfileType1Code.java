
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ProfileType1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="ProfileType1Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="HEDG"/>
 *     <enumeration value="HFTR"/>
 *     <enumeration value="MAKE"/>
 *     <enumeration value="TREA"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "ProfileType1Code")
@XmlEnum
public enum ProfileType1Code {


    /**
     * Investor shares that uses defensive operations (hedging), thus avoiding the risk of large swings.
     * 
     */
    HEDG,

    /**
     * Investors operating through algorithms and send orders automatically according to the strategies defined by their managers. Through this access model, the participants of these servers are hosted primarily within the premises of Brazilian Market and significantly reduce the time of submission of offers to trading systems.
     * 
     */
    HFTR,

    /**
     * Agent liquidity, liquidity facilitator, promoter of business, specialist, market maker and liquidity provider are some designations given to those who propose to provide liquidity and minimum reference price for assets previously accredited, factors highlighted in the analysis of efficiency in capital markets.
     * 
     */
    MAKE,

    /**
     * Trading system of federal securities in the retail market directly to the investor. The operation can be performed directly over the Internet.
     * 
     */
    TREA;

    public String value() {
        return name();
    }

    public static ProfileType1Code fromValue(String v) {
        return valueOf(v);
    }

}
