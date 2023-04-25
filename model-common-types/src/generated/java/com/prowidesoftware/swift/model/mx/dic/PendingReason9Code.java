
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PendingReason9Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="PendingReason9Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="ADEA"/>
 *     <enumeration value="CONF"/>
 *     <enumeration value="OTHR"/>
 *     <enumeration value="CDRG"/>
 *     <enumeration value="CDCY"/>
 *     <enumeration value="CDRE"/>
 *     <enumeration value="CDAC"/>
 *     <enumeration value="INBC"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "PendingReason9Code")
@XmlEnum
public enum PendingReason9Code {


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
     * Execution is conditional to the execution of a process at the registrar.
     * 
     */
    CDRG,

    /**
     * Execution is conditional to the execution of a process linked to the currency of the transaction.
     * 
     */
    CDCY,

    /**
     * Execution is conditional to the execution of a process of realignment at the issuer CSD.
     * 
     */
    CDRE,

    /**
     * Awaiting cancellation of one of the party.
     * 
     */
    CDAC,

    /**
     * Not all the instructions part of a pool have been received.
     * 
     */
    INBC;

    public String value() {
        return name();
    }

    public static PendingReason9Code fromValue(String v) {
        return valueOf(v);
    }

}
