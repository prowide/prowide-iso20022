
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TerminalManagementAction3Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="TerminalManagementAction3Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="CREA"/>
 *     <enumeration value="DELT"/>
 *     <enumeration value="UPDT"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "TerminalManagementAction3Code")
@XmlEnum
public enum TerminalManagementAction3Code {


    /**
     * Request to create or add the element identified inside the message exchange.
     * 
     */
    CREA,

    /**
     * Request to delete the element identified inside the message exchange.
     * 
     */
    DELT,

    /**
     * Request to update the element identified inside the message exchange.
     * 
     */
    UPDT;

    public String value() {
        return name();
    }

    public static TerminalManagementAction3Code fromValue(String v) {
        return valueOf(v);
    }

}
