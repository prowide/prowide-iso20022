
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for QuoteStatus1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="QuoteStatus1Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="ACPT"/&gt;
 *     &lt;enumeration value="SYMB"/&gt;
 *     &lt;enumeration value="SECU"/&gt;
 *     &lt;enumeration value="UNSY"/&gt;
 *     &lt;enumeration value="ALLE"/&gt;
 *     &lt;enumeration value="REJT"/&gt;
 *     &lt;enumeration value="REMO"/&gt;
 *     &lt;enumeration value="EXPI"/&gt;
 *     &lt;enumeration value="QUER"/&gt;
 *     &lt;enumeration value="NQUO"/&gt;
 *     &lt;enumeration value="PEND"/&gt;
 *     &lt;enumeration value="PASS"/&gt;
 *     &lt;enumeration value="LMWA"/&gt;
 *     &lt;enumeration value="CMWA"/&gt;
 *     &lt;enumeration value="CDLM"/&gt;
 *     &lt;enumeration value="CDCM"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
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
