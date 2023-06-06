
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AssetClassSubProductType18Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="AssetClassSubProductType18Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="PLST"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "AssetClassSubProductType18Code")
@XmlEnum
public enum AssetClassSubProductType18Code {


    /**
     * Commodity of type plastic.
     * 
     */
    PLST;

    public String value() {
        return name();
    }

    public static AssetClassSubProductType18Code fromValue(String v) {
        return valueOf(v);
    }

}
