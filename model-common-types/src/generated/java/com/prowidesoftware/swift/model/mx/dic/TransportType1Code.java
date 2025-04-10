
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TransportType1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="TransportType1Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="AIRR"/>
 *     <enumeration value="BUSS"/>
 *     <enumeration value="OTHN"/>
 *     <enumeration value="OTHP"/>
 *     <enumeration value="RAIL"/>
 *     <enumeration value="SHIP"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "TransportType1Code")
@XmlEnum
public enum TransportType1Code {


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
     * Other National
     * 
     */
    OTHN,

    /**
     * Other Private
     * 
     */
    OTHP,

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

    public static TransportType1Code fromValue(String v) {
        return valueOf(v);
    }

}
