
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AssetClassSubProductType16Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="AssetClassSubProductType16Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="PRME"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "AssetClassSubProductType16Code")
@XmlEnum
public enum AssetClassSubProductType16Code {


    /**
     * Commodity of type precious metals.
     * 
     */
    PRME;

    public String value() {
        return name();
    }

    public static AssetClassSubProductType16Code fromValue(String v) {
        return valueOf(v);
    }

}
