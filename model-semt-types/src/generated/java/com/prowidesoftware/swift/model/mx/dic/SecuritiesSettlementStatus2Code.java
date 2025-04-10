
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SecuritiesSettlementStatus2Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="SecuritiesSettlementStatus2Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="PEND"/>
 *     <enumeration value="PENF"/>
 *     <enumeration value="USET"/>
 *     <enumeration value="SETT"/>
 *     <enumeration value="PAIN"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "SecuritiesSettlementStatus2Code")
@XmlEnum
public enum SecuritiesSettlementStatus2Code {


    /**
     * Instruction is pending. Settlement at the instructed settlement date is still possible.
     * 
     */
    PEND,

    /**
     * Instruction is failing. Settlement at the instructed settlement date is no longer possible.
     * 
     */
    PENF,

    /**
     * Instruction is unsettled.
     * 
     */
    USET,

    /**
     * Full settlement.
     * 
     */
    SETT,

    /**
     * Part of the instruction remains unsettled.
     * 
     */
    PAIN;

    public String value() {
        return name();
    }

    public static SecuritiesSettlementStatus2Code fromValue(String v) {
        return valueOf(v);
    }

}
