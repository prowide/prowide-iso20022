
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PendingReason6Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="PendingReason6Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="ADEA"/&gt;
 *     &lt;enumeration value="CONF"/&gt;
 *     &lt;enumeration value="OTHR"/&gt;
 *     &lt;enumeration value="CDRG"/&gt;
 *     &lt;enumeration value="CDCY"/&gt;
 *     &lt;enumeration value="CDRE"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "PendingReason6Code")
@XmlEnum
public enum PendingReason6Code {


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
    CDRE;

    public String value() {
        return name();
    }

    public static PendingReason6Code fromValue(String v) {
        return valueOf(v);
    }

}
