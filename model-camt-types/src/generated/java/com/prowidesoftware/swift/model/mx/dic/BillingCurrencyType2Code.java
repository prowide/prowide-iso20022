
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BillingCurrencyType2Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="BillingCurrencyType2Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="ACCT"/>
 *     <enumeration value="STLM"/>
 *     <enumeration value="PRCG"/>
 *     <enumeration value="HOST"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "BillingCurrencyType2Code")
@XmlEnum
public enum BillingCurrencyType2Code {


    /**
     * Currency type used for the billing is the account currency.
     * 
     */
    ACCT,

    /**
     * Currency type used for the billing is the settlement currency.
     * 
     */
    STLM,

    /**
     * Currency type used for the billing is the pricing currency.
     * 
     */
    PRCG,

    /**
     * Currency type used for the billing is the host currency.
     * 
     */
    HOST;

    public String value() {
        return name();
    }

    public static BillingCurrencyType2Code fromValue(String v) {
        return valueOf(v);
    }

}
