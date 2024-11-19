
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AssetClassSubProductType24Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="AssetClassSubProductType24Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="COAL"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "AssetClassSubProductType24Code")
@XmlEnum
public enum AssetClassSubProductType24Code {


    /**
     * Commodity of type coal.
     * 
     */
    COAL;

    public String value() {
        return name();
    }

    public static AssetClassSubProductType24Code fromValue(String v) {
        return valueOf(v);
    }

}
