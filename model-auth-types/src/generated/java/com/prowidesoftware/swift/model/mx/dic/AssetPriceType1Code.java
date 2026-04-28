
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AssetPriceType1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="AssetPriceType1Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="ARGM"/&gt;
 *     &lt;enumeration value="BLTC"/&gt;
 *     &lt;enumeration value="EXOF"/&gt;
 *     &lt;enumeration value="GBCL"/&gt;
 *     &lt;enumeration value="IHSM"/&gt;
 *     &lt;enumeration value="OTHR"/&gt;
 *     &lt;enumeration value="PLAT"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
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
