
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AssetClassDetailedSubProductType2Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="AssetClassDetailedSubProductType2Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="ROBU"/>
 *     <enumeration value="CCOA"/>
 *     <enumeration value="BRWN"/>
 *     <enumeration value="WHSG"/>
 *     <enumeration value="OTHR"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "AssetClassDetailedSubProductType2Code")
@XmlEnum
public enum AssetClassDetailedSubProductType2Code {


    /**
     * Commodity attribute of type robusta coffee.
     * 
     */
    ROBU,

    /**
     * Commodity attribute of type cocoa.
     * 
     */
    CCOA,

    /**
     * Commodity attribute of type raw sugar.
     * 
     */
    BRWN,

    /**
     * Commodity attribute of type white sugar.
     * 
     */
    WHSG,

    /**
     * Commodity attribute of other type.
     * 
     */
    OTHR;

    public String value() {
        return name();
    }

    public static AssetClassDetailedSubProductType2Code fromValue(String v) {
        return valueOf(v);
    }

}
