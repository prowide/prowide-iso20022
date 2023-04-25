
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ExchangeRateAgreementType1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="ExchangeRateAgreementType1Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="FWCT"/>
 *     <enumeration value="NORM"/>
 *     <enumeration value="OTHN"/>
 *     <enumeration value="OTHP"/>
 *     <enumeration value="SPOT"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "ExchangeRateAgreementType1Code")
@XmlEnum
public enum ExchangeRateAgreementType1Code {


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
     * Other exchange rate agreement type defined at national level.
     * 
     */
    OTHN,

    /**
     * Other exchange rate agreement type that is privately defined.
     * 
     */
    OTHP,

    /**
     * Spot agreement exchange rate type.
     * 
     */
    SPOT;

    public String value() {
        return name();
    }

    public static ExchangeRateAgreementType1Code fromValue(String v) {
        return valueOf(v);
    }

}
