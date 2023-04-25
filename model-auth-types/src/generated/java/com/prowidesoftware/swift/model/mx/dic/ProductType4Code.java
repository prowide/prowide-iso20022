
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ProductType4Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="ProductType4Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="CRDT"/>
 *     <enumeration value="CURR"/>
 *     <enumeration value="EQUI"/>
 *     <enumeration value="INTR"/>
 *     <enumeration value="COMM"/>
 *     <enumeration value="OTHR"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "ProductType4Code")
@XmlEnum
public enum ProductType4Code {


    /**
     * Identifies categories of instruments that are credits.
     * 
     */
    CRDT,

    /**
     * Identifies categories of currency instruments.
     * 
     */
    CURR,

    /**
     * Identifies the nature or type of an equity.
     * 
     */
    EQUI,

    /**
     * Identifies categories of instruments that are interest rates based.
     * 
     */
    INTR,

    /**
     * Identifies categories of instruments that are commodities.
     * 
     */
    COMM,

    /**
     * Other asset type.
     * 
     */
    OTHR;

    public String value() {
        return name();
    }

    public static ProductType4Code fromValue(String v) {
        return valueOf(v);
    }

}
