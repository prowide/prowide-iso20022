
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SecuritiesSettlementStatus2Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="SecuritiesSettlementStatus2Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="PEND"/&gt;
 *     &lt;enumeration value="PENF"/&gt;
 *     &lt;enumeration value="USET"/&gt;
 *     &lt;enumeration value="SETT"/&gt;
 *     &lt;enumeration value="PAIN"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
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
