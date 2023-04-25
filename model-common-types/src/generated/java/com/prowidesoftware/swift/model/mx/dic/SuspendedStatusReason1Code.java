
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SuspendedStatusReason1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="SuspendedStatusReason1Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="SUBY"/>
 *     <enumeration value="SUBS"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "SuspendedStatusReason1Code")
@XmlEnum
public enum SuspendedStatusReason1Code {


    /**
     * Transaction/instruction is suspended following your earlier suspension instruction.
     * 
     */
    SUBY,

    /**
     * Transaction/instruction is suspended following a system suspension instruction.
     * 
     */
    SUBS;

    public String value() {
        return name();
    }

    public static SuspendedStatusReason1Code fromValue(String v) {
        return valueOf(v);
    }

}
