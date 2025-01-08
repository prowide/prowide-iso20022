
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AssetClassSubProductType21Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="AssetClassSubProductType21Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="FRST"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "AssetClassSubProductType21Code")
@XmlEnum
public enum AssetClassSubProductType21Code {


    /**
     * Commodity of type forestry.
     * 
     */
    FRST;

    public String value() {
        return name();
    }

    public static AssetClassSubProductType21Code fromValue(String v) {
        return valueOf(v);
    }

}
