
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ExchangeRateAgreementType1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ExchangeRateAgreementType1Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="FWCT"/&gt;
 *     &lt;enumeration value="NORM"/&gt;
 *     &lt;enumeration value="OTHN"/&gt;
 *     &lt;enumeration value="OTHP"/&gt;
 *     &lt;enumeration value="SPOT"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
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
