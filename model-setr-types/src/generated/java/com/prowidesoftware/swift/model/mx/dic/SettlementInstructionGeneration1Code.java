
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SettlementInstructionGeneration1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="SettlementInstructionGeneration1Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="GENS"/&gt;
 *     &lt;enumeration value="NOGE"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "SettlementInstructionGeneration1Code")
@XmlEnum
public enum SettlementInstructionGeneration1Code {


    /**
     * Specifies if the ETC service provider is to generate a settlement instruction.
     * 
     */
    GENS,

    /**
     * Specifies if the ETC service provider is not to generate a settlement instruction where a previous agreement to do so exists.
     * 
     */
    NOGE;

    public String value() {
        return name();
    }

    public static SettlementInstructionGeneration1Code fromValue(String v) {
        return valueOf(v);
    }

}
