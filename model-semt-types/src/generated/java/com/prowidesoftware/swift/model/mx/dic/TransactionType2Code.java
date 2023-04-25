
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TransactionType2Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="TransactionType2Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="REDM"/>
 *     <enumeration value="SUBS"/>
 *     <enumeration value="SSPL"/>
 *     <enumeration value="RWPL"/>
 *     <enumeration value="TRIN"/>
 *     <enumeration value="TOUT"/>
 *     <enumeration value="SWII"/>
 *     <enumeration value="SWIO"/>
 *     <enumeration value="SUAA"/>
 *     <enumeration value="REAA"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "TransactionType2Code")
@XmlEnum
public enum TransactionType2Code {


    /**
     * Transaction is a redemption of an investment fund.
     * 
     */
    REDM,

    /**
     * Transaction is a subscription to an investment fund.
     * 
     */
    SUBS,

    /**
     * Transaction is a subscription for a savings plan, that is, money set aside by individuals in the framework of a structured plan for a special purpose, for example, retirement.
     * 
     */
    SSPL,

    /**
     * Transaction is a withdrawal by individuals in the framework of a structured plan for investments made in the past.
     * 
     */
    RWPL,

    /**
     * Transaction is an incoming credit to an account on the shareholders register, and is not linked to a shift in investment (subscription or switch), but to account management.
     * 
     */
    TRIN,

    /**
     * Transaction is a debit to an account on the shareholders register, and is not linked to a shift in investment (redemption or switch), but to account management.
     * 
     */
    TOUT,

    /**
     * Transaction is a subscription leg of a switch order execution.
     * 
     */
    SWII,

    /**
     * Transaction is a subscription leg of a switch order execution.
     * 
     */
    SWIO,

    /**
     * Transaction is a subscription in an asset allocation plan that enables investors to allocate, by percentage a certain amount of cash into several sub-funds of a same umbrella structure.
     * 
     */
    SUAA,

    /**
     * Transaction is a redemption in an asset allocation plan which enables investors to withdraw, by percentage a certain amount of cash from several sub-funds of a same umbrella structure.
     * 
     */
    REAA;

    public String value() {
        return name();
    }

    public static TransactionType2Code fromValue(String v) {
        return valueOf(v);
    }

}
