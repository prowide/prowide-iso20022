
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SettlementInstructionGeneration1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="SettlementInstructionGeneration1Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="GENS"/>
 *     <enumeration value="NOGE"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
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
