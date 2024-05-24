
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RejectionReason59Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="RejectionReason59Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="ADEA"/>
 *     <enumeration value="OPTY"/>
 *     <enumeration value="ULNK"/>
 *     <enumeration value="DSEC"/>
 *     <enumeration value="LATE"/>
 *     <enumeration value="NMTY"/>
 *     <enumeration value="OPNM"/>
 *     <enumeration value="OTHR"/>
 *     <enumeration value="DQUA"/>
 *     <enumeration value="SAFE"/>
 *     <enumeration value="EVNM"/>
 *     <enumeration value="DQCS"/>
 *     <enumeration value="DQCC"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "RejectionReason59Code")
@XmlEnum
public enum RejectionReason59Code {


    /**
     * Transaction/instruction received after the account servicer's specified deadline.
     * 
     */
    ADEA,

    /**
     * Invalid option type.
     * 
     */
    OPTY,

    /**
     * Linked reference is unknown.
     * 
     */
    ULNK,

    /**
     * Unrecognised or invalid financial instrument identification.
     * 
     */
    DSEC,

    /**
     * Received after market deadline.
     * 
     */
    LATE,

    /**
     * Mismatch between option number and option type.
     * 
     */
    NMTY,

    /**
     * Unrecognised option number.
     * 
     */
    OPNM,

    /**
     * Other. See Narrative.
     * 
     */
    OTHR,

    /**
     * Unrecognised or invalid instructed quantity.
     * 
     */
    DQUA,

    /**
     * Unrecognised or invalid message sender's safekeeping account.
     * 
     */
    SAFE,

    /**
     * Unrecognised event number.
     * 
     */
    EVNM,

    /**
     * Unrecognised or invalid instructed cash amount.
     * 
     */
    DQCS,

    /**
     * Invalid instructed currency.
     * 
     */
    DQCC;

    public String value() {
        return name();
    }

    public static RejectionReason59Code fromValue(String v) {
        return valueOf(v);
    }

}
