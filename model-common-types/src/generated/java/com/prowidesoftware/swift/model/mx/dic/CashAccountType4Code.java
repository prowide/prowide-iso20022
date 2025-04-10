
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CashAccountType4Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="CashAccountType4Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="CASH"/>
 *     <enumeration value="CHAR"/>
 *     <enumeration value="COMM"/>
 *     <enumeration value="TAXE"/>
 *     <enumeration value="CISH"/>
 *     <enumeration value="TRAS"/>
 *     <enumeration value="SACC"/>
 *     <enumeration value="CACC"/>
 *     <enumeration value="SVGS"/>
 *     <enumeration value="ONDP"/>
 *     <enumeration value="MGLD"/>
 *     <enumeration value="NREX"/>
 *     <enumeration value="MOMA"/>
 *     <enumeration value="LOAN"/>
 *     <enumeration value="SLRY"/>
 *     <enumeration value="ODFT"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "CashAccountType4Code")
@XmlEnum
public enum CashAccountType4Code {


    /**
     * Account used for the payment of cash.
     * 
     */
    CASH,

    /**
     * Account used for charges if different from the account for payment.
     * 
     */
    CHAR,

    /**
     * Account used for commission if different from the account for payment.
     * 
     */
    COMM,

    /**
     * Account used for taxes if different from the account for payment.
     * 
     */
    TAXE,

    /**
     * Account used for payment of income if different from the current cash account.
     * 
     */
    CISH,

    /**
     * Account used for trading if different from the current cash account.
     * 
     */
    TRAS,

    /**
     * Account used to post debit and credit entries, as a result of transactions cleared and settled through a specific clearing and settlement system.
     * 
     */
    SACC,

    /**
     * Account used to post debits and credits when no specific account has been nominated.
     * 
     */
    CACC,

    /**
     * Account used for savings.
     * 
     */
    SVGS,

    /**
     * Account used for overnight deposits.
     * 
     */
    ONDP,

    /**
     * Account used for a marginal lending facility.
     * 
     */
    MGLD,

    /**
     * Account used for non-resident external.
     * 
     */
    NREX,

    /**
     * Account used for money markets if different from the cash account.
     * 
     */
    MOMA,

    /**
     * Account used for loans.
     * 
     */
    LOAN,

    /**
     * Accounts used for salary payments.
     * 
     */
    SLRY,

    /**
     * Account is used for overdrafts.
     * 
     */
    ODFT;

    public String value() {
        return name();
    }

    public static CashAccountType4Code fromValue(String v) {
        return valueOf(v);
    }

}
