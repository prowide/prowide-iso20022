
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PriceProtectionScope2Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="PriceProtectionScope2Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="LOCA"/>
 *     <enumeration value="NATI"/>
 *     <enumeration value="GLOB"/>
 *     <enumeration value="NAEL"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "PriceProtectionScope2Code")
@XmlEnum
public enum PriceProtectionScope2Code {


    /**
     * Price protection is local (for example, Exchange, ECN, ATS).
     * 
     */
    LOCA,

    /**
     * Price protection is national (across all national markets).
     * 
     */
    NATI,

    /**
     * Price protection is global (across all markets).
     * 
     */
    GLOB,

    /**
     * Price protection is national (across all national markets) excluding local price protection.
     * 
     */
    NAEL;

    public String value() {
        return name();
    }

    public static PriceProtectionScope2Code fromValue(String v) {
        return valueOf(v);
    }

}
