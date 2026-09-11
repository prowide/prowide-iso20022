
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ExchangeRateAgreementType2Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="ExchangeRateAgreementType2Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="FWCT"/>
 *     <enumeration value="NORM"/>
 *     <enumeration value="SPOT"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "ExchangeRateAgreementType2Code")
@XmlEnum
public enum ExchangeRateAgreementType2Code {


    /**
     * Forward contract exchange rate type.
     * 
     */
    FWCT,

    /**
     * Normal exchange rate agreement type.
     * 
     */
    NORM,

    /**
     * Spot agreement exchange rate type.
     * 
     */
    SPOT;

    public String value() {
        return name();
    }

    public static ExchangeRateAgreementType2Code fromValue(String v) {
        return valueOf(v);
    }

}
