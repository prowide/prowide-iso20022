
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ProductType7Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ProductType7Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="SVGN"/&gt;
 *     &lt;enumeration value="EQUI"/&gt;
 *     &lt;enumeration value="OTHR"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
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
