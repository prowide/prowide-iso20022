
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AssetClassSubProductType40Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="AssetClassSubProductType40Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="DAPH"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "AssetClassSubProductType40Code")
@XmlEnum
public enum AssetClassSubProductType40Code {


    /**
     * Commodity of type diammonium phosphate.
     * 
     */
    DAPH;

    public String value() {
        return name();
    }

    public static AssetClassSubProductType40Code fromValue(String v) {
        return valueOf(v);
    }

}
