
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GateHoldBack1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="GateHoldBack1Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="GATE"/>
 *     <enumeration value="HOLD"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "GateHoldBack1Code")
@XmlEnum
public enum GateHoldBack1Code {


    /**
     * Gating of redemption proceeds.
     * 
     */
    GATE,

    /**
     * Hold back of redemption proceeds.
     * 
     */
    HOLD;

    public String value() {
        return name();
    }

    public static GateHoldBack1Code fromValue(String v) {
        return valueOf(v);
    }

}
