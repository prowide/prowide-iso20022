
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Status1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="Status1Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="PACK"/>
 *     <enumeration value="COMP"/>
 *     <enumeration value="NOIN"/>
 *     <enumeration value="CAND"/>
 *     <enumeration value="RCIS"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "Status1Code")
@XmlEnum
public enum Status1Code {


    /**
     * Instruction has been accepted and is validated for further processing.
     * 
     */
    PACK,

    /**
     * Processing has been completed.
     * 
     */
    COMP,

    /**
     * No instruction has been received (to be used in a reminder).
     * 
     */
    NOIN,

    /**
     * Instruction has been cancelled.
     * 
     */
    CAND,

    /**
     * Instruction has been received by Issuer.
     * 
     */
    RCIS;

    public String value() {
        return name();
    }

    public static Status1Code fromValue(String v) {
        return valueOf(v);
    }

}
