
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AssetClassSubProductType41Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="AssetClassSubProductType41Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="PTSH"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "AssetClassSubProductType41Code")
@XmlEnum
public enum AssetClassSubProductType41Code {


    /**
     * Commodity of type potash.
     * 
     */
    PTSH;

    public String value() {
        return name();
    }

    public static AssetClassSubProductType41Code fromValue(String v) {
        return valueOf(v);
    }

}
