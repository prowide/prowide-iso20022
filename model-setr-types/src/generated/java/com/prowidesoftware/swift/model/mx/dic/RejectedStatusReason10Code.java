
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RejectedStatusReason10Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="RejectedStatusReason10Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="ADEA"/>
 *     <enumeration value="BLTR"/>
 *     <enumeration value="CUTO"/>
 *     <enumeration value="DDAT"/>
 *     <enumeration value="DOCC"/>
 *     <enumeration value="DQUA"/>
 *     <enumeration value="DSEC"/>
 *     <enumeration value="DTRD"/>
 *     <enumeration value="IDNA"/>
 *     <enumeration value="IEXE"/>
 *     <enumeration value="INTE"/>
 *     <enumeration value="IOTP"/>
 *     <enumeration value="IPAC"/>
 *     <enumeration value="LATE"/>
 *     <enumeration value="MONY"/>
 *     <enumeration value="NRGM"/>
 *     <enumeration value="NSLA"/>
 *     <enumeration value="ORRF"/>
 *     <enumeration value="SAFE"/>
 *     <enumeration value="SECU"/>
 *     <enumeration value="SHIG"/>
 *     <enumeration value="SLOW"/>
 *     <enumeration value="UDCY"/>
 *     <enumeration value="ULNK"/>
 *     <enumeration value="URSC"/>
 *     <enumeration value="ORDR"/>
 *     <enumeration value="BMIN"/>
 *     <enumeration value="BMTO"/>
 *     <enumeration value="INSU"/>
 *     <enumeration value="PRCT"/>
 *     <enumeration value="BMRA"/>
 *     <enumeration value="BMRV"/>
 *     <enumeration value="LOCK"/>
 *     <enumeration value="ILLI"/>
 *     <enumeration value="DINV"/>
 *     <enumeration value="CLOS"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "RejectedStatusReason10Code")
@XmlEnum
public enum RejectedStatusReason10Code {


    /**
     * Instruction was received after the Receiver's deadline.
     * 
     */
    ADEA,

    /**
     * Investment account is blocked due to a transfer out of investment funds.
     * 
     */
    BLTR,

    /**
     * Instruction has been received after the cut-off time.
     * 
     */
    CUTO,

    /**
     * Cash settlement date is not recognised or is invalid.
     * 
     */
    DDAT,

    /**
     * Investment account is blocked until certain legal proceedings are completed, for example, legal documents from the successor, legal proceedings due to bankruptcy.
     * 
     */
    DOCC,

    /**
     * Financial instrument quantity is invalid.
     * 
     */
    DQUA,

    /**
     * Identification of the security is not recognised or is invalid.
     * 
     */
    DSEC,

    /**
     * Unrecognised or invalid trade date or requested trade date or future trade date.
     * 
     */
    DTRD,

    /**
     * Identification of the security and the security name are not the same.
     * 
     */
    IDNA,

    /**
     * Unrecognised or invalid subscriber or redeemer.
     * 
     */
    IEXE,

    /**
     * Intermediary is not recognised or is invalid.
     * 
     */
    INTE,

    /**
     * Order type is invalid.
     * 
     */
    IOTP,

    /**
     * Instructing party is not allowed to instruct for this investment account.
     * 
     */
    IPAC,

    /**
     * Instruction was received after market deadline.
     * 
     */
    LATE,

    /**
     * There is not enough cash in the account to process the instruction.
     * 
     */
    MONY,

    /**
     * The cancellation request has been rejected since more than one instruction match to the cancellation criteria.
     * 
     */
    NRGM,

    /**
     * Instruction is not compliant with the service level agreement.
     * 
     */
    NSLA,

    /**
     * Order reference is a duplicate of a previously received order.
     * 
     */
    ORRF,

    /**
     * Investment account identification is not recognised or is invalid.
     * 
     */
    SAFE,

    /**
     * There are not enough securities in the account to process the instruction.
     * 
     */
    SECU,

    /**
     * Quantity of units or amount of money in the order is too high for a subscription.
     * 
     */
    SHIG,

    /**
     * Quantity of units or amount of money in the order is too low for a subscription.
     * 
     */
    SLOW,

    /**
     * Deal currency is not supported.
     * 
     */
    UDCY,

    /**
     * Linked reference is not known.
     * 
     */
    ULNK,

    /**
     * Settlement currency requested is not supported.
     * 
     */
    URSC,

    /**
     * Unrecognised or invalid ordered amount.
     * 
     */
    ORDR,

    /**
     * Amount of subscription is below the minimum initial investment amount.
     * 
     */
    BMIN,

    /**
     * Amount of subscription is below the minimum top-up investment.
     * 
     */
    BMTO,

    /**
     * Insufficient capacity.
     * 
     */
    INSU,

    /**
     * Percentage holding breach, for example, PPM rules; taxation rules (ERISA).
     * 
     */
    PRCT,

    /**
     * Amount is below the minimum redemption amount.
     * 
     */
    BMRA,

    /**
     * Holding will be below the minimum retained value.
     * 
     */
    BMRV,

    /**
     * Lock-up period is in place.
     * 
     */
    LOCK,

    /**
     * Assets are illiquid.
     * 
     */
    ILLI,

    /**
     * Data in the order or transfer instruction is invalid.
     * 
     */
    DINV,

    /**
     * Fund is closed and will not take in any more investments.
     * 
     */
    CLOS;

    public String value() {
        return name();
    }

    public static RejectedStatusReason10Code fromValue(String v) {
        return valueOf(v);
    }

}
