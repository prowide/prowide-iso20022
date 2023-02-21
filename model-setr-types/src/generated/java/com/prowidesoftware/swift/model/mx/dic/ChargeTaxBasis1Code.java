
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ChargeTaxBasis1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ChargeTaxBasis1Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="FLAT"/&gt;
 *     &lt;enumeration value="PERU"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ChargeTaxBasis1Code")
@XmlEnum
public enum ChargeTaxBasis1Code {


    /**
     * Charges/tax basis is flat or absolute for the trade being allocated.
     * 
     */
    FLAT,

    /**
     * Charge/tax basis is per unit of financial instrument.
     * 
     */
    PERU;

    public String value() {
        return name();
    }

    public static ChargeTaxBasis1Code fromValue(String v) {
        return valueOf(v);
    }

}
