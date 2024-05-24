
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AssetClassSubProductType25Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="AssetClassSubProductType25Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="DIST"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "AssetClassSubProductType25Code")
@XmlEnum
public enum AssetClassSubProductType25Code {


    /**
     * Commodity of type distillates.
     * 
     */
    DIST;

    public String value() {
        return name();
    }

    public static AssetClassSubProductType25Code fromValue(String v) {
        return valueOf(v);
    }

}
