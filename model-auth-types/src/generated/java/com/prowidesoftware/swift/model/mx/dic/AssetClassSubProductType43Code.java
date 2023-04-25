
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AssetClassSubProductType43Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="AssetClassSubProductType43Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="UREA"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "AssetClassSubProductType43Code")
@XmlEnum
public enum AssetClassSubProductType43Code {


    /**
     * Commodity of type urea.
     * 
     */
    UREA;

    public String value() {
        return name();
    }

    public static AssetClassSubProductType43Code fromValue(String v) {
        return valueOf(v);
    }

}
