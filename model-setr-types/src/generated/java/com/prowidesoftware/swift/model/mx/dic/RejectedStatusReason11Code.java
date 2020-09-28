
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RejectedStatusReason11Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="RejectedStatusReason11Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="BLCA"/&gt;
 *     &lt;enumeration value="BLTR"/&gt;
 *     &lt;enumeration value="DOCC"/&gt;
 *     &lt;enumeration value="ADEA"/&gt;
 *     &lt;enumeration value="ILLI"/&gt;
 *     &lt;enumeration value="BMIN"/&gt;
 *     &lt;enumeration value="BMRA"/&gt;
 *     &lt;enumeration value="BMRV"/&gt;
 *     &lt;enumeration value="CUTO"/&gt;
 *     &lt;enumeration value="ICAG"/&gt;
 *     &lt;enumeration value="IDDB"/&gt;
 *     &lt;enumeration value="ORRF"/&gt;
 *     &lt;enumeration value="FEEE"/&gt;
 *     &lt;enumeration value="DSEC"/&gt;
 *     &lt;enumeration value="IDNA"/&gt;
 *     &lt;enumeration value="DQUA"/&gt;
 *     &lt;enumeration value="CLOS"/&gt;
 *     &lt;enumeration value="IPAC"/&gt;
 *     &lt;enumeration value="INSU"/&gt;
 *     &lt;enumeration value="INTE"/&gt;
 *     &lt;enumeration value="CASH"/&gt;
 *     &lt;enumeration value="ICTR"/&gt;
 *     &lt;enumeration value="IOTP"/&gt;
 *     &lt;enumeration value="DFOR"/&gt;
 *     &lt;enumeration value="DMON"/&gt;
 *     &lt;enumeration value="SAFE"/&gt;
 *     &lt;enumeration value="LOCK"/&gt;
 *     &lt;enumeration value="NRGM"/&gt;
 *     &lt;enumeration value="NSLA"/&gt;
 *     &lt;enumeration value="MONY"/&gt;
 *     &lt;enumeration value="SECU"/&gt;
 *     &lt;enumeration value="IPAY"/&gt;
 *     &lt;enumeration value="PRCT"/&gt;
 *     &lt;enumeration value="DLVY"/&gt;
 *     &lt;enumeration value="PHYS"/&gt;
 *     &lt;enumeration value="PLCE"/&gt;
 *     &lt;enumeration value="IVAG"/&gt;
 *     &lt;enumeration value="RTGS"/&gt;
 *     &lt;enumeration value="ISAF"/&gt;
 *     &lt;enumeration value="NCRR"/&gt;
 *     &lt;enumeration value="DDAT"/&gt;
 *     &lt;enumeration value="DEPT"/&gt;
 *     &lt;enumeration value="SETR"/&gt;
 *     &lt;enumeration value="IEXE"/&gt;
 *     &lt;enumeration value="SHIG"/&gt;
 *     &lt;enumeration value="LATE"/&gt;
 *     &lt;enumeration value="SLOW"/&gt;
 *     &lt;enumeration value="DTRD"/&gt;
 *     &lt;enumeration value="UWAI"/&gt;
 *     &lt;enumeration value="UDCY"/&gt;
 *     &lt;enumeration value="UNAV"/&gt;
 *     &lt;enumeration value="UPAY"/&gt;
 *     &lt;enumeration value="URSC"/&gt;
 *     &lt;enumeration value="ULNK"/&gt;
 *     &lt;enumeration value="UNSC"/&gt;
 *     &lt;enumeration value="POIN"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "RejectedStatusReason11Code")
@XmlEnum
public enum RejectedStatusReason11Code {


    /**
     * Investment account is blocked due to a corporate action.
     * 
     */
    BLCA,

    /**
     * Investment account is blocked due to a transfer out of investment funds.
     * 
     */
    BLTR,

    /**
     * Investment account is blocked until certain legal proceedings are completed, eg, legal documents from the successor, legal proceedings due to bankruptcy.
     * 
     */
    DOCC,

    /**
     * Instruction was received after the Receiver's deadline.
     * 
     */
    ADEA,

    /**
     * Assets are illiquid.
     * 
     */
    ILLI,

    /**
     * Amount of subscription is below the minimum initial investment amount.
     * 
     */
    BMIN,

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
     * Instruction has been received after the cut-off time.
     * 
     */
    CUTO,

