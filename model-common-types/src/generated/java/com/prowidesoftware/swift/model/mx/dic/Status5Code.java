
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Status5Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="Status5Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="REJT"/>
 *     <enumeration value="PACK"/>
 *     <enumeration value="PDNG"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "Status5Code")
@XmlEnum
public enum Status5Code {


    /**
     * Instruction has been rejected.
     * 
     */
    REJT,

    /**
     * Instruction has been accepted and is validated for further processing.
     * 
     */
    PACK,

    /**
     * Instruction is pending.
     * 
     */
    PDNG;

    public String value() {
        return name();
    }

    public static Status5Code fromValue(String v) {
        return valueOf(v);
    }

}
