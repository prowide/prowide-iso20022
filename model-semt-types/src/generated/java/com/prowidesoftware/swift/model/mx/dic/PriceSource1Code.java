
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PriceSource1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="PriceSource1Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="FUND"/&gt;
 *     &lt;enumeration value="THEO"/&gt;
 *     &lt;enumeration value="VEND"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "PriceSource1Code")
@XmlEnum
public enum PriceSource1Code {


    /**
     * Source of price quotation is a fund, eg, transfer agent, fund itself.
     * 
     */
    FUND,

    /**
     * Source of price quotation is a theoretical value based on the market yield.
     * 
     */
    THEO,

    /**
     * Source of price quotation is an external vendor.
     * 
     */
    VEND;

    public String value() {
        return name();
    }

    public static PriceSource1Code fromValue(String v) {
        return valueOf(v);
    }

}
