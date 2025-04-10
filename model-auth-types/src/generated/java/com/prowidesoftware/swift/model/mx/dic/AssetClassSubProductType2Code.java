
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AssetClassSubProductType2Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="AssetClassSubProductType2Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="SOFT"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "AssetClassSubProductType2Code")
@XmlEnum
public enum AssetClassSubProductType2Code {


    /**
     * Commodity of type softs.
     * 
     */
    SOFT;

    public String value() {
        return name();
    }

    public static AssetClassSubProductType2Code fromValue(String v) {
        return valueOf(v);
    }

}
