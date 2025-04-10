
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TerminalManagementActionResult2Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="TerminalManagementActionResult2Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="CNTE"/>
 *     <enumeration value="FMTE"/>
 *     <enumeration value="HRDW"/>
 *     <enumeration value="NSUP"/>
 *     <enumeration value="SECR"/>
 *     <enumeration value="SUCC"/>
 *     <enumeration value="SYNE"/>
 *     <enumeration value="TIMO"/>
 *     <enumeration value="UKRF"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
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
