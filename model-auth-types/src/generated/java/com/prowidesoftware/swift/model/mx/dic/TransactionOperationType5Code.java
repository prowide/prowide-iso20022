
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TransactionOperationType5Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="TransactionOperationType5Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="NEWT"/&gt;
 *     &lt;enumeration value="MODI"/&gt;
 *     &lt;enumeration value="EROR"/&gt;
 *     &lt;enumeration value="ETRM"/&gt;
 *     &lt;enumeration value="CORR"/&gt;
 *     &lt;enumeration value="VALU"/&gt;
 *     &lt;enumeration value="POSC"/&gt;
 *     &lt;enumeration value="COLU"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "TransactionOperationType5Code")
@XmlEnum
public enum TransactionOperationType5Code {


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
     * Cancellation of a wrongly submitted entire report in case the contract never came into existence or was not subject to regulatory reporting requirements but was reported to a regulatory authority by mistake, in which case, it will be identified as ‘error’.
     * 
     */
    EROR,

    /**
     * Transaction is an early termination.
     * 
     */
    ETRM,

    /**
     * Transaction corrects errors in a previously sent transaction.
     * 
     */
    CORR,

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
     * Update of a contract collateral.
     * 
     */
    COLU;

    public String value() {
        return name();
    }

    public static TransactionOperationType5Code fromValue(String v) {
        return valueOf(v);
    }

}
