
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for OptionParty1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="OptionParty1Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="SLLR"/>
 *     <enumeration value="BYER"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "OptionParty1Code")
@XmlEnum
public enum OptionParty1Code {


    /**
     * Seller in a trade.
     * 
     */
    SLLR,

    /**
     * Buyer in a trade.
     * 
     */
    BYER;

    public String value() {
        return name();
    }

    public static OptionParty1Code fromValue(String v) {
        return valueOf(v);
    }

}
