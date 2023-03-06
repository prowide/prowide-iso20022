
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TransferRejectedStatusReason2Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="TransferRejectedStatusReason2Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="DDAT"/&gt;
 *     &lt;enumeration value="DEPT"/&gt;
 *     &lt;enumeration value="DSEC"/&gt;
 *     &lt;enumeration value="SECU"/&gt;
 *     &lt;enumeration value="ISTP"/&gt;
 *     &lt;enumeration value="ICTN"/&gt;
 *     &lt;enumeration value="SAFE"/&gt;
 *     &lt;enumeration value="IAQD"/&gt;
 *     &lt;enumeration value="BLCA"/&gt;
 *     &lt;enumeration value="DOCC"/&gt;
 *     &lt;enumeration value="IDNA"/&gt;
 *     &lt;enumeration value="DLVY"/&gt;
 *     &lt;enumeration value="LEGL"/&gt;
 *     &lt;enumeration value="NSLA"/&gt;
 *     &lt;enumeration value="DQUA"/&gt;
 *     &lt;enumeration value="INUK"/&gt;
 *     &lt;enumeration value="INID"/&gt;
 *     &lt;enumeration value="INAC"/&gt;
 *     &lt;enumeration value="INNA"/&gt;
 *     &lt;enumeration value="INPM"/&gt;
 *     &lt;enumeration value="CYPA"/&gt;
 *     &lt;enumeration value="PTNS"/&gt;
 *     &lt;enumeration value="FTAX"/&gt;
 *     &lt;enumeration value="ISAT"/&gt;
 *     &lt;enumeration value="CASH"/&gt;
 *     &lt;enumeration value="TREF"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "TransferRejectedStatusReason2Code")
@XmlEnum
public enum TransferRejectedStatusReason2Code {


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
     * Identification of the security is not recognised or is invalid.
     * 
     */
    DSEC,

    /**
     * There are not enough securities in the account to process the instruction.
     * 
     */
    SECU,

    /**
     * One or several settlement parties are not recognised or are invalid.
     * 
     */
    ISTP,

    /**
     * Certificate number is not recognised or is invalid.
     * 
     */
    ICTN,

    /**
     * Investment account identification is not recognised or is invalid.
     * 
     */
    SAFE,

    /**
     * Acquisition date is not recognised or is invalid.
     * 
     */
    IAQD,

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
     * Identification of the security and the security name are not the same.
     * 
     */
    IDNA,

    /**
     * Order contains physical delivery details but the fund can not be physically delivered.
     * 
     */
    DLVY,

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
     * Financial instrument quantity is invalid.
     * 
     */
    DQUA,

    /**
     * Investor name and address is not recognised.
     * 
     */
    INUK,

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
     * Nominee account is not recognised or is invalid.
     * 
     */
    INNA,

    /**
     * New plan manager is not recognised or is invalid.
     * 
     */
    INPM,

    /**
     * Partial transfer of current year is not allowed, that is, it is not possible to transfer one asset for the current year as other assets are held for the current year.
     * 
     */
    CYPA,

    /**
     * Partial transfer is not supported. Applicable when tax years are rolled up and because, for example, a transfer request for tax year 2000 only is received, it is not possible to process the transfer as the investor holds other tax years as well.
     * 
     */
    PTNS,

    /**
     * Financial instrument is not valid for the requested tax year.
     * 
     */
    FTAX,

    /**
     * ISA type is not recognised or invalid.
     * 
     */
    ISAT,

    /**
     * Cash account is not recognised or invalid.
     * 
     */
    CASH,

    /**
     * Transfer reference is a duplicate of a previously received transfer.
     * 
     */
    TREF;

    public String value() {
        return name();
    }

    public static TransferRejectedStatusReason2Code fromValue(String v) {
        return valueOf(v);
    }

}
