
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AssetClassProductType2Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="AssetClassProductType2Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="NRGY"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "AssetClassProductType2Code")
@XmlEnum
public enum AssetClassProductType2Code {


    /**
     * Commodity of type energy.
     * 
     */
    NRGY;

    public String value() {
        return name();
    }

    public static AssetClassProductType2Code fromValue(String v) {
        return valueOf(v);
    }

}
