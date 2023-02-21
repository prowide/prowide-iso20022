
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TerminalManagementAction3Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="TerminalManagementAction3Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="CREA"/&gt;
 *     &lt;enumeration value="DELT"/&gt;
 *     &lt;enumeration value="UPDT"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
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
