
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ATMStatus2Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ATMStatus2Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="OPER"/&gt;
 *     &lt;enumeration value="OUTS"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ATMStatus2Code")
@XmlEnum
public enum ATMStatus2Code {


    /**
     * Component is activated and in operation.
     * 
     */
    OPER,

    /**
     * ATM out of service.
     * 
     */
    OUTS;

    public String value() {
        return name();
    }

    public static ATMStatus2Code fromValue(String v) {
        return valueOf(v);
    }

}
