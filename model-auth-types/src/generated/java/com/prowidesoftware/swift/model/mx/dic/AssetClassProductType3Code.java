
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AssetClassProductType3Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="AssetClassProductType3Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="ENVR"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "AssetClassProductType3Code")
@XmlEnum
public enum AssetClassProductType3Code {


    /**
     * Commodity of type environmental.
     * 
     */
    ENVR;

    public String value() {
        return name();
    }

    public static AssetClassProductType3Code fromValue(String v) {
        return valueOf(v);
    }

}
