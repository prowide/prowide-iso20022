
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SettlementTransactionCondition6Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="SettlementTransactionCondition6Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="ASGN"/&gt;
 *     &lt;enumeration value="BUTC"/&gt;
 *     &lt;enumeration value="CLEN"/&gt;
 *     &lt;enumeration value="DIRT"/&gt;
 *     &lt;enumeration value="DLWM"/&gt;
 *     &lt;enumeration value="DRAW"/&gt;
 *     &lt;enumeration value="EXER"/&gt;
 *     &lt;enumeration value="FRCL"/&gt;
 *     &lt;enumeration value="KNOC"/&gt;
 *     &lt;enumeration value="PHYS"/&gt;
 *     &lt;enumeration value="RESI"/&gt;
 *     &lt;enumeration value="SHOR"/&gt;
 *     &lt;enumeration value="SPDL"/&gt;
 *     &lt;enumeration value="SPST"/&gt;
 *     &lt;enumeration value="EXPI"/&gt;
 *     &lt;enumeration value="PENS"/&gt;
 *     &lt;enumeration value="UNEX"/&gt;
 *     &lt;enumeration value="TRIP"/&gt;
 *     &lt;enumeration value="NOMC"/&gt;
 *     &lt;enumeration value="TRAN"/&gt;
 *     &lt;enumeration value="RHYP"/&gt;
 *     &lt;enumeration value="ADEA"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "SettlementTransactionCondition6Code")
@XmlEnum
public enum SettlementTransactionCondition6Code {


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
     * Settlement transaction relates to options, futures or derivatives that have expired.
     * 
     */
    EXPI,

    /**
     * Position to cover the pending sale will be available by contractual settlement date (accounting information).
     * 
     */
    PENS,

    /**
     * Delivery cannot be performed until money is received.
     * 
     */
    UNEX,

    /**
     * Securities are not be delivered but segregated following triparty collateral transaction.
     * 
     */
    TRIP,

    /**
     * No market claim should be automatically generated.
     * 
     */
    NOMC,

    /**
     * Transaction resulting from a transformation.
     * 
     */
    TRAN,

    /**
     * Collateral position is available for other purposes (for example, onwards delivery).
     * 
     */
    RHYP,

    /**
     * Settlement is on a bilaterally accepted transaction that is to be accepted beyond the regular settlement deadline.
     * 
     */
    ADEA;

    public String value() {
        return name();
    }

    public static SettlementTransactionCondition6Code fromValue(String v) {
        return valueOf(v);
    }

}
