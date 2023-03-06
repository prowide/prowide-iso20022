
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BankRole1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="BankRole1Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="BUYB"/&gt;
 *     &lt;enumeration value="OBLB"/&gt;
 *     &lt;enumeration value="RECB"/&gt;
 *     &lt;enumeration value="SELB"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "BankRole1Code")
@XmlEnum
public enum BankRole1Code {


    /**
     * Bank of the buyer.
     * 
     */
    BUYB,

    /**
     * Obligor bank.
     * 
     */
    OBLB,

    /**
     * Recipient bank.
     * 
     */
    RECB,

    /**
     * Bank of the seller.
     * 
     */
    SELB;

    public String value() {
        return name();
    }

    public static BankRole1Code fromValue(String v) {
        return valueOf(v);
    }

}
