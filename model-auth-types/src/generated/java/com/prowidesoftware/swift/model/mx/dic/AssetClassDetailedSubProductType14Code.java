
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AssetClassDetailedSubProductType14Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="AssetClassDetailedSubProductType14Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="DBCR"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "AssetClassDetailedSubProductType14Code")
@XmlEnum
public enum AssetClassDetailedSubProductType14Code {


    /**
     * Commodity attribute of type dry bulk carrier.
     * 
     */
    DBCR;

    public String value() {
        return name();
    }

    public static AssetClassDetailedSubProductType14Code fromValue(String v) {
        return valueOf(v);
    }

}
