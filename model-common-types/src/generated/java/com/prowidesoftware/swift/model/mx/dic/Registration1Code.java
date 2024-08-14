
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Registration1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="Registration1Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="NREG"/>
 *     <enumeration value="YREG"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "Registration1Code")
@XmlEnum
public enum Registration1Code {


    /**
     * Hold the securities in street name. If there is a standing instruction in place to register on receipt, then this standing instruction is to be ignored.
     * 
     */
    NREG,

    /**
     * Register on receipt. If there is a standing instruction in place to hold the securities in street name, then this standing instruction is to be ignored.
     * 
     */
    YREG;

    public String value() {
        return name();
    }

    public static Registration1Code fromValue(String v) {
        return valueOf(v);
    }

}
