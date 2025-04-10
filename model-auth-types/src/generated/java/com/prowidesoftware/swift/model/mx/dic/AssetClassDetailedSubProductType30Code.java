
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AssetClassDetailedSubProductType30Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="AssetClassDetailedSubProductType30Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="MWHT"/>
 *     <enumeration value="OTHR"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "AssetClassDetailedSubProductType30Code")
@XmlEnum
public enum AssetClassDetailedSubProductType30Code {


    /**
     * Commodity attribute of type milled wheat.
     * 
     */
    MWHT,

    /**
     * Commodity attribute of other type.
     * 
     */
    OTHR;

    public String value() {
        return name();
    }

    public static AssetClassDetailedSubProductType30Code fromValue(String v) {
        return valueOf(v);
    }

}
