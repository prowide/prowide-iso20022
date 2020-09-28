
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TradingCapacity3Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="TradingCapacity3Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="PRIN"/&gt;
 *     &lt;enumeration value="CPRN"/&gt;
 *     &lt;enumeration value="RISP"/&gt;
 *     &lt;enumeration value="PROP"/&gt;
 *     &lt;enumeration value="AGEN"/&gt;
 *     &lt;enumeration value="CAGN"/&gt;
 *     &lt;enumeration value="OAGN"/&gt;
 *     &lt;enumeration value="PRAG"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "TradingCapacity3Code")
@XmlEnum
public enum TradingCapacity3Code {


    /**
     * Trading as Principal.
     * 
     */
    PRIN,

    /**
     * Crossing as a principal.
     * 
     */
    CPRN,

    /**
     * Trading as a riskless principal, ie, the  order to buy(sell) has been simultaneously offset by an order to sell (buy) with another party.
     * 
     */
    RISP,

    /**
     * Trading for its firm. The transaction affects the firm's own account, not that of its customers.
     * 
     */
    PROP,

    /**
     * Trading as Agent on behalf of a customer.
     * 
     */
    AGEN,

    /**
     * Crossing as an agent.
     * 
     */
    CAGN,

    /**
     * Acting as an agent for a party other than a customer.
     * 
     */
    OAGN,

    /**
     * Acting as an agent for some executions and principal for others in the same transaction.
     * 
     */
    PRAG;

    public String value() {
        return name();
    }

    public static TradingCapacity3Code fromValue(String v) {
        return valueOf(v);
    }

}
