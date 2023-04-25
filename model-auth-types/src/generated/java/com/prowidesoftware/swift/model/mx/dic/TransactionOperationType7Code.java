
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TransactionOperationType7Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="TransactionOperationType7Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="CORR"/>
 *     <enumeration value="EROR"/>
 *     <enumeration value="NEWT"/>
 *     <enumeration value="POSC"/>
 *     <enumeration value="VALU"/>
 *     <enumeration value="COMP"/>
 *     <enumeration value="MODI"/>
 *     <enumeration value="OTHR"/>
 *     <enumeration value="REVI"/>
 *     <enumeration value="TERM"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "TransactionOperationType7Code")
@XmlEnum
public enum TransactionOperationType7Code {


    /**
     * Transaction corrects errors in a previously sent transaction.
     * 
     */
    CORR,

    /**
     * Cancellation of a wrongly submitted entire report in case the contract never came into existence or was not subject to regulatory reporting requirements but was reported to a regulatory authority by mistake, in which case, it will be identified as ‘error’.
     * 
     */
    EROR,

    /**
     * Transaction is a new transaction.
     * 
     */
    NEWT,

    /**
     * Contract to be reported as a new trade and included in a separate position report on the same day.
     * 
     */
    POSC,

    /**
     * Update of a contract valuation or collateral.
     * 
     */
    VALU,

    /**
     * Transaction is a compression.
     * 
     */
    COMP,

    /**
     * Transaction modifies in a previously sent transaction.
     * 
     */
    MODI,

    /**
     * Other.
     * 
     */
    OTHR,

    /**
     * Re-opening of a derivative, at a trade or position level, that was cancelled or terminated by mistake.
     * 
     */
    REVI,

    /**
     * Closing of an existing transaction because of a new event (for example: Compression, Novation). This does not apply to transactions that terminate at contractual maturity date.
     * 
     */
    TERM;

    public String value() {
        return name();
    }

    public static TransactionOperationType7Code fromValue(String v) {
        return valueOf(v);
    }

}
