
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AssetClassSubProductType37Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="AssetClassSubProductType37Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="PULP"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "AssetClassSubProductType37Code")
@XmlEnum
public enum AssetClassSubProductType37Code {


    /**
     * Commodity of type pulp.
     * 
     */
    PULP;

    public String value() {
        return name();
    }

    public static AssetClassSubProductType37Code fromValue(String v) {
        return valueOf(v);
    }

}
