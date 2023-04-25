
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AssetClassSubProductType20Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="AssetClassSubProductType20Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="DIRY"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "AssetClassSubProductType20Code")
@XmlEnum
public enum AssetClassSubProductType20Code {


    /**
     * Commodity of type dairy.
     * 
     */
    DIRY;

    public String value() {
        return name();
    }

    public static AssetClassSubProductType20Code fromValue(String v) {
        return valueOf(v);
    }

}
