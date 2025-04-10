
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RejectedStatusReason11Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="RejectedStatusReason11Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="BLCA"/>
 *     <enumeration value="BLTR"/>
 *     <enumeration value="DOCC"/>
 *     <enumeration value="ADEA"/>
 *     <enumeration value="ILLI"/>
 *     <enumeration value="BMIN"/>
 *     <enumeration value="BMRA"/>
 *     <enumeration value="BMRV"/>
 *     <enumeration value="CUTO"/>
 *     <enumeration value="ICAG"/>
 *     <enumeration value="IDDB"/>
 *     <enumeration value="ORRF"/>
 *     <enumeration value="FEEE"/>
 *     <enumeration value="DSEC"/>
 *     <enumeration value="IDNA"/>
 *     <enumeration value="DQUA"/>
 *     <enumeration value="CLOS"/>
 *     <enumeration value="IPAC"/>
 *     <enumeration value="INSU"/>
 *     <enumeration value="INTE"/>
 *     <enumeration value="CASH"/>
 *     <enumeration value="ICTR"/>
 *     <enumeration value="IOTP"/>
 *     <enumeration value="DFOR"/>
 *     <enumeration value="DMON"/>
 *     <enumeration value="SAFE"/>
 *     <enumeration value="LOCK"/>
 *     <enumeration value="NRGM"/>
 *     <enumeration value="NSLA"/>
 *     <enumeration value="MONY"/>
 *     <enumeration value="SECU"/>
 *     <enumeration value="IPAY"/>
 *     <enumeration value="PRCT"/>
 *     <enumeration value="DLVY"/>
 *     <enumeration value="PHYS"/>
 *     <enumeration value="PLCE"/>
 *     <enumeration value="IVAG"/>
 *     <enumeration value="RTGS"/>
 *     <enumeration value="ISAF"/>
 *     <enumeration value="NCRR"/>
 *     <enumeration value="DDAT"/>
 *     <enumeration value="DEPT"/>
 *     <enumeration value="SETR"/>
 *     <enumeration value="IEXE"/>
 *     <enumeration value="SHIG"/>
 *     <enumeration value="LATE"/>
 *     <enumeration value="SLOW"/>
 *     <enumeration value="DTRD"/>
 *     <enumeration value="UWAI"/>
 *     <enumeration value="UDCY"/>
 *     <enumeration value="UNAV"/>
 *     <enumeration value="UPAY"/>
 *     <enumeration value="URSC"/>
 *     <enumeration value="ULNK"/>
 *     <enumeration value="UNSC"/>
 *     <enumeration value="POIN"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
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
     * Investment account is blocked until certain legal proceedings are completed, for example, legal documents from the successor, legal proceedings due to bankruptcy.
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
     * Percentage holding breach, for example, PPM rules; taxation rules (ERISA).
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
     * Payment method, for example, cheque or payment card, is not accepted.
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
