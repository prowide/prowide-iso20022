
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DeniedReason8Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="DeniedReason8Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="ADEA"/>
 *     <enumeration value="DFOR"/>
 *     <enumeration value="IPNC"/>
 *     <enumeration value="OTHR"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "DeniedReason8Code")
@XmlEnum
public enum DeniedReason8Code {


    /**
     * Received after the account servicer's deadline.
     * 
     */
    ADEA,

    /**
     * Repo call request was denied. Call not allowed on the concerned repo, for example, out of delay.
     * 
     */
    DFOR,

    /**
     * Instruction has been processed and cannot be cancelled.
     * 
     */
    IPNC,

    /**
     * Other. See Narrative.
     * 
     */
    OTHR;

    public String value() {
        return name();
    }

    public static DeniedReason8Code fromValue(String v) {
        return valueOf(v);
    }

}
