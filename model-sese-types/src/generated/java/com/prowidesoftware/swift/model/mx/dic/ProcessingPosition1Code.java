
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ProcessingPosition1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ProcessingPosition1Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="AFTR"/&gt;
 *     &lt;enumeration value="WITH"/&gt;
 *     &lt;enumeration value="BEFR"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ProcessingPosition1Code")
@XmlEnum
public enum ProcessingPosition1Code {


    /**
     * Indicates that the instruction is to be executed after the linked instruction.
     * 
     */
    AFTR,

    /**
     * Indicates that the instruction is to be executed with the linked instruction.
     * 
     */
    WITH,

    /**
     * Indicates that the instruction is to be executed before the linked instruction.
     * 
     */
    BEFR;

    public String value() {
        return name();
    }

    public static ProcessingPosition1Code fromValue(String v) {
        return valueOf(v);
    }

}
