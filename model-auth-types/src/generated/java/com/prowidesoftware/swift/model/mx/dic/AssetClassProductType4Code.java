
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AssetClassProductType4Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="AssetClassProductType4Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="FRGT"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "AssetClassProductType4Code")
@XmlEnum
public enum AssetClassProductType4Code {


    /**
     * Commodity of type freight.
     * 
     */
    FRGT;

    public String value() {
        return name();
    }

    public static AssetClassProductType4Code fromValue(String v) {
        return valueOf(v);
    }

}
