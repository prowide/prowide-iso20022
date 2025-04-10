
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FraudType1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="FraudType1Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="ACTO"/>
 *     <enumeration value="CWUI"/>
 *     <enumeration value="CRNT"/>
 *     <enumeration value="FRAC"/>
 *     <enumeration value="FRAP"/>
 *     <enumeration value="CWKA"/>
 *     <enumeration value="CRDL"/>
 *     <enumeration value="MISC"/>
 *     <enumeration value="OTHN"/>
 *     <enumeration value="OTHP"/>
 *     <enumeration value="CRDS"/>
 *     <enumeration value="CNPA"/>
 *     <enumeration value="MUFD"/>
 *     <enumeration value="COSN"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "FraudType1Code")
@XmlEnum
public enum FraudType1Code {


    /**
     * Fraudulent transaction due to the unauthorised use of a card account by a person with the intent to defraud the issuer of the card.
     * 
     */
    ACTO,

    /**
     * Fraudulent transaction where the acquirer confirmed that the IIN (Issuer Identification Number) used was either never issued or is invalid.
     * 
     */
    CWUI,

    /**
     * Fraudulent transaction with a card that was not received by the cardholder.
     * 
     */
    CRNT,

    /**
     * Fraudulent use of an account.
     * 
     */
    FRAC,

    /**
     * Fraudulent transaction on an account that the cardholder never applied for or the information on the application was falsified.
     * 
     */
    FRAP,

    /**
     * Fraudulent transaction with an altered or duplicated card in a card-present environment where the cardholder did not knowingly participate or the account was not created.
     * 
     */
    CWKA,

    /**
     * Fraudulent transaction with a card that has been reported as lost
     * 
     */
    CRDL,

    /**
     * Fraudulent transaction that cannot be categorised as one of the standard fraud types.
     * 
     */
    MISC,

    /**
     * Other type of fraud defined at national level.
     * 
     */
    OTHN,

    /**
     * Other type of fraud defined at private level.
     * 
     */
    OTHP,

    /**
     * Fraudulent transaction with a card that has been reported as stolen.
     * 
     */
    CRDS,

    /**
     * Fraudulent use in a card-not-present environment of an account.
     * 
     */
    CNPA,

    /**
     * Merchant makes additional transactions against a card when consumer authorised for one legitimate transaction.
     * 
     */
    MUFD,

    /**
     * Two parties colluding for the purpose of creating fraudulent transaction. For example, a cardholder and merchant. 
     * 
     */
    COSN;

    public String value() {
        return name();
    }

    public static FraudType1Code fromValue(String v) {
        return valueOf(v);
    }

}
