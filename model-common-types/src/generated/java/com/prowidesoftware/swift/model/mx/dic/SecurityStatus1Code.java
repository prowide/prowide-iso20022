
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SecurityStatus1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="SecurityStatus1Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="ACTV"/>
 *     <enumeration value="INAC"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "SecurityStatus1Code")
@XmlEnum
public enum SecurityStatus1Code {


    /**
     * The status is active.
     * 
     */
    ACTV,

    /**
     * The status is inactive.
     * 
     */
    INAC;

    public String value() {
        return name();
    }

    public static SecurityStatus1Code fromValue(String v) {
        return valueOf(v);
    }

}
