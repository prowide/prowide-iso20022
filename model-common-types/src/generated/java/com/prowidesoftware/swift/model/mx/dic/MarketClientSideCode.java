
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MarketClientSideCode.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="MarketClientSideCode">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="MAKT"/>
 *     <enumeration value="CLNT"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "MarketClientSideCode")
@XmlEnum
public enum MarketClientSideCode {


    /**
     * Instruction is for a market side transaction.
     * 
     */
    MAKT,

    /**
     * Instruction is for a client side transaction.
     * 
     */
    CLNT;

    public String value() {
        return name();
    }

    public static MarketClientSideCode fromValue(String v) {
        return valueOf(v);
    }

}
