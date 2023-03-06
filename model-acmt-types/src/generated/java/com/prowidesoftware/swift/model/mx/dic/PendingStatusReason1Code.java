
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PendingStatusReason1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="PendingStatusReason1Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="KYCM"/&gt;
 *     &lt;enumeration value="FRDM"/&gt;
 *     &lt;enumeration value="RIGH"/&gt;
 *     &lt;enumeration value="ATHR"/&gt;
 *     &lt;enumeration value="ATHP"/&gt;
 *     &lt;enumeration value="MODI"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
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
