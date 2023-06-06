
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AssetClassDetailedSubProductType31Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="AssetClassDetailedSubProductType31Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="GASP"/>
 *     <enumeration value="LNGG"/>
 *     <enumeration value="NCGG"/>
 *     <enumeration value="TTFG"/>
 *     <enumeration value="NBPG"/>
 *     <enumeration value="OTHR"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "AssetClassDetailedSubProductType31Code")
@XmlEnum
public enum AssetClassDetailedSubProductType31Code {


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
    NBPG,

    /**
     * Commodity attribute of other type.
     * 
     */
    OTHR;

    public String value() {
        return name();
    }

    public static AssetClassDetailedSubProductType31Code fromValue(String v) {
        return valueOf(v);
    }

}
