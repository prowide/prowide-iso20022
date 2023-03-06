
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ATMServiceType9Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ATMServiceType9Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="TRFC"/&gt;
 *     &lt;enumeration value="TRFI"/&gt;
 *     &lt;enumeration value="TRFP"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ATMServiceType9Code")
@XmlEnum
public enum ATMServiceType9Code {


    /**
     * Funds transfer between accounts belonging to the customer in the same bank.
     * 
     */
    TRFC,

    /**
     * Funds transfer to another customer.
     * 
     */
    TRFI,

    /**
     * Funds transfer to pay a third party.
     * 
     */
    TRFP;

    public String value() {
        return name();
    }

    public static ATMServiceType9Code fromValue(String v) {
        return valueOf(v);
    }

}
