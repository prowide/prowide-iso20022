
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AssetClassDetailedSubProductType15Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="AssetClassDetailedSubProductType15Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="MWHT"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "AssetClassDetailedSubProductType15Code")
@XmlEnum
public enum AssetClassDetailedSubProductType15Code {


    /**
     * Commodity attribute of type milled wheat.
     * 
     */
    MWHT;

    public String value() {
        return name();
    }

    public static AssetClassDetailedSubProductType15Code fromValue(String v) {
        return valueOf(v);
    }

}
