
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AttendanceContext2Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="AttendanceContext2Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="ATTL"/&gt;
 *     &lt;enumeration value="CARR"/&gt;
 *     &lt;enumeration value="CUST"/&gt;
 *     &lt;enumeration value="FULL"/&gt;
 *     &lt;enumeration value="SELF"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "AttendanceContext2Code")
@XmlEnum
public enum AttendanceContext2Code {


    /**
     * Delivery by an attendant.
     * 
     */
    ATTL,

    /**
     * Delivery by a carrier.
     * 
     */
    CARR,

    /**
     * Delivery by the customer.
     * 
     */
    CUST,

    /**
     * Full service for fuel distribution.
     * 
     */
    FULL,

    /**
     * Self service for fuel distribution.
     * 
     */
    SELF;

    public String value() {
        return name();
    }

    public static AttendanceContext2Code fromValue(String v) {
        return valueOf(v);
    }

}
