
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AdditionalServiceType3Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="AdditionalServiceType3Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="CACT"/>
 *     <enumeration value="CSHB"/>
 *     <enumeration value="DCCV"/>
 *     <enumeration value="INTP"/>
 *     <enumeration value="INTT"/>
 *     <enumeration value="LOYT"/>
 *     <enumeration value="PRST"/>
 *     <enumeration value="BALC"/>
 *     <enumeration value="PVVS"/>
 *     <enumeration value="REAC"/>
 *     <enumeration value="SAVS"/>
 *     <enumeration value="STIP"/>
 *     <enumeration value="TXID"/>
 *     <enumeration value="CDTL"/>
 *     <enumeration value="ANIQ"/>
 *     <enumeration value="ADCA"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "AdditionalServiceType3Code")
@XmlEnum
public enum AdditionalServiceType3Code {


    /**
     * Card activation
     * 
     */
    CACT,

    /**
     * Purchase of goods or services with cashback
     * 
     */
    CSHB,

    /**
     * Dynamic Currency Conversion (DCC)
     * 
     */
    DCCV,

    /**
     * Instant payment from a cardholder's account to an acceptor's account
     * 
     */
    INTP,

    /**
     * Instant transfer of funds from a payer's account to a payee's account.
     * 
     */
    INTT,

    /**
     * Loyalty services
     * 
     */
    LOYT,

    /**
     * Withdrawal transaction was pre-authorised by another channel (amount could be absent).
     * 
     */
    PRST,

    /**
     * Return the account balance with the transaction.
     * 
     */
    BALC,

    /**
     * Verify the PIN data.
     * 
     */
    PVVS,

    /**
     * Request react serervice.
     * 
     */
    REAC,

    /**
     * Smart Account verification service.
     * 
     */
    SAVS,

    /**
     * Processing the transaction on behalf of the Issuer.
     * 
     */
    STIP,

    /**
     * Transaction identification service
     * 
     */
    TXID,

    /**
     * Validate the credential status.
     * 
     */
    CDTL,

    /**
     * Account name inquiry service
     * 
     */
    ANIQ,

    /**
     * Add card to the card on file. 
     * 
     */
    ADCA;

    public String value() {
        return name();
    }

    public static AdditionalServiceType3Code fromValue(String v) {
        return valueOf(v);
    }

}
