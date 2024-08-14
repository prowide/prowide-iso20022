
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AssetClassDetailedSubProductType4Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="AssetClassDetailedSubProductType4Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="LAMP"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "AssetClassDetailedSubProductType4Code")
@XmlEnum
public enum AssetClassDetailedSubProductType4Code {


    /**
     * Commodity attribute of type lampante.
     * 
     */
    LAMP;

    public String value() {
        return name();
    }

    public static AssetClassDetailedSubProductType4Code fromValue(String v) {
        return valueOf(v);
    }

}
