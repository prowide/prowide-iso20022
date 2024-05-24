
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CancellationReason1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="CancellationReason1Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="CUST"/>
 *     <enumeration value="DUPL"/>
 *     <enumeration value="AGNT"/>
 *     <enumeration value="CURR"/>
 *     <enumeration value="UPAY"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "CancellationReason1Code")
@XmlEnum
public enum CancellationReason1Code {


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
    UPAY;

    public String value() {
        return name();
    }

    public static CancellationReason1Code fromValue(String v) {
        return valueOf(v);
    }

}
