
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SettlementTransactionCondition4Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="SettlementTransactionCondition4Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="CLEN"/>
 *     <enumeration value="DIRT"/>
 *     <enumeration value="DLWM"/>
 *     <enumeration value="PHYS"/>
 *     <enumeration value="SPDL"/>
 *     <enumeration value="SPST"/>
 *     <enumeration value="NOMC"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "SettlementTransactionCondition4Code")
@XmlEnum
public enum SettlementTransactionCondition4Code {


    /**
     * Tax-exempt financial instruments are to be settled.
     * 
     */
    CLEN,

    /**
     * Taxable financial instruments are to be settled.
     * 
     */
    DIRT,

    /**
     * Matching receipt instruction not required (only for concerned international or national central securities depositories).
     * 
     */
    DLWM,

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
    SPST,

    /**
     * No market claim should be automatically generated.
     * 
     */
    NOMC;

    public String value() {
        return name();
    }

    public static SettlementTransactionCondition4Code fromValue(String v) {
        return valueOf(v);
    }

}
