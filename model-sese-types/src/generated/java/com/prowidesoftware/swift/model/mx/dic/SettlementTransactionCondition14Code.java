
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SettlementTransactionCondition14Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="SettlementTransactionCondition14Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="ADEA"/&gt;
 *     &lt;enumeration value="ASGN"/&gt;
 *     &lt;enumeration value="BUTC"/&gt;
 *     &lt;enumeration value="CLEN"/&gt;
 *     &lt;enumeration value="DLWM"/&gt;
 *     &lt;enumeration value="DIRT"/&gt;
 *     &lt;enumeration value="DRAW"/&gt;
 *     &lt;enumeration value="EXER"/&gt;
 *     &lt;enumeration value="EXPI"/&gt;
 *     &lt;enumeration value="FRCL"/&gt;
 *     &lt;enumeration value="KNOC"/&gt;
 *     &lt;enumeration value="NOMC"/&gt;
 *     &lt;enumeration value="NACT"/&gt;
 *     &lt;enumeration value="PENS"/&gt;
 *     &lt;enumeration value="PHYS"/&gt;
 *     &lt;enumeration value="RHYP"/&gt;
 *     &lt;enumeration value="RPTO"/&gt;
 *     &lt;enumeration value="RESI"/&gt;
 *     &lt;enumeration value="SHOR"/&gt;
 *     &lt;enumeration value="SPDL"/&gt;
 *     &lt;enumeration value="SPST"/&gt;
 *     &lt;enumeration value="TRAN"/&gt;
 *     &lt;enumeration value="TRIP"/&gt;
 *     &lt;enumeration value="UNEX"/&gt;
 *     &lt;enumeration value="BPSS"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "SettlementTransactionCondition14Code")
@XmlEnum
public enum SettlementTransactionCondition14Code {


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
    UNEX,

    /**
     * Identification of settlement instructions created as a result of a partial successful buy-in.
     * 
     */
    BPSS;

    public String value() {
        return name();
    }

    public static SettlementTransactionCondition14Code fromValue(String v) {
        return valueOf(v);
    }

}
