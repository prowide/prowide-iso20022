
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SystemStatus3Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="SystemStatus3Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="ACTV"/>
 *     <enumeration value="CLSD"/>
 *     <enumeration value="RMPS"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "SystemStatus3Code")
@XmlEnum
public enum SystemStatus3Code {


    /**
     * System is functioning normally, that is, operational.
     * 
     */
    ACTV,

    /**
     * System is closed (eg. normal closure of an RTGS).
     * 
     */
    CLSD,

    /**
     * System is starting a new maintenance period.
     * 
     */
    RMPS;

    public String value() {
        return name();
    }

    public static SystemStatus3Code fromValue(String v) {
        return valueOf(v);
    }

}
