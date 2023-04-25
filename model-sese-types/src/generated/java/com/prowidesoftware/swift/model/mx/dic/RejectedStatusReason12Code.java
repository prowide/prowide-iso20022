
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RejectedStatusReason12Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="RejectedStatusReason12Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="BLCA"/>
 *     <enumeration value="DOCC"/>
 *     <enumeration value="IAQD"/>
 *     <enumeration value="ICTN"/>
 *     <enumeration value="CYPA"/>
 *     <enumeration value="TREF"/>
 *     <enumeration value="DSEC"/>
 *     <enumeration value="IDNA"/>
 *     <enumeration value="DQUA"/>
 *     <enumeration value="FTAX"/>
 *     <enumeration value="INID"/>
 *     <enumeration value="INAC"/>
 *     <enumeration value="CASH"/>
 *     <enumeration value="INPM"/>
 *     <enumeration value="INNA"/>
 *     <enumeration value="SAFE"/>
 *     <enumeration value="INUK"/>
 *     <enumeration value="LEGL"/>
 *     <enumeration value="NSLA"/>
 *     <enumeration value="SECU"/>
 *     <enumeration value="PTNS"/>
 *     <enumeration value="DLVY"/>
 *     <enumeration value="DDAT"/>
 *     <enumeration value="ISTP"/>
 *     <enumeration value="DEPT"/>
 *     <enumeration value="ISAT"/>
 *     <enumeration value="OTHR"/>
 *     <enumeration value="NCON"/>
 *     <enumeration value="ACLO"/>
 *     <enumeration value="NASS"/>
 *     <enumeration value="NQTY"/>
 *     <enumeration value="BLTR"/>
 *     <enumeration value="COSE"/>
 *     <enumeration value="ILLI"/>
 *     <enumeration value="BMRV"/>
 *     <enumeration value="DINV"/>
 *     <enumeration value="ICAG"/>
 *     <enumeration value="IPAC"/>
 *     <enumeration value="INTE"/>
 *     <enumeration value="DMON"/>
 *     <enumeration value="PRCT"/>
 *     <enumeration value="IVAG"/>
 *     <enumeration value="NCRR"/>
 *     <enumeration value="DTRD"/>
 *     <enumeration value="UPAY"/>
 *     <enumeration value="URSC"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "RejectedStatusReason12Code")
@XmlEnum
public enum RejectedStatusReason12Code {


    /**
     * Investment account is blocked due to a corporate action.
     * 
     */
    BLCA,

    /**
     * Investment account is blocked until certain legal proceedings are completed, for example, legal documents from the successor, legal proceedings due to bankruptcy.
     * 
     */
    DOCC,

    /**
     * Acquisition date is not recognised or is invalid.
     * 
     */
    IAQD,

    /**
     * Certificate number is not recognised or is invalid.
     * 
     */
    ICTN,

    /**
     * Partial transfer of current year is not allowed, that is, it is not possible to transfer one asset for the current year as other assets are held for the current year.
     * 
     */
    CYPA,

    /**
     * Transfer reference is a duplicate of a previously received transfer.
     * 
     */
    TREF,

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
     * Financial instrument is not valid for the requested tax year.
     * 
     */
    FTAX,

    /**
     * Investor data is insufficient. Applicable when the mandated market practice is not followed.
     * 
     */
    INID,

    /**
     * Account servicer is not recognised or is invalid.
     * 
     */
    INAC,

    /**
     * Cash account is not recognised or invalid.
     * 
     */
    CASH,

    /**
     * New plan manager is not recognised or is invalid.
     * 
     */
    INPM,

    /**
     * Nominee account is not recognised or is invalid.
     * 
     */
    INNA,

    /**
     * Investment account identification is not recognised or is invalid.
     * 
     */
    SAFE,

    /**
     * Investor name and address is not recognised.
     * 
     */
    INUK,

    /**
     * Legally impossible to cancel.
     * 
     */
    LEGL,

    /**
     * Instruction is not compliant with the service level agreement.
     * 
     */
    NSLA,

    /**
     * There are not enough securities in the account to process the instruction.
     * 
     */
    SECU,

    /**
     * Partial transfer is not supported. Applicable when tax years are rolled up and because, for example, a transfer request for tax year 2000 only is received, it is not possible to process the transfer as the investor holds other tax years as well.
     * 
     */
    PTNS,

    /**
     * Order contains physical delivery details but the fund can not be physically delivered.
     * 
     */
    DLVY,

    /**
     * Cash settlement date is not recognised or is invalid.
     * 
     */
    DDAT,

    /**
     * One or several settlement parties are not recognised or are invalid.
     * 
     */
    ISTP,

    /**
     * Place of settlement is not recognised or is invalid.
     * 
     */
    DEPT,

    /**
     * ISA type is not recognised or invalid.
     * 
     */
    ISAT,

    /**
     * Another reason for the status rejected.
     * 
     */
    OTHR,

    /**
     * The two share classes are not part of the same fund.
     * 
     */
    NCON,

    /**
     * Asset instructed for transfer is closed.
     * 
     */
    ACLO,

    /**
     * Asset does not support reregistration.
     * 
     */
    NASS,

    /**
     * Transfer quantity is too small.
     * 
     */
    NQTY,

    /**
     * Investment account is blocked due to a transfer out of investment funds.
     * 
     */
    BLTR,

    /**
     * Order or transfer has already been executed and confirmation has been sent.
     * 
     */
    COSE,

    /**
     * Assets are illiquid.
     * 
     */
    ILLI,

    /**
     * Holding will be below the minimum retained value.
     * 
     */
    BMRV,

    /**
     * Data in the order or transfer instruction is invalid.
     * 
     */
    DINV,

    /**
     * Delivering agent is not recognised or is invalid.
     * 
     */
    ICAG,

    /**
     * Instructing party is not allowed to instruct for this investment account.
     * 
     */
    IPAC,

    /**
     * Intermediary is not recognised or is invalid.
     * 
     */
    INTE,

    /**
     * Unrecognised or invalid settlement amount.
     * 
     */
    DMON,

    /**
     * Percentage holding breach, for example, PPM rules; taxation rules (ERISA).
     * 
     */
    PRCT,

    /**
     * Receiving agent is not recognised or is invalid.
     * 
     */
    IVAG,

    /**
     * Unrecognised or invalid Settlement Amount Currency.
     * 
     */
    NCRR,

    /**
     * Unrecognised or invalid trade date or requested trade date or future trade date.
     * 
     */
    DTRD,

    /**
     * Payment method, for example, cheque or payment card, is not accepted.
     * 
     */
    UPAY,

    /**
     * Settlement currency requested is not supported.
     * 
     */
    URSC;

    public String value() {
        return name();
    }

    public static RejectedStatusReason12Code fromValue(String v) {
        return valueOf(v);
    }

}
