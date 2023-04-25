
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Payment2Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="Payment2Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="ACTU"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "Payment2Code")
@XmlEnum
public enum Payment2Code {


    /**
     * The cash payment occurs or will occur upon receipt of proceeds from the issuer.
     * 
     */
    ACTU;

    public String value() {
        return name();
    }

    public static Payment2Code fromValue(String v) {
        return valueOf(v);
    }

}
