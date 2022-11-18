
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CardServiceType3Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="CardServiceType3Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="KYDL"/&gt;
 *     &lt;enumeration value="KYCG"/&gt;
 *     &lt;enumeration value="KYVF"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "CardServiceType3Code")
@XmlEnum
public enum CardServiceType3Code {


    /**
     * Convey the key to the receiver.
     * 
     */
    KYDL,

    /**
     * Request the keys that the receiver must send in the response.
     * 
     */
    KYCG,

    /**
     * Request the receiver to verify the key check value.
     * 
     */
    KYVF;

    public String value() {
        return name();
    }

    public static CardServiceType3Code fromValue(String v) {
        return valueOf(v);
    }

}
