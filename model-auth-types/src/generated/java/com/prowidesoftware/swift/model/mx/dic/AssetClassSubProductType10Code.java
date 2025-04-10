
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AssetClassSubProductType10Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="AssetClassSubProductType10Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="EMIS"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "AssetClassSubProductType10Code")
@XmlEnum
public enum AssetClassSubProductType10Code {


    /**
     * Commodity of type emission.
     * 
     */
    EMIS;

    public String value() {
        return name();
    }

    public static AssetClassSubProductType10Code fromValue(String v) {
        return valueOf(v);
    }

}
