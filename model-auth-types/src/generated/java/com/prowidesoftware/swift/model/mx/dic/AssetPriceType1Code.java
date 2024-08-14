
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AssetPriceType1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="AssetPriceType1Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="ARGM"/>
 *     <enumeration value="BLTC"/>
 *     <enumeration value="EXOF"/>
 *     <enumeration value="GBCL"/>
 *     <enumeration value="IHSM"/>
 *     <enumeration value="OTHR"/>
 *     <enumeration value="PLAT"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "AssetPriceType1Code")
@XmlEnum
public enum AssetPriceType1Code {


    /**
     * Argus / Mc Closkey price.
     * 
     */
    ARGM,

    /**
     * Baltic price.
     * 
     */
    BLTC,

    /**
     * Exchange price.
     * 
     */
    EXOF,

    /**
     * Global coal price.
     * 
     */
    GBCL,

    /**
     * IHS Mc Closkey price.
     * 
     */
    IHSM,

    /**
     * Other price.
     * 
     */
    OTHR,

    /**
     * Platts price.
     * 
     */
    PLAT;

    public String value() {
        return name();
    }

    public static AssetPriceType1Code fromValue(String v) {
        return valueOf(v);
    }

}
