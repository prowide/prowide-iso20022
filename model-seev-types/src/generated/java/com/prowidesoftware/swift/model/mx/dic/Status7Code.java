
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Status7Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="Status7Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="CSUB"/>
 *     <enumeration value="PACK"/>
 *     <enumeration value="CAND"/>
 *     <enumeration value="COMP"/>
 *     <enumeration value="NOIN"/>
 *     <enumeration value="RCIS"/>
 *     <enumeration value="STIN"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "Status7Code")
@XmlEnum
public enum Status7Code {


    /**
     * Instruction has been cancelled by the agent, for example, due to an event deadline extension.
     * 
     */
    CSUB,

    /**
     * Instruction has been accepted and is validated for further processing.
     * 
     */
    PACK,

    /**
     * Instruction has been cancelled.
     * 
     */
    CAND,

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

    public static Status7Code fromValue(String v) {
        return valueOf(v);
    }

}
