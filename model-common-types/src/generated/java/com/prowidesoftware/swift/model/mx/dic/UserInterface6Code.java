
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for UserInterface6Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="UserInterface6Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="CDSP"/&gt;
 *     &lt;enumeration value="CRCP"/&gt;
 *     &lt;enumeration value="MDSP"/&gt;
 *     &lt;enumeration value="MRCP"/&gt;
 *     &lt;enumeration value="CRDO"/&gt;
 *     &lt;enumeration value="FILE"/&gt;
 *     &lt;enumeration value="CHAP"/&gt;
 *     &lt;enumeration value="MRAP"/&gt;
 *     &lt;enumeration value="MRIN"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
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
