
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ATMCommand2Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ATMCommand2Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="ABAL"/&gt;
 *     &lt;enumeration value="ASTS"/&gt;
 *     &lt;enumeration value="CFGT"/&gt;
 *     &lt;enumeration value="CCNT"/&gt;
 *     &lt;enumeration value="DISC"/&gt;
 *     &lt;enumeration value="KACT"/&gt;
 *     &lt;enumeration value="KDAC"/&gt;
 *     &lt;enumeration value="KDWL"/&gt;
 *     &lt;enumeration value="KRMV"/&gt;
 *     &lt;enumeration value="SCFU"/&gt;
 *     &lt;enumeration value="SSCU"/&gt;
 *     &lt;enumeration value="SSTU"/&gt;
 *     &lt;enumeration value="SNDM"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ATMCommand2Code")
@XmlEnum
public enum ATMCommand2Code {


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
     * Activate cryptographic keys.
     * 
     */
    KACT,

    /**
     * Deactivate cryptographic keys.
     * 
     */
    KDAC,

    /**
     * Start a cryptographic key download.
     * 
     */
    KDWL,

    /**
     * Remove cryptographic keys.
     * 
     */
    KRMV,

    /**
     * Update the configuration of the hardware security module on the ATM.
     * 
     */
    SCFU,

    /**
     * Update the security scheme of the hardware security module on the ATM.
     * 
     */
    SSCU,

    /**
     * Update the status of the hardware security module on the ATM.
     * 
     */
    SSTU,

    /**
     * Send a specific message to initiate a process.
     * 
     */
    SNDM;

    public String value() {
        return name();
    }

    public static ATMCommand2Code fromValue(String v) {
        return valueOf(v);
    }

}
