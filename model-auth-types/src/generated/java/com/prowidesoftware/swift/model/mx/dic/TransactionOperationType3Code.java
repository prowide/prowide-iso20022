
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TransactionOperationType3Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="TransactionOperationType3Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="CORR"/&gt;
 *     &lt;enumeration value="ETRM"/&gt;
 *     &lt;enumeration value="EROR"/&gt;
 *     &lt;enumeration value="NEWT"/&gt;
 *     &lt;enumeration value="POSC"/&gt;
 *     &lt;enumeration value="VALU"/&gt;
 *     &lt;enumeration value="COMP"/&gt;
 *     &lt;enumeration value="MODI"/&gt;
 *     &lt;enumeration value="OTHR"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "TransactionOperationType3Code")
@XmlEnum
public enum TransactionOperationType3Code {


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
    OTHR;

    public String value() {
        return name();
    }

    public static TransactionOperationType3Code fromValue(String v) {
        return valueOf(v);
    }

}
