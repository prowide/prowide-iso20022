
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TransactionOperationType10Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="TransactionOperationType10Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="COMP"/>
 *     <enumeration value="CORR"/>
 *     <enumeration value="EROR"/>
 *     <enumeration value="MODI"/>
 *     <enumeration value="NEWT"/>
 *     <enumeration value="OTHR"/>
 *     <enumeration value="POSC"/>
 *     <enumeration value="REVI"/>
 *     <enumeration value="TERM"/>
 *     <enumeration value="VALU"/>
 *     <enumeration value="MARU"/>
 *     <enumeration value="PRTO"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "TransactionOperationType10Code")
@XmlEnum
public enum TransactionOperationType10Code {


    /**
     * Transaction is a compression.
     * 
     */
    COMP,

    /**
     * Transaction corrects errors in a previously sent transaction.
     * 
     */
    CORR,

    /**
     * Cancellation of a wrongly submitted entire report in case the contract never came into existence or was not subject to regulatory reporting requirements but was reported to a regulatory authority by mistake or a cancellation of duplicate report.
     * 
     */
    EROR,

    /**
     * Transaction modifies in a previously sent transaction.
     * 
     */
    MODI,

    /**
     * Transaction is a new transaction.
     * 
     */
    NEWT,

    /**
     * Other.
     * 
     */
    OTHR,

    /**
     * Contract to be reported as a new trade and included in a separate position report on the same day.
     * 
     */
    POSC,

    /**
     * Re-opening of a derivative, at a trade or position level, that was cancelled or terminated by mistake.
     * 
     */
    REVI,

    /**
     * Closing of an existing transaction because of a new event (for example: Compression, Novation). This does not apply to transactions that terminate at contractual maturity date.
     * 
     */
    TERM,

    /**
     * Update of a contract valuation or collateral.
     * 
     */
    VALU,

    /**
     * Indicates the report of the collateral data or of their modifications, but not the corrections of the previously reported collateral details.
     * 
     */
    MARU,

    /**
     * Indicates transfers swap transaction from one SDR to another SDR (change of swap data repository).
     * 
     */
    PRTO;

    public String value() {
        return name();
    }

    public static TransactionOperationType10Code fromValue(String v) {
        return valueOf(v);
    }

}
