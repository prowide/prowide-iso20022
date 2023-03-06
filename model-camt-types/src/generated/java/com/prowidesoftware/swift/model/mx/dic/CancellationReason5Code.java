
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CancellationReason5Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="CancellationReason5Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="DUPL"/&gt;
 *     &lt;enumeration value="AGNT"/&gt;
 *     &lt;enumeration value="CURR"/&gt;
 *     &lt;enumeration value="CUST"/&gt;
 *     &lt;enumeration value="UPAY"/&gt;
 *     &lt;enumeration value="CUTA"/&gt;
 *     &lt;enumeration value="TECH"/&gt;
 *     &lt;enumeration value="FRAD"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "CancellationReason5Code")
@XmlEnum
public enum CancellationReason5Code {


    /**
     * Payment is a duplicate of another payment.
     * 
     */
    DUPL,

    /**
     * Agent in the payment workflow is incorrect.
     * 
     */
    AGNT,

    /**
     * Currency of the payment is incorrect.
     * 
     */
    CURR,

    /**
     * Cancellation requested by the Debtor.
     * 
     */
    CUST,

    /**
     * Payment is not justified.
     * 
     */
    UPAY,

    /**
     * Cancellation requested because an investigation request has been received and no remediation is possible.
     * 
     */
    CUTA,

    /**
     * Cancellation requested following technical problems resulting in an erroneous transaction.
     * 
     */
    TECH,

    /**
     * Cancellation requested following a transaction that was originated fraudulently. The use of the FraudulentOrigin code should be governed by jurisdictions.
     * 
     */
    FRAD;

    public String value() {
        return name();
    }

    public static CancellationReason5Code fromValue(String v) {
        return valueOf(v);
    }

}
