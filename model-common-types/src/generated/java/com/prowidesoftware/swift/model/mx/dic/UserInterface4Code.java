
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for UserInterface4Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="UserInterface4Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="CDSP"/>
 *     <enumeration value="CRCP"/>
 *     <enumeration value="MDSP"/>
 *     <enumeration value="MRCP"/>
 *     <enumeration value="CRDO"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "UserInterface4Code")
@XmlEnum
public enum UserInterface4Code {


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
    MRCP,

    /**
     * Other interface of the cardholder, for instance e-mail or smartphone message.
     * 
     */
    CRDO;

    public String value() {
        return name();
    }

    public static UserInterface4Code fromValue(String v) {
        return valueOf(v);
    }

}
