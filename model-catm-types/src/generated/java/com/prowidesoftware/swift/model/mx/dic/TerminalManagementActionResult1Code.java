
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TerminalManagementActionResult1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="TerminalManagementActionResult1Code">
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
 *     <enumeration value="SUCC"/>
 *     <enumeration value="SYNE"/>
 *     <enumeration value="TIMO"/>
 *     <enumeration value="UKDT"/>
 *     <enumeration value="UKRF"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "TerminalManagementActionResult1Code")
@XmlEnum
public enum TerminalManagementActionResult1Code {


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
    UKRF;

    public String value() {
        return name();
    }

    public static TerminalManagementActionResult1Code fromValue(String v) {
        return valueOf(v);
    }

}
