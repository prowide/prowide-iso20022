
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ATMServiceType7Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="ATMServiceType7Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="CHSN"/>
 *     <enumeration value="PINC"/>
 *     <enumeration value="PINR"/>
 *     <enumeration value="PINU"/>
 *     <enumeration value="PATH"/>
 *     <enumeration value="PRFL"/>
 *     <enumeration value="STDR"/>
 *     <enumeration value="SPRV"/>
 *     <enumeration value="TRFC"/>
 *     <enumeration value="TRFI"/>
 *     <enumeration value="DPSN"/>
 *     <enumeration value="DPSV"/>
 *     <enumeration value="MCHG"/>
 *     <enumeration value="TRFP"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "ATMServiceType7Code")
@XmlEnum
public enum ATMServiceType7Code {


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
    SPRV,

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
     * Deposit of media items unverified by the ATM, for instance in an envelope.
     * 
     */
    DPSN,

    /**
     * Deposit of media items verified by the ATM.
     * 
     */
    DPSV,

    /**
     * Making change between media types.
     * 
     */
    MCHG,

    /**
     * Funds transfer to pay a third party.
     * 
     */
    TRFP;

    public String value() {
        return name();
    }

    public static ATMServiceType7Code fromValue(String v) {
        return valueOf(v);
    }

}
