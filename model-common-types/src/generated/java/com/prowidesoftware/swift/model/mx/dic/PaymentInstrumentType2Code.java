
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PaymentInstrumentType2Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="PaymentInstrumentType2Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="CARD"/&gt;
 *     &lt;enumeration value="CASH"/&gt;
 *     &lt;enumeration value="CHCK"/&gt;
 *     &lt;enumeration value="LOYT"/&gt;
 *     &lt;enumeration value="SVAC"/&gt;
 *     &lt;enumeration value="DRDT"/&gt;
 *     &lt;enumeration value="CRTF"/&gt;
 *     &lt;enumeration value="VCHR"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
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
