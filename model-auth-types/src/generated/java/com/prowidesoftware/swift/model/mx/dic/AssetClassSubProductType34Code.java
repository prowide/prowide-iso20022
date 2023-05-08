
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AssetClassSubProductType34Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="AssetClassSubProductType34Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="MFTG"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "AssetClassSubProductType34Code")
@XmlEnum
public enum AssetClassSubProductType34Code {


    /**
     * Commodity of type manufacturing.
     * 
     */
    MFTG;

    public String value() {
        return name();
    }

    public static AssetClassSubProductType34Code fromValue(String v) {
        return valueOf(v);
    }

}
