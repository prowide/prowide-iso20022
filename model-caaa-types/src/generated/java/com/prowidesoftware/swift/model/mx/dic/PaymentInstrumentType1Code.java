
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PaymentInstrumentType1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="PaymentInstrumentType1Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="CARD"/>
 *     <enumeration value="CASH"/>
 *     <enumeration value="CHCK"/>
 *     <enumeration value="LOYT"/>
 *     <enumeration value="SVAC"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
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
