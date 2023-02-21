
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CarRentalActivity1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="CarRentalActivity1Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="CARS"/&gt;
 *     &lt;enumeration value="GLBL"/&gt;
 *     &lt;enumeration value="INDV"/&gt;
 *     &lt;enumeration value="PETP"/&gt;
 *     &lt;enumeration value="OTHP"/&gt;
 *     &lt;enumeration value="OTHN"/&gt;
 *     &lt;enumeration value="OTHR"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
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
