
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AmountPriceType3Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="AmountPriceType3Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="ACTU"/&gt;
 *     &lt;enumeration value="PLOT"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "AmountPriceType3Code")
@XmlEnum
public enum AmountPriceType3Code {


    /**
     * Price expressed as a currency and amount per unit or per share.
     * 
     */
    ACTU,

    /**
     * Price expressed as an amount of money per lot.
     * 
     */
    PLOT;

    public String value() {
        return name();
    }

    public static AmountPriceType3Code fromValue(String v) {
        return valueOf(v);
    }

}
