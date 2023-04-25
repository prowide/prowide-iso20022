
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for UserInterface6Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="UserInterface6Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="CDSP"/>
 *     <enumeration value="CRCP"/>
 *     <enumeration value="MDSP"/>
 *     <enumeration value="MRCP"/>
 *     <enumeration value="CRDO"/>
 *     <enumeration value="FILE"/>
 *     <enumeration value="CHAP"/>
 *     <enumeration value="MRAP"/>
 *     <enumeration value="MRIN"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "UserInterface6Code")
@XmlEnum
public enum UserInterface6Code {


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
    CRDO,

    /**
     * File used to store the message.
     * 
     */
    FILE,

    /**
     * Information dedicated to a software application related to a device belonging to the cardholder.
     * 
     */
    CHAP,

    /**
     * Information dedicated to a software application related to a device belonging to the merchant.
     * 
     */
    MRAP,

    /**
     * Other interface of the merchant for instance e-mail or smartphone message.
     * 
     */
    MRIN;

    public String value() {
        return name();
    }

    public static UserInterface6Code fromValue(String v) {
        return valueOf(v);
    }

}
