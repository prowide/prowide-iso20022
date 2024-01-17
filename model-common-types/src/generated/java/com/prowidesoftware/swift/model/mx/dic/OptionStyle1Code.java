
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for OptionStyle1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="OptionStyle1Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="AMER"/>
 *     <enumeration value="EURO"/>
 *     <enumeration value="BERM"/>
 *     <enumeration value="ASIA"/>
 *     <enumeration value="CANA"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "OptionStyle1Code")
@XmlEnum
public enum OptionStyle1Code {


    /**
     * Option can be exercised before or on expiry date.
     * 
     */
    AMER,

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
     * Option whose exercise style lies somewhere between European options and Bermudan options. The holder can exercise the option at quarterly dates, but not before a set time period (typically one year) has elapsed.
     * 
     */
    CANA;

    public String value() {
        return name();
    }

    public static OptionStyle1Code fromValue(String v) {
        return valueOf(v);
    }

}
