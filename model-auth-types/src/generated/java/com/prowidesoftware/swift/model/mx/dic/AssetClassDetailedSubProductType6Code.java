
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AssetClassDetailedSubProductType6Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="AssetClassDetailedSubProductType6Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="GASP"/>
 *     <enumeration value="LNGG"/>
 *     <enumeration value="NCGG"/>
 *     <enumeration value="TTFG"/>
 *     <enumeration value="NBPG"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "AssetClassDetailedSubProductType6Code")
@XmlEnum
public enum AssetClassDetailedSubProductType6Code {


    /**
     * Commodity attribute of type GASPOOL.
     * 
     */
    GASP,

    /**
     * Commodity attribute of type liquid natural gas.
     * 
     */
    LNGG,

    /**
     * Commodity attribute of type NCG (NetConnect Germany).
     * 
     */
    NCGG,

    /**
     * Commodity attribute of type TTF (Dutch Title Transfer Facility).
     * 
     */
    TTFG,

    /**
     * Commodity attribute of type NBP (National Balancing Point).
     * 
     */
    NBPG;

    public String value() {
        return name();
    }

    public static AssetClassDetailedSubProductType6Code fromValue(String v) {
        return valueOf(v);
    }

}
