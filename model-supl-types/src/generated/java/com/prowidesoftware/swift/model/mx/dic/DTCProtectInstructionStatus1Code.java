
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DTCProtectInstructionStatus1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="DTCProtectInstructionStatus1Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="PENA"/>
 *     <enumeration value="WITH"/>
 *     <enumeration value="COVR"/>
 *     <enumeration value="EXPI"/>
 *     <enumeration value="OPEN"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "DTCProtectInstructionStatus1Code")
@XmlEnum
public enum DTCProtectInstructionStatus1Code {


    /**
     * Instruction pending release or delete from approval function.
     * 
     */
    PENA,

    /**
     * Client instruction withdrawn for events with withdrawal privilege.
     * 
     */
    WITH,

    /**
     * Protect instruction has been fully covered.
     * 
     */
    COVR,

    /**
     * Protect instruction has expired.
     * 
     */
    EXPI,

    /**
     * Protect instruction which has not been fully covered. Will include partial covers.
     * 
     */
    OPEN;

    public String value() {
        return name();
    }

    public static DTCProtectInstructionStatus1Code fromValue(String v) {
        return valueOf(v);
    }

}
