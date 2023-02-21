
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for InstructionLockout1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="InstructionLockout1Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="SYLK"/&gt;
 *     &lt;enumeration value="MALK"/&gt;
 *     &lt;enumeration value="NOLO"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "InstructionLockout1Code")
@XmlEnum
public enum InstructionLockout1Code {


    /**
     * System suspended elections processing based on business rules.
     * 
     */
    SYLK,

    /**
     * DTC (the Depository Trust Company) personnel suspended elections processing.
     * 
     */
    MALK,

    /**
     * Eligible for elections processing.
     * 
     */
    NOLO;

    public String value() {
        return name();
    }

    public static InstructionLockout1Code fromValue(String v) {
        return valueOf(v);
    }

}
