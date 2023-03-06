
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for LocationCategory3Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="LocationCategory3Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="INDR"/&gt;
 *     &lt;enumeration value="IPMP"/&gt;
 *     &lt;enumeration value="MPOI"/&gt;
 *     &lt;enumeration value="MPMP"/&gt;
 *     &lt;enumeration value="MSLE"/&gt;
 *     &lt;enumeration value="SSLE"/&gt;
 *     &lt;enumeration value="VNDG"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
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
