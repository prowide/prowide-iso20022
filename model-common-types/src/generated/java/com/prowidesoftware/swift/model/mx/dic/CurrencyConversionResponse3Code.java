
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CurrencyConversionResponse3Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="CurrencyConversionResponse3Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="ODCC"/>
 *     <enumeration value="DCCA"/>
 *     <enumeration value="ICRD"/>
 *     <enumeration value="IMER"/>
 *     <enumeration value="IPRD"/>
 *     <enumeration value="IRAT"/>
 *     <enumeration value="NDCC"/>
 *     <enumeration value="REST"/>
 *     <enumeration value="CATG"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "CurrencyConversionResponse3Code")
@XmlEnum
public enum CurrencyConversionResponse3Code {


    /**
     * Dynamic currency conversion may be offered to the cardholder.
     * 
     */
    ODCC,

    /**
     * Transaction authorised with dynamic currency conversion.
     * 
     */
    DCCA,

    /**
     * The card is not valid for dynamic currency conversion.
     * 
     */
    ICRD,

    /**
     * The card acceptor has not been recognised.
     * 
     */
    IMER,

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
     * Conversion accepted for the requested amount exclusively.
     * 
     */
    REST,

    /**
     * Conversion accepted for a range of amounts.
     * 
     */
    CATG;

    public String value() {
        return name();
    }

    public static CurrencyConversionResponse3Code fromValue(String v) {
        return valueOf(v);
    }

}
