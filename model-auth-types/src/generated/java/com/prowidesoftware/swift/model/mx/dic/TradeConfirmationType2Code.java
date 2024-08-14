
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TradeConfirmationType2Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="TradeConfirmationType2Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="NCNF"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "TradeConfirmationType2Code")
@XmlEnum
public enum TradeConfirmationType2Code {


    /**
     * Non-confirmed.
     * 
     */
    NCNF;

    public String value() {
        return name();
    }

    public static TradeConfirmationType2Code fromValue(String v) {
        return valueOf(v);
    }

}
