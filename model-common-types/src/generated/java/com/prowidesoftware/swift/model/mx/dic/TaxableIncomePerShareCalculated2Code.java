
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TaxableIncomePerShareCalculated2Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="TaxableIncomePerShareCalculated2Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="TSIY"/&gt;
 *     &lt;enumeration value="TSIN"/&gt;
 *     &lt;enumeration value="UKWN"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "TaxableIncomePerShareCalculated2Code")
@XmlEnum
public enum TaxableIncomePerShareCalculated2Code {


    /**
     * Fund is calculating the taxable interest per share with the NAV.
     * 
     */
    TSIY,

    /**
     * Fund is not calculating the taxable interest per share with the NAV.
     * 
     */
    TSIN,

    /**
     * Unknown whether the fund is calculating the taxable interest per share with the NAV.
     * 
     */
    UKWN;

    public String value() {
        return name();
    }

    public static TaxableIncomePerShareCalculated2Code fromValue(String v) {
        return valueOf(v);
    }

}
