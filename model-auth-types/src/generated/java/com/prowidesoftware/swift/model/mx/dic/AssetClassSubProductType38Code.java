
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AssetClassSubProductType38Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="AssetClassSubProductType38Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="RCVP"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "AssetClassSubProductType38Code")
@XmlEnum
public enum AssetClassSubProductType38Code {


    /**
     * Commodity of type recovered paper.
     * 
     */
    RCVP;

    public String value() {
        return name();
    }

    public static AssetClassSubProductType38Code fromValue(String v) {
        return valueOf(v);
    }

}
