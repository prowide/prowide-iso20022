
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RejectedStatusReason15Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="RejectedStatusReason15Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="DDAT"/>
 *     <enumeration value="POIN"/>
 *     <enumeration value="ICAG"/>
 *     <enumeration value="IDDB"/>
 *     <enumeration value="INTE"/>
 *     <enumeration value="SAFE"/>
 *     <enumeration value="IPAY"/>
 *     <enumeration value="ICTR"/>
 *     <enumeration value="DEPT"/>
 *     <enumeration value="IVAG"/>
 *     <enumeration value="ISAF"/>
 *     <enumeration value="DFOR"/>
 *     <enumeration value="DSEC"/>
 *     <enumeration value="BLCA"/>
 *     <enumeration value="BLTR"/>
 *     <enumeration value="DOCC"/>
 *     <enumeration value="MONY"/>
 *     <enumeration value="SECU"/>
 *     <enumeration value="IDNA"/>
 *     <enumeration value="UWAI"/>
 *     <enumeration value="UDCY"/>
 *     <enumeration value="UNAV"/>
 *     <enumeration value="UPAY"/>
 *     <enumeration value="URSC"/>
 *     <enumeration value="SHIG"/>
 *     <enumeration value="SLOW"/>
 *     <enumeration value="ULNK"/>
 *     <enumeration value="DLVY"/>
 *     <enumeration value="ORRF"/>
 *     <enumeration value="IPAC"/>
 *     <enumeration value="IOTP"/>
 *     <enumeration value="NSLA"/>
 *     <enumeration value="CUTO"/>
 *     <enumeration value="DQUA"/>
 *     <enumeration value="LATE"/>
 *     <enumeration value="ADEA"/>
 *     <enumeration value="DTRD"/>
 *     <enumeration value="FEEE"/>
 *     <enumeration value="IEXE"/>
 *     <enumeration value="NCRR"/>
 *     <enumeration value="PHYS"/>
 *     <enumeration value="PLCE"/>
 *     <enumeration value="SETR"/>
 *     <enumeration value="RTGS"/>
 *     <enumeration value="CASH"/>
 *     <enumeration value="DMON"/>
 *     <enumeration value="BMIN"/>
 *     <enumeration value="INSU"/>
 *     <enumeration value="PRCT"/>
 *     <enumeration value="BMRA"/>
 *     <enumeration value="BMRV"/>
 *     <enumeration value="LOCK"/>
 *     <enumeration value="ILLI"/>
 *     <enumeration value="CLOS"/>
 *     <enumeration value="UNSC"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "RejectedStatusReason15Code")
@XmlEnum
public enum RejectedStatusReason15Code {


    /**
     * Cash settlement date is not recognised or is invalid.
     * 
     */
    DDAT,

    /**
     * Order contains funds that have different valuation points.
     * 
     */
    POIN,

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
     * Intermediary is not recognised or is invalid.
     * 
     */
    INTE,

    /**
     * Investment account identification is not recognised or is invalid.
     * 
     */
    SAFE,

    /**
     * Payment card details are incorrect.
     * 
     */
    IPAY,

    /**
     * Credit transfer details are incorrect.
     * 
     */
    ICTR,

    /**
     * Place of settlement is not recognised or is invalid.
     * 
     */
    DEPT,

    /**
     * Receiving agent is not recognised or is invalid.
     * 
     */
    IVAG,

    /**
     * Safekeeping place is not recognised or is invalid.
     * 
     */
    ISAF,

    /**
     * Form of the security is wrong, eg, the form of security is registered not bearer or vice versa.
     * 
     */
    DFOR,

    /**
     * Identification of the security is not recognised or is invalid.
     * 
     */
    DSEC,

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
     * Identification of the security and the security name are not the same.
     * 
     */
    IDNA,

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
     * Linked reference is not known.
     * 
     */
    ULNK,

    /**
     * Order contains physical delivery details but the fund can not be physically delivered.
     * 
     */
    DLVY,

    /**
     * Order reference is a duplicate of a previously received order.
     * 
     */
    ORRF,

    /**
     * Instructing party is not allowed to instruct for this investment account.
     * 
     */
    IPAC,

    /**
     * Order type is invalid.
     * 
     */
    IOTP,

    /**
     * Instruction is not compliant with the service level agreement.
     * 
     */
    NSLA,

    /**
     * Instruction has been received after the cut-off time.
     * 
     */
    CUTO,

    /**
     * Financial instrument quantity is invalid.
     * 
     */
    DQUA,

    /**
     * Instruction was received after market deadline.
     * 
     */
    LATE,

    /**
     * Instruction was received after the Receiver's deadline.
     * 
     */
    ADEA,

    /**
     * Unrecognised or invalid trade date or requested trade date or future trade date.
     * 
     */
    DTRD,

    /**
     * Unrecognised or invalid fee or commission.
     * 
     */
    FEEE,

    /**
     * Unrecognised or invalid subscriber or redeemer.
     * 
     */
    IEXE,

    /**
     * Unrecognised or invalid Settlement Amount Currency.
     * 
     */
    NCRR,

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
     * Unrecognised or invalid Settlement Transaction.
     * 
     */
    SETR,

    /**
     * Impossible to use RTGS System.
     * 
     */
    RTGS,

    /**
     * Cash account is not recognised or invalid.
     * 
     */
    CASH,

    /**
     * Unrecognised or invalid settlement amount.
     * 
     */
    DMON,

    /**
     * Amount of subscription is below the minimum initial investment amount.
     * 
     */
    BMIN,

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
     * Fund is closed and will not take in any more investments.
     * 
     */
    CLOS,

    /**
     * Instruction specifies an unacceptable combination for the financial instruments in the switch order.
     * 
     */
    UNSC;

    public String value() {
        return name();
    }

    public static RejectedStatusReason15Code fromValue(String v) {
        return valueOf(v);
    }

}
