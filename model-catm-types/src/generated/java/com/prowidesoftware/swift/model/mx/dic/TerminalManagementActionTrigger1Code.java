
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TerminalManagementActionTrigger1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="TerminalManagementActionTrigger1Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="DATE"/>
 *     <enumeration value="HOST"/>
 *     <enumeration value="MANU"/>
 *     <enumeration value="SALE"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "TerminalManagementActionTrigger1Code")
@XmlEnum
public enum TerminalManagementActionTrigger1Code {


    /**
     * Date and time trigger the terminal management action.
     * 
     */
    DATE,

    /**
     * Acquirer triggers the terminal management action.
     * 
     */
    HOST,

    /**
     * Acceptor triggers the terminal management action.
     * 
     */
    MANU,

    /**
     * Sale system triggers the terminal management action.
     * 
     */
    SALE;

    public String value() {
        return name();
    }

    public static TerminalManagementActionTrigger1Code fromValue(String v) {
        return valueOf(v);
    }

}
