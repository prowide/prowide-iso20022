
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AssetClassSubProductType5Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="AssetClassSubProductType5Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="GRIN"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "AssetClassSubProductType5Code")
@XmlEnum
public enum AssetClassSubProductType5Code {


    /**
     * Commodity of type grain.
     * 
     */
    GRIN;

    public String value() {
        return name();
    }

    public static AssetClassSubProductType5Code fromValue(String v) {
        return valueOf(v);
    }

}
