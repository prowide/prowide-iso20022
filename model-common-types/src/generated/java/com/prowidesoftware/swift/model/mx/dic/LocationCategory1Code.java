
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for LocationCategory1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="LocationCategory1Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="MOTO"/&gt;
 *     &lt;enumeration value="HOME"/&gt;
 *     &lt;enumeration value="ABRD"/&gt;
 *     &lt;enumeration value="FIXD"/&gt;
 *     &lt;enumeration value="NMDC"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "LocationCategory1Code")
@XmlEnum
public enum LocationCategory1Code {


    /**
     * Mail order or telephone order.
     * 
     */
    MOTO,

    /**
     * Customer home.
     * 
     */
    HOME,

    /**
     * Aboard a bus, train, ship, airplane, taxi, etc.
     * 
     */
    ABRD,

    /**
     * Fixed location, for example in a shop.
     * 
     */
    FIXD,

    /**
     * Nomadic location.
     * 
     */
    NMDC;

    public String value() {
        return name();
    }

    public static LocationCategory1Code fromValue(String v) {
        return valueOf(v);
    }

}
