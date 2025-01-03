
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TaxRateMarker1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="TaxRateMarker1Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="ALPR"/>
 *     <enumeration value="ALIT"/>
 *     <enumeration value="GRSS"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "TaxRateMarker1Code")
@XmlEnum
public enum TaxRateMarker1Code {


    /**
     * Specifies the amount quoted less life assurance premium rate income tax.
     * 
     */
    ALPR,

    /**
     * Specifies the amount quoted less standard rate income tax.
     * 
     */
    ALIT,

    /**
     * Specifies an amount before the deduction of tax.
     * 
     */
    GRSS;

    public String value() {
        return name();
    }

    public static TaxRateMarker1Code fromValue(String v) {
        return valueOf(v);
    }

}
