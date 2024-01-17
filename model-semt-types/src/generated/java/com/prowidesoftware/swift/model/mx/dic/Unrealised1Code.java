
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Unrealised1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="Unrealised1Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="GAIN"/>
 *     <enumeration value="LOSS"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
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
