
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ATMServiceType8Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="ATMServiceType8Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="ASTS"/>
 *     <enumeration value="BLCQ"/>
 *     <enumeration value="PINC"/>
 *     <enumeration value="STDR"/>
 *     <enumeration value="PRFL"/>
 *     <enumeration value="PATH"/>
 *     <enumeration value="CHSN"/>
 *     <enumeration value="TRFC"/>
 *     <enumeration value="TRFI"/>
 *     <enumeration value="MCHG"/>
 *     <enumeration value="DPSN"/>
 *     <enumeration value="PINR"/>
 *     <enumeration value="PINU"/>
 *     <enumeration value="SPRV"/>
 *     <enumeration value="DPSV"/>
 *     <enumeration value="TRFP"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
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
