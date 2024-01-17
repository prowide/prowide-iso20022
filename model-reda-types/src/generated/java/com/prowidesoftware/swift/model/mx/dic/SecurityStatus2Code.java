
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SecurityStatus2Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="SecurityStatus2Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="ACTV"/>
 *     <enumeration value="INAC"/>
 *     <enumeration value="SUSP"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "SecurityStatus2Code")
@XmlEnum
public enum SecurityStatus2Code {


    /**
     * The status is active.
     * 
     */
    ACTV,

    /**
     * The status is inactive.
     * 
     */
    INAC,

    /**
     * The status is suspended.
     * 
     */
    SUSP;

    public String value() {
        return name();
    }

    public static SecurityStatus2Code fromValue(String v) {
        return valueOf(v);
    }

}
