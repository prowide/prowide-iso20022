
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for UserInterface8Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="UserInterface8Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="DSPU"/>
 *     <enumeration value="FILE"/>
 *     <enumeration value="LOGF"/>
 *     <enumeration value="OTHP"/>
 *     <enumeration value="OTHN"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "UserInterface8Code")
@XmlEnum
public enum UserInterface8Code {


    /**
     * Interface used in case of disputes or chargebacks.
     * 
     */
    DSPU,

    /**
     * File used to store the message.
     * 
     */
    FILE,

    /**
     * Information dedicated to a log file.
     * 
     */
    LOGF,

    /**
     * Other type of interface defined at private level.
     * 
     */
    OTHP,

    /**
     * Other type of interface defined at national level.
     * 
     */
    OTHN;

    public String value() {
        return name();
    }

    public static UserInterface8Code fromValue(String v) {
        return valueOf(v);
    }

}
