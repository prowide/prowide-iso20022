
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PriceProtectionScope2Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="PriceProtectionScope2Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="LOCA"/&gt;
 *     &lt;enumeration value="NATI"/&gt;
 *     &lt;enumeration value="GLOB"/&gt;
 *     &lt;enumeration value="NAEL"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
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
