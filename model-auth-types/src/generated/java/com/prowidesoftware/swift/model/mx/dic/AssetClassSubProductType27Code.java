
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AssetClassSubProductType27Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="AssetClassSubProductType27Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="LGHT"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "AssetClassSubProductType27Code")
@XmlEnum
public enum AssetClassSubProductType27Code {


    /**
     * Commodity of type light ends.
     * 
     */
    LGHT;

    public String value() {
        return name();
    }

    public static AssetClassSubProductType27Code fromValue(String v) {
        return valueOf(v);
    }

}
