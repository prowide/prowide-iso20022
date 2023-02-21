
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for OrderConfirmationStatus1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="OrderConfirmationStatus1Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="STNP"/&gt;
 *     &lt;enumeration value="CPNP"/&gt;
 *     &lt;enumeration value="COAC"/&gt;
 *     &lt;enumeration value="CREC"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "OrderConfirmationStatus1Code")
@XmlEnum
public enum OrderConfirmationStatus1Code {


    /**
     * Order confirmation or order confirmation cancellation instruction or order confirmation amendment has been sent to the next party, eg, the next intermediary.
     * 
     */
    STNP,

    /**
     * Communication problems with the next party.
     * 
     */
    CPNP,

    /**
     * Order confirmation or order confirmation amendment is accepted.
     * 
     */
    COAC,

    /**
     * Order confirmation or order confirmation amendment is received, ie, technical validation of the message is ok, and the message is now at the receiving side.
     * 
     */
    CREC;

    public String value() {
        return name();
    }

    public static OrderConfirmationStatus1Code fromValue(String v) {
        return valueOf(v);
    }

}
