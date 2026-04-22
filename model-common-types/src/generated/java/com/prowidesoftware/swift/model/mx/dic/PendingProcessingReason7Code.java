
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PendingProcessingReason7Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="PendingProcessingReason7Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="BLOC"/>
 *     <enumeration value="ADEA"/>
 *     <enumeration value="DOCY"/>
 *     <enumeration value="CAIS"/>
 *     <enumeration value="YCOL"/>
 *     <enumeration value="CDEL"/>
 *     <enumeration value="CDAC"/>
 *     <enumeration value="CDLR"/>
 *     <enumeration value="CSDH"/>
 *     <enumeration value="CVAL"/>
 *     <enumeration value="GLOB"/>
 *     <enumeration value="INBC"/>
 *     <enumeration value="LIQU"/>
 *     <enumeration value="MONY"/>
 *     <enumeration value="LACK"/>
 *     <enumeration value="FLIM"/>
 *     <enumeration value="MINO"/>
 *     <enumeration value="MUNO"/>
 *     <enumeration value="NEXT"/>
 *     <enumeration value="NOFX"/>
 *     <enumeration value="LALO"/>
 *     <enumeration value="COLL"/>
 *     <enumeration value="OTHR"/>
 *     <enumeration value="CERT"/>
 *     <enumeration value="DENO"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "PendingProcessingReason7Code")
@XmlEnum
public enum PendingProcessingReason7Code {


    /**
     * Your account is blocked, no instruction can settle over the account.
     * 
     */
    BLOC,

    /**
     * Instruction was received after the account servicer's deadline. It will be managed as per the bilateral service agreement between the account servicer and account owner.
     * 
     */
    ADEA,

    /**
     * Awaiting documents or endorsements from you.
     * 
     */
    DOCY,

    /**
     * Awaiting financial instruments from a corporate action or other procedure, for example, conversion, dematerialisation, exchange, registration, stamping, splitting.
     * 
     */
    CAIS,

    /**
     * Insufficient collateral in your account to execute the instruction.
     * 
     */
    YCOL,

    /**
     * Instruction is in a hold/frozen/preadvice mode as it fulfils predefined conditional delivery rules in the market infrastructure platform for conditional delivery.
     * 
     */
    CDEL,

    /**
     * Awaiting cancellation of one of the party.
     * 
     */
    CDAC,

    /**
     * Instruction is in a hold/frozen/preadvice mode. Market infrastructure platform is awaiting release.
     * 
     */
    CDLR,

    /**
     * Central securities depository sets the instruction in a hold/frozen/preadvice mode.
     * 
     */
    CSDH,

    /**
     * Instruction is in a hold/frozen/preadvice mode as it fulfils predefined conditions of a restriction processing type in the market infrastructure platform.
     * 
     */
    CVAL,

    /**
     * Settlement cannot be executed; financial instruments are in global form.
     * 
     */
    GLOB,

    /**
     * Not all the instructions part of a pool have been received.
     * 
     */
    INBC,

    /**
     * Central bank liquidity is insufficient.
     * 
     */
    LIQU,

    /**
     * Insufficient money in your account.
     * 
     */
    MONY,

    /**
     * Insufficient financial instruments in your account.
     * 
     */
    LACK,

    /**
     * Insufficient deliverable financial instruments in your account as maximum foreign limit has been reached.
     * 
     */
    FLIM,

    /**
     * Quantity instructed is lower than the minimum existing settlement quantity for the financial instrument.
     * 
     */
    MINO,

    /**
     * Quantity instructed is not a multiple of an existing settlement quantity lot for the financial instrument.
     * 
     */
    MUNO,

    /**
     * Next process is launched. No processing pending problems to be reported.
     * 
     */
    NEXT,

    /**
     * A foreign exchange instruction from you is missing.
     * 
     */
    NOFX,

    /**
     * Financial instruments are out on loan.
     * 
     */
    LALO,

    /**
     * Financial instruments are not deliverable as they are pledged as collateral.
     * 
     */
    COLL,

    /**
     * Other. See Narrative.
     * 
     */
    OTHR,

    /**
     * Certificate number error.
     * 
     */
    CERT,

    /**
     * Quantity instructed does not match the denomination available/deliverable. Physical securities need to be obtained in deliverable denominated quantities.
     * 
     */
    DENO;

    public String value() {
        return name();
    }

    public static PendingProcessingReason7Code fromValue(String v) {
        return valueOf(v);
    }

}
