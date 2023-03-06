
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Quantity4Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="Quantity4Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="UKWN"/&gt;
 *     &lt;enumeration value="ANYA"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "Quantity4Code")
@XmlEnum
public enum Quantity4Code {


    /**
     * Quantity is unknown by the sender or has not been established.
     * 
     */
    UKWN,

    /**
     * Instruction applies to the entire eligible balance of underlying securities.
     * 
     */
    ANYA;

    public String value() {
        return name();
    }

    public static Quantity4Code fromValue(String v) {
        return valueOf(v);
    }

}
