
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TerminalManagementErrorAction2Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="TerminalManagementErrorAction2Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="SDSR"/&gt;
 *     &lt;enumeration value="STOP"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
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
