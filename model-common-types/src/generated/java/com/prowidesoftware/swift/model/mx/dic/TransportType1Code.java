
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TransportType1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="TransportType1Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="AIRR"/&gt;
 *     &lt;enumeration value="BUSS"/&gt;
 *     &lt;enumeration value="OTHN"/&gt;
 *     &lt;enumeration value="OTHP"/&gt;
 *     &lt;enumeration value="RAIL"/&gt;
 *     &lt;enumeration value="SHIP"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
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
