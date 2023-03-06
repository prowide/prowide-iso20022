
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CardServiceType2Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="CardServiceType2Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="SFDS"/&gt;
 *     &lt;enumeration value="ECHO"/&gt;
 *     &lt;enumeration value="SFEN"/&gt;
 *     &lt;enumeration value="SGNF"/&gt;
 *     &lt;enumeration value="SGNN"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "CardServiceType2Code")
@XmlEnum
public enum CardServiceType2Code {


    /**
     * Close communication at application level to stop store and forward process.
     * 
     */
    SFDS,

    /**
     * Detection whether communication at application level is still active.
     * 
     */
    ECHO,

    /**
     * Establish communication at application level to start store and forward process.
     * 
     */
    SFEN,

    /**
     * Terminate communication at application level.
     * 
     */
    SGNF,

    /**
     * Establish communication at application level.
     * 
     */
    SGNN;

    public String value() {
        return name();
    }

    public static CardServiceType2Code fromValue(String v) {
        return valueOf(v);
    }

}
