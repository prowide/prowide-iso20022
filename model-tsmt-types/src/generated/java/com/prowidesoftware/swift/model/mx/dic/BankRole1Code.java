
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BankRole1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="BankRole1Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="BUYB"/>
 *     <enumeration value="OBLB"/>
 *     <enumeration value="RECB"/>
 *     <enumeration value="SELB"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
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
