
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TerminalManagementActionResult2Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="TerminalManagementActionResult2Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="CNTE"/&gt;
 *     &lt;enumeration value="FMTE"/&gt;
 *     &lt;enumeration value="HRDW"/&gt;
 *     &lt;enumeration value="NSUP"/&gt;
 *     &lt;enumeration value="SECR"/&gt;
 *     &lt;enumeration value="SUCC"/&gt;
 *     &lt;enumeration value="SYNE"/&gt;
 *     &lt;enumeration value="TIMO"/&gt;
 *     &lt;enumeration value="UKRF"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "TerminalManagementActionResult2Code")
@XmlEnum
public enum TerminalManagementActionResult2Code {


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
     * Hardware error.
     * 
     */
    HRDW,

    /**
     * Action is not supported.
     * 
     */
    NSUP,

    /**
     * Security error.
     * 
     */
    SECR,

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
     * Cryptographic key reference used for the data signature is not valid.
     * 
     */
    UKRF;

    public String value() {
        return name();
    }

    public static TerminalManagementActionResult2Code fromValue(String v) {
        return valueOf(v);
    }

}
