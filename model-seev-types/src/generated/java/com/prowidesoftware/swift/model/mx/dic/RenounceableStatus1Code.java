
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RenounceableStatus1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="RenounceableStatus1Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="NREN"/&gt;
 *     &lt;enumeration value="RENO"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "RenounceableStatus1Code")
@XmlEnum
public enum RenounceableStatus1Code {


    /**
     * Intermediate securities cannot be sold.
     * 
     */
    NREN,

    /**
     * Intermediate securities can be sold.
     * 
     */
    RENO;

    public String value() {
        return name();
    }

    public static RenounceableStatus1Code fromValue(String v) {
        return valueOf(v);
    }

}
