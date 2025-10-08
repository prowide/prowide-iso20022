
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CardPaymentServiceType15Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="CardPaymentServiceType15Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="IRES"/&gt;
 *     &lt;enumeration value="URES"/&gt;
 *     &lt;enumeration value="PRES"/&gt;
 *     &lt;enumeration value="ARES"/&gt;
 *     &lt;enumeration value="FREC"/&gt;
 *     &lt;enumeration value="RREC"/&gt;
 *     &lt;enumeration value="GOPT"/&gt;
 *     &lt;enumeration value="DFCL"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "CardPaymentServiceType15Code")
@XmlEnum
public enum CardPaymentServiceType15Code {


    /**
     * Initial reservation.
     * 
     */
    IRES,

    /**
     * Update reservation.
     * 
     */
    URES,

    /**
     * Payment after reservation.
     * 
     */
    PRES,

    /**
     * Additional payment after reservation.
     * 
     */
    ARES,

    /**
     * Initial recurring payment.
     * 
     */
    FREC,

    /**
     * Repeat recurring payment.
     * 
     */
    RREC,

    /**
     * Acceptor claims for guarantee of payment.
     * 
     */
    GOPT,

    /**
     * DeferredClearing identifies transactions, like ones related to health care system, that allows a delay in clearing which ensure the payer to be refunded by a system, for example an insurance, before its bank account is debited.
     * 
     */
    DFCL;

    public String value() {
        return name();
    }

    public static CardPaymentServiceType15Code fromValue(String v) {
        return valueOf(v);
    }

}
