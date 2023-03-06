
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Modification1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="Modification1Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="NOCH"/&gt;
 *     &lt;enumeration value="MODI"/&gt;
 *     &lt;enumeration value="DELE"/&gt;
 *     &lt;enumeration value="ADDD"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "Modification1Code")
@XmlEnum
public enum Modification1Code {


    /**
     * Specifies that the item is not changed.
     * 
     */
    NOCH,

    /**
     * Specifies that the item is modified.
     * 
     */
    MODI,

    /**
     * Specifies that the item is deleted.
     * 
     */
    DELE,

    /**
     * Specifies that the item is added.
     * 
     */
    ADDD;

    public String value() {
        return name();
    }

    public static Modification1Code fromValue(String v) {
        return valueOf(v);
    }

}
