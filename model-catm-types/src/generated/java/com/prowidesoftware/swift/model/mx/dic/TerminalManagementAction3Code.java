
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


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
     * Creation or addition of a new data set.
     * 
     */
    CREA,

    /**
     * Data set must be deleted.
     * 
     */
    DELT,

    /**
     * Update, or replacement of the data set.
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
