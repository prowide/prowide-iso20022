
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for UserInterface7Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="UserInterface7Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="OCAI"/>
 *     <enumeration value="CLRL"/>
 *     <enumeration value="CLRA"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "UserInterface7Code")
@XmlEnum
public enum UserInterface7Code {


    /**
     * Data dedicated to another interface maintained by the clearing agent.
     * 
     */
    OCAI,

    /**
     * Data dedicated to a log maintained by the clearing agent.
     * 
     */
    CLRL,

    /**
     * Data dedicated to an application maintained by a clearing agent.
     * 
     */
    CLRA;

    public String value() {
        return name();
    }

    public static UserInterface7Code fromValue(String v) {
        return valueOf(v);
    }

}
