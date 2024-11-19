
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SecuritiesSettlementStatus3Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="SecuritiesSettlementStatus3Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="PEND"/>
 *     <enumeration value="SETT"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "SecuritiesSettlementStatus3Code")
@XmlEnum
public enum SecuritiesSettlementStatus3Code {


    /**
     * Instruction is pending. Settlement at the instructed settlement date is still possible.
     * 
     */
    PEND,

    /**
     * Full settlement.
     * 
     */
    SETT;

    public String value() {
        return name();
    }

    public static SecuritiesSettlementStatus3Code fromValue(String v) {
        return valueOf(v);
    }

}
