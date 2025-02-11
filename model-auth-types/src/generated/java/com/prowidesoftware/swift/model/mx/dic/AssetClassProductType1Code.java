
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AssetClassProductType1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="AssetClassProductType1Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="AGRI"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "AssetClassProductType1Code")
@XmlEnum
public enum AssetClassProductType1Code {


    /**
     * Commodity of type agricultural.
     * 
     */
    AGRI;

    public String value() {
        return name();
    }

    public static AssetClassProductType1Code fromValue(String v) {
        return valueOf(v);
    }

}
