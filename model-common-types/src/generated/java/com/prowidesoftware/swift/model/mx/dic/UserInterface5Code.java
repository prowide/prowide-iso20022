
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for UserInterface5Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="UserInterface5Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="CDSP"/&gt;
 *     &lt;enumeration value="CRCP"/&gt;
 *     &lt;enumeration value="CRDO"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "UserInterface5Code")
@XmlEnum
public enum UserInterface5Code {


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
     * Other interface of the cardholder, for instance e-mail or smartphone message.
     * 
     */
    CRDO;

    public String value() {
        return name();
    }

    public static UserInterface5Code fromValue(String v) {
        return valueOf(v);
    }

}
