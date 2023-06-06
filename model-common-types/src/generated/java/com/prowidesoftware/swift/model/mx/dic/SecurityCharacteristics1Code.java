
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SecurityCharacteristics1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="SecurityCharacteristics1Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="CETE"/>
 *     <enumeration value="CPTE"/>
 *     <enumeration value="CENC"/>
 *     <enumeration value="CMAC"/>
 *     <enumeration value="ETEE"/>
 *     <enumeration value="METE"/>
 *     <enumeration value="MPTE"/>
 *     <enumeration value="OPNN"/>
 *     <enumeration value="PMAC"/>
 *     <enumeration value="PKIE"/>
 *     <enumeration value="PRAE"/>
 *     <enumeration value="PRAM"/>
 *     <enumeration value="PRVN"/>
 *     <enumeration value="STAM"/>
 *     <enumeration value="APTE"/>
 *     <enumeration value="AETE"/>
 *     <enumeration value="OTHN"/>
 *     <enumeration value="OTHP"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
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
