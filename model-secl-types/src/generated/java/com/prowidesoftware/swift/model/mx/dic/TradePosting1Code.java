
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TradePosting1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="TradePosting1Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="GROS"/>
 *     <enumeration value="NETT"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "TradePosting1Code")
@XmlEnum
public enum TradePosting1Code {


    /**
     * Trade is maintained as a separate individual position in the clearing account.
     * 
     */
    GROS,

    /**
     * Trade is maintained as a net position in the clearing account.
     * 
     */
    NETT;

    public String value() {
        return name();
    }

    public static TradePosting1Code fromValue(String v) {
        return valueOf(v);
    }

}
