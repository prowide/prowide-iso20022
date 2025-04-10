
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TransactionIndividualStatus3Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="TransactionIndividualStatus3Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="ACTC"/>
 *     <enumeration value="RJCT"/>
 *     <enumeration value="PDNG"/>
 *     <enumeration value="ACCP"/>
 *     <enumeration value="ACSP"/>
 *     <enumeration value="ACSC"/>
 *     <enumeration value="ACWC"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "TransactionIndividualStatus3Code")
@XmlEnum
public enum TransactionIndividualStatus3Code {


    /**
     * Authentication and syntactical and semantical validation are successful.
     * 
     */
    ACTC,

    /**
     * Payment initiation or individual transaction included in the payment initiation has been rejected.
     * 
     */
    RJCT,

    /**
     * Payment initiation or individual transaction included in the payment initiation is pending.  Further checks and status update will be performed.
     * 
     */
    PDNG,

    /**
     * Preceding check of technical validation was successful. Customer profile check was also successful.
     * 
     */
    ACCP,

    /**
     * All preceding checks such as technical validation and customer profile were successful and therefore the payment initiation has been accepted for execution.
     * 
     */
    ACSP,

    /**
     * Settlement on the debtor's account has been completed. 
     * 
     * Usage : this can be used by the first agent to report to the debtor that the transaction has been completed. Warning : this status is provided for transaction status reasons, not for financial information. It can only be used after bilateral agreement
     * 
     */
    ACSC,

    /**
     * Instruction is accepted but a change will be made, such as date or remittance not sent.
     * 
     */
    ACWC;

    public String value() {
        return name();
    }

    public static TransactionIndividualStatus3Code fromValue(String v) {
        return valueOf(v);
    }

}
