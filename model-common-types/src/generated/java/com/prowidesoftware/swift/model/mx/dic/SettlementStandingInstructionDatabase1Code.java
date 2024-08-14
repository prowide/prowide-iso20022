
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SettlementStandingInstructionDatabase1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="SettlementStandingInstructionDatabase1Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="INTE"/>
 *     <enumeration value="BRKR"/>
 *     <enumeration value="VEND"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "SettlementStandingInstructionDatabase1Code")
@XmlEnum
public enum SettlementStandingInstructionDatabase1Code {


    /**
     * The settlement standing instruction database to be used is the receiver's internal database.
     * 
     */
    INTE,

    /**
     * The settlement standing instruction database to be used is the broker's database.
     * 
     */
    BRKR,

    /**
     * The settlement standing instruction database to be used is the database of the vendor.
     * 
     */
    VEND;

    public String value() {
        return name();
    }

    public static SettlementStandingInstructionDatabase1Code fromValue(String v) {
        return valueOf(v);
    }

}
