
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TerminalIntegrationCategory1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="TerminalIntegrationCategory1Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="MPOI"/>
 *     <enumeration value="MSLE"/>
 *     <enumeration value="SSLE"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "TerminalIntegrationCategory1Code")
@XmlEnum
public enum TerminalIntegrationCategory1Code {


    /**
     * Multiple terminals linked to a unique sale terminal.
     * 
     */
    MPOI,

    /**
     * Terminal serving multiple sale terminals.
     * 
     */
    MSLE,

    /**
     * Terminal linked to a unique sale terminal.
     * 
     */
    SSLE;

    public String value() {
        return name();
    }

    public static TerminalIntegrationCategory1Code fromValue(String v) {
        return valueOf(v);
    }

}
