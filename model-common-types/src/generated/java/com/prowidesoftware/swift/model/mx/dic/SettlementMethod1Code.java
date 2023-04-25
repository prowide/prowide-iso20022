
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SettlementMethod1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="SettlementMethod1Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="INDA"/>
 *     <enumeration value="INGA"/>
 *     <enumeration value="COVE"/>
 *     <enumeration value="CLRG"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "SettlementMethod1Code")
@XmlEnum
public enum SettlementMethod1Code {


    /**
     * Settlement is done by the agent instructed to execute a payment instruction.
     * 
     */
    INDA,

    /**
     * Settlement is done by the agent instructing and forwarding the payment to the next party in the payment chain.
     * 
     */
    INGA,

    /**
     * Settlement is done through a cover payment.
     * 
     */
    COVE,

    /**
     * Settlement is done through a payment clearing system.
     * 
     */
    CLRG;

    public String value() {
        return name();
    }

    public static SettlementMethod1Code fromValue(String v) {
        return valueOf(v);
    }

}
