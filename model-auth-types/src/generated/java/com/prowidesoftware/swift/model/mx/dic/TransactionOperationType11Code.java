
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TransactionOperationType11Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="TransactionOperationType11Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="CORR"/&gt;
 *     &lt;enumeration value="MARU"/&gt;
 *     &lt;enumeration value="NEWT"/&gt;
 *     &lt;enumeration value="EROR"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "TransactionOperationType11Code")
@XmlEnum
public enum TransactionOperationType11Code {


    /**
     * Transaction corrects errors in a previously sent transaction.
     * 
     */
    CORR,

    /**
     * Indicates the report of the collateral data or of their modifications, but not the corrections of the previously reported collateral details.
     * 
     */
    MARU,

    /**
     * Transaction is a new transaction.
     * 
     */
    NEWT,

    /**
     * Cancellation of a wrongly submitted entire report in case the contract never came into existence or was not subject to regulatory reporting requirements but was reported to a regulatory authority by mistake or a cancellation of duplicate report.
     * 
     */
    EROR;

    public String value() {
        return name();
    }

    public static TransactionOperationType11Code fromValue(String v) {
        return valueOf(v);
    }

}
