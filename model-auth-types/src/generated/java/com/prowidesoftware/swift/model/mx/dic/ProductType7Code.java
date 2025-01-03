
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ProductType7Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="ProductType7Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="SVGN"/>
 *     <enumeration value="EQUI"/>
 *     <enumeration value="OTHR"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "ProductType7Code")
@XmlEnum
public enum ProductType7Code {


    /**
     * Asset type is sovereign.
     * 
     */
    SVGN,

    /**
     * Identifies the nature or type of an equity.
     * 
     */
    EQUI,

    /**
     * Other asset type.
     * 
     */
    OTHR;

    public String value() {
        return name();
    }

    public static ProductType7Code fromValue(String v) {
        return valueOf(v);
    }

}
