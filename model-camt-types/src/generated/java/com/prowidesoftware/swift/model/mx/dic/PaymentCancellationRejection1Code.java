
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PaymentCancellationRejection1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="PaymentCancellationRejection1Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="LEGL"/>
 *     <enumeration value="AGNT"/>
 *     <enumeration value="CUST"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "PaymentCancellationRejection1Code")
@XmlEnum
public enum PaymentCancellationRejection1Code {


    /**
     * Reported when the cancellation cannot be accepted because of regulatory rules.
     * 
     */
    LEGL,

    /**
     * Reported when the cancellation cannot be accepted because of an agent refuses to cancel.
     * 
     */
    AGNT,

    /**
     * Reported when the cancellation cannot be accepted because of a customer decision (Creditor).
     * 
     */
    CUST;

    public String value() {
        return name();
    }

    public static PaymentCancellationRejection1Code fromValue(String v) {
        return valueOf(v);
    }

}
