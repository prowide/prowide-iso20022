
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PriceProtectionScope1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="PriceProtectionScope1Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="LOCA"/&gt;
 *     &lt;enumeration value="NATI"/&gt;
 *     &lt;enumeration value="GLOB"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
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
