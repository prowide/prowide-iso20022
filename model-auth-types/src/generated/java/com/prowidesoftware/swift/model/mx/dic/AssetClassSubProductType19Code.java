
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AssetClassSubProductType19Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="AssetClassSubProductType19Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="DLVR"/>
 *     <enumeration value="NDLV"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "AssetClassSubProductType19Code")
@XmlEnum
public enum AssetClassSubProductType19Code {


    /**
     * Commodity of type deliverable.
     * 
     */
    DLVR,

    /**
     * Commodity of type non deliverable.
     * 
     */
    NDLV;

    public String value() {
        return name();
    }

    public static AssetClassSubProductType19Code fromValue(String v) {
        return valueOf(v);
    }

}
