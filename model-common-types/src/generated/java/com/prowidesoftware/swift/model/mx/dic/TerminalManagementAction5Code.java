
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TerminalManagementAction5Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="TerminalManagementAction5Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="DCTV"/>
 *     <enumeration value="DELT"/>
 *     <enumeration value="DWNL"/>
 *     <enumeration value="INST"/>
 *     <enumeration value="RSTR"/>
 *     <enumeration value="UPLD"/>
 *     <enumeration value="UPDT"/>
 *     <enumeration value="BIND"/>
 *     <enumeration value="RBND"/>
 *     <enumeration value="UBND"/>
 *     <enumeration value="ACTV"/>
 *     <enumeration value="DEVR"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "TerminalManagementAction5Code")
@XmlEnum
public enum TerminalManagementAction5Code {


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
    UPDT,

    /**
     * Request sent to a POI to bind with a server.
     * 
     */
    BIND,

    /**
     * Request sent to a POI to rebind with a server.
     * 
     */
    RBND,

    /**
     * Request sent to a POI to unbind with a server.
     * 
     */
    UBND,

    /**
     * Request to activate the element identified inside the message exchange.
     * 
     */
    ACTV,

    /**
     * Request to execute a device request.
     * 
     */
    DEVR;

    public String value() {
        return name();
    }

    public static TerminalManagementAction5Code fromValue(String v) {
        return valueOf(v);
    }

}
