
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SecuritiesSettlementStatus3Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="SecuritiesSettlementStatus3Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="PEND"/&gt;
 *     &lt;enumeration value="SETT"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
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
