
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CashSettlementSystem3Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="CashSettlementSystem3Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="DCSS"/>
 *     <enumeration value="GROS"/>
 *     <enumeration value="NETS"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "CashSettlementSystem3Code")
@XmlEnum
public enum CashSettlementSystem3Code {


    /**
     * Digital cash settlement system used for the payment.
     * 
     */
    DCSS,

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

    public static CashSettlementSystem3Code fromValue(String v) {
        return valueOf(v);
    }

}
