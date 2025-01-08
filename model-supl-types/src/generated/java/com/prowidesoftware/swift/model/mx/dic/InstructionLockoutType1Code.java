
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for InstructionLockoutType1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="InstructionLockoutType1Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="MANL"/>
 *     <enumeration value="NOTL"/>
 *     <enumeration value="SYSL"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "InstructionLockoutType1Code")
@XmlEnum
public enum InstructionLockoutType1Code {


    /**
     * Event is locked out manually for instruction processing.  This relates to conversions, warrants and put events.
     * 
     */
    MANL,

    /**
     * Event is not locked out manually for instruction processing. This relates to conversions, warrants and put events.
     * 
     */
    NOTL,

    /**
     * Event is locked out systemically for instruction processing. This relates to conversion or warrant events due to an "out of town" record date on the disbursed security.
     * 
     */
    SYSL;

    public String value() {
        return name();
    }

    public static InstructionLockoutType1Code fromValue(String v) {
        return valueOf(v);
    }

}
