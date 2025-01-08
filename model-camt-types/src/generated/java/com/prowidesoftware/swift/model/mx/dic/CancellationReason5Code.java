
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CancellationReason5Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="CancellationReason5Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="DUPL"/>
 *     <enumeration value="AGNT"/>
 *     <enumeration value="CURR"/>
 *     <enumeration value="CUST"/>
 *     <enumeration value="UPAY"/>
 *     <enumeration value="CUTA"/>
 *     <enumeration value="TECH"/>
 *     <enumeration value="FRAD"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
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
