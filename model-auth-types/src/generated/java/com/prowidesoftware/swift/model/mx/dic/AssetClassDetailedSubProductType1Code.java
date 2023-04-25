
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AssetClassDetailedSubProductType1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="AssetClassDetailedSubProductType1Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="FWHT"/>
 *     <enumeration value="SOYB"/>
 *     <enumeration value="RPSD"/>
 *     <enumeration value="OTHR"/>
 *     <enumeration value="CORN"/>
 *     <enumeration value="RICE"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "AssetClassDetailedSubProductType1Code")
@XmlEnum
public enum AssetClassDetailedSubProductType1Code {


    /**
     * Commodity attribute of type feed wheat.
     * 
     */
    FWHT,

    /**
     * Commodity attribute of type soybeans.
     * 
     */
    SOYB,

    /**
     * Commodity attribute of type rapeseed.
     * 
     */
    RPSD,

    /**
     * Commodity attribute of other type.
     * 
     */
    OTHR,

    /**
     * Commodity attribute of type maize.
     * 
     */
    CORN,

    /**
     * Commodity attribute of type rice.
     * 
     */
    RICE;

    public String value() {
        return name();
    }

    public static AssetClassDetailedSubProductType1Code fromValue(String v) {
        return valueOf(v);
    }

}
