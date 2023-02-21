
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ATMServiceType3Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ATMServiceType3Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="ASTS"/&gt;
 *     &lt;enumeration value="CDVF"/&gt;
 *     &lt;enumeration value="DCCS"/&gt;
 *     &lt;enumeration value="XRTD"/&gt;
 *     &lt;enumeration value="XRTW"/&gt;
 *     &lt;enumeration value="EMVS"/&gt;
 *     &lt;enumeration value="CMPF"/&gt;
 *     &lt;enumeration value="BLCQ"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ATMServiceType3Code")
@XmlEnum
public enum ATMServiceType3Code {


    /**
     * Ask for account statement information to a related custumer account.
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
    BLCQ;

    public String value() {
        return name();
    }

    public static ATMServiceType3Code fromValue(String v) {
        return valueOf(v);
    }

}
