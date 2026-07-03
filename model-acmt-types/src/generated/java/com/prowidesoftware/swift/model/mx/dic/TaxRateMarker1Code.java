
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TaxRateMarker1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="TaxRateMarker1Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="ALPR"/&gt;
 *     &lt;enumeration value="ALIT"/&gt;
 *     &lt;enumeration value="GRSS"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
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
