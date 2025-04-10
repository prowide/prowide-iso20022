
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TerminalManagementActionResult5Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="TerminalManagementActionResult5Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="ACCD"/>
 *     <enumeration value="CNTE"/>
 *     <enumeration value="FMTE"/>
 *     <enumeration value="INVC"/>
 *     <enumeration value="LENE"/>
 *     <enumeration value="OVER"/>
 *     <enumeration value="MISS"/>
 *     <enumeration value="NSUP"/>
 *     <enumeration value="SIGE"/>
 *     <enumeration value="WARN"/>
 *     <enumeration value="SYNE"/>
 *     <enumeration value="TIMO"/>
 *     <enumeration value="UKDT"/>
 *     <enumeration value="UKRF"/>
 *     <enumeration value="INDP"/>
 *     <enumeration value="IDMP"/>
 *     <enumeration value="DPRU"/>
 *     <enumeration value="AERR"/>
 *     <enumeration value="CMER"/>
 *     <enumeration value="ULER"/>
 *     <enumeration value="SUCC"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "TerminalManagementActionResult5Code")
@XmlEnum
public enum TerminalManagementActionResult5Code {


    /**
     * Access is denied while performing the action.
     * 
     */
    ACCD,

    /**
     * Problem to connect while performing the action.
     * 
     */
    CNTE,

    /**
     * Data transferred has a wrong format.
     * 
     */
    FMTE,

    /**
     * Content of the data is invalid.
     * 
     */
    INVC,

    /**
     * Data transferred has a wrong length.
     * 
     */
    LENE,

    /**
     * Memory to store the date exceeded.
     * 
     */
    OVER,

    /**
     * Data set to be maintained is missing.
     * 
     */
    MISS,

    /**
     * Action is not supported.
     * 
     */
    NSUP,

    /**
     * Data transferred has a wrong digital signature.
     * 
     */
    SIGE,

    /**
     * Action was performed but some warnings arose.
     * 
     */
    WARN,

    /**
     * Data transferred has a wrong syntax.
     * 
     */
    SYNE,

    /**
     * Timeout expired during the data transfer.
     * 
     */
    TIMO,

    /**
     * Data set identification invalid.
     * 
     */
    UKDT,

    /**
     * Cryptographic key reference used for the data signature is not valid.
     * 
     */
    UKRF,

    /**
     * Delegation Proof transmitted by the delegated TMS is not the one expected.
     * 
     */
    INDP,

    /**
     * One action of the AcceptorManagementPlan refers to an update unauthorized by the delegation.
     * 
     */
    IDMP,

    /**
     * The content analysis of the AcceptorConfigurationUpdate reveals unexpected parameters.
     * 
     */
    DPRU,

    /**
     * This code value means all TerminalManagementActionResultCode except "Any Error" and "Unlisted Error".
     * 
     */
    AERR,

    /**
     * Error in communication once the connection has been established.
     * 
     */
    CMER,

    /**
     * Any error that is not defined by a code value inside the TerminalManagementActionResultCode.
     * 
     */
    ULER,

    /**
     * Action was successfully performed.
     * 
     */
    SUCC;

    public String value() {
        return name();
    }

    public static TerminalManagementActionResult5Code fromValue(String v) {
        return valueOf(v);
    }

}
