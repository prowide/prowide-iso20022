
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AssetClassSubProductType15Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="AssetClassSubProductType15Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="NPRM"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "AssetClassSubProductType15Code")
@XmlEnum
public enum AssetClassSubProductType15Code {


    /**
     * Commodity of type non precious metals.
     * 
     */
    NPRM;

    public String value() {
        return name();
    }

    public static AssetClassSubProductType15Code fromValue(String v) {
        return valueOf(v);
    }

}
