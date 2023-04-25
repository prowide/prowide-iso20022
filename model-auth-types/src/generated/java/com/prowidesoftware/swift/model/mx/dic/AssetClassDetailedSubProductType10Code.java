
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AssetClassDetailedSubProductType10Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="AssetClassDetailedSubProductType10Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="ALUM"/>
 *     <enumeration value="ALUA"/>
 *     <enumeration value="CBLT"/>
 *     <enumeration value="COPR"/>
 *     <enumeration value="IRON"/>
 *     <enumeration value="MOLY"/>
 *     <enumeration value="NASC"/>
 *     <enumeration value="NICK"/>
 *     <enumeration value="STEL"/>
 *     <enumeration value="TINN"/>
 *     <enumeration value="ZINC"/>
 *     <enumeration value="OTHR"/>
 *     <enumeration value="LEAD"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "AssetClassDetailedSubProductType10Code")
@XmlEnum
public enum AssetClassDetailedSubProductType10Code {


    /**
     * Commodity attribute of type aluminium.
     * 
     */
    ALUM,

    /**
     * Commodity attribute of type aluminium alloy.
     * 
     */
    ALUA,

    /**
     * Commodity attribute of type cobalt.
     * 
     */
    CBLT,

    /**
     * Commodity attribute of type copper.
     * 
     */
    COPR,

    /**
     *  Commodity attribute of type iron ore.
     * 
     */
    IRON,

    /**
     * Commodity attribute of type molybdenum.
     * 
     */
    MOLY,

    /**
     * Commodity attribute of type NASAAC (North American Special Aluminum Alloy Contract).
     * 
     */
    NASC,

    /**
     * Commodity attribute of type nickel.
     * 
     */
    NICK,

    /**
     * Commodity attribute of type steel.
     * 
     */
    STEL,

    /**
     * Commodity attribute of type tin.
     * 
     */
    TINN,

    /**
     * Commodity attribute of type zinc.
     * 
     */
    ZINC,

    /**
     * Commodity attribute of other type.
     * 
     */
    OTHR,

    /**
     * Commodity attribute of type lead.
     * 
     */
    LEAD;

    public String value() {
        return name();
    }

    public static AssetClassDetailedSubProductType10Code fromValue(String v) {
        return valueOf(v);
    }

}
