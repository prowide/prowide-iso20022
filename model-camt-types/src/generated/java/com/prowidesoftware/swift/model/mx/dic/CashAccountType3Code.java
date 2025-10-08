
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CashAccountType3Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="CashAccountType3Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="CASH"/&gt;
 *     &lt;enumeration value="CHAR"/&gt;
 *     &lt;enumeration value="SACC"/&gt;
 *     &lt;enumeration value="CACC"/&gt;
 *     &lt;enumeration value="SVGS"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "CashAccountType3Code")
@XmlEnum
public enum CashAccountType3Code {


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
    SVGS;

    public String value() {
        return name();
    }

    public static CashAccountType3Code fromValue(String v) {
        return valueOf(v);
    }

}
