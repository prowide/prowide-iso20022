
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ATMMediaType2Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ATMMediaType2Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="CARD"/&gt;
 *     &lt;enumeration value="COIN"/&gt;
 *     &lt;enumeration value="CMDT"/&gt;
 *     &lt;enumeration value="CPNS"/&gt;
 *     &lt;enumeration value="NOTE"/&gt;
 *     &lt;enumeration value="STMP"/&gt;
 *     &lt;enumeration value="UDTM"/&gt;
 *     &lt;enumeration value="CHCK"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ATMMediaType2Code")
@XmlEnum
public enum ATMMediaType2Code {


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
    UDTM,

    /**
     * Check media.
     * 
     */
    CHCK;

    public String value() {
        return name();
    }

    public static ATMMediaType2Code fromValue(String v) {
        return valueOf(v);
    }

}
