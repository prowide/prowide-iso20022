
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Instruction1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="Instruction1Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="PBEN"/>
 *     <enumeration value="TTIL"/>
 *     <enumeration value="TFRO"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "Instruction1Code")
@XmlEnum
public enum Instruction1Code {


    /**
     * (Ultimate) creditor to be paid only after verification of identity.
     * 
     */
    PBEN,

    /**
     * Payment instruction is valid and eligible for execution until the date and time stipulated. Otherwise, the payment instruction will be rejected.
     * 
     */
    TTIL,

    /**
     * Payment instruction will be valid and eligible for execution from the date and time stipulated.
     * 
     */
    TFRO;

    public String value() {
        return name();
    }

    public static Instruction1Code fromValue(String v) {
        return valueOf(v);
    }

}
