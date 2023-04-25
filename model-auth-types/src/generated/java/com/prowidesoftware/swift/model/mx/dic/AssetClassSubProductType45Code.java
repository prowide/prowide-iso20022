
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AssetClassSubProductType45Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="AssetClassSubProductType45Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="POTA"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "AssetClassSubProductType45Code")
@XmlEnum
public enum AssetClassSubProductType45Code {


    /**
     * Commodity of type potato.
     * 
     */
    POTA;

    public String value() {
        return name();
    }

    public static AssetClassSubProductType45Code fromValue(String v) {
        return valueOf(v);
    }

}
