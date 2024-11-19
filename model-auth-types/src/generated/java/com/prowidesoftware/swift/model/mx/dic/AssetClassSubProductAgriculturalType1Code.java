
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AssetClassSubProductAgriculturalType1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="AssetClassSubProductAgriculturalType1Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="DIRY"/>
 *     <enumeration value="FRST"/>
 *     <enumeration value="GROS"/>
 *     <enumeration value="LSTK"/>
 *     <enumeration value="SOFT"/>
 *     <enumeration value="SEAF"/>
 *     <enumeration value="OTHR"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
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
