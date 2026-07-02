
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FileActionResult1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="FileActionResult1Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="DUPR"/&gt;
 *     &lt;enumeration value="FERD"/&gt;
 *     &lt;enumeration value="INFD"/&gt;
 *     &lt;enumeration value="FLCK"/&gt;
 *     &lt;enumeration value="FTER"/&gt;
 *     &lt;enumeration value="NSUP"/&gt;
 *     &lt;enumeration value="OTHR"/&gt;
 *     &lt;enumeration value="SUCC"/&gt;
 *     &lt;enumeration value="UTLR"/&gt;
 *     &lt;enumeration value="UNKF"/&gt;
 *     &lt;enumeration value="USUC"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "FileActionResult1Code")
@XmlEnum
public enum FileActionResult1Code {


    /**
     * Identified record is already present in the file.
     * 
     */
    DUPR,

    /**
     * Invalid record field syntax.
     * 
     */
    FERD,

    /**
     * Invalid field value in record.
     * 
     */
    INFD,

    /**
     * File is locked and cannot be modified.
     * 
     */
    FLCK,

    /**
     * Invalid record format.
     * 
     */
    FTER,

    /**
     * Requested file action not supported.
     * 
     */
    NSUP,

    /**
     * Other type of file action result
     * 
     */
    OTHR,

    /**
     * Action performed successfully
     * 
     */
    SUCC,

    /**
     * Identified record was not found.
     * 
     */
    UTLR,

    /**
     * File is unknown.
     * 
     */
    UNKF,

    /**
     * Action could not be performed.
     * 
     */
    USUC;

    public String value() {
        return name();
    }

    public static FileActionResult1Code fromValue(String v) {
        return valueOf(v);
    }

}
