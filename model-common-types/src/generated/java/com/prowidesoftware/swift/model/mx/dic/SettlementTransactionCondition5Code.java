
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SettlementTransactionCondition5Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="SettlementTransactionCondition5Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="PART"/>
 *     <enumeration value="NPAR"/>
 *     <enumeration value="PARC"/>
 *     <enumeration value="PARQ"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "SettlementTransactionCondition5Code")
@XmlEnum
public enum SettlementTransactionCondition5Code {


    /**
     * Partial settlement is allowed.
     * 
     */
    PART,

    /**
     * Partial settlement is not allowed.
     * 
     */
    NPAR,

    /**
     * Partial settlement is allowed but must satisfy a cash value minimum (value defined in static data).
     * 
     */
    PARC,

    /**
     * Partial settlement is allowed but must satisfy a minimum quantity of securities (quantity defined in static data).
     * 
     */
    PARQ;

    public String value() {
        return name();
    }

    public static SettlementTransactionCondition5Code fromValue(String v) {
        return valueOf(v);
    }

}
