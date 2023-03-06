
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DTCProtectInstructionStatus3Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="DTCProtectInstructionStatus3Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="PENA"/&gt;
 *     &lt;enumeration value="WITH"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
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
