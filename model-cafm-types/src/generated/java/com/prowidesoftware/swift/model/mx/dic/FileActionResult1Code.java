
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FileActionResult1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="FileActionResult1Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="DUPR"/>
 *     <enumeration value="FERD"/>
 *     <enumeration value="INFD"/>
 *     <enumeration value="FLCK"/>
 *     <enumeration value="FTER"/>
 *     <enumeration value="NSUP"/>
 *     <enumeration value="OTHR"/>
 *     <enumeration value="SUCC"/>
 *     <enumeration value="UTLR"/>
 *     <enumeration value="UNKF"/>
 *     <enumeration value="USUC"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
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
