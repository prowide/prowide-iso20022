
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for UserInterface1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="UserInterface1Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="CDSP"/>
 *     <enumeration value="CRCP"/>
 *     <enumeration value="MDSP"/>
 *     <enumeration value="MRCP"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "UserInterface1Code")
@XmlEnum
public enum UserInterface1Code {


    /**
     * Cardholder display or interface.
     * 
     */
    CDSP,

    /**
     * Cardholder receipt.
     * 
     */
    CRCP,

    /**
     * Merchant display or interface.
     * 
     */
    MDSP,

    /**
     * Merchant receipt.
     * 
     */
    MRCP;

    public String value() {
        return name();
    }

    public static UserInterface1Code fromValue(String v) {
        return valueOf(v);
    }

}
