
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FailureReason5Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="FailureReason5Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="SECR"/>
 *     <enumeration value="HRDW"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "FailureReason5Code")
@XmlEnum
public enum FailureReason5Code {


    /**
     * General security error.
     * 
     */
    SECR,

    /**
     * Hardware error on the device.
     * 
     */
    HRDW;

    public String value() {
        return name();
    }

    public static FailureReason5Code fromValue(String v) {
        return valueOf(v);
    }

}
