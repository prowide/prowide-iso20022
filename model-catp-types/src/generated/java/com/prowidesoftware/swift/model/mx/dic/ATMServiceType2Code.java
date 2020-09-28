
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ATMServiceType2Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ATMServiceType2Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="CHSN"/&gt;
 *     &lt;enumeration value="PINC"/&gt;
 *     &lt;enumeration value="PINR"/&gt;
 *     &lt;enumeration value="PINU"/&gt;
 *     &lt;enumeration value="PATH"/&gt;
 *     &lt;enumeration value="PRFL"/&gt;
 *     &lt;enumeration value="STDR"/&gt;
 *     &lt;enumeration value="SPRV"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ATMServiceType2Code")
@XmlEnum
public enum ATMServiceType2Code {


    /**
     * Amount and notes values are chosen by the customer.
     * 
     */
    CHSN,

    /**
     * Modification of the card PIN value.
     * 
     */
    PINC,

    /**
     * Resetting of a PIN.
     * 
     */
    PINR,

    /**
     * Unblock the PIN.
     * 
     */
    PINU,

    /**
     * Withdrawal transaction was pre-authorised by another channel, for instance a mobile. The amount could be absent from the withdrawal request message.
     * 
     */
    PATH,

    /**
     * Amount and notes Values are pre-defined by the customer profile.
     * 
     */
    PRFL,

    /**
     * Standard withdrawal of items.
     * 
     */
    STDR,

    /**
     * Withdrawal authorised by a supervisor.
     * 
     */
    SPRV;

    public String value() {
        return name();
    }

    public static ATMServiceType2Code fromValue(String v) {
        return valueOf(v);
    }

}
