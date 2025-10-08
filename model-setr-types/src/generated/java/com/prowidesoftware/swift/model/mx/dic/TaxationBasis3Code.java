
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TaxationBasis3Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="TaxationBasis3Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="FLAT"/&gt;
 *     &lt;enumeration value="PERU"/&gt;
 *     &lt;enumeration value="OTHR"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "TaxationBasis3Code")
@XmlEnum
public enum TaxationBasis3Code {


    /**
     * Charge/tax basis is a lump sum.
     * 
     */
    FLAT,

    /**
     * Charges/tax basis is per unit of financial instrument.
     * 
     */
    PERU,

    /**
     * Another type of taxation basis.
     * 
     */
    OTHR;

    public String value() {
        return name();
    }

    public static TaxationBasis3Code fromValue(String v) {
        return valueOf(v);
    }

}
