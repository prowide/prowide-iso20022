
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AssetClassSubProductType47Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="AssetClassSubProductType47Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="DLVR"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "AssetClassSubProductType47Code")
@XmlEnum
public enum AssetClassSubProductType47Code {


    /**
     * Commodity of type deliverable.
     * 
     */
    DLVR;

    public String value() {
        return name();
    }

    public static AssetClassSubProductType47Code fromValue(String v) {
        return valueOf(v);
    }

}
