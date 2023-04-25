
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PriceValueType1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="PriceValueType1Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="DISC"/>
 *     <enumeration value="PREM"/>
 *     <enumeration value="PARV"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "PriceValueType1Code")
@XmlEnum
public enum PriceValueType1Code {


    /**
     * Price expressed as a number of percentage points below par, for example, a discount price of 2.0% equals a price of 98 when par is 100.
     * 
     */
    DISC,

    /**
     * Price expressed as a number of percentage points above par, for example, a premium price of 2.0% equals a price of 102 when par is 100.
     * 
     */
    PREM,

    /**
     * Price is the face amount.
     * 
     */
    PARV;

    public String value() {
        return name();
    }

    public static PriceValueType1Code fromValue(String v) {
        return valueOf(v);
    }

}
