
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TerminalManagementAction1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="TerminalManagementAction1Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="ACTV"/&gt;
 *     &lt;enumeration value="DCTV"/&gt;
 *     &lt;enumeration value="DELT"/&gt;
 *     &lt;enumeration value="DWNL"/&gt;
 *     &lt;enumeration value="INST"/&gt;
 *     &lt;enumeration value="RSTR"/&gt;
 *     &lt;enumeration value="UPLD"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "TerminalManagementAction1Code")
@XmlEnum
public enum TerminalManagementAction1Code {


    /**
     * Request to activate the element identified inside the message exchange.
     * 
     */
    ACTV,

    /**
     * Request to deactivate the element identified inside the message exchange.
     * 
     */
    DCTV,

    /**
     * Request to delete the element identified inside the message exchange.
     * 
     */
    DELT,

    /**
     * Request to download the element identified inside the message exchange.
     * 
     */
    DWNL,

    /**
     * Request to install the element identified inside the message exchange.
     * 
     */
    INST,

    /**
     * Request to restart the element identified inside the message exchange.
     * 
     */
    RSTR,

    /**
     * Request to upload the element identified inside the message exchange.
     * 
     */
    UPLD;

    public String value() {
        return name();
    }

    public static TerminalManagementAction1Code fromValue(String v) {
        return valueOf(v);
    }

}
