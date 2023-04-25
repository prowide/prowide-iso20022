
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AssetClassSubProductType39Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="AssetClassSubProductType39Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="AMMO"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "AssetClassSubProductType39Code")
@XmlEnum
public enum AssetClassSubProductType39Code {


    /**
     * Commodity of type ammonia.
     * 
     */
    AMMO;

    public String value() {
        return name();
    }

    public static AssetClassSubProductType39Code fromValue(String v) {
        return valueOf(v);
    }

}
