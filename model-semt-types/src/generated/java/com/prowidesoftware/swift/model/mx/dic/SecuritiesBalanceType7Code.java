
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SecuritiesBalanceType7Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="SecuritiesBalanceType7Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="COLA"/&gt;
 *     &lt;enumeration value="OTHR"/&gt;
 *     &lt;enumeration value="CLEN"/&gt;
 *     &lt;enumeration value="DIRT"/&gt;
 *     &lt;enumeration value="NOMI"/&gt;
 *     &lt;enumeration value="SPOS"/&gt;
 *     &lt;enumeration value="UNRG"/&gt;
 *     &lt;enumeration value="ISSU"/&gt;
 *     &lt;enumeration value="QUAS"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "SecuritiesBalanceType7Code")
@XmlEnum
public enum SecuritiesBalanceType7Code {


    /**
     * Balance of securities that are eligible for use for collateral purposes.
     * 
     */
    COLA,

    /**
     * Other. See Narrative.
     * 
     */
    OTHR,

    /**
     * Tax-exempt financial instruments are to be settled.
     * 
     */
    CLEN,

    /**
     * Taxable financial instruments are to be settled.
     * 
     */
    DIRT,

    /**
     * Balance of financial instruments that are registered (in nominee name or in the name of the beneficial owner).
     * 
     */
    NOMI,

    /**
     * Balance of financial instruments that remain registered in the name of the prior beneficial owner.
     * 
     */
    SPOS,

    /**
     * Balance of securities that could not be registered due to foreign ownership limitation.
     * 
     */
    UNRG,

    /**
     * In issuer agent / depository communication, balance of issued financial instruments for which legal documentation has been received.
     * 
     */
    ISSU,

    /**
     * In Issuer Agent / Depository communication, balance of issued financial instruments for which legal documentation has not yet been received.
     * 
     */
    QUAS;

    public String value() {
        return name();
    }

    public static SecuritiesBalanceType7Code fromValue(String v) {
        return valueOf(v);
    }

}
