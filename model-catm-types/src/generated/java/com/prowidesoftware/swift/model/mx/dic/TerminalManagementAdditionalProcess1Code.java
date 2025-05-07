
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TerminalManagementAdditionalProcess1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="TerminalManagementAdditionalProcess1Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="MANC"/&gt;
 *     &lt;enumeration value="RCNC"/&gt;
 *     &lt;enumeration value="RSRT"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
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
