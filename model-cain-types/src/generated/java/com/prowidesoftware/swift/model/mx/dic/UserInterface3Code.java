
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for UserInterface3Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="UserInterface3Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="ACQU"/&gt;
 *     &lt;enumeration value="AGNT"/&gt;
 *     &lt;enumeration value="ISSR"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "UserInterface3Code")
@XmlEnum
public enum UserInterface3Code {


    /**
     * Acquirer.
     * 
     */
    ACQU,

    /**
     * Agent.
     * 
     */
    AGNT,

    /**
     * Issuer.
     * 
     */
    ISSR;

    public String value() {
        return name();
    }

    public static UserInterface3Code fromValue(String v) {
        return valueOf(v);
    }

}
