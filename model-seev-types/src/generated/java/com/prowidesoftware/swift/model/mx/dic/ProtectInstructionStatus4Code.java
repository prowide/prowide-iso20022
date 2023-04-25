
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ProtectInstructionStatus4Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="ProtectInstructionStatus4Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="OPEN"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "ProtectInstructionStatus4Code")
@XmlEnum
public enum ProtectInstructionStatus4Code {


    /**
     * Protect instruction which has not been fully covered. Will include partial covers.
     * 
     */
    OPEN;

    public String value() {
        return name();
    }

    public static ProtectInstructionStatus4Code fromValue(String v) {
        return valueOf(v);
    }

}
