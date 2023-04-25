
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SecuritiesBalanceType4Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="SecuritiesBalanceType4Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="CLEN"/>
 *     <enumeration value="DIRT"/>
 *     <enumeration value="NOMI"/>
 *     <enumeration value="OTHR"/>
 *     <enumeration value="SPOS"/>
 *     <enumeration value="UNRG"/>
 *     <enumeration value="SPCM"/>
 *     <enumeration value="HOLD"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "SecuritiesBalanceType4Code")
@XmlEnum
public enum SecuritiesBalanceType4Code {


    /**
     * Balance of tax-exempt securities.
     * 
     */
    CLEN,

    /**
     * Balance of taxable securities.
     * 
     */
    DIRT,

    /**
     * Balance of securities that are registered (in the name of a nominee or of the beneficial owner).
     * 
     */
    NOMI,

    /**
     * Balance of securities that is unclassified, ie, is not identified with one of the existing sub-balance types.
     * 
     */
    OTHR,

    /**
     * Balance of securities that remain registered in the name of the prior beneficial owner of securities.
     * 
     */
    SPOS,

    /**
     * Balance of securities that could not be registered due to foreign ownership limitation.
     * 
     */
    UNRG,

    /**
     * Investment fund order contains a side pocket component.
     * 
     */
    SPCM,

    /**
     * Investment fund order execution subject to redemption proceeds.
     * 
     */
    HOLD;

    public String value() {
        return name();
    }

    public static SecuritiesBalanceType4Code fromValue(String v) {
        return valueOf(v);
    }

}
