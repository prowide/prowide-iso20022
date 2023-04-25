
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TaxationBasis2Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="TaxationBasis2Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="FLAT"/>
 *     <enumeration value="PERU"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "TaxationBasis2Code")
@XmlEnum
public enum TaxationBasis2Code {


    /**
     * Charge/tax basis is a lump sum.
     * 
     */
    FLAT,

    /**
     * Charges/tax basis is per unit of financial instrument.
     * 
     */
    PERU;

    public String value() {
        return name();
    }

    public static TaxationBasis2Code fromValue(String v) {
        return valueOf(v);
    }

}
