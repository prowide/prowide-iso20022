
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CancellationReason4Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="CancellationReason4Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="CUST"/>
 *     <enumeration value="DUPL"/>
 *     <enumeration value="AGNT"/>
 *     <enumeration value="CURR"/>
 *     <enumeration value="UPAY"/>
 *     <enumeration value="CUTA"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "CancellationReason4Code")
@XmlEnum
public enum CancellationReason4Code {


    /**
     * Cancellation requested by the Debtor.
     * 
     */
    CUST,

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
     * Payment is not justified.
     * 
     */
    UPAY,

    /**
     * Cancellation requested because an investigation request has been received and no remediation is possible.
     * 
     */
    CUTA;

    public String value() {
        return name();
    }

    public static CancellationReason4Code fromValue(String v) {
        return valueOf(v);
    }

}
