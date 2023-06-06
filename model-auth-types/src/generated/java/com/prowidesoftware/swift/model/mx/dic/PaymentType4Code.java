
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PaymentType4Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="PaymentType4Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="UFRO"/>
 *     <enumeration value="UWIN"/>
 *     <enumeration value="PEXH"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "PaymentType4Code")
@XmlEnum
public enum PaymentType4Code {


    /**
     * Transaction is an initial payment made by one of the counterparties  either to bring a transaction to fair value or for any other reason that may be the cause of an off-market transaction.
     * 
     */
    UFRO,

    /**
     * Transaction is the final settlement payment made when a transaction is unwound prior to its end date or a payment that may result due to the full termination of derivative transaction(s).
     * 
     */
    UWIN,

    /**
     * Transaction is an exchange of notional values for cross-currency swaps.
     * 
     */
    PEXH;

    public String value() {
        return name();
    }

    public static PaymentType4Code fromValue(String v) {
        return valueOf(v);
    }

}
