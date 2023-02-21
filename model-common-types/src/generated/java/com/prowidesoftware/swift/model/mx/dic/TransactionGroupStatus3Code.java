
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TransactionGroupStatus3Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="TransactionGroupStatus3Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="ACTC"/&gt;
 *     &lt;enumeration value="RCVD"/&gt;
 *     &lt;enumeration value="PART"/&gt;
 *     &lt;enumeration value="RJCT"/&gt;
 *     &lt;enumeration value="PDNG"/&gt;
 *     &lt;enumeration value="ACCP"/&gt;
 *     &lt;enumeration value="ACSP"/&gt;
 *     &lt;enumeration value="ACSC"/&gt;
 *     &lt;enumeration value="ACWC"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "TransactionGroupStatus3Code")
@XmlEnum
public enum TransactionGroupStatus3Code {


    /**
     * Authentication and syntactical and semantical validation are successful.
     * 
     */
    ACTC,

    /**
     * Payment initiation has been received by the receiving agent.
     * 
     */
    RCVD,

    /**
     * A number of transactions have been accepted, whereas another number of transactions have not yet achieved 'accepted' status.
     * 
     */
    PART,

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

    public static TransactionGroupStatus3Code fromValue(String v) {
        return valueOf(v);
    }

}
