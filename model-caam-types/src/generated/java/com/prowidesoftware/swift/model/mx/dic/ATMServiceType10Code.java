
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ATMServiceType10Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ATMServiceType10Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="TRFC"/&gt;
 *     &lt;enumeration value="TRFI"/&gt;
 *     &lt;enumeration value="TRFP"/&gt;
 *     &lt;enumeration value="ASTS"/&gt;
 *     &lt;enumeration value="BLCQ"/&gt;
 *     &lt;enumeration value="CDVF"/&gt;
 *     &lt;enumeration value="CHSN"/&gt;
 *     &lt;enumeration value="CMPF"/&gt;
 *     &lt;enumeration value="DCCS"/&gt;
 *     &lt;enumeration value="XRTD"/&gt;
 *     &lt;enumeration value="XRTW"/&gt;
 *     &lt;enumeration value="MCHG"/&gt;
 *     &lt;enumeration value="DPSN"/&gt;
 *     &lt;enumeration value="PINC"/&gt;
 *     &lt;enumeration value="PINR"/&gt;
 *     &lt;enumeration value="PINU"/&gt;
 *     &lt;enumeration value="PATH"/&gt;
 *     &lt;enumeration value="PRFL"/&gt;
 *     &lt;enumeration value="EMVS"/&gt;
 *     &lt;enumeration value="STDR"/&gt;
 *     &lt;enumeration value="SPRV"/&gt;
 *     &lt;enumeration value="DPSV"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ATMServiceType10Code")
@XmlEnum
public enum ATMServiceType10Code {


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
    DPSV;

    public String value() {
        return name();
    }

    public static ATMServiceType10Code fromValue(String v) {
        return valueOf(v);
    }

}
