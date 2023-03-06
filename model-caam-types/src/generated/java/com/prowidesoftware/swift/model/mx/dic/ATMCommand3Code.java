
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ATMCommand3Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ATMCommand3Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="ABAL"/&gt;
 *     &lt;enumeration value="CCNT"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ATMCommand3Code")
@XmlEnum
public enum ATMCommand3Code {


    /**
     * Provide the ATM counters, resetting those that are applicable.
     * 
     */
    ABAL,

    /**
     * Request the value of the ATM counters.
     * 
     */
    CCNT;

    public String value() {
        return name();
    }

    public static ATMCommand3Code fromValue(String v) {
        return valueOf(v);
    }

}
