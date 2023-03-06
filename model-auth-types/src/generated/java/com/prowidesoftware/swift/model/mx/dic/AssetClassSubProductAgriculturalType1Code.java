
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AssetClassSubProductAgriculturalType1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="AssetClassSubProductAgriculturalType1Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="DIRY"/&gt;
 *     &lt;enumeration value="FRST"/&gt;
 *     &lt;enumeration value="GROS"/&gt;
 *     &lt;enumeration value="LSTK"/&gt;
 *     &lt;enumeration value="SOFT"/&gt;
 *     &lt;enumeration value="SEAF"/&gt;
 *     &lt;enumeration value="OTHR"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "AssetClassSubProductAgriculturalType1Code")
@XmlEnum
public enum AssetClassSubProductAgriculturalType1Code {


    /**
     * Commodity of type dairy.
     * 
     */
    DIRY,

    /**
     * Commodity of type forestry.
     * 
     */
    FRST,

    /**
     * Commodity of type grain oil seeds.
     * 
     */
    GROS,

    /**
     * Commodity of type livestock.
     * 
     */
    LSTK,

    /**
     * Commodity of type softs.
     * 
     */
    SOFT,

    /**
     * Commodity of type seafood.
     * 
     */
    SEAF,

    /**
     * Commodity of other type.
     * 
     */
    OTHR;

    public String value() {
        return name();
    }

    public static AssetClassSubProductAgriculturalType1Code fromValue(String v) {
        return valueOf(v);
    }

}
