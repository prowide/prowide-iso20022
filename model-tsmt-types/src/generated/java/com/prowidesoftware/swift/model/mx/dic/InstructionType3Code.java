
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for InstructionType3Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="InstructionType3Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="MTCH"/&gt;
 *     &lt;enumeration value="PMTC"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "InstructionType3Code")
@XmlEnum
public enum InstructionType3Code {


    /**
     * Instruction to match a data set.
     * 
     */
    MTCH,

    /**
     * Instruction to pre-match a data set.
     * 
     */
    PMTC;

    public String value() {
        return name();
    }

    public static InstructionType3Code fromValue(String v) {
        return valueOf(v);
    }

}
