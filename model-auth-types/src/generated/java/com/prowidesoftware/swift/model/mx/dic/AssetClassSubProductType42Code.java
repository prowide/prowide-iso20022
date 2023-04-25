
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AssetClassSubProductType42Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="AssetClassSubProductType42Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="SLPH"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "AssetClassSubProductType42Code")
@XmlEnum
public enum AssetClassSubProductType42Code {


    /**
     * Commodity of type sulphur.
     * 
     */
    SLPH;

    public String value() {
        return name();
    }

    public static AssetClassSubProductType42Code fromValue(String v) {
        return valueOf(v);
    }

}
