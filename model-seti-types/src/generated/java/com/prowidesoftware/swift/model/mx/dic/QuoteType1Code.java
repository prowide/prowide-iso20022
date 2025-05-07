
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for QuoteType1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="QuoteType1Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="INDI"/&gt;
 *     &lt;enumeration value="TRAD"/&gt;
 *     &lt;enumeration value="REST"/&gt;
 *     &lt;enumeration value="COUN"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "QuoteType1Code")
@XmlEnum
public enum QuoteType1Code {


    /**
     * Indicates the type of quote is an indicative quote. 
     * 
     * An indicative quote is used to inform a counterparty of a market. An indicative quote does not result directly in a trade.
     * 
     */
    INDI,

    /**
     * Indicates the type of quote is a tradeable quote. 
     * A tradeable quote is submitted to a market and will result directly in a trade against other orders and quotes in a market.
     * 
     */
    TRAD,

    /**
     * Indicates the type of quote is a restricted tradeable quote. 
     * A restricted tradeable quote is submitted to a market and within a certain restriction (possibly based upon price or quantity) will automatically trade against orders. Order that do not comply with restrictions are sent to the quote issuer who can choose to accept or decline the order.
     * 
     */
    REST,

    /**
     * Indicates the type of quote is a counter quote.
     * 
     */
    COUN;

    public String value() {
        return name();
    }

    public static QuoteType1Code fromValue(String v) {
        return valueOf(v);
    }

}
