
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TransactionOperationType3Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="TransactionOperationType3Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="CORR"/>
 *     <enumeration value="ETRM"/>
 *     <enumeration value="EROR"/>
 *     <enumeration value="NEWT"/>
 *     <enumeration value="POSC"/>
 *     <enumeration value="VALU"/>
 *     <enumeration value="COMP"/>
 *     <enumeration value="MODI"/>
 *     <enumeration value="OTHR"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
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
