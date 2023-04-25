
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for OptionStyle6Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="OptionStyle6Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="EURO"/>
 *     <enumeration value="BERM"/>
 *     <enumeration value="ASIA"/>
 *     <enumeration value="AMER"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "OptionStyle6Code")
@XmlEnum
public enum OptionStyle6Code {


    /**
     * Option that can be exercised on expiry date only.
     * 
     */
    EURO,

    /**
     * Option that can be exercised on multiple discrete dates prior to, or on expiry date.
     * 
     */
    BERM,

    /**
     * Option where the payoff is not determined by the underlying price at maturity but by the average underlying price over some pre-set period of time.
     * 
     */
    ASIA,

    /**
     * Option can be exercised before or on expiry date.
     * 
     */
    AMER;

    public String value() {
        return name();
    }

    public static OptionStyle6Code fromValue(String v) {
        return valueOf(v);
    }

}
