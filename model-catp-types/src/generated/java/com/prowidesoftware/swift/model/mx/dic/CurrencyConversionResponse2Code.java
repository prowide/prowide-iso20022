
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CurrencyConversionResponse2Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="CurrencyConversionResponse2Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="ODCC"/>
 *     <enumeration value="ICRD"/>
 *     <enumeration value="IPRD"/>
 *     <enumeration value="IRAT"/>
 *     <enumeration value="NDCC"/>
 *     <enumeration value="IAMG"/>
 *     <enumeration value="IATM"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "CurrencyConversionResponse2Code")
@XmlEnum
public enum CurrencyConversionResponse2Code {


    /**
     * Dynamic currency conversion may be offered to the cardholder.
     * 
     */
    ODCC,

    /**
     * The card is not valid for dynamic currency conversion.
     * 
     */
    ICRD,

    /**
     * Dynamic currency conversion service cannot be offered for this card product.
     * 
     */
    IPRD,

    /**
     * Exchange rates are not available.
     * 
     */
    IRAT,

    /**
     * Dynamic currency conversion is not available for other reason.
     * 
     */
    NDCC,

    /**
     * The ATM manager is not valid for dynamic currency conversion.
     * 
     */
    IAMG,

    /**
     * The ATM is not valid for dynamic currency conversion.
     * 
     */
    IATM;

    public String value() {
        return name();
    }

    public static CurrencyConversionResponse2Code fromValue(String v) {
        return valueOf(v);
    }

}
