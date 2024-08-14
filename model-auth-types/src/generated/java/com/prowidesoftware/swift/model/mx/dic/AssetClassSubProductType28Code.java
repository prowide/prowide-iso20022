
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AssetClassSubProductType28Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="AssetClassSubProductType28Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="RNNG"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "AssetClassSubProductType28Code")
@XmlEnum
public enum AssetClassSubProductType28Code {


    /**
     * Commodity of type renewable energy.
     * 
     */
    RNNG;

    public String value() {
        return name();
    }

    public static AssetClassSubProductType28Code fromValue(String v) {
        return valueOf(v);
    }

}
