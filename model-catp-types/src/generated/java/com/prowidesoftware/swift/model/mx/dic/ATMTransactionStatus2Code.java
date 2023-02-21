
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ATMTransactionStatus2Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ATMTransactionStatus2Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="FULL"/&gt;
 *     &lt;enumeration value="PART"/&gt;
 *     &lt;enumeration value="NONE"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ATMTransactionStatus2Code")
@XmlEnum
public enum ATMTransactionStatus2Code {


    /**
     * Total presented amount is equal to the amount to dispense.
     * 
     */
    FULL,

    /**
     * Total presented amount is lower than the amount to dispense.
     * 
     */
    PART,

    /**
     * Total presented amount is equal to zero.
     * 
     */
    NONE;

    public String value() {
        return name();
    }

    public static ATMTransactionStatus2Code fromValue(String v) {
        return valueOf(v);
    }

}
