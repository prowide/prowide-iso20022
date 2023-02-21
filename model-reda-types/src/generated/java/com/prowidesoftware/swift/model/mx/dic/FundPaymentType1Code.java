
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FundPaymentType1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="FundPaymentType1Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="DRAF"/&gt;
 *     &lt;enumeration value="CACC"/&gt;
 *     &lt;enumeration value="CHEQ"/&gt;
 *     &lt;enumeration value="CRDT"/&gt;
 *     &lt;enumeration value="DDEB"/&gt;
 *     &lt;enumeration value="CARD"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "FundPaymentType1Code")
@XmlEnum
public enum FundPaymentType1Code {


    /**
     * Payment instrument is a bankers draft.
     * 
     */
    DRAF,

    /**
     * Payment instrument is a cash account.
     * 
     */
    CACC,

    /**
     * Payment instrument is a cheque.
     * 
     */
    CHEQ,

    /**
     * Payment instrument is a credit transfer.
     * 
     */
    CRDT,

    /**
     * Payment instrument is a direct debit.
     * 
     */
    DDEB,

    /**
     * Payment instrument is a payment card.
     * 
     */
    CARD;

    public String value() {
        return name();
    }

    public static FundPaymentType1Code fromValue(String v) {
        return valueOf(v);
    }

}
