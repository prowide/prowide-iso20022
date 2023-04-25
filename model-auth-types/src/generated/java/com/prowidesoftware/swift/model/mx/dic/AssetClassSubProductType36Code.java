
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AssetClassSubProductType36Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="AssetClassSubProductType36Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="NSPT"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "AssetClassSubProductType36Code")
@XmlEnum
public enum AssetClassSubProductType36Code {


    /**
     * Commodity of type newsprint.
     * 
     */
    NSPT;

    public String value() {
        return name();
    }

    public static AssetClassSubProductType36Code fromValue(String v) {
        return valueOf(v);
    }

}
