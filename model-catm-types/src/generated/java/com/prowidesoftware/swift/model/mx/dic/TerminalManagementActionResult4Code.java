
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TerminalManagementActionResult4Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="TerminalManagementActionResult4Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="ACCD"/&gt;
 *     &lt;enumeration value="CNTE"/&gt;
 *     &lt;enumeration value="FMTE"/&gt;
 *     &lt;enumeration value="INVC"/&gt;
 *     &lt;enumeration value="LENE"/&gt;
 *     &lt;enumeration value="OVER"/&gt;
 *     &lt;enumeration value="MISS"/&gt;
 *     &lt;enumeration value="NSUP"/&gt;
 *     &lt;enumeration value="SIGE"/&gt;
 *     &lt;enumeration value="SUCC"/&gt;
 *     &lt;enumeration value="SYNE"/&gt;
 *     &lt;enumeration value="TIMO"/&gt;
 *     &lt;enumeration value="UKDT"/&gt;
 *     &lt;enumeration value="UKRF"/&gt;
 *     &lt;enumeration value="INDP"/&gt;
 *     &lt;enumeration value="IDMP"/&gt;
 *     &lt;enumeration value="DPRU"/&gt;
 *     &lt;enumeration value="AERR"/&gt;
 *     &lt;enumeration value="CMER"/&gt;
 *     &lt;enumeration value="ULER"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "TerminalManagementActionResult4Code")
@XmlEnum
public enum TerminalManagementActionResult4Code {


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
     * Action was successfully performed.
     * 
     */
    SUCC,

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
    ULER;

    public String value() {
        return name();
    }

    public static TerminalManagementActionResult4Code fromValue(String v) {
        return valueOf(v);
    }

}
