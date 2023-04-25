
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DTCProtectInstructionStatus3Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="DTCProtectInstructionStatus3Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="PENA"/>
 *     <enumeration value="WITH"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "DTCProtectInstructionStatus3Code")
@XmlEnum
public enum DTCProtectInstructionStatus3Code {


    /**
     * Instruction pending release or delete from approval function.
     * 
     */
    PENA,

    /**
     * Client instruction withdrawn for events with withdrawal privilege.
     * 
     */
    WITH;

    public String value() {
        return name();
    }

    public static DTCProtectInstructionStatus3Code fromValue(String v) {
        return valueOf(v);
    }

}
