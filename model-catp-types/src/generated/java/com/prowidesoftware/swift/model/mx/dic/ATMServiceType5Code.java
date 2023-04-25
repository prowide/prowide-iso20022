
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ATMServiceType5Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="ATMServiceType5Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="PINC"/>
 *     <enumeration value="PINR"/>
 *     <enumeration value="PINU"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "ATMServiceType5Code")
@XmlEnum
public enum ATMServiceType5Code {


    /**
     * Modification of the card PIN value.
     * 
     */
    PINC,

    /**
     * Resetting of a PIN.
     * 
     */
    PINR,

    /**
     * Unblock the PIN.
     * 
     */
    PINU;

    public String value() {
        return name();
    }

    public static ATMServiceType5Code fromValue(String v) {
        return valueOf(v);
    }

}
