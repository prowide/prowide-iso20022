
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for IntendedOrActual2Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="IntendedOrActual2Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="ANTE"/>
 *     <enumeration value="POST"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "IntendedOrActual2Code")
@XmlEnum
public enum IntendedOrActual2Code {


    /**
     * Ex ante (intended).
     * 
     */
    ANTE,

    /**
     * Ex post (actual).
     * 
     */
    POST;

    public String value() {
        return name();
    }

    public static IntendedOrActual2Code fromValue(String v) {
        return valueOf(v);
    }

}
