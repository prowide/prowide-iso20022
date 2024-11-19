
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SettlementUnitType1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="SettlementUnitType1Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="FAMT"/>
 *     <enumeration value="UNIT"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "SettlementUnitType1Code")
@XmlEnum
public enum SettlementUnitType1Code {


    /**
     * Represent the face amount, for example the principal of a debt instrument.
     * 
     */
    FAMT,

    /**
     * Represent the unit as a number, for example a number of shares.
     * 
     */
    UNIT;

    public String value() {
        return name();
    }

    public static SettlementUnitType1Code fromValue(String v) {
        return valueOf(v);
    }

}
