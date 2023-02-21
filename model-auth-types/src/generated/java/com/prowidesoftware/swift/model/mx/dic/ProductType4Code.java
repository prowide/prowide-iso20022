
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ProductType4Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ProductType4Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="CRDT"/&gt;
 *     &lt;enumeration value="CURR"/&gt;
 *     &lt;enumeration value="EQUI"/&gt;
 *     &lt;enumeration value="INTR"/&gt;
 *     &lt;enumeration value="COMM"/&gt;
 *     &lt;enumeration value="OTHR"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
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
