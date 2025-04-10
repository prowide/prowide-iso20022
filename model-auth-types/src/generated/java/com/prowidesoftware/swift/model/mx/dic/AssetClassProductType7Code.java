
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AssetClassProductType7Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="AssetClassProductType7Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="METL"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "AssetClassProductType7Code")
@XmlEnum
public enum AssetClassProductType7Code {


    /**
     * Commodity of type metal.
     * 
     */
    METL;

    public String value() {
        return name();
    }

    public static AssetClassProductType7Code fromValue(String v) {
        return valueOf(v);
    }

}
