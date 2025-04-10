
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TerminalManagementErrorAction2Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="TerminalManagementErrorAction2Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="SDSR"/>
 *     <enumeration value="STOP"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "TerminalManagementErrorAction2Code")
@XmlEnum
public enum TerminalManagementErrorAction2Code {


    /**
     * Send a status report immediately.
     * 
     */
    SDSR,

    /**
     * Stop the current sequence of terminal management actions without any action, and do not notice the error with a status report.
     * 
     */
    STOP;

    public String value() {
        return name();
    }

    public static TerminalManagementErrorAction2Code fromValue(String v) {
        return valueOf(v);
    }

}
