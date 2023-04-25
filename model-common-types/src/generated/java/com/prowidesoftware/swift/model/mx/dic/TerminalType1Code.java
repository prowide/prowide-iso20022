
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TerminalType1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="TerminalType1Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="ATMT"/>
 *     <enumeration value="MPOS"/>
 *     <enumeration value="OTHN"/>
 *     <enumeration value="OTHP"/>
 *     <enumeration value="POST"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "TerminalType1Code")
@XmlEnum
public enum TerminalType1Code {


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
     * Other type defined at national level
     * 
     */
    OTHN,

    /**
     * Other private type of terminal.
     * 
     */
    OTHP,

    /**
     * Point of Sale terminal.
     * 
     */
    POST;

    public String value() {
        return name();
    }

    public static TerminalType1Code fromValue(String v) {
        return valueOf(v);
    }

}
