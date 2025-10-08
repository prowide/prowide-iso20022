
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RejectionReason21Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="RejectionReason21Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="ADEA"/&gt;
 *     &lt;enumeration value="LATE"/&gt;
 *     &lt;enumeration value="SAFE"/&gt;
 *     &lt;enumeration value="NRGM"/&gt;
 *     &lt;enumeration value="NRGN"/&gt;
 *     &lt;enumeration value="OTHR"/&gt;
 *     &lt;enumeration value="REFE"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "RejectionReason21Code")
@XmlEnum
public enum RejectionReason21Code {


    /**
     * Transaction/instruction received after the account servicer's specified deadline.
     * 
     */
    ADEA,

    /**
     * Received after market deadline.
     * 
     */
    LATE,

    /**
     * Unrecognised or invalid message sender's safekeeping account.
     * 
     */
    SAFE,

    /**
     * More than one instruction match the criteria.
     * 
     */
    NRGM,

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
     * Instruction has a reference identical to another previously received instruction.
     * 
     */
    REFE;

    public String value() {
        return name();
    }

    public static RejectionReason21Code fromValue(String v) {
        return valueOf(v);
    }

}
