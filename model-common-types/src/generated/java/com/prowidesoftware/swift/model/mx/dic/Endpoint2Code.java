
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Endpoint2Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="Endpoint2Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="DEST"/>
 *     <enumeration value="ORIG"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "Endpoint2Code")
@XmlEnum
public enum Endpoint2Code {


    /**
     * Destination	
     * 
     */
    DEST,

    /**
     * Origination
     * 
     */
    ORIG;

    public String value() {
        return name();
    }

    public static Endpoint2Code fromValue(String v) {
        return valueOf(v);
    }

}
