
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CardAccountType3Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="CardAccountType3Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="CTDP"/>
 *     <enumeration value="CHCK"/>
 *     <enumeration value="CRDT"/>
 *     <enumeration value="CURR"/>
 *     <enumeration value="CDBT"/>
 *     <enumeration value="DFLT"/>
 *     <enumeration value="EPRS"/>
 *     <enumeration value="HEQL"/>
 *     <enumeration value="ISTL"/>
 *     <enumeration value="INVS"/>
 *     <enumeration value="LCDT"/>
 *     <enumeration value="MBNW"/>
 *     <enumeration value="MNMK"/>
 *     <enumeration value="MNMC"/>
 *     <enumeration value="MTGL"/>
 *     <enumeration value="RTRM"/>
 *     <enumeration value="RVLV"/>
 *     <enumeration value="SVNG"/>
 *     <enumeration value="STBD"/>
 *     <enumeration value="UVRL"/>
 *     <enumeration value="PRPD"/>
 *     <enumeration value="FLTC"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "CardAccountType3Code")
@XmlEnum
public enum CardAccountType3Code {


    /**
     * Certificate of deposit saving account.
     * 
     */
    CTDP,

    /**
     * Checking account.
     * 
     */
    CHCK,

    /**
     * Credit card account.
     * 
     */
    CRDT,

    /**
     * Current account.
     * 
     */
    CURR,

    /**
     * Debit card account.
     * 
     */
    CDBT,

    /**
     * Default account.
     * 
     */
    DFLT,

    /**
     * Electronic purse card account.
     * 
     */
    EPRS,

    /**
     * Home equity loan credit account.
     * 
     */
    HEQL,

    /**
     * Instalment loan credit account.
     * 
     */
    ISTL,

    /**
     * Investment account.
     * 
     */
    INVS,

    /**
     * Line of credit account.
     * 
     */
    LCDT,

    /**
     * Mobile Station Integrated Services Digital Network Number (MSISDN).
     * 
     */
    MBNW,

    /**
     * Money market saving account.
     * 
     */
    MNMK,

    /**
     * Money market checking account.
     * 
     */
    MNMC,

    /**
     * Mortgage loan credit account.
     * 
     */
    MTGL,

    /**
     * Retirement account.
     * 
     */
    RTRM,

    /**
     * Revolving loan account.
     * 
     */
    RVLV,

    /**
     * Savings account.
     * 
     */
    SVNG,

    /**
     * Stock or bond investment account.
     * 
     */
    STBD,

    /**
     * Universal account.
     * 
     */
    UVRL,

    /**
     * Pre-paid account.
     * 
     */
    PRPD,

    /**
     * Fleet card account.
     * 
     */
    FLTC;

    public String value() {
        return name();
    }

    public static CardAccountType3Code fromValue(String v) {
        return valueOf(v);
    }

}
