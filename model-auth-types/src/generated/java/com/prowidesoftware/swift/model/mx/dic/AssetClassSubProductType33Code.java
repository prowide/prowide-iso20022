
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AssetClassSubProductType33Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="AssetClassSubProductType33Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="CSTR"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "AssetClassSubProductType33Code")
@XmlEnum
public enum AssetClassSubProductType33Code {


    /**
     * Commodity of type construction.
     * 
     */
    CSTR;

    public String value() {
        return name();
    }

    public static AssetClassSubProductType33Code fromValue(String v) {
        return valueOf(v);
    }

}
