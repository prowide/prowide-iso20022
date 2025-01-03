
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AssetClassSubProductType6Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="AssetClassSubProductType6Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="ELEC"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "AssetClassSubProductType6Code")
@XmlEnum
public enum AssetClassSubProductType6Code {


    /**
     * Commodity of type electricity.
     * 
     */
    ELEC;

    public String value() {
        return name();
    }

    public static AssetClassSubProductType6Code fromValue(String v) {
        return valueOf(v);
    }

}
