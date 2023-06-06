
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BillingCurrencyType1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="BillingCurrencyType1Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="ACCT"/>
 *     <enumeration value="STLM"/>
 *     <enumeration value="PRCG"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "BillingCurrencyType1Code")
@XmlEnum
public enum BillingCurrencyType1Code {


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
    PRCG;

    public String value() {
        return name();
    }

    public static BillingCurrencyType1Code fromValue(String v) {
        return valueOf(v);
    }

}
