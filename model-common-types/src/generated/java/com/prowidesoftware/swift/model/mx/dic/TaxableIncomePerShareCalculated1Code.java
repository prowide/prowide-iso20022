
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TaxableIncomePerShareCalculated1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="TaxableIncomePerShareCalculated1Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="TSIY"/&gt;
 *     &lt;enumeration value="TSIN"/&gt;
 *     &lt;enumeration value="UKWN"/&gt;
 *     &lt;enumeration value="OTHR"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "TaxableIncomePerShareCalculated1Code")
@XmlEnum
public enum TaxableIncomePerShareCalculated1Code {


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
    UKWN,

    /**
     * Another type of taxable income per share.
     * 
     */
    OTHR;

    public String value() {
        return name();
    }

    public static TaxableIncomePerShareCalculated1Code fromValue(String v) {
        return valueOf(v);
    }

}
