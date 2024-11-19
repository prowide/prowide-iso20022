
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AssetClassDetailedSubProductType12Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="AssetClassDetailedSubProductType12Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="TNKR"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "AssetClassDetailedSubProductType12Code")
@XmlEnum
public enum AssetClassDetailedSubProductType12Code {


    /**
     * Commodity attribute of type tanker.
     * 
     */
    TNKR;

    public String value() {
        return name();
    }

    public static AssetClassDetailedSubProductType12Code fromValue(String v) {
        return valueOf(v);
    }

}
