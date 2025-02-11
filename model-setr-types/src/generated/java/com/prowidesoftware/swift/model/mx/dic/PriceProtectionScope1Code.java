
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PriceProtectionScope1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="PriceProtectionScope1Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="LOCA"/>
 *     <enumeration value="NATI"/>
 *     <enumeration value="GLOB"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "PriceProtectionScope1Code")
@XmlEnum
public enum PriceProtectionScope1Code {


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
    GLOB;

    public String value() {
        return name();
    }

    public static PriceProtectionScope1Code fromValue(String v) {
        return valueOf(v);
    }

}
