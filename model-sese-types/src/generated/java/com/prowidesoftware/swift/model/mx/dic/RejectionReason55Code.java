
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RejectionReason55Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="RejectionReason55Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="BENO"/>
 *     <enumeration value="CAEV"/>
 *     <enumeration value="DQUA"/>
 *     <enumeration value="OTHR"/>
 *     <enumeration value="PODU"/>
 *     <enumeration value="SAFE"/>
 *     <enumeration value="SSID"/>
 *     <enumeration value="DSEC"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
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
