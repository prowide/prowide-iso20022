
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ProcessingPosition3Code__1.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="ProcessingPosition3Code__1">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="AFTE"/>
 *     <enumeration value="WITH"/>
 *     <enumeration value="BEFO"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "ProcessingPosition3Code__1")
@XmlEnum
public enum ProcessingPosition3Code1 {


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
    BEFO;

    public String value() {
        return name();
    }

    public static ProcessingPosition3Code1 fromValue(String v) {
        return valueOf(v);
    }

}
