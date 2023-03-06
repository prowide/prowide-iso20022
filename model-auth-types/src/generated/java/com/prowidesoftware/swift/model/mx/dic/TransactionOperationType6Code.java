
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TransactionOperationType6Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="TransactionOperationType6Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="REUU"/&gt;
 *     &lt;enumeration value="COLU"/&gt;
 *     &lt;enumeration value="CORR"/&gt;
 *     &lt;enumeration value="ETRM"/&gt;
 *     &lt;enumeration value="VALU"/&gt;
 *     &lt;enumeration value="POSC"/&gt;
 *     &lt;enumeration value="NEWT"/&gt;
 *     &lt;enumeration value="MODI"/&gt;
 *     &lt;enumeration value="MARU"/&gt;
 *     &lt;enumeration value="EROR"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "TransactionOperationType6Code")
@XmlEnum
public enum TransactionOperationType6Code {


    /**
     * Update in the reuse of collateral, the reinvestment of cash or the margin lending funding sources.
     * 
     */
    REUU,

    /**
     * Update of a contract collateral.
     * 
     */
    COLU,

    /**
     * Transaction corrects errors in a previously sent transaction.
     * 
     */
    CORR,

    /**
     * Transaction is an early termination.
     * 
     */
    ETRM,

    /**
     * Update of a contract valuation or collateral.
     * 
     */
    VALU,

    /**
     * Contract to be reported as a new trade and included in a separate position report on the same day.
     * 
     */
    POSC,

    /**
     * Transaction is a new transaction.
     * 
     */
    NEWT,

    /**
     * Transaction modifies in a previously sent transaction.
     * 
     */
    MODI,

    /**
     * Specifies a dedicated report to provide changes in initial and variation margin that a reporting counterparty posts with regards to CCP-cleared SFTs.
     * 
     */
    MARU,

    /**
     * Cancellation of a wrongly submitted entire report in case the contract never came into existence or was not subject to regulatory reporting requirements but was reported to a regulatory authority by mistake, in which case, it will be identified as ‘error’.
     * 
     */
    EROR;

    public String value() {
        return name();
    }

    public static TransactionOperationType6Code fromValue(String v) {
        return valueOf(v);
    }

}
