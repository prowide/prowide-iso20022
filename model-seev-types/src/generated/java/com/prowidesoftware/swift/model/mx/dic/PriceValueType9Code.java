
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PriceValueType9Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="PriceValueType9Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="TBSP"/>
 *     <enumeration value="UNSP"/>
 *     <enumeration value="UKWN"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "PriceValueType9Code")
@XmlEnum
public enum PriceValueType9Code {


    /**
     * Price to be specified by account owner.
     * 
     */
    TBSP,

    /**
     * Price is not required to be specified by account owner.
     * 
     */
    UNSP,

    /**
     * Price is unknown by the sender or has not been established.
     * 
     */
    UKWN;

    public String value() {
        return name();
    }

    public static PriceValueType9Code fromValue(String v) {
        return valueOf(v);
    }

}
