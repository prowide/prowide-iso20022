
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AssetClassProductType14Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="AssetClassProductType14Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="OEST"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "AssetClassProductType14Code")
@XmlEnum
public enum AssetClassProductType14Code {


    /**
     * Commodity of type official economic statistic.
     * 
     */
    OEST;

    public String value() {
        return name();
    }

    public static AssetClassProductType14Code fromValue(String v) {
        return valueOf(v);
    }

}
