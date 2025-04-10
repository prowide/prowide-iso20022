
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AmountPriceType2Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="AmountPriceType2Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="ACTU"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "AmountPriceType2Code")
@XmlEnum
public enum AmountPriceType2Code {


    /**
     * Price expressed as a currency and amount per unit or per share.
     * 
     */
    ACTU;

    public String value() {
        return name();
    }

    public static AmountPriceType2Code fromValue(String v) {
        return valueOf(v);
    }

}
