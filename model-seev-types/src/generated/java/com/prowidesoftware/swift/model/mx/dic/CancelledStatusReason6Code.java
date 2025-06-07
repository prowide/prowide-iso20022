
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CancelledStatusReason6Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="CancelledStatusReason6Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="CANI"/&gt;
 *     &lt;enumeration value="CANO"/&gt;
 *     &lt;enumeration value="CANS"/&gt;
 *     &lt;enumeration value="CSUB"/&gt;
 *     &lt;enumeration value="OTHR"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "CancelledStatusReason6Code")
@XmlEnum
public enum CancelledStatusReason6Code {


    /**
     * Transaction is cancelled by yourself.
     * 
     */
    CANI,

    /**
     * Transaction is cancelled by a party other than the instructing party, for example, a market infrastructure such as a stock exchange.
     * 
     */
    CANO,

    /**
     * Transaction is cancelled by the system.
     * 
     */
    CANS,

    /**
     * Instruction has been cancelled by the agent due to an event deadline extension.
     * 
     */
    CSUB,

    /**
     * Other. See Narrative.
     * 
     */
    OTHR;

    public String value() {
        return name();
    }

    public static CancelledStatusReason6Code fromValue(String v) {
        return valueOf(v);
    }

}
