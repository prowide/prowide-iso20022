
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AssetClassSubProductType30Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="AssetClassSubProductType30Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="WTHR"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "AssetClassSubProductType30Code")
@XmlEnum
public enum AssetClassSubProductType30Code {


    /**
     * Commodity of type weather.
     * 
     */
    WTHR;

    public String value() {
        return name();
    }

    public static AssetClassSubProductType30Code fromValue(String v) {
        return valueOf(v);
    }

}
