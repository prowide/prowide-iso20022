
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AssetClassDetailedSubProductType11Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="AssetClassDetailedSubProductType11Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="GOLD"/>
 *     <enumeration value="OTHR"/>
 *     <enumeration value="PLDM"/>
 *     <enumeration value="PTNM"/>
 *     <enumeration value="SLVR"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "AssetClassDetailedSubProductType11Code")
@XmlEnum
public enum AssetClassDetailedSubProductType11Code {


    /**
     * Commodity attribute of type gold.
     * 
     */
    GOLD,

    /**
     * Commodity attribute of other type.
     * 
     */
    OTHR,

    /**
     * Commodity attribute of type palladium.
     * 
     */
    PLDM,

    /**
     * Commodity attribute of type platinum.
     * 
     */
    PTNM,

    /**
     * Commodity attribute of type silver.
     * 
     */
    SLVR;

    public String value() {
        return name();
    }

    public static AssetClassDetailedSubProductType11Code fromValue(String v) {
        return valueOf(v);
    }

}
