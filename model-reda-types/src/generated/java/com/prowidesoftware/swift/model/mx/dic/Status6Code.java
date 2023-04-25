
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Status6Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="Status6Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="REJT"/>
 *     <enumeration value="COMP"/>
 *     <enumeration value="QUED"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "Status6Code")
@XmlEnum
public enum Status6Code {


    /**
     * Instruction has been rejected.
     * 
     */
    REJT,

    /**
     * Processing has been completed.
     * 
     */
    COMP,

    /**
     * Instruction is queued.
     * 
     */
    QUED;

    public String value() {
        return name();
    }

    public static Status6Code fromValue(String v) {
        return valueOf(v);
    }

}
