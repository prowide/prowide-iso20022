
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ATMMediaType1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ATMMediaType1Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="CARD"/&gt;
 *     &lt;enumeration value="COIN"/&gt;
 *     &lt;enumeration value="CMDT"/&gt;
 *     &lt;enumeration value="CPNS"/&gt;
 *     &lt;enumeration value="NOTE"/&gt;
 *     &lt;enumeration value="STMP"/&gt;
 *     &lt;enumeration value="UDTM"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ATMMediaType1Code")
@XmlEnum
public enum ATMMediaType1Code {


    /**
     * Card media.
     * 
     */
    CARD,

    /**
     * Coin media.
     * 
     */
    COIN,

    /**
     * Non fixed value of the media, for instance gold, silver.
     * 
     */
    CMDT,

    /**
     * Coupon media.
     * 
     */
    CPNS,

    /**
     * Bank note media.
     * 
     */
    NOTE,

    /**
     * Stamp media.
     * 
     */
    STMP,

    /**
     * Undetermined medias.
     * 
     */
    UDTM;

    public String value() {
        return name();
    }

    public static ATMMediaType1Code fromValue(String v) {
        return valueOf(v);
    }

}
