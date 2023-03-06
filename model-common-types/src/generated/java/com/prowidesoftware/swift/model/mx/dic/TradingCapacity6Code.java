
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TradingCapacity6Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="TradingCapacity6Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="AGEN"/&gt;
 *     &lt;enumeration value="BAGN"/&gt;
 *     &lt;enumeration value="CAGN"/&gt;
 *     &lt;enumeration value="CPRN"/&gt;
 *     &lt;enumeration value="OAGN"/&gt;
 *     &lt;enumeration value="PRAG"/&gt;
 *     &lt;enumeration value="PRIN"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "TradingCapacity6Code")
@XmlEnum
public enum TradingCapacity6Code {


    /**
     * Trading as Agent on behalf of a customer.
     * 
     */
    AGEN,

    /**
     * Party acting as an agent for both customer and another person.
     * 
     */
    BAGN,

    /**
     * Crossing as an agent.
     * 
     */
    CAGN,

    /**
     * Crossing as a principal.
     * 
     */
    CPRN,

    /**
     * Acting as an agent for a party other than a customer.
     * 
     */
    OAGN,

    /**
     * Acting as an agent for some executions and principal for others in the same transaction.
     * 
     */
    PRAG,

    /**
     * Trading as Principal.
     * 
     */
    PRIN;

    public String value() {
        return name();
    }

    public static TradingCapacity6Code fromValue(String v) {
        return valueOf(v);
    }

}
