
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PaymentCancellationRejection2Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="PaymentCancellationRejection2Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="LEGL"/>
 *     <enumeration value="AGNT"/>
 *     <enumeration value="CUST"/>
 *     <enumeration value="ARDT"/>
 *     <enumeration value="NOAS"/>
 *     <enumeration value="NOOR"/>
 *     <enumeration value="AC04"/>
 *     <enumeration value="AM04"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "PaymentCancellationRejection2Code")
@XmlEnum
public enum PaymentCancellationRejection2Code {


    /**
     * Reported when the cancellation cannot be accepted because of regulatory rules.
     * 
     */
    LEGL("LEGL"),

    /**
     * Reported when the cancellation cannot be accepted because of an agent refuses to cancel.
     * 
     */
    AGNT("AGNT"),

    /**
     * Reported when the cancellation cannot be accepted because of a customer decision (Creditor).
     * 
     */
    CUST("CUST"),

    /**
     * Cancellation not accepted as the transaction has already been returned.
     * 
     */
    ARDT("ARDT"),

    /**
     * No response from beneficiary (to the cancellation request).
     * 
     */
    NOAS("NOAS"),

    /**
     * Original transaction (subject to cancellation) never received.
     * 
     */
    NOOR("NOOR"),

    /**
     * Account number specified has been closed on the receiver’s books.
     * 
     */
    @XmlEnumValue("AC04")
    AC_04("AC04"),

    /**
     * Amount of funds available to cover specified message amount is insufficient.
     * 
     */
    @XmlEnumValue("AM04")
    AM_04("AM04");
    private final String value;

    PaymentCancellationRejection2Code(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static PaymentCancellationRejection2Code fromValue(String v) {
        for (PaymentCancellationRejection2Code c: PaymentCancellationRejection2Code.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
