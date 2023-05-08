
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Registration2Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="Registration2Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="PTYH"/>
 *     <enumeration value="CSDH"/>
 *     <enumeration value="CDEL"/>
 *     <enumeration value="CVAL"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "Registration2Code")
@XmlEnum
public enum Registration2Code {


    /**
     * You or your party set the instruction in a hold/frozen/preadvice mode.
     * 
     */
    PTYH,

    /**
     * Central securities depository sets the instruction in a hold/frozen/preadvice mode.
     * 
     */
    CSDH,

    /**
     * Instruction is in a hold/frozen/preadvice mode as it fulfils predefined conditional delivery rules in the market infrastructure platform for conditional delivery.
     * 
     */
    CDEL,

    /**
     * Instruction is in a hold/frozen/preadvice mode as it fulfils predefined conditions of a restriction processing type in the market infrastructure platform.
     * 
     */
    CVAL;

    public String value() {
        return name();
    }

    public static Registration2Code fromValue(String v) {
        return valueOf(v);
    }

}
