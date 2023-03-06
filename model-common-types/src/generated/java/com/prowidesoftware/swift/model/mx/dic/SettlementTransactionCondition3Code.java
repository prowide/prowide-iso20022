
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SettlementTransactionCondition3Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="SettlementTransactionCondition3Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="ASGN"/&gt;
 *     &lt;enumeration value="CLEN"/&gt;
 *     &lt;enumeration value="DIRT"/&gt;
 *     &lt;enumeration value="DLWM"/&gt;
 *     &lt;enumeration value="DRAW"/&gt;
 *     &lt;enumeration value="EXER"/&gt;
 *     &lt;enumeration value="FRCL"/&gt;
 *     &lt;enumeration value="KNOC"/&gt;
 *     &lt;enumeration value="PHYS"/&gt;
 *     &lt;enumeration value="RESI"/&gt;
 *     &lt;enumeration value="SPDL"/&gt;
 *     &lt;enumeration value="SPST"/&gt;
 *     &lt;enumeration value="UNEX"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "SettlementTransactionCondition3Code")
@XmlEnum
public enum SettlementTransactionCondition3Code {


    /**
     * Transfer of ownership of the asset to another party during the closing of an option.
     * 
     */
    ASGN,

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
     * Settlement transactions relates to drawn securities.
     * 
     */
    DRAW,

    /**
     * Settlement transaction relates to options, futures or derivatives that are exercised.
     * 
     */
    EXER,

    /**
     * Delivery will be made free of payment but a clean payment order will be sent.
     * 
     */
    FRCL,

    /**
     * Settlement transaction relates to options, futures or derivatives that are expired worthless.
     * 
     */
    KNOC,

    /**
     * Securities are to be physically settled.
     * 
     */
    PHYS,

    /**
     * Relates to transaction on a security that is not eligible at the Central Security Depository (CSD) but for which the payment will be enacted by the central securities depository.
     * 
     */
    RESI,

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
     * Delivery cannot be performed until money is received.
     * 
     */
    UNEX;

    public String value() {
        return name();
    }

    public static SettlementTransactionCondition3Code fromValue(String v) {
        return valueOf(v);
    }

}
