
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ATMServiceType12Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="ATMServiceType12Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="ASTS"/>
 *     <enumeration value="CDVF"/>
 *     <enumeration value="DCCS"/>
 *     <enumeration value="XRTD"/>
 *     <enumeration value="XRTW"/>
 *     <enumeration value="EMVS"/>
 *     <enumeration value="CMPF"/>
 *     <enumeration value="BLCQ"/>
 *     <enumeration value="ACCD"/>
 *     <enumeration value="MINI"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
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
