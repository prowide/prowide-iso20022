
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CashSettlementSystem2Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="CashSettlementSystem2Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="GROS"/&gt;
 *     &lt;enumeration value="NETS"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
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
