
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FailureReason5Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="FailureReason5Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="SECR"/&gt;
 *     &lt;enumeration value="HRDW"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
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
