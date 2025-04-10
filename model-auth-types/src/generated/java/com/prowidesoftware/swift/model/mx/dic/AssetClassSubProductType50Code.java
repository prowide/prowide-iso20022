
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AssetClassSubProductType50Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="AssetClassSubProductType50Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="OTHR"/>
 *     <enumeration value="RCVP"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "AssetClassSubProductType50Code")
@XmlEnum
public enum AssetClassSubProductType50Code {


    /**
     * Commodity of other type.
     * 
     */
    OTHR,

    /**
     * Commodity of type recovered paper.
     * 
     */
    RCVP;

    public String value() {
        return name();
    }

    public static AssetClassSubProductType50Code fromValue(String v) {
        return valueOf(v);
    }

}
