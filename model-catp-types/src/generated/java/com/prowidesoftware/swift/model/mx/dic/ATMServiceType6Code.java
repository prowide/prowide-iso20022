
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ATMServiceType6Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ATMServiceType6Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="MCHG"/&gt;
 *     &lt;enumeration value="DPSN"/&gt;
 *     &lt;enumeration value="DPSV"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ATMServiceType6Code")
@XmlEnum
public enum ATMServiceType6Code {


    /**
     * Making change between media types.
     * 
     */
    MCHG,

    /**
     * Deposit of media items unverified by the ATM, for instance in an envelope.
     * 
     */
    DPSN,

    /**
     * Deposit of media items verified by the ATM.
     * 
     */
    DPSV;

    public String value() {
        return name();
    }

    public static ATMServiceType6Code fromValue(String v) {
        return valueOf(v);
    }

}
