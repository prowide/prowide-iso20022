
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PriceValueType8Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="PriceValueType8Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="TBSP"/>
 *     <enumeration value="UNSP"/>
 *     <enumeration value="UKWN"/>
 *     <enumeration value="NILP"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "PriceValueType8Code")
@XmlEnum
public enum PriceValueType8Code {


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
    UKWN,

    /**
     * Price will not be paid.
     * 
     */
    NILP;

    public String value() {
        return name();
    }

    public static PriceValueType8Code fromValue(String v) {
        return valueOf(v);
    }

}
