
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AssetClassProductType8Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="AssetClassProductType8Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="PAPR"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "AssetClassProductType8Code")
@XmlEnum
public enum AssetClassProductType8Code {


    /**
     * Commodity of type paper.
     * 
     */
    PAPR;

    public String value() {
        return name();
    }

    public static AssetClassProductType8Code fromValue(String v) {
        return valueOf(v);
    }

}
