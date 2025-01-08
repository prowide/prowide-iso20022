
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AssetClassSubProductFreight1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="AssetClassSubProductFreight1Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="DRYF"/>
 *     <enumeration value="WETF"/>
 *     <enumeration value="OTHR"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "AssetClassSubProductFreight1Code")
@XmlEnum
public enum AssetClassSubProductFreight1Code {


    /**
     * Commodity of type dry freight.
     * 
     */
    DRYF,

    /**
     * Commodity of type wet freight.
     * 
     */
    WETF,

    /**
     * Commodity of other type.
     * 
     */
    OTHR;

    public String value() {
        return name();
    }

    public static AssetClassSubProductFreight1Code fromValue(String v) {
        return valueOf(v);
    }

}
