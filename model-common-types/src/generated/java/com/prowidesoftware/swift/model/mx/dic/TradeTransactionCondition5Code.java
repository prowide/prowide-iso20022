
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TradeTransactionCondition5Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="TradeTransactionCondition5Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="XCPN"/&gt;
 *     &lt;enumeration value="CCPN"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "TradeTransactionCondition5Code")
@XmlEnum
public enum TradeTransactionCondition5Code {


    /**
     * Indicates whether the trade is executed ex coupon.
     * 
     */
    XCPN,

    /**
     * Indicates whether the trade is executed cum coupon.
     * 
     */
    CCPN;

    public String value() {
        return name();
    }

    public static TradeTransactionCondition5Code fromValue(String v) {
        return valueOf(v);
    }

}
