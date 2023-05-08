
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for LocationCategory4Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="LocationCategory4Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="ABRD"/>
 *     <enumeration value="NMDC"/>
 *     <enumeration value="FIXD"/>
 *     <enumeration value="VIRT"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "LocationCategory4Code")
@XmlEnum
public enum LocationCategory4Code {


    /**
     * Aboard is used when the sale is done in a vehicle (e.g a bus, train, ship, airplane,
     * taxi, etc).
     * 
     */
    ABRD,

    /**
     * Nomadic is used when the merchant is traveling to different locations (e.g fair or
     * sport events, home delivery, food truck).
     * 
     */
    NMDC,

    /**
     * Fixed location, for example in a shop.
     * 
     */
    FIXD,

    /**
     * Virtual Shop is used for any ecommerce solution.
     * 
     */
    VIRT;

    public String value() {
        return name();
    }

    public static LocationCategory4Code fromValue(String v) {
        return valueOf(v);
    }

}
