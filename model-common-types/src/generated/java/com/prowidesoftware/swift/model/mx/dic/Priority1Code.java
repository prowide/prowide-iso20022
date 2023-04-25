
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Priority1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="Priority1Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="HIGH"/>
 *     <enumeration value="NORM"/>
 *     <enumeration value="LOWW"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "Priority1Code")
@XmlEnum
public enum Priority1Code {


    /**
     * Priority level is high.
     * 
     */
    HIGH,

    /**
     * Priority level is normal.
     * 
     */
    NORM,

    /**
     * Priority level is low.
     * 
     */
    LOWW;

    public String value() {
        return name();
    }

    public static Priority1Code fromValue(String v) {
        return valueOf(v);
    }

}
