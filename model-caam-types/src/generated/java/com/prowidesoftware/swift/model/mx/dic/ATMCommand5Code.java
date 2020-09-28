
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ATMCommand5Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ATMCommand5Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="ABAL"/&gt;
 *     &lt;enumeration value="CCNT"/&gt;
 *     &lt;enumeration value="RPTC"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ATMCommand5Code")
@XmlEnum
public enum ATMCommand5Code {


    /**
     * Provide the ATM counters, resetting those that are applicable.
     * 
     */
    ABAL,

    /**
     * Request the value of the ATM counters.
     * 
     */
    CCNT,

    /**
     * Provide the value of the ATM counters, no reinitialisation of the counters.
     * 
     */
    RPTC;

    public String value() {
        return name();
    }

    public static ATMCommand5Code fromValue(String v) {
        return valueOf(v);
    }

}
