
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AssetClassSubProductMetal1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="AssetClassSubProductMetal1Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="NPRM"/>
 *     <enumeration value="PRME"/>
 *     <enumeration value="OTHR"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "AssetClassSubProductMetal1Code")
@XmlEnum
public enum AssetClassSubProductMetal1Code {


    /**
     * Commodity of type non precious metals.
     * 
     */
    NPRM,

    /**
     * Commodity of type precious metals.
     * 
     */
    PRME,

    /**
     * Commodity of other type.
     * 
     */
    OTHR;

    public String value() {
        return name();
    }

    public static AssetClassSubProductMetal1Code fromValue(String v) {
        return valueOf(v);
    }

}
