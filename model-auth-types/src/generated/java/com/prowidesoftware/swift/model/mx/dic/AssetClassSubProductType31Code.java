
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AssetClassSubProductType31Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="AssetClassSubProductType31Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="DRYF"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "AssetClassSubProductType31Code")
@XmlEnum
public enum AssetClassSubProductType31Code {


    /**
     * Commodity of type dry freight.
     * 
     */
    DRYF;

    public String value() {
        return name();
    }

    public static AssetClassSubProductType31Code fromValue(String v) {
        return valueOf(v);
    }

}
