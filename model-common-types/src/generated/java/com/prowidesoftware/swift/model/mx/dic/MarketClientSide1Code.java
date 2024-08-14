
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MarketClientSide1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="MarketClientSide1Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="CLNT"/>
 *     <enumeration value="MAKT"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "MarketClientSide1Code")
@XmlEnum
public enum MarketClientSide1Code {


    /**
     * Instruction is for a client side transaction.
     * 
     */
    CLNT,

    /**
     * Instruction is for a market side transaction.
     * 
     */
    MAKT;

    public String value() {
        return name();
    }

    public static MarketClientSide1Code fromValue(String v) {
        return valueOf(v);
    }

}
