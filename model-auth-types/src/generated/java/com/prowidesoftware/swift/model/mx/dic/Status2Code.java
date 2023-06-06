
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Status2Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="Status2Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="COMP"/>
 *     <enumeration value="PDNG"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "Status2Code")
@XmlEnum
public enum Status2Code {


    /**
     * Processing has been completed.
     * 
     */
    COMP,

    /**
     * Instruction is pending.
     * 
     */
    PDNG;

    public String value() {
        return name();
    }

    public static Status2Code fromValue(String v) {
        return valueOf(v);
    }

}
