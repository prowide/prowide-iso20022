
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SettlementConditionModificationProcessingStatus1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="SettlementConditionModificationProcessingStatus1Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="PACK"/&gt;
 *     &lt;enumeration value="REJT"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "SettlementConditionModificationProcessingStatus1Code")
@XmlEnum
public enum SettlementConditionModificationProcessingStatus1Code {


    /**
     * Instruction has been acknowledged/accepted for further processing by the account servicer.
     * 
     */
    PACK,

    /**
     * Instruction has been rejected for further processing.
     * 
     */
    REJT;

    public String value() {
        return name();
    }

    public static SettlementConditionModificationProcessingStatus1Code fromValue(String v) {
        return valueOf(v);
    }

}
