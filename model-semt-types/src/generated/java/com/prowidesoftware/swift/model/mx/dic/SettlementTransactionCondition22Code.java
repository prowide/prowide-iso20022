
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SettlementTransactionCondition22Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="SettlementTransactionCondition22Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="CLEN"/>
 *     <enumeration value="DLWM"/>
 *     <enumeration value="DIRT"/>
 *     <enumeration value="GATE"/>
 *     <enumeration value="NOMC"/>
 *     <enumeration value="PHYS"/>
 *     <enumeration value="SPDL"/>
 *     <enumeration value="SPST"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "SettlementTransactionCondition22Code")
@XmlEnum
public enum SettlementTransactionCondition22Code {


    /**
     * Tax-exempt financial instruments are to be settled.
     * 
     */
    CLEN,

    /**
     * Matching receipt instruction not required (only for concerned international or national central securities depositories).
     * 
     */
    DLWM,

    /**
     * Taxable financial instruments are to be settled.
     * 
     */
    DIRT,

    /**
     * Gating event participation. Hold until event start time.
     * 
     */
    GATE,

    /**
     * No market claim should be automatically generated.
     * 
     */
    NOMC,

    /**
     * Securities are to be physically settled.
     * 
     */
    PHYS,

    /**
     * Settlement transactions to be settled with special delivery.
     * 
     */
    SPDL,

    /**
     * Money and financial instruments settle in different locations.
     * 
     */
    SPST;

    public String value() {
        return name();
    }

    public static SettlementTransactionCondition22Code fromValue(String v) {
        return valueOf(v);
    }

}
