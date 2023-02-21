
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Endpoint1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="Endpoint1Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="DEST"/&gt;
 *     &lt;enumeration value="ORIG"/&gt;
 *     &lt;enumeration value="OTHP"/&gt;
 *     &lt;enumeration value="OTHN"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
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
