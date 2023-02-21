
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for OptionStyle7Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="OptionStyle7Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="AMER"/&gt;
 *     &lt;enumeration value="ASIA"/&gt;
 *     &lt;enumeration value="BERM"/&gt;
 *     &lt;enumeration value="EURO"/&gt;
 *     &lt;enumeration value="OTHR"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "OptionStyle7Code")
@XmlEnum
public enum OptionStyle7Code {


    /**
     * Option can be exercised before or on expiry date.
     * 
     */
    AMER,

    /**
     * Option where the payoff is not determined by the underlying price at maturity but by the average underlying price over some pre-set period of time.
     * 
     */
    ASIA,

    /**
     * Option that can be exercised on multiple discrete dates prior to, or on expiry date.
     * 
     */
    BERM,

    /**
     * Option that can be exercised on expiry date only.
     * 
     */
    EURO,

    /**
     * Other type of option style.
     * 
     */
    OTHR;

    public String value() {
        return name();
    }

    public static OptionStyle7Code fromValue(String v) {
        return valueOf(v);
    }

}
