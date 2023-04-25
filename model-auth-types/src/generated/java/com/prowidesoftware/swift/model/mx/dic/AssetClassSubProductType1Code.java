
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AssetClassSubProductType1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="AssetClassSubProductType1Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="GROS"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "AssetClassSubProductType1Code")
@XmlEnum
public enum AssetClassSubProductType1Code {


    /**
     * Commodity of type grain oil seeds.
     * 
     */
    GROS;

    public String value() {
        return name();
    }

    public static AssetClassSubProductType1Code fromValue(String v) {
        return valueOf(v);
    }

}
