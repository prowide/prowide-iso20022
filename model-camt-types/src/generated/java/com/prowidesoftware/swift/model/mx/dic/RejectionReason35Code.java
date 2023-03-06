
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RejectionReason35Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="RejectionReason35Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="CASH"/&gt;
 *     &lt;enumeration value="ADEA"/&gt;
 *     &lt;enumeration value="REFE"/&gt;
 *     &lt;enumeration value="LATE"/&gt;
 *     &lt;enumeration value="DDAT"/&gt;
 *     &lt;enumeration value="NRGN"/&gt;
 *     &lt;enumeration value="OTHR"/&gt;
 *     &lt;enumeration value="INVM"/&gt;
 *     &lt;enumeration value="INVL"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "RejectionReason35Code")
@XmlEnum
public enum RejectionReason35Code {


    /**
     * Unrecognised or invalid cash account.
     * 
     */
    CASH,

    /**
     * Transaction/instruction received after the account servicer's specified deadline.
     * 
     */
    ADEA,

    /**
     * Instruction has a reference identical to another previously received instruction.
     * 
     */
    REFE,

    /**
     * Received after market deadline.
     * 
     */
    LATE,

    /**
     * Unrecognised or invalid settlement date.
     * 
     */
    DDAT,

    /**
     * Instruction could not be found.
     * 
     */
    NRGN,

    /**
     * Other. See Narrative.
     * 
     */
    OTHR,

    /**
     * Invalid or unrecognized modification request.
     * 
     */
    INVM,

    /**
     * Invalid or unrecognized link.
     * 
     */
    INVL;

    public String value() {
        return name();
    }

    public static RejectionReason35Code fromValue(String v) {
        return valueOf(v);
    }

}
