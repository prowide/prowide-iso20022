
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for EnabledStatusReason1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="EnabledStatusReason1Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="MODI"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "EnabledStatusReason1Code")
@XmlEnum
public enum EnabledStatusReason1Code {


    /**
     * Modification to the account data is in process.
     * 
     */
    MODI;

    public String value() {
        return name();
    }

    public static EnabledStatusReason1Code fromValue(String v) {
        return valueOf(v);
    }

}
