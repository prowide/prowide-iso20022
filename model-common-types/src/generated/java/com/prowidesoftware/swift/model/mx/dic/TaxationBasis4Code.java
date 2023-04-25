
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TaxationBasis4Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="TaxationBasis4Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="FLAT"/>
 *     <enumeration value="PERU"/>
 *     <enumeration value="GRAM"/>
 *     <enumeration value="NEAM"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "TaxationBasis4Code")
@XmlEnum
public enum TaxationBasis4Code {


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
     * Charge/Commission/tax basis is based on the gross amount.
     * 
     */
    GRAM,

    /**
     * Charge/commission/tax basis is based on the net amount.
     * 
     */
    NEAM;

    public String value() {
        return name();
    }

    public static TaxationBasis4Code fromValue(String v) {
        return valueOf(v);
    }

}
