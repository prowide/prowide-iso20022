
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ActionType10Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="ActionType10Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="ACTV"/>
 *     <enumeration value="DEAC"/>
 *     <enumeration value="DISP"/>
 *     <enumeration value="FUPD"/>
 *     <enumeration value="PRNT"/>
 *     <enumeration value="SNDM"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "ActionType10Code")
@XmlEnum
public enum ActionType10Code {


    /**
     * Activate device or service.
     * 
     */
    ACTV,

    /**
     * Deactivate device or service.
     * 
     */
    DEAC,

    /**
     * Message to display, print or log.
     * 
     */
    DISP,

    /**
     * Update a data file.
     * 
     */
    FUPD,

    /**
     * Print a message.
     * 
     */
    PRNT,

    /**
     * Send a message.
     * 
     */
    SNDM;

    public String value() {
        return name();
    }

    public static ActionType10Code fromValue(String v) {
        return valueOf(v);
    }

}
