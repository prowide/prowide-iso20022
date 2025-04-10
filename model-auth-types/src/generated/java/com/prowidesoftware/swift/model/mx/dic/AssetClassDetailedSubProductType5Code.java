
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AssetClassDetailedSubProductType5Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="AssetClassDetailedSubProductType5Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="BSLD"/>
 *     <enumeration value="FITR"/>
 *     <enumeration value="PKLD"/>
 *     <enumeration value="OFFP"/>
 *     <enumeration value="OTHR"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "AssetClassDetailedSubProductType5Code")
@XmlEnum
public enum AssetClassDetailedSubProductType5Code {


    /**
     * Commodity attribute of type base load.
     * 
     */
    BSLD,

    /**
     * Commodity attribute of type financial transmission rights.
     * 
     */
    FITR,

    /**
     * Commodity attribute of type peak load.
     * 
     */
    PKLD,

    /**
     * Commodity attribute of type off-peak.
     * 
     */
    OFFP,

    /**
     * Commodity attribute of other type.
     * 
     */
    OTHR;

    public String value() {
        return name();
    }

    public static AssetClassDetailedSubProductType5Code fromValue(String v) {
        return valueOf(v);
    }

}
