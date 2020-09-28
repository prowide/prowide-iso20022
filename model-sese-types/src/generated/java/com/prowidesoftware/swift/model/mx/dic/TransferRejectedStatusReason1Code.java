
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TransferRejectedStatusReason1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="TransferRejectedStatusReason1Code"&gt;
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
 *     &lt;enumeration value="OTHR"/&gt;
 *     &lt;enumeration value="DQUA"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
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
     * Investment account is blocked until certain legal proceedings are completed, eg, legal documents from the successor, legal proceedings due to bankruptcy.
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
