
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ProtectInstructionStatus3Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="ProtectInstructionStatus3Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="OPEN"/>
 *     <enumeration value="COVR"/>
 *     <enumeration value="EXPI"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "ProtectInstructionStatus3Code")
@XmlEnum
public enum ProtectInstructionStatus3Code {


    /**
     * Protect instruction which has not been fully covered. Will include partial covers.
     * 
     */
    OPEN,

    /**
     * Protect instruction has been fully covered.
     * 
     */
    COVR,

    /**
     * Protect instruction has expired.
     * 
     */
    EXPI;

    public String value() {
        return name();
    }

    public static ProtectInstructionStatus3Code fromValue(String v) {
        return valueOf(v);
    }

}
