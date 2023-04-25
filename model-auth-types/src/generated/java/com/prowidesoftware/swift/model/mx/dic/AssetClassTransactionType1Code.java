
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AssetClassTransactionType1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="AssetClassTransactionType1Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="CRCK"/>
 *     <enumeration value="DIFF"/>
 *     <enumeration value="FUTR"/>
 *     <enumeration value="MINI"/>
 *     <enumeration value="OPTN"/>
 *     <enumeration value="OTCT"/>
 *     <enumeration value="ORIT"/>
 *     <enumeration value="SWAP"/>
 *     <enumeration value="TAPO"/>
 *     <enumeration value="OTHR"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
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
