
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AssetClassSubProductType3Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="AssetClassSubProductType3Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="OOLI"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "AssetClassSubProductType3Code")
@XmlEnum
public enum AssetClassSubProductType3Code {


    /**
     * Commodity of type olive oil.
     * 
     */
    OOLI;

    public String value() {
        return name();
    }

    public static AssetClassSubProductType3Code fromValue(String v) {
        return valueOf(v);
    }

}
