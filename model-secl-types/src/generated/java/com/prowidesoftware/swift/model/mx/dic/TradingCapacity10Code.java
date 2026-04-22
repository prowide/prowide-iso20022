
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TradingCapacity10Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="TradingCapacity10Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="PRIN"/>
 *     <enumeration value="RISP"/>
 *     <enumeration value="AGEN"/>
 *     <enumeration value="MIXC"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "TradingCapacity10Code")
@XmlEnum
public enum TradingCapacity10Code {


    /**
     * Trading as Principal.
     * 
     */
    PRIN,

    /**
     * Trading as a riskless principal, ie, the order to buy(sell) has been simultaneously offset by an order to sell (buy) with another party.
     * 
     */
    RISP,

    /**
     * Trading as Agent on behalf of a customer.
     * 
     */
    AGEN,

    /**
     * Trading as an agent on behalf of the customer and as a principal.
     * 
     */
    MIXC;

    public String value() {
        return name();
    }

    public static TradingCapacity10Code fromValue(String v) {
        return valueOf(v);
    }

}
