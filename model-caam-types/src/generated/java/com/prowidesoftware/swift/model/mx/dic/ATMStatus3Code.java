
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ATMStatus3Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ATMStatus3Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="OPER"/&gt;
 *     &lt;enumeration value="STOP"/&gt;
 *     &lt;enumeration value="WACT"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ATMStatus3Code")
@XmlEnum
public enum ATMStatus3Code {


    /**
     * Component is activated and in operation.
     * 
     */
    OPER,

    /**
     * Component has been stopped.
     * 
     */
    STOP,

    /**
     * Component has been loaded, but not yet activated.
     * 
     */
    WACT;

    public String value() {
        return name();
    }

    public static ATMStatus3Code fromValue(String v) {
        return valueOf(v);
    }

}
