
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for UserInterface8Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="UserInterface8Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="DSPU"/&gt;
 *     &lt;enumeration value="FILE"/&gt;
 *     &lt;enumeration value="LOGF"/&gt;
 *     &lt;enumeration value="OTHP"/&gt;
 *     &lt;enumeration value="OTHN"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
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
