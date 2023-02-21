
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for QuoteResponseType1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="QuoteResponseType1Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="HILI"/&gt;
 *     &lt;enumeration value="COUN"/&gt;
 *     &lt;enumeration value="EXPI"/&gt;
 *     &lt;enumeration value="COVE"/&gt;
 *     &lt;enumeration value="DONE"/&gt;
 *     &lt;enumeration value="PASS"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "QuoteResponseType1Code")
@XmlEnum
public enum QuoteResponseType1Code {


    /**
     * Acceptance by a party of the conditions of a quote.
     * 
     */
    HILI,

    /**
     * Rejection of the conditions of a quote and proposition of new quote details.
     * 
     */
    COUN,

    /**
     * Rejection of the conditions of a quote due to its expiry.
     * 
     */
    EXPI,

    /**
     * Purchase of a contract to offset a previously established short position.
     * 
     */
    COVE,

    /**
     * Trade completed with a third party, counter-party.
     * 
     */
    DONE,

    /**
     * Rejection of the conditions of a quote because the offer is being declined.
     * 
     */
    PASS;

    public String value() {
        return name();
    }

    public static QuoteResponseType1Code fromValue(String v) {
        return valueOf(v);
    }

}
