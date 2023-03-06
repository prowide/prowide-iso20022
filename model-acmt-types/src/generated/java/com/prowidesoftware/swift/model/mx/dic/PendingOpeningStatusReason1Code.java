
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PendingOpeningStatusReason1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="PendingOpeningStatusReason1Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="ATHR"/&gt;
 *     &lt;enumeration value="ATHP"/&gt;
 *     &lt;enumeration value="FRDM"/&gt;
 *     &lt;enumeration value="KYCM"/&gt;
 *     &lt;enumeration value="NOTO"/&gt;
 *     &lt;enumeration value="REST"/&gt;
 *     &lt;enumeration value="RIGH"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "PendingOpeningStatusReason1Code")
@XmlEnum
public enum PendingOpeningStatusReason1Code {


    /**
     * Authorisation is required.
     * 
     */
    ATHR,

    /**
     * Authorisation is provided but account opening is still pending.
     * 
     */
    ATHP,

    /**
     * FATCA reporting date is missing.
     * 
     */
    FRDM,

    /**
     * Know Your Customer (KYC) document is missing.
     * 
     */
    KYCM,

    /**
     * Account is not yet open, even for partial use.
     * 
     */
    NOTO,

    /**
     * Account will be opened when restrictions are addressed.
     * 
     */
    REST,

    /**
     * Rights holder information is missing.
     * 
     */
    RIGH;

    public String value() {
        return name();
    }

    public static PendingOpeningStatusReason1Code fromValue(String v) {
        return valueOf(v);
    }

}
