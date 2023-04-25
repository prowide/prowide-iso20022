
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Payment1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="Payment1Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="ACTU"/>
 *     <enumeration value="CONT"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "Payment1Code")
@XmlEnum
public enum Payment1Code {


    /**
     * The cash payment occurs or will occur upon receipt of proceeds from the issuer.
     * 
     */
    ACTU,

    /**
     * The cash payment occurs or will occur in advance of receipt of proceeds from the issuer and based on a contractual agreement established with the account servicer.
     * 
     */
    CONT;

    public String value() {
        return name();
    }

    public static Payment1Code fromValue(String v) {
        return valueOf(v);
    }

}
