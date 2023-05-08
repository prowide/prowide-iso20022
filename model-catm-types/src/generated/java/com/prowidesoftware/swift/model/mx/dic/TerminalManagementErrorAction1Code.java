
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TerminalManagementErrorAction1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="TerminalManagementErrorAction1Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="IGNR"/>
 *     <enumeration value="SDSR"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "TerminalManagementErrorAction1Code")
@XmlEnum
public enum TerminalManagementErrorAction1Code {


    /**
     * Ignore the error.
     * 
     */
    IGNR,

    /**
     * Send a status report immediately.
     * 
     */
    SDSR;

    public String value() {
        return name();
    }

    public static TerminalManagementErrorAction1Code fromValue(String v) {
        return valueOf(v);
    }

}
