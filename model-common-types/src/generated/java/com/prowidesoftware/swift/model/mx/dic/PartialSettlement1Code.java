
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PartialSettlement1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="PartialSettlement1Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="PAIN"/>
 *     <enumeration value="PARC"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "PartialSettlement1Code")
@XmlEnum
public enum PartialSettlement1Code {


    /**
     * Confirmation is for partial settlement. Part of the transaction remains unsettled.
     * 
     */
    PAIN,

    /**
     * Confirmation is for the remaining part of an instruction that was previously partially confirmed.
     * 
     */
    PARC;

    public String value() {
        return name();
    }

    public static PartialSettlement1Code fromValue(String v) {
        return valueOf(v);
    }

}
