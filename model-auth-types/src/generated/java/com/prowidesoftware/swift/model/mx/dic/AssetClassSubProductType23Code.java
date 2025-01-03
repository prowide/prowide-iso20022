
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AssetClassSubProductType23Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="AssetClassSubProductType23Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="SEAF"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "AssetClassSubProductType23Code")
@XmlEnum
public enum AssetClassSubProductType23Code {


    /**
     * Commodity of type seafood.
     * 
     */
    SEAF;

    public String value() {
        return name();
    }

    public static AssetClassSubProductType23Code fromValue(String v) {
        return valueOf(v);
    }

}
