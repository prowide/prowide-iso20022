
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ATMServiceType12Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ATMServiceType12Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="ASTS"/&gt;
 *     &lt;enumeration value="CDVF"/&gt;
 *     &lt;enumeration value="DCCS"/&gt;
 *     &lt;enumeration value="XRTD"/&gt;
 *     &lt;enumeration value="XRTW"/&gt;
 *     &lt;enumeration value="EMVS"/&gt;
 *     &lt;enumeration value="CMPF"/&gt;
 *     &lt;enumeration value="BLCQ"/&gt;
 *     &lt;enumeration value="ACCD"/&gt;
 *     &lt;enumeration value="MINI"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ATMServiceType12Code")
@XmlEnum
public enum ATMServiceType12Code {


    /**
     * Request a full statement (that is a legal statement) related to a customer account.
     * 
     */
    ASTS,

    /**
     * Verification of the card.
     * 
     */
    CDVF,

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
     * Select the EMV applications allowed by the acquirer.
     * 
     */
    EMVS,

    /**
     * Ask for customer profile with eventualy related account information.
     * 
     */
    CMPF,

    /**
     * Balance inquiry.
     * 
     */
    BLCQ,

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

    public static ATMServiceType12Code fromValue(String v) {
        return valueOf(v);
    }

}
