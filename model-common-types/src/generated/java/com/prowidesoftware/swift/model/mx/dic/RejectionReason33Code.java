
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RejectionReason33Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="RejectionReason33Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="CASH"/>
 *     <enumeration value="ADEA"/>
 *     <enumeration value="DMON"/>
 *     <enumeration value="NCRR"/>
 *     <enumeration value="LATE"/>
 *     <enumeration value="INVL"/>
 *     <enumeration value="INVB"/>
 *     <enumeration value="INVN"/>
 *     <enumeration value="VALR"/>
 *     <enumeration value="MONY"/>
 *     <enumeration value="CAEV"/>
 *     <enumeration value="DDAT"/>
 *     <enumeration value="REFE"/>
 *     <enumeration value="OTHR"/>
 *     <enumeration value="DQUA"/>
 *     <enumeration value="DSEC"/>
 *     <enumeration value="MINO"/>
 *     <enumeration value="MUNO"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "RejectionReason33Code")
@XmlEnum
public enum RejectionReason33Code {


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
     * Unrecognised or invalid settlement amount.
     * 
     */
    DMON,

    /**
     * Unrecognised or invalid settlement amount currency.
     * 
     */
    NCRR,

    /**
     * Received after market deadline.
     * 
     */
    LATE,

    /**
     * Invalid or unrecognized link.
     * 
     */
    INVL,

    /**
     * Instruction aims at using an invalid balance.
     * 
     */
    INVB,

    /**
     * Invalid or unrecognized lot number.
     * 
     */
    INVN,

    /**
     * Account servicer validation rule rejection.
     * 
     */
    VALR,

    /**
     * Insufficient money in your account.
     * 
     */
    MONY,

    /**
     * Corporate action pending on the financial instrument instructed.
     * 
     */
    CAEV,

    /**
     * Unrecognised or invalid settlement date.
     * 
     */
    DDAT,

    /**
     * Instruction has a reference identical to another previously received instruction.
     * 
     */
    REFE,

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
     * Unrecognised or invalid financial instrument identification.
     * 
     */
    DSEC,

    /**
     * Quantity instructed is lower than the minimum existing settlement quantity for the financial instrument.
     * 
     */
    MINO,

    /**
     * Quantity instructed is not a multiple of an existing settlement quantity lot for the financial instrument.
     * 
     */
    MUNO;

    public String value() {
        return name();
    }

    public static RejectionReason33Code fromValue(String v) {
        return valueOf(v);
    }

}
