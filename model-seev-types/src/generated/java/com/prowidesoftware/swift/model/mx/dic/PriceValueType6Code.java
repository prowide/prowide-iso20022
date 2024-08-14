
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PriceValueType6Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="PriceValueType6Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="UKWN"/>
 *     <enumeration value="OPEN"/>
 *     <enumeration value="UNSP"/>
 *     <enumeration value="TBSP"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "PriceValueType6Code")
@XmlEnum
public enum PriceValueType6Code {


    /**
     * Price is unknown by the sender or has not been established.
     * 
     */
    UKWN,

    /**
     * Price has not been established.
     * 
     */
    OPEN,

    /**
     * Price is not required to be specified by account owner.
     * 
     */
    UNSP,

    /**
     * Price to be specified by account owner.
     * 
     */
    TBSP;

    public String value() {
        return name();
    }

    public static PriceValueType6Code fromValue(String v) {
        return valueOf(v);
    }

}
