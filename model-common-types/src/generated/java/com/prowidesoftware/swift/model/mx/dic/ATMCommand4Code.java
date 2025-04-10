
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ATMCommand4Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="ATMCommand4Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="ABAL"/>
 *     <enumeration value="ASTS"/>
 *     <enumeration value="CFGT"/>
 *     <enumeration value="CCNT"/>
 *     <enumeration value="DISC"/>
 *     <enumeration value="SNDM"/>
 *     <enumeration value="RPTC"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "ATMCommand4Code")
@XmlEnum
public enum ATMCommand4Code {


    /**
     * Provide the ATM counters, resetting those that are applicable.
     * 
     */
    ABAL,

    /**
     * Status of the ATM required by the ATM manager.
     * 
     */
    ASTS,

    /**
     * Update the ATM configuration parameters.
     * 
     */
    CFGT,

    /**
     * Request the value of the ATM counters.
     * 
     */
    CCNT,

    /**
     * Perform a disconnection followed by a reconnection.
     * 
     */
    DISC,

    /**
     * Send a specific message to initiate a process.
     * 
     */
    SNDM,

    /**
     * Provide the value of the ATM counters, no reinitialisation of the counters.
     * 
     */
    RPTC;

    public String value() {
        return name();
    }

    public static ATMCommand4Code fromValue(String v) {
        return valueOf(v);
    }

}
