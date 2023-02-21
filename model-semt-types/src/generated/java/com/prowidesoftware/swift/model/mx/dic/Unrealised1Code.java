
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Unrealised1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="Unrealised1Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="GAIN"/&gt;
 *     &lt;enumeration value="LOSS"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "Unrealised1Code")
@XmlEnum
public enum Unrealised1Code {


    /**
     * Unrealised gain.
     * 
     */
    GAIN,

    /**
     * Unrealised loss.
     * 
     */
    LOSS;

    public String value() {
        return name();
    }

    public static Unrealised1Code fromValue(String v) {
        return valueOf(v);
    }

}
