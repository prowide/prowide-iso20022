
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ATMMediaType2Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="ATMMediaType2Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="CARD"/>
 *     <enumeration value="COIN"/>
 *     <enumeration value="CMDT"/>
 *     <enumeration value="CPNS"/>
 *     <enumeration value="NOTE"/>
 *     <enumeration value="STMP"/>
 *     <enumeration value="UDTM"/>
 *     <enumeration value="CHCK"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
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
