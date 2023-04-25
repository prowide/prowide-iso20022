
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TradingCapacity2Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="TradingCapacity2Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="PRIN"/>
 *     <enumeration value="TAGN"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "TradingCapacity2Code")
@XmlEnum
public enum TradingCapacity2Code {


    /**
     * Broker is buying or selling securities for its own account.
     * 
     */
    PRIN,

    /**
     * Broker is trading on behalf of another party.
     * 
     */
    TAGN;

    public String value() {
        return name();
    }

    public static TradingCapacity2Code fromValue(String v) {
        return valueOf(v);
    }

}
