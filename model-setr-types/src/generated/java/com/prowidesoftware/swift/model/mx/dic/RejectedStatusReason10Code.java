
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RejectedStatusReason10Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="RejectedStatusReason10Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="ADEA"/&gt;
 *     &lt;enumeration value="BLTR"/&gt;
 *     &lt;enumeration value="CUTO"/&gt;
 *     &lt;enumeration value="DDAT"/&gt;
 *     &lt;enumeration value="DOCC"/&gt;
 *     &lt;enumeration value="DQUA"/&gt;
 *     &lt;enumeration value="DSEC"/&gt;
 *     &lt;enumeration value="DTRD"/&gt;
 *     &lt;enumeration value="IDNA"/&gt;
 *     &lt;enumeration value="IEXE"/&gt;
 *     &lt;enumeration value="INTE"/&gt;
 *     &lt;enumeration value="IOTP"/&gt;
 *     &lt;enumeration value="IPAC"/&gt;
 *     &lt;enumeration value="LATE"/&gt;
 *     &lt;enumeration value="MONY"/&gt;
 *     &lt;enumeration value="NRGM"/&gt;
 *     &lt;enumeration value="NSLA"/&gt;
 *     &lt;enumeration value="ORRF"/&gt;
 *     &lt;enumeration value="SAFE"/&gt;
 *     &lt;enumeration value="SECU"/&gt;
 *     &lt;enumeration value="SHIG"/&gt;
 *     &lt;enumeration value="SLOW"/&gt;
 *     &lt;enumeration value="UDCY"/&gt;
 *     &lt;enumeration value="ULNK"/&gt;
 *     &lt;enumeration value="URSC"/&gt;
 *     &lt;enumeration value="ORDR"/&gt;
 *     &lt;enumeration value="BMIN"/&gt;
 *     &lt;enumeration value="BMTO"/&gt;
 *     &lt;enumeration value="INSU"/&gt;
 *     &lt;enumeration value="PRCT"/&gt;
 *     &lt;enumeration value="BMRA"/&gt;
 *     &lt;enumeration value="BMRV"/&gt;
 *     &lt;enumeration value="LOCK"/&gt;
 *     &lt;enumeration value="ILLI"/&gt;
 *     &lt;enumeration value="DINV"/&gt;
 *     &lt;enumeration value="CLOS"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
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
