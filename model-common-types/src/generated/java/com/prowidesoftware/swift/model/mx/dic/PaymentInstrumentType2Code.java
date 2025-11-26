
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PaymentInstrumentType2Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="PaymentInstrumentType2Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="CARD"/>
 *     <enumeration value="CASH"/>
 *     <enumeration value="CHCK"/>
 *     <enumeration value="LOYT"/>
 *     <enumeration value="SVAC"/>
 *     <enumeration value="DRDT"/>
 *     <enumeration value="CRTF"/>
 *     <enumeration value="VCHR"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "PaymentInstrumentType2Code")
@XmlEnum
public enum PaymentInstrumentType2Code {


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
    SVAC,

    /**
     * Payment, initiated by the creditor, to debit a debtor's account in favour of the creditor. A direct debit can be pre-authorised or not. In most countries, authorisation is in the form of a mandate between the debtor and creditor.
     * 
     */
    DRDT,

    /**
     * Payment made by transferring an amount of money from a debtor to a creditor. The payment flows through one or more financial institutions or systems.
     * 
     */
    CRTF,

    /**
     * Bond of the redeemable transaction type which is worth a certain monetary value and which may be spent only for specific reasons or on specific goods.
     * 
     */
    VCHR;

    public String value() {
        return name();
    }

    public static PaymentInstrumentType2Code fromValue(String v) {
        return valueOf(v);
    }

}
