
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ATMCommand6Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="ATMCommand6Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="ABAL"/>
 *     <enumeration value="ASTS"/>
 *     <enumeration value="CFGT"/>
 *     <enumeration value="CCNT"/>
 *     <enumeration value="DISC"/>
 *     <enumeration value="KACT"/>
 *     <enumeration value="KDAC"/>
 *     <enumeration value="KDWL"/>
 *     <enumeration value="KRMV"/>
 *     <enumeration value="SCFU"/>
 *     <enumeration value="SSCU"/>
 *     <enumeration value="SSTU"/>
 *     <enumeration value="SNDM"/>
 *     <enumeration value="HKCG"/>
 *     <enumeration value="HKRV"/>
 *     <enumeration value="KCHG"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "ATMCommand6Code")
@XmlEnum
public enum ATMCommand6Code {


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
    SNDM,

    /**
     * Replace an existing key using a Higher Level Authority (HLA) key. In the TR34 scheme this would be used to implement a HLA Rebind operation.
     * 
     */
    HKCG,

    /**
     * Remove a cryptographic key using a Higher Level Authority key (HLA). In the TR34 scheme this would be used to implement a HLA Unbind operation.
     * 
     */
    HKRV,

    /**
     * Replaces an existing cryptographic key. In a TR34 scheme this would be used to implement a Rebind operation.
     * 
     */
    KCHG;

    public String value() {
        return name();
    }

    public static ATMCommand6Code fromValue(String v) {
        return valueOf(v);
    }

}
