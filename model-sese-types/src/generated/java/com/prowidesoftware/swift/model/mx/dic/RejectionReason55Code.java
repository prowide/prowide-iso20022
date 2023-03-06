
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RejectionReason55Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="RejectionReason55Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="BENO"/&gt;
 *     &lt;enumeration value="CAEV"/&gt;
 *     &lt;enumeration value="DQUA"/&gt;
 *     &lt;enumeration value="OTHR"/&gt;
 *     &lt;enumeration value="PODU"/&gt;
 *     &lt;enumeration value="SAFE"/&gt;
 *     &lt;enumeration value="SSID"/&gt;
 *     &lt;enumeration value="DSEC"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "RejectionReason55Code")
@XmlEnum
public enum RejectionReason55Code {


    /**
     * Disagreement in beneficial ownership.
     * 
     */
    BENO,

    /**
     * Corporate action pending on the financial instrument instructed.
     * 
     */
    CAEV,

    /**
     * Unrecognised or invalid instructed quantity.
     * 
     */
    DQUA,

    /**
     * Other. See Narrative.
     * 
     */
    OTHR,

    /**
     * Instruction has not been matched. It is a possible duplicate instruction.
     * 
     */
    PODU,

    /**
     * Unrecognised or invalid message sender's safekeeping account.
     * 
     */
    SAFE,

    /**
     * Standing Settlement Instruction is unknown or invalid.
     * 
     */
    SSID,

    /**
     * Unrecognised or invalid financial instrument identification.
     * 
     */
    DSEC;

    public String value() {
        return name();
    }

    public static RejectionReason55Code fromValue(String v) {
        return valueOf(v);
    }

}
