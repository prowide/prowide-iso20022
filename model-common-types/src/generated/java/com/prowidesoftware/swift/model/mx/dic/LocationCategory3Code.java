
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for LocationCategory3Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="LocationCategory3Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="INDR"/>
 *     <enumeration value="IPMP"/>
 *     <enumeration value="MPOI"/>
 *     <enumeration value="MPMP"/>
 *     <enumeration value="MSLE"/>
 *     <enumeration value="SSLE"/>
 *     <enumeration value="VNDG"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "LocationCategory3Code")
@XmlEnum
public enum LocationCategory3Code {


    /**
     * Indoor terminal.
     * 
     */
    INDR,

    /**
     * Terminal incorporated in the pump dispensing petrol.
     * 
     */
    IPMP,

    /**
     * Multiple terminals linked to a unique sale terminal.
     * 
     */
    MPOI,

    /**
     * Outdoor terminal serving several petrol pumps.
     * 
     */
    MPMP,

    /**
     * Terminal serving multiple sale terminals.
     * 
     */
    MSLE,

    /**
     * Terminal linked to a unique sale terminal.
     * 
     */
    SSLE,

    /**
     * Terminal integrated in a vending machine.
     * 
     */
    VNDG;

    public String value() {
        return name();
    }

    public static LocationCategory3Code fromValue(String v) {
        return valueOf(v);
    }

}
