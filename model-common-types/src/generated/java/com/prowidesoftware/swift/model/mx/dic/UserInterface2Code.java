
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for UserInterface2Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="UserInterface2Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="MDSP"/>
 *     <enumeration value="CDSP"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "UserInterface2Code")
@XmlEnum
public enum UserInterface2Code {


    /**
     * Merchant display or interface.
     * 
     */
    MDSP,

    /**
     * Cardholder display or interface.
     * 
     */
    CDSP;

    public String value() {
        return name();
    }

    public static UserInterface2Code fromValue(String v) {
        return valueOf(v);
    }

}
