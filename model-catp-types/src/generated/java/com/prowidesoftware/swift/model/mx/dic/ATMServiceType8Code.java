
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ATMServiceType8Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ATMServiceType8Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="ASTS"/&gt;
 *     &lt;enumeration value="BLCQ"/&gt;
 *     &lt;enumeration value="PINC"/&gt;
 *     &lt;enumeration value="STDR"/&gt;
 *     &lt;enumeration value="PRFL"/&gt;
 *     &lt;enumeration value="PATH"/&gt;
 *     &lt;enumeration value="CHSN"/&gt;
 *     &lt;enumeration value="TRFC"/&gt;
 *     &lt;enumeration value="TRFI"/&gt;
 *     &lt;enumeration value="MCHG"/&gt;
 *     &lt;enumeration value="DPSN"/&gt;
 *     &lt;enumeration value="PINR"/&gt;
 *     &lt;enumeration value="PINU"/&gt;
 *     &lt;enumeration value="SPRV"/&gt;
 *     &lt;enumeration value="DPSV"/&gt;
 *     &lt;enumeration value="TRFP"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ATMServiceType8Code")
@XmlEnum
public enum ATMServiceType8Code {


    /**
     * Ask for account statement information to a related custumer account.
     * 
     */
    ASTS,

    /**
     * Balance inquiry.
     * 
     */
    BLCQ,

    /**
     * Modification of the card PIN value.
     * 
     */
    PINC,

    /**
     * Standard withdrawal of items.
     * 
     */
    STDR,

    /**
     * Amount and notes Values are pre-defined by the customer profile.
     * 
     */
    PRFL,

    /**
     * Withdrawal transaction was pre-authorised by another channel, for instance a mobile. The amount could be absent from the withdrawal request message.
     * 
     */
    PATH,

    /**
     * Amount and notes values are chosen by the customer.
     * 
     */
    CHSN,

    /**
     * Funds transfer between accounts belonging to the customer in the same bank.
     * 
     */
    TRFC,

    /**
     * Funds transfer to another customer.
     * 
     */
    TRFI,

    /**
     * Making change between media types.
     * 
     */
    MCHG,

    /**
     * Deposit of media items unverified by the ATM, for instance in an envelope.
     * 
     */
    DPSN,

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
     * Withdrawal authorised by a supervisor.
     * 
     */
    SPRV,

    /**
     * Deposit of media items verified by the ATM.
     * 
     */
    DPSV,

    /**
     * Funds transfer to pay a third party.
     * 
     */
    TRFP;

    public String value() {
        return name();
    }

    public static ATMServiceType8Code fromValue(String v) {
        return valueOf(v);
    }

}
