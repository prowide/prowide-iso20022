
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CarRentalActivity1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="CarRentalActivity1Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="CARS"/>
 *     <enumeration value="GLBL"/>
 *     <enumeration value="INDV"/>
 *     <enumeration value="PETP"/>
 *     <enumeration value="OTHP"/>
 *     <enumeration value="OTHN"/>
 *     <enumeration value="OTHR"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "CarRentalActivity1Code")
@XmlEnum
public enum CarRentalActivity1Code {


    /**
     * Company specialised in car sharing activities.
     * 
     */
    CARS,

    /**
     * Global car rental activities.
     * 
     */
    GLBL,

    /**
     * Individual renting a car.
     * 
     */
    INDV,

    /**
     * Peer to peer car rental activities.
     * 
     */
    PETP,

    /**
     * Other Private
     * 
     */
    OTHP,

    /**
     * Other National
     * 
     */
    OTHN,

    /**
     * Other type of car rental activity.
     * 
     */
    OTHR;

    public String value() {
        return name();
    }

    public static CarRentalActivity1Code fromValue(String v) {
        return valueOf(v);
    }

}
