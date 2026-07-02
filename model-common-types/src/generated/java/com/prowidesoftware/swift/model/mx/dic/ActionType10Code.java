
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ActionType10Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ActionType10Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="ACTV"/&gt;
 *     &lt;enumeration value="DEAC"/&gt;
 *     &lt;enumeration value="DISP"/&gt;
 *     &lt;enumeration value="FUPD"/&gt;
 *     &lt;enumeration value="PRNT"/&gt;
 *     &lt;enumeration value="SNDM"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
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
