
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TerminalType2Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="TerminalType2Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="ATMT"/>
 *     <enumeration value="MPOS"/>
 *     <enumeration value="POST"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "TerminalType2Code")
@XmlEnum
public enum TerminalType2Code {


    /**
     * Automated Teller Machine
     * 
     */
    ATMT,

    /**
     * Mobile or tablet used as a Point of Sale terminal
     * 
     */
    MPOS,

    /**
     * Point of Sale terminal.
     * 
     */
    POST;

    public String value() {
        return name();
    }

    public static TerminalType2Code fromValue(String v) {
        return valueOf(v);
    }

}
