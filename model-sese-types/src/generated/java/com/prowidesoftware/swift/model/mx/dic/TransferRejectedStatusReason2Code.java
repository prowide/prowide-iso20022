
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TransferRejectedStatusReason2Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="TransferRejectedStatusReason2Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="DDAT"/>
 *     <enumeration value="DEPT"/>
 *     <enumeration value="DSEC"/>
 *     <enumeration value="SECU"/>
 *     <enumeration value="ISTP"/>
 *     <enumeration value="ICTN"/>
 *     <enumeration value="SAFE"/>
 *     <enumeration value="IAQD"/>
 *     <enumeration value="BLCA"/>
 *     <enumeration value="DOCC"/>
 *     <enumeration value="IDNA"/>
 *     <enumeration value="DLVY"/>
 *     <enumeration value="LEGL"/>
 *     <enumeration value="NSLA"/>
 *     <enumeration value="DQUA"/>
 *     <enumeration value="INUK"/>
 *     <enumeration value="INID"/>
 *     <enumeration value="INAC"/>
 *     <enumeration value="INNA"/>
 *     <enumeration value="INPM"/>
 *     <enumeration value="CYPA"/>
 *     <enumeration value="PTNS"/>
 *     <enumeration value="FTAX"/>
 *     <enumeration value="ISAT"/>
 *     <enumeration value="CASH"/>
 *     <enumeration value="TREF"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
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