    /**
     * Delivering agent is not recognised or is invalid.
     * 
     */
    ICAG,

    /**
     * Direct debit account identification is not recognised or is invalid.
     * 
     */
    IDDB,

    /**
     * Order reference is a duplicate of a previously received order.
     * 
     */
    ORRF,

    /**
     * Unrecognised or invalid fee or commission.
     * 
     */
    FEEE,

    /**
     * Identification of the security is not recognised or is invalid.
     * 
     */
    DSEC,

    /**
     * Identification of the security and the security name are not the same.
     * 
     */
    IDNA,

    /**
     * Financial instrument quantity is invalid.
     * 
     */
    DQUA,

    /**
     * Fund is closed and will not take in any more investments.
     * 
     */
    CLOS,

    /**
     * Instructing party is not allowed to instruct for this investment account.
     * 
     */
    IPAC,

    /**
     * Insufficient capacity.
     * 
     */
    INSU,

    /**
     * Intermediary is not recognised or is invalid.
     * 
     */
    INTE,

    /**
     * Cash account is not recognised or invalid.
     * 
     */
    CASH,

    /**
     * Credit transfer details are incorrect.
     * 
     */
    ICTR,

    /**
     * Order type is invalid.
     * 
     */
    IOTP,

    /**
     * Form of the security is wrong, eg, the form of security is registered not bearer or vice versa.
     * 
     */
    DFOR,

    /**
     * Unrecognised or invalid settlement amount.
     * 
     */
    DMON,

    /**
     * Investment account identification is not recognised or is invalid.
     * 
     */
    SAFE,

    /**
     * Lock-up period is in place.
     * 
     */
    LOCK,

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
     * There is not enough cash in the account to process the instruction.
     * 
     */
    MONY,

    /**
     * There are not enough securities in the account to process the instruction.
     * 
     */
    SECU,

    /**
     * Payment card details are incorrect.
     * 
     */
    IPAY,

    /**
     * Percentage holding breach, eg, PPM rules; taxation rules (ERISA).
     * 
     */
    PRCT,

    /**
     * Order contains physical delivery details but the fund can not be physically delivered.
     * 
     */
    DLVY,

    /**
     * Physical Settlement Impossible.
     * 
     */
    PHYS,

    /**
     * Unrecognised or invalid Place of Trade.
     * 
     */
    PLCE,

    /**
     * Receiving agent is not recognised or is invalid.
     * 
     */
    IVAG,

    /**
     * Impossible to use RTGS System.
     * 
     */
    RTGS,

    /**
     * Safekeeping place is not recognised or is invalid.
     * 
     */
    ISAF,

    /**
     * Unrecognised or invalid Settlement Amount Currency.
     * 
     */
    NCRR,

    /**
     * Cash settlement date is not recognised or is invalid.
     * 
     */
    DDAT,

    /**
     * Place of settlement is not recognised or is invalid.
     * 
     */
    DEPT,

    /**
     * Unrecognised or invalid Settlement Transaction.
     * 
     */
    SETR,

    /**
     * Unrecognised or invalid subscriber or redeemer.
     * 
     */
    IEXE,

    /**
     * Quantity of units or amount of money in the order is too high for a subscription.
     * 
     */
    SHIG,

    /**
     * Instruction was received after market deadline.
     * 
     */
    LATE,

    /**
     * Quantity of units or amount of money in the order is too low for a subscription.
     * 
     */
    SLOW,

    /**
     * Unrecognised or invalid trade date or requested trade date or future trade date.
     * 
     */
    DTRD,

    /**
     * Percentage of commission waiving exceeds the commission percentage or commission amount.
     * 
     */
    UWAI,

    /**
     * Deal currency is not supported.
     * 
     */
    UDCY,

    /**
     * Net asset value currency is not supported.
     * 
     */
    UNAV,

    /**
     * Payment method, eg, cheque or payment card, is not accepted.
     * 
     */
    UPAY,

    /**
     * Settlement currency requested is not supported.
     * 
     */
    URSC,

    /**
     * Linked reference is not known.
     * 
     */
    ULNK,

    /**
     * Instruction specifies an unacceptable combination for the financial instruments in the switch order.
     * 
     */
    UNSC,

    /**
     * Order contains funds that have different valuation points.
     * 
     */
    POIN;

    public String value() {
        return name();
    }

    public static RejectedStatusReason11Code fromValue(String v) {
        return valueOf(v);
    }

}
