
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AssetClassProductType11Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="AssetClassProductType11Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="OTHC"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "AssetClassProductType11Code")
@XmlEnum
public enum AssetClassProductType11Code {


    /**
     * Commodity of other type C10.
     * 
     */
    OTHC;

    public String value() {
        return name();
    }

    public static AssetClassProductType11Code fromValue(String v) {
        return valueOf(v);
    }

}
