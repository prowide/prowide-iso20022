
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TerminalManagementAdditionalProcess1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="TerminalManagementAdditionalProcess1Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="MANC"/>
 *     <enumeration value="RCNC"/>
 *     <enumeration value="RSRT"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "TerminalManagementAdditionalProcess1Code")
@XmlEnum
public enum TerminalManagementAdditionalProcess1Code {


    /**
     * Manual confirmation of the merchant before the terminal management action.
     * 
     */
    MANC,

    /**
     * Acquirer reconciliation to be performed before the terminal management action.
     * 
     */
    RCNC,

    /**
     * Restart the system after performing the terminal management action.
     * 
     */
    RSRT;

    public String value() {
        return name();
    }

    public static TerminalManagementAdditionalProcess1Code fromValue(String v) {
        return valueOf(v);
    }

}
