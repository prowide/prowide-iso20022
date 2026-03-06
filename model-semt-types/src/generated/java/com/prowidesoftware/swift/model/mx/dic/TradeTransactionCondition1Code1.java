
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TradeTransactionCondition1Code__1.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="TradeTransactionCondition1Code__1">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="CCPN"/>
 *     <enumeration value="XCPN"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "TradeTransactionCondition1Code__1")
@XmlEnum
public enum TradeTransactionCondition1Code1 {


    /**
     * Indicates whether the trade is executed cum coupon.
     * 
     */
    CCPN,

    /**
     * Indicates whether the trade is executed ex coupon.
     * 
     */
    XCPN;

    public String value() {
        return name();
    }

    public static TradeTransactionCondition1Code1 fromValue(String v) {
        return valueOf(v);
    }

}
