
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Status8Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="Status8Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="CSUB"/>
 *     <enumeration value="PACK"/>
 *     <enumeration value="CAND"/>
 *     <enumeration value="RCIS"/>
 *     <enumeration value="STIN"/>
 *     <enumeration value="FRWD"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "Status8Code")
@XmlEnum
public enum Status8Code {


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
     * Instruction has been received by Issuer.
     * 
     */
    RCIS,

    /**
     * Standing instruction is applied.
     * 
     */
    STIN,

    /**
     * Accepted and sent along the chain.
     * 
     */
    FRWD;

    public String value() {
        return name();
    }

    public static Status8Code fromValue(String v) {
        return valueOf(v);
    }

}
