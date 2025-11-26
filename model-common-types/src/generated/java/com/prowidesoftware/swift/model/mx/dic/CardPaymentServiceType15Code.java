
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CardPaymentServiceType15Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="CardPaymentServiceType15Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="IRES"/>
 *     <enumeration value="URES"/>
 *     <enumeration value="PRES"/>
 *     <enumeration value="ARES"/>
 *     <enumeration value="FREC"/>
 *     <enumeration value="RREC"/>
 *     <enumeration value="GOPT"/>
 *     <enumeration value="DFCL"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
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
