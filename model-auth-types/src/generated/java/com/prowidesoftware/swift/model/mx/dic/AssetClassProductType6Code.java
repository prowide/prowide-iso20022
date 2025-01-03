
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AssetClassProductType6Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="AssetClassProductType6Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="INDP"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "AssetClassProductType6Code")
@XmlEnum
public enum AssetClassProductType6Code {


    /**
     * Commodity of type industrial product.
     * 
     */
    INDP;

    public String value() {
        return name();
    }

    public static AssetClassProductType6Code fromValue(String v) {
        return valueOf(v);
    }

}
