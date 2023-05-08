
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PendingProcessingReason1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="PendingProcessingReason1Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="ADEA"/>
 *     <enumeration value="CAIS"/>
 *     <enumeration value="DOCY"/>
 *     <enumeration value="NOFX"/>
 *     <enumeration value="BLOC"/>
 *     <enumeration value="MUNO"/>
 *     <enumeration value="GLOB"/>
 *     <enumeration value="YCOL"/>
 *     <enumeration value="COLL"/>
 *     <enumeration value="FLIM"/>
 *     <enumeration value="NEXT"/>
 *     <enumeration value="LACK"/>
 *     <enumeration value="LALO"/>
 *     <enumeration value="MONY"/>
 *     <enumeration value="MINO"/>
 *     <enumeration value="OTHR"/>
 *     <enumeration value="DENO"/>
 *     <enumeration value="LIQU"/>
 *     <enumeration value="CERT"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "PendingProcessingReason1Code")
@XmlEnum
public enum PendingProcessingReason1Code {


    /**
     * Instruction was received after the account servicer's deadline. Processed on best effort basis.
     * 
     */
    ADEA,

    /**
     * Awaiting financial instruments from a corporate action or other procedure, for example, conversion, dematerialisation, exchange, registration, stamping, splitting.
     * 
     */
    CAIS,

    /**
     * Awaiting documents or endorsements from you.
     * 
     */
    DOCY,

    /**
     * A foreign exchange instruction from you is missing.
     * 
     */
    NOFX,

    /**
     * Your account is blocked, no instruction can settle over the account.
     * 
     */
    BLOC,

    /**
     * Quantity instructed is not a multiple of an existing settlement quantity lot for the financial instrument.
     * 
     */
    MUNO,

    /**
     * Settlement cannot be executed; financial instruments are in global form.
     * 
     */
    GLOB,

    /**
     * Insufficient collateral in your account to execute the instruction.
     * 
     */
    YCOL,

    /**
     * Financial instruments are not deliverable as they are pledged as collateral.
     * 
     */
    COLL,

    /**
     * Insufficient deliverable financial instruments in your account as maximum foreign limit has been reached.
     * 
     */
    FLIM,

    /**
     * Next process is launched. No processing pending problems to be reported.
     * 
     */
    NEXT,

    /**
     * Insufficient financial instruments in your account.
     * 
     */
    LACK,

    /**
     * Financial instruments are out on loan.
     * 
     */
    LALO,

    /**
     * Insufficient money in your account.
     * 
     */
    MONY,

    /**
     * Quantity instructed is lower than the minimum existing settlement quantity for the financial instrument.
     * 
     */
    MINO,

    /**
     * Other. See Narrative.
     * 
     */
    OTHR,

    /**
     * Quantity instructed does not match the denomination available/deliverable. Physical securities need to be obtained in deliverable denominated quantities.
     * 
     */
    DENO,

    /**
     * Central bank liquidity is insufficient.
     * 
     */
    LIQU,

    /**
     * Certificate number error.
     * 
     */
    CERT;

    public String value() {
        return name();
    }

    public static PendingProcessingReason1Code fromValue(String v) {
        return valueOf(v);
    }

}
