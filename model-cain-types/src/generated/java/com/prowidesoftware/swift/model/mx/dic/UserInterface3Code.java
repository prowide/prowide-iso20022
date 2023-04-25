
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for UserInterface3Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="UserInterface3Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="ACQU"/>
 *     <enumeration value="AGNT"/>
 *     <enumeration value="ISSR"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
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
