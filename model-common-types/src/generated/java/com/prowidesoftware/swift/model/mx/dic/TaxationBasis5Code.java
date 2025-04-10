
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TaxationBasis5Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="TaxationBasis5Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="FLAT"/&gt;
 *     &lt;enumeration value="GRAM"/&gt;
 *     &lt;enumeration value="NEAM"/&gt;
 *     &lt;enumeration value="NAVP"/&gt;
 *     &lt;enumeration value="PERU"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
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
