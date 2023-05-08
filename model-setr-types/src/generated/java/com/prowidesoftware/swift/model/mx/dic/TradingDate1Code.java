
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TradingDate1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="TradingDate1Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="VARI"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "TradingDate1Code")
@XmlEnum
public enum TradingDate1Code {


    /**
     * Partial trades have occurred over a period of two or more days.
     * 
     */
    VARI;

    public String value() {
        return name();
    }

    public static TradingDate1Code fromValue(String v) {
        return valueOf(v);
    }

}
