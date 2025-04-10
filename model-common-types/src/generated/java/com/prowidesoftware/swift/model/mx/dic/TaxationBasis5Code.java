
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TaxationBasis5Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="TaxationBasis5Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="FLAT"/>
 *     <enumeration value="GRAM"/>
 *     <enumeration value="NEAM"/>
 *     <enumeration value="NAVP"/>
 *     <enumeration value="PERU"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "TaxationBasis5Code")
@XmlEnum
public enum TaxationBasis5Code {


    /**
     * Charge/tax basis is a lump sum.
     * 
     */
    FLAT,

    /**
     * Charge/Commission/tax basis is based on the gross amount.
     * 
     */
    GRAM,

    /**
     * Charge/commission/tax basis is based on the net amount.
     * 
     */
    NEAM,

    /**
     * Charge/tax basis is the price.
     * 
     */
    NAVP,

    /**
     * Charges/tax basis is per unit of financial instrument.
     * 
     */
    PERU;

    public String value() {
        return name();
    }

    public static TaxationBasis5Code fromValue(String v) {
        return valueOf(v);
    }

}
