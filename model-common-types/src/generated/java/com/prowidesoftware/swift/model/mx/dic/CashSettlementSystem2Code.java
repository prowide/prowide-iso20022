
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CashSettlementSystem2Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="CashSettlementSystem2Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="GROS"/>
 *     <enumeration value="NETS"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "CashSettlementSystem2Code")
@XmlEnum
public enum CashSettlementSystem2Code {


    /**
     * Settle money through gross settlement system.
     * 
     */
    GROS,

    /**
     * Settle money through net settlement system.
     * 
     */
    NETS;

    public String value() {
        return name();
    }

    public static CashSettlementSystem2Code fromValue(String v) {
        return valueOf(v);
    }

}
