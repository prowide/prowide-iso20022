
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AssetClassSubProductType46Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="AssetClassSubProductType46Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="CSHP"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "AssetClassSubProductType46Code")
@XmlEnum
public enum AssetClassSubProductType46Code {


    /**
     * Commodity of type container ships.
     * 
     */
    CSHP;

    public String value() {
        return name();
    }

    public static AssetClassSubProductType46Code fromValue(String v) {
        return valueOf(v);
    }

}
