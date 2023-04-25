
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SettlementType1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="SettlementType1Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="PRIN"/>
 *     <enumeration value="NETO"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "SettlementType1Code")
@XmlEnum
public enum SettlementType1Code {


    /**
     * Option trade is settled as principal.
     * 
     */
    PRIN,

    /**
     * Option trade is netted off against another trade.
     * 
     */
    NETO;

    public String value() {
        return name();
    }

    public static SettlementType1Code fromValue(String v) {
        return valueOf(v);
    }

}
