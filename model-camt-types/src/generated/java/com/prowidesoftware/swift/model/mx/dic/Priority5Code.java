
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Priority5Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="Priority5Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="HIGH"/>
 *     <enumeration value="LOWW"/>
 *     <enumeration value="NORM"/>
 *     <enumeration value="URGT"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "Priority5Code")
@XmlEnum
public enum Priority5Code {


    /**
     * Priority level is high.
     * 
     */
    HIGH,

    /**
     * Priority level is low.
     * 
     */
    LOWW,

    /**
     * Priority level is normal.
     * 
     */
    NORM,

    /**
     * Priority level is urgent (highest priority possible).
     * 
     */
    URGT;

    public String value() {
        return name();
    }

    public static Priority5Code fromValue(String v) {
        return valueOf(v);
    }

}
