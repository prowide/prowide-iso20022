
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for QuoteStatus1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="QuoteStatus1Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="ACPT"/>
 *     <enumeration value="SYMB"/>
 *     <enumeration value="SECU"/>
 *     <enumeration value="UNSY"/>
 *     <enumeration value="ALLE"/>
 *     <enumeration value="REJT"/>
 *     <enumeration value="REMO"/>
 *     <enumeration value="EXPI"/>
 *     <enumeration value="QUER"/>
 *     <enumeration value="NQUO"/>
 *     <enumeration value="PEND"/>
 *     <enumeration value="PASS"/>
 *     <enumeration value="LMWA"/>
 *     <enumeration value="CMWA"/>
 *     <enumeration value="CDLM"/>
 *     <enumeration value="CDCM"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "QuoteStatus1Code")
@XmlEnum
public enum QuoteStatus1Code {


    /**
     * Indicates that the quote is accepted for further negotiation.
     * 
     */
    ACPT,

    /**
     * Indicates that all quotes are cancelled for a financial instrument's symbol.
     * 
     */
    SYMB,

    /**
     * Indicates that all quotes are cancelled for a specific security.
     * 
     */
    SECU,

    /**
     * Indicates that all quotes are cancelled for an underlying financial instrument.
     * 
     */
    UNSY,

    /**
     * Indicates that all quotes are cancelled.
     * 
     */
    ALLE,

    /**
     * Indicates that the quote is not accepted.
     * 
     */
    REJT,

    /**
     * Indicates that all quotes are removed from the market.
     * 
     */
    REMO,

    /**
     * Indicates that the quote is not valid anymore.
     * 
     */
    EXPI,

    /**
     * Indicates that the quote is being requested.
     * 
     */
    QUER,

    /**
     * Indicates that no quote can be computed or communicated.
     * 
     */
    NQUO,

    /**
     * Indicates that the quote is being processed.
     * 
     */
    PEND,

    /**
     * Indicates that the counterparty is not interested in the transaction.
     * 
     */
    PASS,

    /**
     * Warning due to a situation of locked market.
     * 
     */
    LMWA,

    /**
     * Warning due to a situation of cross market.
     * 
     */
    CMWA,

    /**
     * Indicates that the quote is canceled due to a situation of locked market.
     * 
     */
    CDLM,

    /**
     * Indicates that the quote is canceled due to a situation of cross market.
     * 
     */
    CDCM;

    public String value() {
        return name();
    }

    public static QuoteStatus1Code fromValue(String v) {
        return valueOf(v);
    }

}
