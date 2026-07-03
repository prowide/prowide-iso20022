
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DeniedReason3Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="DeniedReason3Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="ADEA"/&gt;
 *     &lt;enumeration value="DCAL"/&gt;
 *     &lt;enumeration value="DFOR"/&gt;
 *     &lt;enumeration value="LATE"/&gt;
 *     &lt;enumeration value="OTHR"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "DeniedReason3Code")
@XmlEnum
public enum DeniedReason3Code {


    /**
     * Received after the account servicer's deadline.
     * 
     */
    ADEA,

    /**
     * Repo call request was denied since another call already applies.
     * 
     */
    DCAL,

    /**
     * Repo call request was denied. Call not allowed on the concerned repo, for example, out of delay.
     * 
     */
    DFOR,

    /**
     * Received after market deadline.
     * 
     */
    LATE,

    /**
     * Other. See Narrative.
     * 
     */
    OTHR;

    public String value() {
        return name();
    }

    public static DeniedReason3Code fromValue(String v) {
        return valueOf(v);
    }

}
