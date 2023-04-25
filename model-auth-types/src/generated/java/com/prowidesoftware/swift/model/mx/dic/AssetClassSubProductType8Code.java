
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AssetClassSubProductType8Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="AssetClassSubProductType8Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="OILP"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "AssetClassSubProductType8Code")
@XmlEnum
public enum AssetClassSubProductType8Code {


    /**
     * Commodity of type oil.
     * 
     */
    OILP;

    public String value() {
        return name();
    }

    public static AssetClassSubProductType8Code fromValue(String v) {
        return valueOf(v);
    }

}
