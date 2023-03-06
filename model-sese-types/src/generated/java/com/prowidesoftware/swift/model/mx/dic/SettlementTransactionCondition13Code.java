
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SettlementTransactionCondition13Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="SettlementTransactionCondition13Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="CLEN"/&gt;
 *     &lt;enumeration value="DIRT"/&gt;
 *     &lt;enumeration value="DLWM"/&gt;
 *     &lt;enumeration value="PHYS"/&gt;
 *     &lt;enumeration value="SPDL"/&gt;
 *     &lt;enumeration value="SPST"/&gt;
 *     &lt;enumeration value="NOMC"/&gt;
 *     &lt;enumeration value="BPSS"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "SettlementTransactionCondition13Code")
@XmlEnum
public enum SettlementTransactionCondition13Code {


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
    NOMC,

    /**
     * Identification of settlement instructions created as a result of a partial successful buy-in.
     * 
     */
    BPSS;

    public String value() {
        return name();
    }

    public static SettlementTransactionCondition13Code fromValue(String v) {
        return valueOf(v);
    }

}
