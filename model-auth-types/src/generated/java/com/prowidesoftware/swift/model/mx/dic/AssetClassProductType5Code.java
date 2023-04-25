
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AssetClassProductType5Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="AssetClassProductType5Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="FRTL"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "AssetClassProductType5Code")
@XmlEnum
public enum AssetClassProductType5Code {


    /**
     * Commodity of type fertilizer.
     * 
     */
    FRTL;

    public String value() {
        return name();
    }

    public static AssetClassProductType5Code fromValue(String v) {
        return valueOf(v);
    }

}
