
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MeetingInstructionRejection1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="MeetingInstructionRejection1Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="INMR"/&gt;
 *     &lt;enumeration value="INAC"/&gt;
 *     &lt;enumeration value="IPOS"/&gt;
 *     &lt;enumeration value="INQY"/&gt;
 *     &lt;enumeration value="INDT"/&gt;
 *     &lt;enumeration value="SPLT"/&gt;
 *     &lt;enumeration value="PART"/&gt;
 *     &lt;enumeration value="IPOA"/&gt;
 *     &lt;enumeration value="PRXY"/&gt;
 *     &lt;enumeration value="RBIS"/&gt;
 *     &lt;enumeration value="OTHR"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "MeetingInstructionRejection1Code")
@XmlEnum
public enum MeetingInstructionRejection1Code {


    /**
     * Instruction contains an invalid meeting reference.
     * 
     */
    INMR,

    /**
     * Instruction contains an invalid account identification.
     * 
     */
    INAC,

    /**
     * Position is less than required threshold to be allowed to vote.
     * 
     */
    IPOS,

    /**
     * Instruction contains an invalid instructed quantity (eg the instructed quantity is greater than the entitlement).
     * 
     */
    INQY,

    /**
     * Instruction received after the specified deadline.
     * 
     */
    INDT,

    /**
     * Split voting is not allowed.
     * 
     */
    SPLT,

    /**
     * Partial voting is not allowed.
     * 
     */
    PART,

    /**
     * Missing or invalid power of attorney.
     * 
     */
    IPOA,

    /**
     * Invalid proxy information.
     * 
     */
    PRXY,

    /**
     * Issuer has rejected the instruction.
     * 
     */
    RBIS,

    /**
     * Other errors.
     * 
     */
    OTHR;

    public String value() {
        return name();
    }

    public static MeetingInstructionRejection1Code fromValue(String v) {
        return valueOf(v);
    }

}
