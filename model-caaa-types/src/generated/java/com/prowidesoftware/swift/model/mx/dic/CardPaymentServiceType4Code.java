
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CardPaymentServiceType4Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="CardPaymentServiceType4Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="TP2P"/>
 *     <enumeration value="TP2B"/>
 *     <enumeration value="BALC"/>
 *     <enumeration value="CACT"/>
 *     <enumeration value="CRDP"/>
 *     <enumeration value="CAFT"/>
 *     <enumeration value="CAVR"/>
 *     <enumeration value="CSHW"/>
 *     <enumeration value="CSHB"/>
 *     <enumeration value="CSHD"/>
 *     <enumeration value="DEFR"/>
 *     <enumeration value="LOAD"/>
 *     <enumeration value="ORCR"/>
 *     <enumeration value="PINC"/>
 *     <enumeration value="QUCH"/>
 *     <enumeration value="RFND"/>
 *     <enumeration value="RESA"/>
 *     <enumeration value="VALC"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "CardPaymentServiceType4Code")
@XmlEnum
public enum CardPaymentServiceType4Code {


    /**
     * Card payment transaction transfer from person to person.
     * 
     */
    @XmlEnumValue("TP2P")
    TP_2_P("TP2P"),

    /**
     * Card payment transaction transfer from person to business.
     * 
     */
    @XmlEnumValue("TP2B")
    TP_2_B("TP2B"),

    /**
     * Balance enquiry.
     * 
     */
    BALC("BALC"),

    /**
     * Card activation.
     * 
     */
    CACT("CACT"),

    /**
     * Card payment.
     * 
     */
    CRDP("CRDP"),

    /**
     * Transfer of funds to and/or from a card account.
     * 
     */
    CAFT("CAFT"),

    /**
     * Card verification.
     * 
     */
    CAVR("CAVR"),

    /**
     * Cash advance or withdrawals on a POI (Point Of Interaction), or at a bank counter.
     * 
     */
    CSHW("CSHW"),

    /**
     * Card payment with cash-back.
     * 
     */
    CSHB("CSHB"),

    /**
     * Cash deposit.
     * 
     */
    CSHD("CSHD"),

    /**
     * Deferred payment.
     * 
     */
    DEFR("DEFR"),

    /**
     * Loading or reloading non-financial account.
     * 
     */
    LOAD("LOAD"),

    /**
     * Original credit.
     * 
     */
    ORCR("ORCR"),

    /**
     * PIN (Personal Identification Number) change.
     * 
     */
    PINC("PINC"),

    /**
     * Quasi-cash.
     * 
     */
    QUCH("QUCH"),

    /**
     * Refund transaction.
     * 
     */
    RFND("RFND"),

    /**
     * Reservation (pre-authorisation).
     * 
     */
    RESA("RESA"),

    /**
     * Card validity check.
     * 
     */
    VALC("VALC");
    private final String value;

    CardPaymentServiceType4Code(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static CardPaymentServiceType4Code fromValue(String v) {
        for (CardPaymentServiceType4Code c: CardPaymentServiceType4Code.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
