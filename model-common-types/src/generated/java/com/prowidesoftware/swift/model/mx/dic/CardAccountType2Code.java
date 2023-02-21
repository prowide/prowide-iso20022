
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CardAccountType2Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="CardAccountType2Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="CTDP"/&gt;
 *     &lt;enumeration value="CHCK"/&gt;
 *     &lt;enumeration value="CRDT"/&gt;
 *     &lt;enumeration value="CURR"/&gt;
 *     &lt;enumeration value="CDBT"/&gt;
 *     &lt;enumeration value="DFLT"/&gt;
 *     &lt;enumeration value="EPRS"/&gt;
 *     &lt;enumeration value="HEQL"/&gt;
 *     &lt;enumeration value="ISTL"/&gt;
 *     &lt;enumeration value="INVS"/&gt;
 *     &lt;enumeration value="LCDT"/&gt;
 *     &lt;enumeration value="MBNW"/&gt;
 *     &lt;enumeration value="MNMK"/&gt;
 *     &lt;enumeration value="MNMC"/&gt;
 *     &lt;enumeration value="MTGL"/&gt;
 *     &lt;enumeration value="RTRM"/&gt;
 *     &lt;enumeration value="RVLV"/&gt;
 *     &lt;enumeration value="SVNG"/&gt;
 *     &lt;enumeration value="STBD"/&gt;
 *     &lt;enumeration value="UVRL"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "CardAccountType2Code")
@XmlEnum
public enum CardAccountType2Code {


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
    UVRL;

    public String value() {
        return name();
    }

    public static CardAccountType2Code fromValue(String v) {
        return valueOf(v);
    }

}
