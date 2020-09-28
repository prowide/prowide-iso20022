
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Operation1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="Operation1Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="TILL"/&gt;
 *     &lt;enumeration value="ORRR"/&gt;
 *     &lt;enumeration value="ANDD"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "Operation1Code")
@XmlEnum
public enum Operation1Code {


    /**
     * Indicates a range delimited by two variables.
     * 
     */
    TILL,

    /**
     * Indicates either of two variables is valid, but not both.
     * 
     */
    ORRR,

    /**
     * Indicates that only when both variables are given, the operation is valid.
     * 
     */
    ANDD;

    public String value() {
        return name();
    }

    public static Operation1Code fromValue(String v) {
        return valueOf(v);
    }

}
