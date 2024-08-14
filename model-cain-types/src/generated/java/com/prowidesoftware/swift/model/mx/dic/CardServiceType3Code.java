
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CardServiceType3Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="CardServiceType3Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="KYDL"/>
 *     <enumeration value="KYCG"/>
 *     <enumeration value="KYVF"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
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
