
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SecurityCharacteristics1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="SecurityCharacteristics1Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="CETE"/&gt;
 *     &lt;enumeration value="CPTE"/&gt;
 *     &lt;enumeration value="CENC"/&gt;
 *     &lt;enumeration value="CMAC"/&gt;
 *     &lt;enumeration value="ETEE"/&gt;
 *     &lt;enumeration value="METE"/&gt;
 *     &lt;enumeration value="MPTE"/&gt;
 *     &lt;enumeration value="OPNN"/&gt;
 *     &lt;enumeration value="PMAC"/&gt;
 *     &lt;enumeration value="PKIE"/&gt;
 *     &lt;enumeration value="PRAE"/&gt;
 *     &lt;enumeration value="PRAM"/&gt;
 *     &lt;enumeration value="PRVN"/&gt;
 *     &lt;enumeration value="STAM"/&gt;
 *     &lt;enumeration value="APTE"/&gt;
 *     &lt;enumeration value="AETE"/&gt;
 *     &lt;enumeration value="OTHN"/&gt;
 *     &lt;enumeration value="OTHP"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "SecurityCharacteristics1Code")
@XmlEnum
public enum SecurityCharacteristics1Code {


    /**
     * Encryption initiated by the cardholder to secure end-to-end communication channel.
     * 
     */
    CETE,

    /**
     * Encryption initiated by the cardholder to secure point-to-point communication channel.
     * 
     */
    CPTE,

    /**
     * Encryption used to secure the communication channel.
     * 
     */
    CENC,

    /**
     * Usage of MAC to secure a communication channel
     * 
     */
    CMAC,

    /**
     * Encryption used from one end to the other end of the communication channel.
     * 
     */
    ETEE,

    /**
     * Encryption initiated by the merchant to secure end-to-end communication channel.
     * 
     */
    METE,

    /**
     * Encryption initiated by the merchant to secure point-to-point communication channel.
     * 
     */
    MPTE,

    /**
     * Open network
     * 
     */
    OPNN,

    /**
     * MAC used in a pass-through communication mode
     * 
     */
    PMAC,

    /**
     * Encryption using PKI to secure the communication channel.
     * 
     */
    PKIE,

    /**
     * Encryption using a private algorithm to secure a communication channel.
     * 
     */
    PRAE,

    /**
     * Private algorithm used for MAC.
     * 
     */
    PRAM,

    /**
     * Private network.
     * 
     */
    PRVN,

    /**
     * Standard algorithm used for MAC
     * 
     */
    STAM,

    /**
     * Encryption initiated by the acquirer to secure point-to-point communication channel.
     * 
     */
    APTE,

    /**
     * Encryption initiated by the acquirer to secure end-to-end communication channel.
     * 
     */
    AETE,

    /**
     * Other security characteristics defined at national level
     * 
     */
    OTHN,

    /**
     * Other security characteristics defined at private level
     * 
     */
    OTHP;

    public String value() {
        return name();
    }

    public static SecurityCharacteristics1Code fromValue(String v) {
        return valueOf(v);
    }

}
