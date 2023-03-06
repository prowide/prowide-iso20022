
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ATMCustomerProfile1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ATMCustomerProfile1Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="CRDF"/&gt;
 *     &lt;enumeration value="OREQ"/&gt;
 *     &lt;enumeration value="PREQ"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ATMCustomerProfile1Code")
@XmlEnum
public enum ATMCustomerProfile1Code {


    /**
     * Customer profile is deduced from the card data and the local configuration.
     * 
     */
    CRDF,

    /**
     * Customer profile is sent via an account enquiry selecting an account.
     * 
     */
    OREQ,

    /**
     * Customer profile is built via a specific profile message exchange.
     * 
     */
    PREQ;

    public String value() {
        return name();
    }

    public static ATMCustomerProfile1Code fromValue(String v) {
        return valueOf(v);
    }

}
