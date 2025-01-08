
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AssetClassSubProductType49Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="AssetClassSubProductType49Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="OTHR"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "AssetClassSubProductType49Code")
@XmlEnum
public enum AssetClassSubProductType49Code {


    /**
     * Commodity of other type.
     * 
     */
    OTHR;

    public String value() {
        return name();
    }

    public static AssetClassSubProductType49Code fromValue(String v) {
        return valueOf(v);
    }

}
