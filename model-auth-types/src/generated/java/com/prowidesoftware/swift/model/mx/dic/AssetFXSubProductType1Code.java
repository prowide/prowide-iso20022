
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AssetFXSubProductType1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="AssetFXSubProductType1Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="FXCR"/>
 *     <enumeration value="FXEM"/>
 *     <enumeration value="FXMJ"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "AssetFXSubProductType1Code")
@XmlEnum
public enum AssetFXSubProductType1Code {


    /**
     * Commodity attribute of type foreign exchange cross rate.
     * 
     */
    FXCR,

    /**
     * Commodity attribute of type foreign exchange emerging markets.
     * 
     */
    FXEM,

    /**
     * Commodity attribute of type foreign exchange majors.
     * 
     */
    FXMJ;

    public String value() {
        return name();
    }

    public static AssetFXSubProductType1Code fromValue(String v) {
        return valueOf(v);
    }

}
