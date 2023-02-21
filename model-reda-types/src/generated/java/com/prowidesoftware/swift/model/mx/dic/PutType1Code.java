
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PutType1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="PutType1Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="MAND"/&gt;
 *     &lt;enumeration value="OPTI"/&gt;
 *     &lt;enumeration value="TWOS"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "PutType1Code")
@XmlEnum
public enum PutType1Code {


    /**
     * Type of execution of the put feature is mandatory.
     * 
     */
    MAND,

    /**
     * Type of execution of the put feature is optional.
     * 
     */
    OPTI,

    /**
     * Type of execution of the put feature could be optional or mandatory.
     * 
     */
    TWOS;

    public String value() {
        return name();
    }

    public static PutType1Code fromValue(String v) {
        return valueOf(v);
    }

}
