
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ATMMediaType4Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="ATMMediaType4Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="CARD"/>
 *     <enumeration value="COIN"/>
 *     <enumeration value="CMDT"/>
 *     <enumeration value="CPNS"/>
 *     <enumeration value="NOTE"/>
 *     <enumeration value="STMP"/>
 *     <enumeration value="UDTM"/>
 *     <enumeration value="CHCK"/>
 *     <enumeration value="ENVP"/>
 *     <enumeration value="MLTP"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "ATMMediaType4Code")
@XmlEnum
public enum ATMMediaType4Code {


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
    CHCK,

    /**
     * One envelope containing unknown amounts of unknown items.
     * 
     */
    ENVP,

    /**
     * Multiple items either outside of envelope or in multiple envelopes.
     * 
     */
    MLTP;

    public String value() {
        return name();
    }

    public static ATMMediaType4Code fromValue(String v) {
        return valueOf(v);
    }

}
