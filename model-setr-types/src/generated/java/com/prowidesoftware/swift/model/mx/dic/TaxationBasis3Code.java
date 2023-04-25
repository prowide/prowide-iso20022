
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TaxationBasis3Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="TaxationBasis3Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="FLAT"/>
 *     <enumeration value="PERU"/>
 *     <enumeration value="OTHR"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
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
