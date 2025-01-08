
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SettlementTransactionCondition10Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="SettlementTransactionCondition10Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="ADEA"/>
 *     <enumeration value="ASGN"/>
 *     <enumeration value="BUTC"/>
 *     <enumeration value="CLEN"/>
 *     <enumeration value="DLWM"/>
 *     <enumeration value="DIRT"/>
 *     <enumeration value="DRAW"/>
 *     <enumeration value="EXER"/>
 *     <enumeration value="EXPI"/>
 *     <enumeration value="FRCL"/>
 *     <enumeration value="KNOC"/>
 *     <enumeration value="NOMC"/>
 *     <enumeration value="NACT"/>
 *     <enumeration value="PENS"/>
 *     <enumeration value="PHYS"/>
 *     <enumeration value="RHYP"/>
 *     <enumeration value="RPTO"/>
 *     <enumeration value="RESI"/>
 *     <enumeration value="SHOR"/>
 *     <enumeration value="SPDL"/>
 *     <enumeration value="SPST"/>
 *     <enumeration value="TRAN"/>
 *     <enumeration value="TRIP"/>
 *     <enumeration value="UNEX"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "SettlementTransactionCondition10Code")
@XmlEnum
public enum SettlementTransactionCondition10Code {


    /**
     * Settlement is on a bilaterally accepted transaction that is to be accepted beyond the regular settlement deadline.
     * 
     */
    ADEA,

    /**
     * Transfer of ownership of the asset to another party during the closing of an option.
     * 
     */
    ASGN,

    /**
     * Transaction is a buy to cover.
     * 
     */
    BUTC,

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
     * Settlement transaction relates to options, futures or derivatives that have expired.
     * 
     */
    EXPI,

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
     * No market claim should be automatically generated.
     * 
     */
    NOMC,

    /**
     * Security transaction is not for accounting.
     * 
     */
    NACT,

    /**
     * Position to cover the pending sale will be available by contractual settlement date (accounting information).
     * 
     */
    PENS,

    /**
     * Securities are to be physically settled.
     * 
     */
    PHYS,

    /**
     * Collateral position is available for other purposes (for example, onwards delivery).
     * 
     */
    RHYP,

    /**
     * Relates to a transaction that is for reporting purposes only.
     * 
     */
    RPTO,

    /**
     * Relates to transaction on a security that is not eligible at the Central Security Depository (CSD) but for which the payment will be enacted by the central securities depository.
     * 
     */
    RESI,

    /**
     * Account is used for short sale orders.
     * 
     */
    SHOR,

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
     * Transaction resulting from a transformation.
     * 
     */
    TRAN,

    /**
     * Securities are not be delivered but segregated following triparty collateral transaction.
     * 
     */
    TRIP,

    /**
     * Delivery cannot be performed until money is received.
     * 
     */
    UNEX;

    public String value() {
        return name();
    }

    public static SettlementTransactionCondition10Code fromValue(String v) {
        return valueOf(v);
    }

}
