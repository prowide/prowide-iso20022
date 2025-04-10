
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PendingReason7Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="PendingReason7Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="ADEA"/>
 *     <enumeration value="CONF"/>
 *     <enumeration value="OTHR"/>
 *     <enumeration value="DQUA"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "PendingReason7Code")
@XmlEnum
public enum PendingReason7Code {


    /**
     * Instruction was received after the account servicer's deadline. Processed on best effort basis.
     * 
     */
    ADEA,

    /**
     * Awaiting confirmation from the counterparty.
     * 
     */
    CONF,

    /**
     * Other. See Narrative.
     * 
     */
    OTHR,

    /**
     * Quantity of financial instruments does not match.
     * 
     */
    DQUA;

    public String value() {
        return name();
    }

    public static PendingReason7Code fromValue(String v) {
        return valueOf(v);
    }

}
