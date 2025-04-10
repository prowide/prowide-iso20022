
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TradingCapacity8Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="TradingCapacity8Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="AGEN"/>
 *     <enumeration value="PRIN"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "TradingCapacity8Code")
@XmlEnum
public enum TradingCapacity8Code {


    /**
     * Trading as Agent on behalf of a customer.
     * 
     */
    AGEN,

    /**
     * Trading as Principal.
     * 
     */
    PRIN;

    public String value() {
        return name();
    }

    public static TradingCapacity8Code fromValue(String v) {
        return valueOf(v);
    }

}
