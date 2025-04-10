
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TerminalManagementAction2Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="TerminalManagementAction2Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="ACTV"/>
 *     <enumeration value="DCTV"/>
 *     <enumeration value="DELT"/>
 *     <enumeration value="DWNL"/>
 *     <enumeration value="INST"/>
 *     <enumeration value="RSTR"/>
 *     <enumeration value="UPLD"/>
 *     <enumeration value="UPDT"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "TerminalManagementAction2Code")
@XmlEnum
public enum TerminalManagementAction2Code {


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
    UPLD,

    /**
     * Request to update the element identified inside the message exchange.
     * 
     */
    UPDT;

    public String value() {
        return name();
    }

    public static TerminalManagementAction2Code fromValue(String v) {
        return valueOf(v);
    }

}
