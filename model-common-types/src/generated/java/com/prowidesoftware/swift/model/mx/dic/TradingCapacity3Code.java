
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TradingCapacity3Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="TradingCapacity3Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="PRIN"/>
 *     <enumeration value="CPRN"/>
 *     <enumeration value="RISP"/>
 *     <enumeration value="PROP"/>
 *     <enumeration value="AGEN"/>
 *     <enumeration value="CAGN"/>
 *     <enumeration value="OAGN"/>
 *     <enumeration value="PRAG"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
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
     * Trading as a riskless principal, ie, the order to buy(sell) has been simultaneously offset by an order to sell (buy) with another party.
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
