
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ATMServiceType11Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="ATMServiceType11Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="TRFC"/>
 *     <enumeration value="TRFI"/>
 *     <enumeration value="TRFP"/>
 *     <enumeration value="ASTS"/>
 *     <enumeration value="BLCQ"/>
 *     <enumeration value="CDVF"/>
 *     <enumeration value="CHSN"/>
 *     <enumeration value="CMPF"/>
 *     <enumeration value="DCCS"/>
 *     <enumeration value="XRTD"/>
 *     <enumeration value="XRTW"/>
 *     <enumeration value="MCHG"/>
 *     <enumeration value="DPSN"/>
 *     <enumeration value="PINC"/>
 *     <enumeration value="PINR"/>
 *     <enumeration value="PINU"/>
 *     <enumeration value="PATH"/>
 *     <enumeration value="PRFL"/>
 *     <enumeration value="EMVS"/>
 *     <enumeration value="STDR"/>
 *     <enumeration value="SPRV"/>
 *     <enumeration value="DPSV"/>
 *     <enumeration value="ACCD"/>
 *     <enumeration value="MINI"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "ATMServiceType11Code")
@XmlEnum
public enum ATMServiceType11Code {


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
     * Funds transfer to pay a third party.
     * 
     */
    TRFP,

    /**
     * Request a full statement (that is a legal statement) related to a customer account.
     * 
     */
    ASTS,

    /**
     * Balance inquiry.
     * 
     */
    BLCQ,

    /**
     * Verification of the card.
     * 
     */
    CDVF,

    /**
     * Amount and notes values are chosen by the customer.
     * 
     */
    CHSN,

    /**
     * Ask for customer profile with eventualy related account information.
     * 
     */
    CMPF,

    /**
     * Ask to a DCC service provider to qualify the currency conversion for the card.
     * 
     */
    DCCS,

    /**
     * Ask for exchange rate for the ongoing deposit transaction.
     * 
     */
    XRTD,

    /**
     * Ask for exchange rate for the ongoing withdrawal transaction.
     * 
     */
    XRTW,

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
     * Select the EMV applications allowed by the acquirer.
     * 
     */
    EMVS,

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
     * Deposit of media items verified by the ATM.
     * 
     */
    DPSV,

    /**
     * Download accounts associated to the customer card.
     * 
     */
    ACCD,

    /**
     * Request a mini-statement (i.e. partial statement) related to a customer account.
     * 
     */
    MINI;

    public String value() {
        return name();
    }

    public static ATMServiceType11Code fromValue(String v) {
        return valueOf(v);
    }

}
