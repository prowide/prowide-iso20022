
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SecuritiesSettlementStatus1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="SecuritiesSettlementStatus1Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="PEND"/>
 *     <enumeration value="PENF"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "SecuritiesSettlementStatus1Code")
@XmlEnum
public enum SecuritiesSettlementStatus1Code {


    /**
     * Instruction is pending. Settlement at the instructed settlement date is still possible.
     * 
     */
    PEND,

    /**
     * Instruction is failing. Settlement at the instructed settlement date is no longer possible.
     * 
     */
    PENF;

    public String value() {
        return name();
    }

    public static SecuritiesSettlementStatus1Code fromValue(String v) {
        return valueOf(v);
    }

}
