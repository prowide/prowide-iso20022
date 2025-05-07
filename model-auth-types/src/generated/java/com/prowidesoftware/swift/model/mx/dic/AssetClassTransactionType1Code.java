
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AssetClassTransactionType1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="AssetClassTransactionType1Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="CRCK"/&gt;
 *     &lt;enumeration value="DIFF"/&gt;
 *     &lt;enumeration value="FUTR"/&gt;
 *     &lt;enumeration value="MINI"/&gt;
 *     &lt;enumeration value="OPTN"/&gt;
 *     &lt;enumeration value="OTCT"/&gt;
 *     &lt;enumeration value="ORIT"/&gt;
 *     &lt;enumeration value="SWAP"/&gt;
 *     &lt;enumeration value="TAPO"/&gt;
 *     &lt;enumeration value="OTHR"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "AssetClassTransactionType1Code")
@XmlEnum
public enum AssetClassTransactionType1Code {


    /**
     * Crack.
     * 
     */
    CRCK,

    /**
     * Differential.
     * 
     */
    DIFF,

    /**
     * Futures.
     * 
     */
    FUTR,

    /**
     * Minis.
     * 
     */
    MINI,

    /**
     * Options.
     * 
     * 
     */
    OPTN,

    /**
     * Over-The-Counter.
     * 
     */
    OTCT,

    /**
     * Outright.
     * 
     */
    ORIT,

    /**
     * Swaps.
     * 
     */
    SWAP,

    /**
     * TAPOS.
     * 
     */
    TAPO,

    /**
     * Other.
     * 
     */
    OTHR;

    public String value() {
        return name();
    }

    public static AssetClassTransactionType1Code fromValue(String v) {
        return valueOf(v);
    }

}
