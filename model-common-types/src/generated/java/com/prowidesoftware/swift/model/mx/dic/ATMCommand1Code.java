
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ATMCommand1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ATMCommand1Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="ABAL"/&gt;
 *     &lt;enumeration value="ASTS"/&gt;
 *     &lt;enumeration value="CFGT"/&gt;
 *     &lt;enumeration value="CCNT"/&gt;
 *     &lt;enumeration value="DISC"/&gt;
 *     &lt;enumeration value="SNDM"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ATMCommand1Code")
@XmlEnum
public enum ATMCommand1Code {


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
    SNDM;

    public String value() {
        return name();
    }

    public static ATMCommand1Code fromValue(String v) {
        return valueOf(v);
    }

}
