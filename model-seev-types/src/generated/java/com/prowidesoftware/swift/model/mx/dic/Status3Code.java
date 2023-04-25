
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Status3Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="Status3Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="CAND"/>
 *     <enumeration value="PACK"/>
 *     <enumeration value="NOIN"/>
 *     <enumeration value="COMP"/>
 *     <enumeration value="RCIS"/>
 *     <enumeration value="STIN"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "Status3Code")
@XmlEnum
public enum Status3Code {


    /**
     * Instruction has been cancelled.
     * 
     */
    CAND,

    /**
     * Instruction has been accepted and is validated for further processing.
     * 
     */
    PACK,

    /**
     * No instruction has been received (to be used in a reminder).
     * 
     */
    NOIN,

    /**
     * Processing has been completed.
     * 
     */
    COMP,

    /**
     * Instruction has been received by Issuer.
     * 
     */
    RCIS,

    /**
     * Standing instruction is applied.
     * 
     */
    STIN;

    public String value() {
        return name();
    }

    public static Status3Code fromValue(String v) {
        return valueOf(v);
    }

}
