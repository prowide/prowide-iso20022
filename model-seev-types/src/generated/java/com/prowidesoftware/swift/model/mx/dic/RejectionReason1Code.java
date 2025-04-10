
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RejectionReason1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="RejectionReason1Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="ADEA"/>
 *     <enumeration value="LATE"/>
 *     <enumeration value="DQUA"/>
 *     <enumeration value="IPOS"/>
 *     <enumeration value="LACK"/>
 *     <enumeration value="SAFE"/>
 *     <enumeration value="RBIS"/>
 *     <enumeration value="EVNM"/>
 *     <enumeration value="ULNK"/>
 *     <enumeration value="PRXY"/>
 *     <enumeration value="PART"/>
 *     <enumeration value="SPLT"/>
 *     <enumeration value="IPOA"/>
 *     <enumeration value="IREG"/>
 *     <enumeration value="DSEC"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "RejectionReason1Code")
@XmlEnum
public enum RejectionReason1Code {


    /**
     * Instruction received after the account servicers specified deadline.
     * 
     */
    ADEA,

    /**
     * Received after market deadline.
     * 
     */
    LATE,

    /**
     * Unrecognised or invalid instructed quantity.
     * 
     */
    DQUA,

    /**
     * Position is less than required threshold.
     * 
     */
    IPOS,

    /**
     * Instructed position exceeds the eligible balance.
     * 
     */
    LACK,

    /**
     * Instruction contains an invalid or unrecognised safekeeping account.
     * 
     */
    SAFE,

    /**
     * Issuer or Registrar has rejected the instruction.
     * 
     */
    RBIS,

    /**
     * Unrecognised event number or identification (eg corporate action event number, a meeting identification).
     * 
     */
    EVNM,

    /**
     * Instruction contains an invalid message reference, reference is unknown.
     * 
     */
    ULNK,

    /**
     * Invalid proxy information.
     * 
     */
    PRXY,

    /**
     * Partial voting is not allowed.
     * 
     */
    PART,

    /**
     * Split voting is not allowed.
     * 
     */
    SPLT,

    /**
     * Missing or invalid power of attorney.
     * 
     */
    IPOA,

    /**
     * Invalid registration information.
     * 
     */
    IREG,

    /**
     * Unrecognised or invalid financial instrument identification.
     * 
     */
    DSEC;

    public String value() {
        return name();
    }

    public static RejectionReason1Code fromValue(String v) {
        return valueOf(v);
    }

}
