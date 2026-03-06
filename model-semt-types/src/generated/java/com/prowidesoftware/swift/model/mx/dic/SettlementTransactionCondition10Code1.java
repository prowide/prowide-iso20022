
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SettlementTransactionCondition10Code__1.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="SettlementTransactionCondition10Code__1">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="NOMC"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "SettlementTransactionCondition10Code__1")
@XmlEnum
public enum SettlementTransactionCondition10Code1 {


    /**
     * No market claim should be automatically generated.
     * 
     */
    NOMC;

    public String value() {
        return name();
    }

    public static SettlementTransactionCondition10Code1 fromValue(String v) {
        return valueOf(v);
    }

}
