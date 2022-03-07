
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ProductType5Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ProductType5Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="EMAL"/&gt;
 *     &lt;enumeration value="INTR"/&gt;
 *     &lt;enumeration value="EQUI"/&gt;
 *     &lt;enumeration value="COMM"/&gt;
 *     &lt;enumeration value="CRDT"/&gt;
 *     &lt;enumeration value="CURR"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
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
