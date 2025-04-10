
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AssetClassSubProductType35Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="AssetClassSubProductType35Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="CBRD"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "AssetClassSubProductType35Code")
@XmlEnum
public enum AssetClassSubProductType35Code {


    /**
     * Commodity of type containerboard.
     * 
     */
    CBRD;

    public String value() {
        return name();
    }

    public static AssetClassSubProductType35Code fromValue(String v) {
        return valueOf(v);
    }

}
