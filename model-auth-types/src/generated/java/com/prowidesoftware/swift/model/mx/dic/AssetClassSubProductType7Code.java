
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AssetClassSubProductType7Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="AssetClassSubProductType7Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="NGAS"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "AssetClassSubProductType7Code")
@XmlEnum
public enum AssetClassSubProductType7Code {


    /**
     * Commodity of type natural gas.
     * 
     */
    NGAS;

    public String value() {
        return name();
    }

    public static AssetClassSubProductType7Code fromValue(String v) {
        return valueOf(v);
    }

}
