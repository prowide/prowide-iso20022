
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CancelledStatusReason2Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="CancelledStatusReason2Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="CANH"/&gt;
 *     &lt;enumeration value="CANP"/&gt;
 *     &lt;enumeration value="CXLR"/&gt;
 *     &lt;enumeration value="CANO"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "CancelledStatusReason2Code")
@XmlEnum
public enum CancelledStatusReason2Code {


    /**
     * Transaction is cancelled by the hub.
     * 
     */
    CANH,

    /**
     * Transaction is cancelled by the instructing party.
     * 
     */
    CANP,

    /**
     * Transaction is rejected by the executing party, the rejection is final therefore the order is cancelled in the system.
     * 
     */
    CXLR,

    /**
     * Transaction is cancelled by a party other than the instructing party, eg, a market infrastructure such as a stock exchange.
     * 
     */
    CANO;

    public String value() {
        return name();
    }

    public static CancelledStatusReason2Code fromValue(String v) {
        return valueOf(v);
    }

}
