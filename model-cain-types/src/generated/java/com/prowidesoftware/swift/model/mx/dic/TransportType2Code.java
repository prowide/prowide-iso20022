
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TransportType2Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="TransportType2Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="AIRR"/>
 *     <enumeration value="BUSS"/>
 *     <enumeration value="RAIL"/>
 *     <enumeration value="SHIP"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "TransportType2Code")
@XmlEnum
public enum TransportType2Code {


    /**
     * Air
     * 
     */
    AIRR,

    /**
     * Bus
     * 
     */
    BUSS,

    /**
     * Rail
     * 
     */
    RAIL,

    /**
     * Ship
     * 
     */
    SHIP;

    public String value() {
        return name();
    }

    public static TransportType2Code fromValue(String v) {
        return valueOf(v);
    }

}
