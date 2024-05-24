
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SettlementTransactionCondition11Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="SettlementTransactionCondition11Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="NOMC"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "SettlementTransactionCondition11Code")
@XmlEnum
public enum SettlementTransactionCondition11Code {


    /**
     * No market claim should be automatically generated.
     * 
     */
    NOMC;

    public String value() {
        return name();
    }

    public static SettlementTransactionCondition11Code fromValue(String v) {
        return valueOf(v);
    }

}
