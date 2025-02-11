
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ProcessingPosition2Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="ProcessingPosition2Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="AFTE"/>
 *     <enumeration value="WITH"/>
 *     <enumeration value="BEFO"/>
 *     <enumeration value="INFO"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "ProcessingPosition2Code")
@XmlEnum
public enum ProcessingPosition2Code {


    /**
     * Specifies that the transaction/instruction is to be executed after the linked transaction/instruction.
     * 
     */
    AFTE,

    /**
     * Specifies that the transaction/instruction is to be executed with the linked transaction/instruction.
     * 
     */
    WITH,

    /**
     * Specifies that the transaction/instruction is to be executed before the linked transaction/instruction.
     * 
     */
    BEFO,

    /**
     * Specifies that the transactions/instructions are linked for information purposes only.
     * 
     */
    INFO;

    public String value() {
        return name();
    }

    public static ProcessingPosition2Code fromValue(String v) {
        return valueOf(v);
    }

}
