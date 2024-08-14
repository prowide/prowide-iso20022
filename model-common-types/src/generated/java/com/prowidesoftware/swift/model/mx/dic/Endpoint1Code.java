
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Endpoint1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="Endpoint1Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="DEST"/>
 *     <enumeration value="ORIG"/>
 *     <enumeration value="OTHP"/>
 *     <enumeration value="OTHN"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "Endpoint1Code")
@XmlEnum
public enum Endpoint1Code {


    /**
     * Destination	
     * 
     */
    DEST,

    /**
     * Origination
     * 
     */
    ORIG,

    /**
     * Type specified at a private level.
     * 
     */
    OTHP,

    /**
     * Type specified at the national level.
     * 
     */
    OTHN;

    public String value() {
        return name();
    }

    public static Endpoint1Code fromValue(String v) {
        return valueOf(v);
    }

}
