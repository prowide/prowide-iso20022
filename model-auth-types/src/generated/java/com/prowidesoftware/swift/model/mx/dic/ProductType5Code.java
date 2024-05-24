
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ProductType5Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="ProductType5Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="EMAL"/>
 *     <enumeration value="INTR"/>
 *     <enumeration value="EQUI"/>
 *     <enumeration value="COMM"/>
 *     <enumeration value="CRDT"/>
 *     <enumeration value="CURR"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "ProductType5Code")
@XmlEnum
public enum ProductType5Code {


    /**
     * Identifies categories of instruments related to Emission Allowance.
     * 
     */
    EMAL,

    /**
     * Identifies categories of instruments that are interest rates based.
     * 
     */
    INTR,

    /**
     * Identifies the nature or type of an equity.
     * 
     */
    EQUI,

    /**
     * Identifies categories of instruments that are commodities.
     * 
     */
    COMM,

    /**
     * Identifies categories of instruments that are credits.
     * 
     */
    CRDT,

    /**
     * Identifies categories of currency instruments.
     * 
     */
    CURR;

    public String value() {
        return name();
    }

    public static ProductType5Code fromValue(String v) {
        return valueOf(v);
    }

}
