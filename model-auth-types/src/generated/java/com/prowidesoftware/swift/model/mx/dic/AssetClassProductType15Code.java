
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AssetClassProductType15Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="AssetClassProductType15Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="OTHR"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "AssetClassProductType15Code")
@XmlEnum
public enum AssetClassProductType15Code {


    /**
     * Commodity of other type.
     * 
     */
    OTHR;

    public String value() {
        return name();
    }

    public static AssetClassProductType15Code fromValue(String v) {
        return valueOf(v);
    }

}
