
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AcknowledgementReason5Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="AcknowledgementReason5Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="ADEA"/&gt;
 *     &lt;enumeration value="SMPG"/&gt;
 *     &lt;enumeration value="OTHR"/&gt;
 *     &lt;enumeration value="CDCY"/&gt;
 *     &lt;enumeration value="CDRG"/&gt;
 *     &lt;enumeration value="CDRE"/&gt;
 *     &lt;enumeration value="NSTP"/&gt;
 *     &lt;enumeration value="RQWV"/&gt;
 *     &lt;enumeration value="LATE"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "AcknowledgementReason5Code")
@XmlEnum
public enum AcknowledgementReason5Code {


    /**
     * Received after the account servicer's deadline. Processed on best effort basis.
     * 
     */
    ADEA,

    /**
     * Instruction is accepted but does not comply with the market practice rule published for the concerned market or process.
     * 
     */
    SMPG,

    /**
     * Other. See Narrative.
     * 
     */
    OTHR,

    /**
     * Execution is conditional to the execution of a process linked to the currency of the transaction.
     * 
     */
    CDCY,

    /**
     * Execution is conditional to the execution of a process at the registrar.
     * 
     */
    CDRG,

    /**
     * Execution is conditional to the execution of a process of realignment at the issuer CSD.
     * 
     */
    CDRE,

    /**
     * Instruction was not straight through processing and had to be processed manually.
     * 
     */
    NSTP,

    /**
     * Instruction registration is accepted but the registration is not in full, that is, not with voting rights.
     * 
     */
    RQWV,

    /**
     * Instruction was received after market deadline.
     * 
     */
    LATE;

    public String value() {
        return name();
    }

    public static AcknowledgementReason5Code fromValue(String v) {
        return valueOf(v);
    }

}
