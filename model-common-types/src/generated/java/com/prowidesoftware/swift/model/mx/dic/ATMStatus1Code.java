
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ATMStatus1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ATMStatus1Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="INSV"/&gt;
 *     &lt;enumeration value="OUTS"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ATMStatus1Code")
@XmlEnum
public enum ATMStatus1Code {


    /**
     * Component is in service.
     * 
     */
    INSV,

    /**
     * ATM out of service.
     * 
     */
    OUTS;

    public String value() {
        return name();
    }

    public static ATMStatus1Code fromValue(String v) {
        return valueOf(v);
    }

}
