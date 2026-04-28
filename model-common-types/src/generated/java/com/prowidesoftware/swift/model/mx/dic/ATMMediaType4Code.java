
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ATMMediaType4Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ATMMediaType4Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="CARD"/&gt;
 *     &lt;enumeration value="COIN"/&gt;
 *     &lt;enumeration value="CMDT"/&gt;
 *     &lt;enumeration value="CPNS"/&gt;
 *     &lt;enumeration value="NOTE"/&gt;
 *     &lt;enumeration value="STMP"/&gt;
 *     &lt;enumeration value="UDTM"/&gt;
 *     &lt;enumeration value="CHCK"/&gt;
 *     &lt;enumeration value="ENVP"/&gt;
 *     &lt;enumeration value="MLTP"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
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
