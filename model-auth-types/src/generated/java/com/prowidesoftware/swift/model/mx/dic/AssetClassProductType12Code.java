
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AssetClassProductType12Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="AssetClassProductType12Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="INFL"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "AssetClassProductType12Code")
@XmlEnum
public enum AssetClassProductType12Code {


    /**
     * Commodity of type inflation.
     * 
     */
    INFL;

    public String value() {
        return name();
    }

    public static AssetClassProductType12Code fromValue(String v) {
        return valueOf(v);
    }

}
