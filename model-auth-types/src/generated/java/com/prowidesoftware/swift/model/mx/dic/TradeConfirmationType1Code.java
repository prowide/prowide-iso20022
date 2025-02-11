
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TradeConfirmationType1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="TradeConfirmationType1Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="ECNF"/>
 *     <enumeration value="YCNF"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "TradeConfirmationType1Code")
@XmlEnum
public enum TradeConfirmationType1Code {


    /**
     * Electronically confirmed.
     * 
     */
    ECNF,

    /**
     * Non-electronically confirmed.
     * 
     */
    YCNF;

    public String value() {
        return name();
    }

    public static TradeConfirmationType1Code fromValue(String v) {
        return valueOf(v);
    }

}
