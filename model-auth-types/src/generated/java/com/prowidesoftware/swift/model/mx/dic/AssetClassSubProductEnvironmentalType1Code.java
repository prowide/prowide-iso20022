
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AssetClassSubProductEnvironmentalType1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="AssetClassSubProductEnvironmentalType1Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="EMIS"/>
 *     <enumeration value="WTHR"/>
 *     <enumeration value="OTHR"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "AssetClassSubProductEnvironmentalType1Code")
@XmlEnum
public enum AssetClassSubProductEnvironmentalType1Code {


    /**
     * Commodity of type emission.
     * 
     */
    EMIS,

    /**
     * Commodity of type weather.
     * 
     */
    WTHR,

    /**
     * Commodity of other type.
     * 
     */
    OTHR;

    public String value() {
        return name();
    }

    public static AssetClassSubProductEnvironmentalType1Code fromValue(String v) {
        return valueOf(v);
    }

}
