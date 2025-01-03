
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AssetClassProductType16Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="AssetClassProductType16Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="INDX"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "AssetClassProductType16Code")
@XmlEnum
public enum AssetClassProductType16Code {


    /**
     * Index type of commodities.
     * 
     */
    INDX;

    public String value() {
        return name();
    }

    public static AssetClassProductType16Code fromValue(String v) {
        return valueOf(v);
    }

}
