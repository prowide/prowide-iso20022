
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Gender1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="Gender1Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="FEMA"/&gt;
 *     &lt;enumeration value="MALE"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "Gender1Code")
@XmlEnum
public enum Gender1Code {


    /**
     * Individual is a female.
     * 
     */
    FEMA,

    /**
     * Individual is a male.
     * 
     */
    MALE;

    public String value() {
        return name();
    }

    public static Gender1Code fromValue(String v) {
        return valueOf(v);
    }

}
