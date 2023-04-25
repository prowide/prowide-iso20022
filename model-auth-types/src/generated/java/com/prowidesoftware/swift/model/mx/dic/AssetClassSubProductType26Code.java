
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AssetClassSubProductType26Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="AssetClassSubProductType26Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="INRG"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "AssetClassSubProductType26Code")
@XmlEnum
public enum AssetClassSubProductType26Code {


    /**
     * Commodity of type inter energy.
     * 
     */
    INRG;

    public String value() {
        return name();
    }

    public static AssetClassSubProductType26Code fromValue(String v) {
        return valueOf(v);
    }

}
