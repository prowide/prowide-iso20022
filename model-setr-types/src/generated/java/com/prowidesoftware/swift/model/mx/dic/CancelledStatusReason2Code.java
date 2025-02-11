
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CancelledStatusReason2Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="CancelledStatusReason2Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="CANH"/>
 *     <enumeration value="CANP"/>
 *     <enumeration value="CXLR"/>
 *     <enumeration value="CANO"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
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
