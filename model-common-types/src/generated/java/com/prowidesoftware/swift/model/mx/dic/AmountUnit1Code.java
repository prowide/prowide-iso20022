
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AmountUnit1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="AmountUnit1Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="MONE"/>
 *     <enumeration value="POIN"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "AmountUnit1Code")
@XmlEnum
public enum AmountUnit1Code {


    /**
     * The amount is expressed in a monetary value in a currency.
     * 
     */
    MONE,

    /**
     * The amount is expressed in point.
     * 
     */
    POIN;

    public String value() {
        return name();
    }

    public static AmountUnit1Code fromValue(String v) {
        return valueOf(v);
    }

}
