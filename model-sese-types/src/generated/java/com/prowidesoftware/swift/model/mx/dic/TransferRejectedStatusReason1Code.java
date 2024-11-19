
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TransferRejectedStatusReason1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="TransferRejectedStatusReason1Code">
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
 *     <enumeration value="OTHR"/>
 *     <enumeration value="DQUA"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "TransferRejectedStatusReason1Code")
@XmlEnum
public enum TransferRejectedStatusReason1Code {


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
     * Another reason for the status rejected.
     * 
     */
    OTHR,

    /**
     * Financial instrument quantity is invalid.
     * 
     */
    DQUA;

    public String value() {
        return name();
    }

    public static TransferRejectedStatusReason1Code fromValue(String v) {
        return valueOf(v);
    }

}
