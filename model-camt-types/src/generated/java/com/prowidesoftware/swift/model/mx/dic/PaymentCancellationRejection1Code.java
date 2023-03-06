
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PaymentCancellationRejection1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="PaymentCancellationRejection1Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="LEGL"/&gt;
 *     &lt;enumeration value="AGNT"/&gt;
 *     &lt;enumeration value="CUST"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
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
