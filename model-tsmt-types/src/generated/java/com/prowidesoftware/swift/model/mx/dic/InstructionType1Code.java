
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for InstructionType1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="InstructionType1Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="LODG"/>
 *     <enumeration value="FPTR"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "InstructionType1Code")
@XmlEnum
public enum InstructionType1Code {


    /**
     * Instruction to lodge a baseline.
     * 
     */
    LODG,

    /**
     * Instruction to push full baseline information to the correspondent.
     * 
     */
    FPTR;

    public String value() {
        return name();
    }

    public static InstructionType1Code fromValue(String v) {
        return valueOf(v);
    }

}
