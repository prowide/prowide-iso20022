
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ProductType6Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="ProductType6Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="BOND"/>
 *     <enumeration value="CASH"/>
 *     <enumeration value="OTHR"/>
 *     <enumeration value="EQUI"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "ProductType6Code")
@XmlEnum
public enum ProductType6Code {


    /**
     * The asset type is bond.
     * 
     */
    BOND,

    /**
     * The asset type is cash.
     * 
     */
    CASH,

    /**
     * Other asset type.
     * 
     */
    OTHR,

    /**
     * Identifies the nature or type of an equity.
     * 
     */
    EQUI;

    public String value() {
        return name();
    }

    public static ProductType6Code fromValue(String v) {
        return valueOf(v);
    }

}
