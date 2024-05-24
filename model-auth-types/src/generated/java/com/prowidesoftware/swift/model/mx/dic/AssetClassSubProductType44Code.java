
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AssetClassSubProductType44Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="AssetClassSubProductType44Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="UAAN"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "AssetClassSubProductType44Code")
@XmlEnum
public enum AssetClassSubProductType44Code {


    /**
     * Commodity of type urea and ammonium nitrite.
     * 
     */
    UAAN;

    public String value() {
        return name();
    }

    public static AssetClassSubProductType44Code fromValue(String v) {
        return valueOf(v);
    }

}
