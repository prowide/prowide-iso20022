
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AmountPriceType1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="AmountPriceType1Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="ACTU"/>
 *     <enumeration value="DISC"/>
 *     <enumeration value="PLOT"/>
 *     <enumeration value="PREM"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "AmountPriceType1Code")
@XmlEnum
public enum AmountPriceType1Code {


    /**
     * Price expressed as a currency and amount per unit or per share.
     * 
     */
    ACTU,

    /**
     * Price expressed as a discount amount.
     * 
     */
    DISC,

    /**
     * Price expressed as an amount of money per lot.
     * 
     */
    PLOT,

    /**
     * Price expressed as a premium.
     * 
     */
    PREM;

    public String value() {
        return name();
    }

    public static AmountPriceType1Code fromValue(String v) {
        return valueOf(v);
    }

}
