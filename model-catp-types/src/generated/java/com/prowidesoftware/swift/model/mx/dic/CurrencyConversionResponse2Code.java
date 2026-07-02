
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CurrencyConversionResponse2Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="CurrencyConversionResponse2Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="ODCC"/&gt;
 *     &lt;enumeration value="ICRD"/&gt;
 *     &lt;enumeration value="IPRD"/&gt;
 *     &lt;enumeration value="IRAT"/&gt;
 *     &lt;enumeration value="NDCC"/&gt;
 *     &lt;enumeration value="IAMG"/&gt;
 *     &lt;enumeration value="IATM"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
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
