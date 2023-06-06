
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AssetClassSubProductType48Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="AssetClassSubProductType48Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="NDLV"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "AssetClassSubProductType48Code")
@XmlEnum
public enum AssetClassSubProductType48Code {


    /**
     * Commodity of type non deliverable.
     * 
     */
    NDLV;

    public String value() {
        return name();
    }

    public static AssetClassSubProductType48Code fromValue(String v) {
        return valueOf(v);
    }

}
