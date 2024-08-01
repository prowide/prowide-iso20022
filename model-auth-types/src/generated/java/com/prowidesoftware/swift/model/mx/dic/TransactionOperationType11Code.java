
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TransactionOperationType11Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="TransactionOperationType11Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="CORR"/>
 *     <enumeration value="MARU"/>
 *     <enumeration value="NEWT"/>
 *     <enumeration value="EROR"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
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
