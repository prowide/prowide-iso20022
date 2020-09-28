
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Operation3Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="Operation3Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="ANDD"/&gt;
 *     &lt;enumeration value="ORRR"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "Operation3Code")
@XmlEnum
public enum Operation3Code {


    /**
     * Indicates that only when all if all of its elements are valid, the whole expression is valid.
     * 
     */
    ANDD,

    /**
     * Indicates that when at least one of its elements is valid, the whole expression is valid.
     * 
     */
    ORRR;

    public String value() {
        return name();
    }

    public static Operation3Code fromValue(String v) {
        return valueOf(v);
    }

}
