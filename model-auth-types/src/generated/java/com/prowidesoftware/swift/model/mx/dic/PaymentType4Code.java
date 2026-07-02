
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PaymentType4Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="PaymentType4Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="UFRO"/&gt;
 *     &lt;enumeration value="UWIN"/&gt;
 *     &lt;enumeration value="PEXH"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
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
