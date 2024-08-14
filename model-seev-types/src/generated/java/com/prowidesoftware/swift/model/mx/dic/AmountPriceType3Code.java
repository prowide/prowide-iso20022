
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AmountPriceType3Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="AmountPriceType3Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="ACTU"/>
 *     <enumeration value="PLOT"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
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
