
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AssetClassSubProductType22Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="AssetClassSubProductType22Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="LSTK"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "AssetClassSubProductType22Code")
@XmlEnum
public enum AssetClassSubProductType22Code {


    /**
     * Commodity of type livestock.
     * 
     */
    LSTK;

    public String value() {
        return name();
    }

    public static AssetClassSubProductType22Code fromValue(String v) {
        return valueOf(v);
    }

}
