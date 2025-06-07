
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TerminalManagementActionTrigger1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="TerminalManagementActionTrigger1Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="DATE"/&gt;
 *     &lt;enumeration value="HOST"/&gt;
 *     &lt;enumeration value="MANU"/&gt;
 *     &lt;enumeration value="SALE"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
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
