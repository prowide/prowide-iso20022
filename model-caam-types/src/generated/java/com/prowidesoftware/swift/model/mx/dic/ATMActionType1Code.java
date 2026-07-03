
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ATMActionType1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ATMActionType1Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="APLY"/&gt;
 *     &lt;enumeration value="NONE"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ATMActionType1Code")
@XmlEnum
public enum ATMActionType1Code {


    /**
     * The received configuration must be applied.
     * 
     */
    APLY,

    /**
     * There is no specific action required with the received configuration.
     * 
     */
    NONE;

    public String value() {
        return name();
    }

    public static ATMActionType1Code fromValue(String v) {
        return valueOf(v);
    }

}
