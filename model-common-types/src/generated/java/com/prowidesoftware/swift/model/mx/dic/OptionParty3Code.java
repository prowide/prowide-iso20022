
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for OptionParty3Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="OptionParty3Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="MAKE"/>
 *     <enumeration value="TAKE"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "OptionParty3Code")
@XmlEnum
public enum OptionParty3Code {


    /**
     * Indicates the receiver of the trade.
     * 
     */
    MAKE,

    /**
     * Indicates the initiator of the trade.
     * 
     */
    TAKE;

    public String value() {
        return name();
    }

    public static OptionParty3Code fromValue(String v) {
        return valueOf(v);
    }

}
