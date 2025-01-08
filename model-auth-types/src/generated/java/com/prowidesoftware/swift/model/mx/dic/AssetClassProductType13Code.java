
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AssetClassProductType13Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="AssetClassProductType13Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="MCEX"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "AssetClassProductType13Code")
@XmlEnum
public enum AssetClassProductType13Code {


    /**
     * Commodity of type multi commodity exotic.
     * 
     */
    MCEX;

    public String value() {
        return name();
    }

    public static AssetClassProductType13Code fromValue(String v) {
        return valueOf(v);
    }

}
