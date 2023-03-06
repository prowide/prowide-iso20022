
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PaymentInstrumentType1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="PaymentInstrumentType1Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="CARD"/&gt;
 *     &lt;enumeration value="CASH"/&gt;
 *     &lt;enumeration value="CHCK"/&gt;
 *     &lt;enumeration value="LOYT"/&gt;
 *     &lt;enumeration value="SVAC"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "PaymentInstrumentType1Code")
@XmlEnum
public enum PaymentInstrumentType1Code {


    /**
     * Payment card (credit or debit).
     * 
     */
    CARD,

    /**
     * Cash managed by a cash handling system.
     * 
     */
    CASH,

    /**
     * Paper check.
     * 
     */
    CHCK,

    /**
     * Account using loyalty processing.
     * 
     */
    LOYT,

    /**
     * Account accessed by a stored value instrument such as a card or a certificate.
     * 
     */
    SVAC;

    public String value() {
        return name();
    }

    public static PaymentInstrumentType1Code fromValue(String v) {
        return valueOf(v);
    }

}
