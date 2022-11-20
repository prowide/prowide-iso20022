
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for UserInterface1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="UserInterface1Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="CDSP"/&gt;
 *     &lt;enumeration value="CRCP"/&gt;
 *     &lt;enumeration value="MDSP"/&gt;
 *     &lt;enumeration value="MRCP"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
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
