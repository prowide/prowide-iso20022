
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CashClearingSystem2Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="CashClearingSystem2Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="RTG"/&gt;
 *     &lt;enumeration value="ACH"/&gt;
 *     &lt;enumeration value="CHI"/&gt;
 *     &lt;enumeration value="FDN"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "CashClearingSystem2Code")
@XmlEnum
public enum CashClearingSystem2Code {


    /**
     * Real Time Gross Settlement System. Payment system that simultaneously clears individual transfers and settles them in central bank money.
     * 
     */
    RTG,

    /**
     * Automated Clearing House. Payment system that clears cash transfers and settles the proceeds in a lump sum, usually on a multilateral netting basis.
     * 
     */
    ACH,

    /**
     * CHIPS is the Clearing House Interbank Payment System in the US.
     * 
     */
    CHI,

    /**
     * FedNet is a link to a Federal Bank account via the internet. FedNet enables checking of account balance, transactions, take print outs of account statement, transfer funds to third party accounts, E-shopping, BSNL Payments, Deposit opening, Deposit Renewal, Request for Demand Draft, Cheque Book etc.
     * 
     */
    FDN;

    public String value() {
        return name();
    }

    public static CashClearingSystem2Code fromValue(String v) {
        return valueOf(v);
    }

}
