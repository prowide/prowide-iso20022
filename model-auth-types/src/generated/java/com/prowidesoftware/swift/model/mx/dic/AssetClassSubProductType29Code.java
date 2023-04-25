
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AssetClassSubProductType29Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="AssetClassSubProductType29Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="CRBR"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "AssetClassSubProductType29Code")
@XmlEnum
public enum AssetClassSubProductType29Code {


    /**
     * Commodity of type carbon related.
     * 
     */
    CRBR;

    public String value() {
        return name();
    }

    public static AssetClassSubProductType29Code fromValue(String v) {
        return valueOf(v);
    }

}
