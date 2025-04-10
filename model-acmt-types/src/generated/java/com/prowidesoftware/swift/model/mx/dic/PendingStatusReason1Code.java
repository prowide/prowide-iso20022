
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PendingStatusReason1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="PendingStatusReason1Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="KYCM"/>
 *     <enumeration value="FRDM"/>
 *     <enumeration value="RIGH"/>
 *     <enumeration value="ATHR"/>
 *     <enumeration value="ATHP"/>
 *     <enumeration value="MODI"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "PendingStatusReason1Code")
@XmlEnum
public enum PendingStatusReason1Code {


    /**
     * Know Your Customer (KYC) document is missing.
     * 
     */
    KYCM,

    /**
     * FATCA reporting date is missing.
     * 
     */
    FRDM,

    /**
     * Rights holder information is missing.
     * 
     */
    RIGH,

    /**
     * Authorisation is required.
     * 
     */
    ATHR,

    /**
     * Authorisation is provided but the account change is still pending.
     * 
     */
    ATHP,

    /**
     * Modification to the account data is in process.
     * 
     */
    MODI;

    public String value() {
        return name();
    }

    public static PendingStatusReason1Code fromValue(String v) {
        return valueOf(v);
    }

}
