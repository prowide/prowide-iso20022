
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PriceStatus1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="PriceStatus1Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="PNDG"/>
 *     <enumeration value="NOAP"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "PriceStatus1Code")
@XmlEnum
public enum PriceStatus1Code {


    /**
     * Price is pending.
     * 
     */
    PNDG,

    /**
     * No price for transaction (e.g. transfer between accounts).
     * 
     */
    NOAP;

    public String value() {
        return name();
    }

    public static PriceStatus1Code fromValue(String v) {
        return valueOf(v);
    }

}
